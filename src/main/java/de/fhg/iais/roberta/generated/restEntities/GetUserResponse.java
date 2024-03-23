/*
 * This is a class GENERATED by the TransportGenerator maven plugin. DON'T MODIFY IT.
 * IF you modify it, your work may be lost: the class will be overwritten automatically
 * when the maven plugin is re-executed for any reasons.
 */
package de.fhg.iais.roberta.generated.restEntities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.Iterator;

import java.util.List;

import java.util.Map;

import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import javax.annotation.processing.Generated;

import de.fhg.iais.roberta.generated.restEntities.InitRequest;
import de.fhg.iais.roberta.generated.restEntities.FullRestRequest;
import de.fhg.iais.roberta.generated.restEntities.BaseRequest;
import de.fhg.iais.roberta.generated.restEntities.BaseResponse;
import de.fhg.iais.roberta.generated.restEntities.InitResponse;
import de.fhg.iais.roberta.generated.restEntities.RobotInfo;
import de.fhg.iais.roberta.generated.restEntities.SaveRequest;
import de.fhg.iais.roberta.generated.restEntities.ShareCreateRequest;
import de.fhg.iais.roberta.generated.restEntities.SaveResponse;
import de.fhg.iais.roberta.generated.restEntities.ShareDeleteRequest;
import de.fhg.iais.roberta.generated.restEntities.ListingRequest;
import de.fhg.iais.roberta.generated.restEntities.ListingResponse;
import de.fhg.iais.roberta.generated.restEntities.ImportRequest;
import de.fhg.iais.roberta.generated.restEntities.ImportResponse;
import de.fhg.iais.roberta.generated.restEntities.ImportErrorResponse;
import de.fhg.iais.roberta.generated.restEntities.ShareRequest;
import de.fhg.iais.roberta.generated.restEntities.ShareResponse;
import de.fhg.iais.roberta.generated.restEntities.LikeRequest;
import de.fhg.iais.roberta.generated.restEntities.EntityRequest;
import de.fhg.iais.roberta.generated.restEntities.EntityResponse;
import de.fhg.iais.roberta.generated.restEntities.ListingNamesResponse;
import de.fhg.iais.roberta.generated.restEntities.DeleteRequest;
import de.fhg.iais.roberta.generated.restEntities.SetTokenRequest;
import de.fhg.iais.roberta.generated.restEntities.SetTokenResponse;
import de.fhg.iais.roberta.generated.restEntities.SetRobotRequest;
import de.fhg.iais.roberta.generated.restEntities.SetRobotResponse;
import de.fhg.iais.roberta.generated.restEntities.SaveConfRequest;
import de.fhg.iais.roberta.generated.restEntities.ConfRequest;
import de.fhg.iais.roberta.generated.restEntities.ConfResponse;
import de.fhg.iais.roberta.generated.restEntities.PingResponse;
import de.fhg.iais.roberta.generated.restEntities.LoginRequest;
import de.fhg.iais.roberta.generated.restEntities.LoginResponse;
import de.fhg.iais.roberta.generated.restEntities.GetUserResponse;
import de.fhg.iais.roberta.generated.restEntities.UserRequest;
import de.fhg.iais.roberta.generated.restEntities.ChangePasswordRequest;
import de.fhg.iais.roberta.generated.restEntities.DeleteUserRequest;
import de.fhg.iais.roberta.generated.restEntities.ResetPasswordRequest;
import de.fhg.iais.roberta.generated.restEntities.IsResetPasswordLinkExpiredResponse;
import de.fhg.iais.roberta.generated.restEntities.PasswordRecoveryRequest;
import de.fhg.iais.roberta.generated.restEntities.ResendActivationRequest;
import de.fhg.iais.roberta.generated.restEntities.ActivateUserRequest;
import de.fhg.iais.roberta.generated.restEntities.GetStatusTextResponse;
import de.fhg.iais.roberta.generated.restEntities.SetStatusTextRequest;
import de.fhg.iais.roberta.generated.restEntities.ProjectWorkflowRequest;
import de.fhg.iais.roberta.generated.restEntities.ProjectWorkflowResetRequest;
import de.fhg.iais.roberta.generated.restEntities.ProjectSourceResponse;
import de.fhg.iais.roberta.generated.restEntities.ProjectSourceSimulationResponse;
import de.fhg.iais.roberta.generated.restEntities.ProjectNepoResponse;
import de.fhg.iais.roberta.generated.restEntities.ProjectNativeResponse;
import de.fhg.iais.roberta.generated.restEntities.UserGroupProgramListRequest;
import de.fhg.iais.roberta.generated.restEntities.UserGroupRequest;
import de.fhg.iais.roberta.generated.restEntities.UserGroupResponse;
import de.fhg.iais.roberta.generated.restEntities.UserGroupListResponse;
import de.fhg.iais.roberta.generated.restEntities.ChangeUserGroupRequest;
import de.fhg.iais.roberta.generated.restEntities.UpdateUserGroupMemberAccountRequest;
import de.fhg.iais.roberta.generated.restEntities.UserGroupsRequest;
import de.fhg.iais.roberta.generated.restEntities.UserGroupMembersRequest;
import de.fhg.iais.roberta.generated.restEntities.NotificationsResponse;

/**
 * the response for the /getUser REST request<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class GetUserResponse extends BaseResponse {
    protected int userId;
    protected boolean userIdDefined = false;
    protected String userAccountName;
    protected String userName;
    protected String userEmail;
    protected boolean isYoungerThen14;
    protected boolean isYoungerThen14Defined = false;
    
    /**
     * the response for the /getUser REST request
     */
    public static GetUserResponse make() {
        return new GetUserResponse();
    }
    
    /**
     * the response for the /getUser REST request
     */
    public static GetUserResponse makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch (JSONException e) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }
    
    /**
     * the response for the /getUser REST request
     */
    public static GetUserResponse makeFromProperties(String cmd,String rc,String message,String cause,JSONObject parameters,String initToken,long serverTime,String serverVersion,long robotWait,String robotBattery,String robotName,String robotVersion,String robotFirmwareName,JSONObject robotSensorvalues,int robotNepoexitvalue,String robotState,boolean notificationsAvailable,int userId,String userAccountName,String userName,String userEmail,boolean isYoungerThen14) {
        GetUserResponse entity = new GetUserResponse();
        entity.setCmd(cmd);
        entity.setRc(rc);
        entity.setMessage(message);
        entity.setCause(cause);
        entity.setParameters(parameters);
        entity.setInitToken(initToken);
        entity.setServerTime(serverTime);
        entity.setServerVersion(serverVersion);
        entity.setRobotWait(robotWait);
        entity.setRobotBattery(robotBattery);
        entity.setRobotName(robotName);
        entity.setRobotVersion(robotVersion);
        entity.setRobotFirmwareName(robotFirmwareName);
        entity.setRobotSensorvalues(robotSensorvalues);
        entity.setRobotNepoexitvalue(robotNepoexitvalue);
        entity.setRobotState(robotState);
        entity.setNotificationsAvailable(notificationsAvailable);
        entity.setUserId(userId);
        entity.setUserAccountName(userAccountName);
        entity.setUserName(userName);
        entity.setUserEmail(userEmail);
        entity.setIsYoungerThen14(isYoungerThen14);
        entity.immutable();
        return entity;
    }
    
    /**
     * the response for the /getUser REST request
     */
    public static GetUserResponse make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }
    
    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public GetUserResponse merge(JSONObject jsonO) {
        try {
            for (String key : JSONObject.getNames(jsonO)) {
                if ("_version".equals(key)) {
                } else if ("cmd".equals(key)) {
                    setCmd(jsonO.optString(key));
                } else if ("rc".equals(key)) {
                    setRc(jsonO.getString(key));
                } else if ("message".equals(key)) {
                    setMessage(jsonO.optString(key));
                } else if ("cause".equals(key)) {
                    setCause(jsonO.optString(key));
                } else if ("parameters".equals(key)) {
                    setParameters(jsonO.optJSONObject(key));
                } else if ("initToken".equals(key)) {
                    setInitToken(jsonO.getString(key));
                } else if ("serverTime".equals(key)) {
                    setServerTime(jsonO.getLong(key));
                } else if ("serverVersion".equals(key)) {
                    setServerVersion(jsonO.getString(key));
                } else if ("robotWait".equals(key)) {
                    setRobotWait(jsonO.optLong(key));
                } else if ("robotBattery".equals(key)) {
                    setRobotBattery(jsonO.optString(key));
                } else if ("robotName".equals(key)) {
                    setRobotName(jsonO.optString(key));
                } else if ("robotVersion".equals(key)) {
                    setRobotVersion(jsonO.optString(key));
                } else if ("robotFirmwareName".equals(key)) {
                    setRobotFirmwareName(jsonO.optString(key));
                } else if ("robotSensorvalues".equals(key)) {
                    setRobotSensorvalues(jsonO.optJSONObject(key));
                } else if ("robotNepoexitvalue".equals(key)) {
                    setRobotNepoexitvalue(jsonO.optInt(key));
                } else if ("robotState".equals(key)) {
                    setRobotState(jsonO.optString(key));
                } else if ("notificationsAvailable".equals(key)) {
                    setNotificationsAvailable(jsonO.optBoolean(key));
                } else if ("userId".equals(key)) {
                    setUserId(jsonO.getInt(key));
                } else if ("userAccountName".equals(key)) {
                    setUserAccountName(jsonO.getString(key));
                } else if ("userName".equals(key)) {
                    setUserName(jsonO.optString(key));
                } else if ("userEmail".equals(key)) {
                    setUserEmail(jsonO.getString(key));
                } else if ("isYoungerThen14".equals(key)) {
                    setIsYoungerThen14(jsonO.getBoolean(key));
                } else {
                    throw new RuntimeException("JSON parse error. Found invalid key: " + key + " in " + jsonO);
                }
            }
            return this;
        } catch (Exception e) {
            throw new RuntimeException("JSON parse / casting error when parsing: " + jsonO, e);
        }
    }
    
    /**
     * moves a bean from state "under construction" to state "immutable".<br>
     * Checks whether all required fields are set. All lists are made immutable.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public GetUserResponse immutable() {
        if (this.immutable) {
            return this;
        }
        this.immutable = true;
        return validate();
    }
    
    /**
     * Checks whether all required fields are set.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    private GetUserResponse validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "GetUserResponse-object is already immutable: " + toString();
        }
        if ( rc == null) {
            _message = "required property rc of GetUserResponse-object is not set: " + toString();
        }
        if ( initToken == null) {
            _message = "required property initToken of GetUserResponse-object is not set: " + toString();
        }
        if ( !serverTimeDefined) {
            _message = "required property serverTime of GetUserResponse-object is not set: " + toString();
        }
        if ( serverVersion == null) {
            _message = "required property serverVersion of GetUserResponse-object is not set: " + toString();
        }
        if ( !userIdDefined) {
            _message = "required property userId of GetUserResponse-object is not set: " + toString();
        }
        if ( userAccountName == null) {
            _message = "required property userAccountName of GetUserResponse-object is not set: " + toString();
        }
        if ( userEmail == null) {
            _message = "required property userEmail of GetUserResponse-object is not set: " + toString();
        }
        if ( !isYoungerThen14Defined) {
            _message = "required property isYoungerThen14 of GetUserResponse-object is not set: " + toString();
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }
    
    /**
     * GET userId. Object must be immutable. Never return null or an undefined/default value.
     */
    public int getUserId() {
        if (!this.immutable) {
            throw new RuntimeException("no userId from an object under construction: " + toString());
        }
        return this.userId;
    }
    
    /**
     * SET userId. Object must be mutable.
     */
    public GetUserResponse setUserId(int userId) {
        if (this.immutable) {
            throw new RuntimeException("userId assigned to an immutable object: " + toString());
        }
        this.userId = userId;
        this.userIdDefined = true;
        return this;
    }
    
    /**
     * GET userAccountName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getUserAccountName() {
        if (!this.immutable) {
            throw new RuntimeException("no userAccountName from an object under construction: " + toString());
        }
        return this.userAccountName;
    }
    
    /**
     * SET userAccountName. Object must be mutable.
     */
    public GetUserResponse setUserAccountName(String userAccountName) {
        if (this.immutable) {
            throw new RuntimeException("userAccountName assigned to an immutable object: " + toString());
        }
        this.userAccountName = userAccountName;
        return this;
    }
    
    /**
     * GET userName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getUserName() {
        if (!this.immutable) {
            throw new RuntimeException("no userName from an object under construction: " + toString());
        }
        return this.userName;
    }
    
    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean userNameDefined() {
        return this.userName != null;
    }
    
    /**
     * SET userName. Object must be mutable.
     */
    public GetUserResponse setUserName(String userName) {
        if (this.immutable) {
            throw new RuntimeException("userName assigned to an immutable object: " + toString());
        }
        this.userName = userName;
        return this;
    }
    
    /**
     * GET userEmail. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getUserEmail() {
        if (!this.immutable) {
            throw new RuntimeException("no userEmail from an object under construction: " + toString());
        }
        return this.userEmail;
    }
    
    /**
     * SET userEmail. Object must be mutable.
     */
    public GetUserResponse setUserEmail(String userEmail) {
        if (this.immutable) {
            throw new RuntimeException("userEmail assigned to an immutable object: " + toString());
        }
        this.userEmail = userEmail;
        return this;
    }
    
    /**
     * GET isYoungerThen14. Object must be immutable. Never return null or an undefined/default value.
     */
    public boolean getIsYoungerThen14() {
        if (!this.immutable) {
            throw new RuntimeException("no isYoungerThen14 from an object under construction: " + toString());
        }
        return this.isYoungerThen14;
    }
    
    /**
     * SET isYoungerThen14. Object must be mutable.
     */
    public GetUserResponse setIsYoungerThen14(boolean isYoungerThen14) {
        if (this.immutable) {
            throw new RuntimeException("isYoungerThen14 assigned to an immutable object: " + toString());
        }
        this.isYoungerThen14 = isYoungerThen14;
        this.isYoungerThen14Defined = true;
        return this;
    }
    
    /**
     * generates a JSON-object from an immutable bean.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public JSONObject toJson() {
        if (!this.immutable) {
            throw new RuntimeException("no JSON from an object under construction: " + toString());
        }
        JSONObject jsonO = new JSONObject();
        try {
            jsonO.put("_version", "1");
            if (this.cmd != null) {
                jsonO.put("cmd", this.cmd);
            }
            jsonO.put("rc", this.rc);
            if (this.message != null) {
                jsonO.put("message", this.message);
            }
            if (this.cause != null) {
                jsonO.put("cause", this.cause);
            }
            if (this.parameters != null) {
                jsonO.put("parameters", this.parameters);
            }
            jsonO.put("initToken", this.initToken);
            jsonO.put("serverTime", this.serverTime);
            jsonO.put("serverVersion", this.serverVersion);
            if (this.robotWaitDefined) {
                jsonO.put("robotWait", this.robotWait);
            }
            if (this.robotBattery != null) {
                jsonO.put("robotBattery", this.robotBattery);
            }
            if (this.robotName != null) {
                jsonO.put("robotName", this.robotName);
            }
            if (this.robotVersion != null) {
                jsonO.put("robotVersion", this.robotVersion);
            }
            if (this.robotFirmwareName != null) {
                jsonO.put("robotFirmwareName", this.robotFirmwareName);
            }
            if (this.robotSensorvalues != null) {
                jsonO.put("robotSensorvalues", this.robotSensorvalues);
            }
            if (this.robotNepoexitvalueDefined) {
                jsonO.put("robotNepoexitvalue", this.robotNepoexitvalue);
            }
            if (this.robotState != null) {
                jsonO.put("robotState", this.robotState);
            }
            if (this.notificationsAvailableDefined) {
                jsonO.put("notificationsAvailable", this.notificationsAvailable);
            }
            jsonO.put("userId", this.userId);
            jsonO.put("userAccountName", this.userAccountName);
            if (this.userName != null) {
                jsonO.put("userName", this.userName);
            }
            jsonO.put("userEmail", this.userEmail);
            jsonO.put("isYoungerThen14", this.isYoungerThen14);
        } catch (JSONException e) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }
    
    @Override
    public String toString() {
        return "GetUserResponse [immutable=" + this.immutable + ", cmd=" + this.cmd + ", rc=" + this.rc + ", message=" + this.message + ", cause=" + this.cause + ", parameters=" + this.parameters + ", initToken=" + this.initToken + ", serverTime=" + this.serverTime + ", serverVersion=" + this.serverVersion + ", robotWait=" + this.robotWait + ", robotBattery=" + this.robotBattery + ", robotName=" + this.robotName + ", robotVersion=" + this.robotVersion + ", robotFirmwareName=" + this.robotFirmwareName + ", robotSensorvalues=" + this.robotSensorvalues + ", robotNepoexitvalue=" + this.robotNepoexitvalue + ", robotState=" + this.robotState + ", notificationsAvailable=" + this.notificationsAvailable + ", userId=" + this.userId + ", userAccountName=" + this.userAccountName + ", userName=" + this.userName + ", userEmail=" + this.userEmail + ", isYoungerThen14=" + this.isYoungerThen14 + " ]";
    }
    @Override
    public int hashCode() {
        throw new RuntimeException("no hashCode from transport beans!");
    }
    
    @Override
    public boolean equals(Object obj) {
        throw new RuntimeException("no equals from transport beans!");
    }
    
}
