package cn.temptation.web;

import java.util.List;

import javax.annotation.Resource;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.temptation.dao.IUserDao;
import cn.temptation.dao.UserDao;
import cn.temptation.domain.EUser;
import cn.temptation.domain.User;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * �û�������
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	private UserDao userDao;
	@Resource
	private IUserDao iuserDao;

//日志记录器
	private static Logger LOGGER = LogManager.getLogger(UserController.class);

	@RequestMapping("/view")
	public String view() {
		return "login";
	}

	@RequestMapping("/indexview")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(User model, HttpSession session) {
		User user = userDao.findByUsername(model.getUsername());
		if (user == null || !user.getPassword().equals(model.getPassword())) {
			// 自动快速地使用缺省Log4j环境
			// BasicConfigurator.configure();
			// 打印日志信息
			LOGGER.warn("Dangerous user is trying, Name:" + model.getUsername() + ", Get RUN Now!");

			// test select
			/*List<User> lsuser2 = userDao.getAllUsers();
			if (null != lsuser2)
				LOGGER.info("get old user count: " + lsuser2.size());*/
			if (null == iuserDao)
				LOGGER.info("iuserDao is null");
			else {
				List<EUser> lsuser = iuserDao.getAllUsers();
				if (null != lsuser)
				{
					LOGGER.info("get user count: " + lsuser.size());
					for (EUser eu: lsuser) {
						LOGGER.info("get user count: " + eu.toString());
					}
				}
			}
			// end test
			
			session.setAttribute("user", user);
			session.setAttribute("Msg", "用户名或密码错误！请重试");
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("login");
			return mav;// new ModelAndView("redirect:/login.jsp");
		} else {
			session.setAttribute("user", user);
			List<EUser> lsuser = iuserDao.getAllUsers();
			session.setAttribute("euserList", lsuser);
			
			//List<EUser> lsuser = new List<EUser>();
			// session.getServletContext().
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			return mav;
		}
	}
}