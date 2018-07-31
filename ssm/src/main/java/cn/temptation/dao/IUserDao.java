package cn.temptation.dao;
import java.util.List;
import cn.temptation.domain.EUser;

public interface IUserDao {
 public abstract EUser findByUsername(String username);
 public abstract EUser findByUserid(String userid);
 public abstract List<EUser> getAllUsers();
 public abstract void insertUser(EUser user);
 public abstract void deleteUser(int id);
 public abstract void updateUser(EUser user);
}