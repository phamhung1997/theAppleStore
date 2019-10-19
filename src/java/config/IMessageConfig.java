/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * 
 */
public interface IMessageConfig {
    // Login
    public static final String LOGIN_FAIL = "Sai email hoặc mật khẩu";
    
    // Register
    public static final String DUPLICATE_EMAIL = "Email đăng ký đã tồn tại";
    public static final String EMAIL_OUT_OF_REGEX = "Email không đúng định dạng";
    public static final String PASSWORD_OUT_OF_REGEX = "Mật khẩu không đúng định dạng";
    public static final String REGISTER_SUCCESS = "Đăng ký thành công. Vui lòng kiểm tra email để kích hoạt tài khoản.";
    
    // Active
    public static final String ACTIVE_CODE_NOT_MATCH = "Mã kích hoạt không đúng. Vui lòng thử lại.";
}
