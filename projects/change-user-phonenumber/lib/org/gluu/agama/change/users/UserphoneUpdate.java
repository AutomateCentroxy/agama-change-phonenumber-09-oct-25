package org.gluu.agama.change.users;

import java.util.HashMap;
import java.util.Map;
import org.gluu.agama.change.smschange.PhonenumberUpdate;



public abstract class UserphoneUpdate {
    public abstract String addNewUser(Map<String, String> profile) throws Exception;

    public abstract boolean usernamePolicyMatch(String userName);

    public abstract boolean passwordPolicyMatch(String userPassword);

    public abstract String updateUser(Map<String, String> profile) throws Exception;

    public abstract Map<String, String> getUserEntityByInum(String inum);

    public abstract boolean isPhoneVerified(String username);

    public abstract boolean isPhoneUnique(String username, String phone);

    public abstract String markPhoneAsVerified(String username, String phone);

    public abstract boolean sendOTPCode(String username, String phone);

    public abstract boolean validateOTPCode(String phone, String code);

    public static UserphoneUpdate getInstance(HashMap config){
        return  PhonenumberUpdate.getInstance(config);
    }    
}
