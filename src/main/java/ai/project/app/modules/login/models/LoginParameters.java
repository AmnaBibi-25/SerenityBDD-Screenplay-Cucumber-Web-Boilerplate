package ai.project.app.modules.login.models;

import com.google.gson.annotations.SerializedName;
import indexed.pojo.model.IndexedPojo;

public class LoginParameters extends IndexedPojo {

    public static final String USERNAME_KEY = "Username";
    @SerializedName(USERNAME_KEY)
    public String username = "";

    public static final String PASSWORD_KEY = "Password";
    @SerializedName(PASSWORD_KEY)
    public String password = "";

}
