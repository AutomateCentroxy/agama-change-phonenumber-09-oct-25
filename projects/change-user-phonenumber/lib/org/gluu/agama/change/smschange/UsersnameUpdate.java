package org.gluu.agama.change.users;

import java.util.Map;
import org.gluu.agama.change.smschange.PhonenumberUpdate;



public abstract class UsersnameUpdate {
    public abstract String addNewUser(Map<String, String> profile) throws Exception;

    public abstract boolean usernamePolicyMatch(String userName);

    public abstract boolean passwordPolicyMatch(String userPassword);

    public abstract String updateUser(Map<String, String> profile) throws Exception;

    public abstract Map<String, String> getUserEntityByInum(String inum);

    public abstract boolean sendUsernameUpdateEmail(String to, String newUsername, String lang);

    public static UsernameUpdate getInstance(HashMap config){
        return  JansUsernameUpdate.getInstance(config);
    }    
}
