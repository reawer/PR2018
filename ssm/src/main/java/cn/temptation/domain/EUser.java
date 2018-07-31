package cn.temptation.domain;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class EUser {
	private Integer userid;
	private String username;
	private String password;
	private Integer userage;
	private Timestamp updateTime;

	// init
	public EUser() {
		super();
	}

	public EUser(Integer userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}

	public EUser(Integer userid, String username, String password, Integer userage, Timestamp updateTime) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.userage = userage;
		this.updateTime = updateTime;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserage() {
		return userage;
	}

	public void setUserage(Integer userage) {
		this.userage = userage;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		return "-- " + this.username + ",age:" + this.userage + ",updateTime:" + sdf.format(this.updateTime) + "  --";
	}
}
