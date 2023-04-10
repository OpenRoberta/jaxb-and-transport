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
 * the response for the /listing request<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class ListingResponse extends BaseResponse {
    protected String programName;
    protected String progXML;
    protected String configName;
    protected String confXML;
    protected long lastChanged;
    protected boolean lastChangedDefined = false;
    
    /**
     * the response for the /listing request
     */
    public static ListingResponse make() {
        return new ListingResponse();
    }
    
    /**
     * the response for the /listing request
     */
    public static ListingResponse makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch (JSONException e) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }
    
    /**
     * the response for the /listing request
     */
    public static ListingResponse makeFromProperties(String cmd,String rc,String message,String cause,JSONObject parameters,String initToken,long serverTime,String serverVersion,long robotWait,String robotBattery,String robotName,String robotVersion,String robotFirmwareName,JSONObject robotSensorvalues,int robotNepoexitvalue,String robotState,boolean notificationsAvailable,String programName,String progXML,String configName,String confXML,long lastChanged) {
        ListingResponse entity = new ListingResponse();
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
        entity.setProgramName(programName);
        entity.setProgXML(progXML);
        entity.setConfigName(configName);
        entity.setConfXML(confXML);
        entity.setLastChanged(lastChanged);
        entity.immutable();
        return entity;
    }
    
    /**
     * the response for the /listing request
     */
    public static ListingResponse make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }
    
    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public ListingResponse merge(JSONObject jsonO) {
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
                } else if ("server.time".equals(key)) {
                    setServerTime(jsonO.getLong(key));
                } else if ("server.version".equals(key)) {
                    setServerVersion(jsonO.getString(key));
                } else if ("robot.wait".equals(key)) {
                    setRobotWait(jsonO.optLong(key));
                } else if ("robot.battery".equals(key)) {
                    setRobotBattery(jsonO.optString(key));
                } else if ("robot.name".equals(key)) {
                    setRobotName(jsonO.optString(key));
                } else if ("robot.version".equals(key)) {
                    setRobotVersion(jsonO.optString(key));
                } else if ("robot.firmwareName".equals(key)) {
                    setRobotFirmwareName(jsonO.optString(key));
                } else if ("robot.sensorvalues".equals(key)) {
                    setRobotSensorvalues(jsonO.optJSONObject(key));
                } else if ("robot.nepoexitvalue".equals(key)) {
                    setRobotNepoexitvalue(jsonO.optInt(key));
                } else if ("robot.state".equals(key)) {
                    setRobotState(jsonO.optString(key));
                } else if ("notifications.available".equals(key)) {
                    setNotificationsAvailable(jsonO.optBoolean(key));
                } else if ("programName".equals(key)) {
                    setProgramName(jsonO.optString(key));
                } else if ("progXML".equals(key)) {
                    setProgXML(jsonO.getString(key));
                } else if ("configName".equals(key)) {
                    setConfigName(jsonO.optString(key));
                } else if ("confXML".equals(key)) {
                    setConfXML(jsonO.optString(key));
                } else if ("lastChanged".equals(key)) {
                    setLastChanged(jsonO.getLong(key));
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
    public ListingResponse immutable() {
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
    private ListingResponse validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "ListingResponse-object is already immutable: " + toString();
        }
        if ( rc == null) {
            _message = "required property rc of ListingResponse-object is not set: " + toString();
        }
        if ( initToken == null) {
            _message = "required property initToken of ListingResponse-object is not set: " + toString();
        }
        if ( !serverTimeDefined) {
            _message = "required property serverTime of ListingResponse-object is not set: " + toString();
        }
        if ( serverVersion == null) {
            _message = "required property serverVersion of ListingResponse-object is not set: " + toString();
        }
        if ( progXML == null) {
            _message = "required property progXML of ListingResponse-object is not set: " + toString();
        }
        if ( !lastChangedDefined) {
            _message = "required property lastChanged of ListingResponse-object is not set: " + toString();
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }
    
    /**
     * GET programName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getProgramName() {
        if (!this.immutable) {
            throw new RuntimeException("no programName from an object under construction: " + toString());
        }
        return this.programName;
    }
    
    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean programNameDefined() {
        return this.programName != null;
    }
    
    /**
     * SET programName. Object must be mutable.
     */
    public ListingResponse setProgramName(String programName) {
        if (this.immutable) {
            throw new RuntimeException("programName assigned to an immutable object: " + toString());
        }
        this.programName = programName;
        return this;
    }
    
    /**
     * GET progXML. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getProgXML() {
        if (!this.immutable) {
            throw new RuntimeException("no progXML from an object under construction: " + toString());
        }
        return this.progXML;
    }
    
    /**
     * SET progXML. Object must be mutable.
     */
    public ListingResponse setProgXML(String progXML) {
        if (this.immutable) {
            throw new RuntimeException("progXML assigned to an immutable object: " + toString());
        }
        this.progXML = progXML;
        return this;
    }
    
    /**
     * GET configName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getConfigName() {
        if (!this.immutable) {
            throw new RuntimeException("no configName from an object under construction: " + toString());
        }
        return this.configName;
    }
    
    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean configNameDefined() {
        return this.configName != null;
    }
    
    /**
     * SET configName. Object must be mutable.
     */
    public ListingResponse setConfigName(String configName) {
        if (this.immutable) {
            throw new RuntimeException("configName assigned to an immutable object: " + toString());
        }
        this.configName = configName;
        return this;
    }
    
    /**
     * GET confXML. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getConfXML() {
        if (!this.immutable) {
            throw new RuntimeException("no confXML from an object under construction: " + toString());
        }
        return this.confXML;
    }
    
    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean confXMLDefined() {
        return this.confXML != null;
    }
    
    /**
     * SET confXML. Object must be mutable.
     */
    public ListingResponse setConfXML(String confXML) {
        if (this.immutable) {
            throw new RuntimeException("confXML assigned to an immutable object: " + toString());
        }
        this.confXML = confXML;
        return this;
    }
    
    /**
     * GET lastChanged. Object must be immutable. Never return null or an undefined/default value.
     */
    public long getLastChanged() {
        if (!this.immutable) {
            throw new RuntimeException("no lastChanged from an object under construction: " + toString());
        }
        return this.lastChanged;
    }
    
    /**
     * SET lastChanged. Object must be mutable.
     */
    public ListingResponse setLastChanged(long lastChanged) {
        if (this.immutable) {
            throw new RuntimeException("lastChanged assigned to an immutable object: " + toString());
        }
        this.lastChanged = lastChanged;
        this.lastChangedDefined = true;
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
            jsonO.put("server.time", this.serverTime);
            jsonO.put("server.version", this.serverVersion);
            if (this.robotWaitDefined) {
                jsonO.put("robot.wait", this.robotWait);
            }
            if (this.robotBattery != null) {
                jsonO.put("robot.battery", this.robotBattery);
            }
            if (this.robotName != null) {
                jsonO.put("robot.name", this.robotName);
            }
            if (this.robotVersion != null) {
                jsonO.put("robot.version", this.robotVersion);
            }
            if (this.robotFirmwareName != null) {
                jsonO.put("robot.firmwareName", this.robotFirmwareName);
            }
            if (this.robotSensorvalues != null) {
                jsonO.put("robot.sensorvalues", this.robotSensorvalues);
            }
            if (this.robotNepoexitvalueDefined) {
                jsonO.put("robot.nepoexitvalue", this.robotNepoexitvalue);
            }
            if (this.robotState != null) {
                jsonO.put("robot.state", this.robotState);
            }
            if (this.notificationsAvailableDefined) {
                jsonO.put("notifications.available", this.notificationsAvailable);
            }
            if (this.programName != null) {
                jsonO.put("programName", this.programName);
            }
            jsonO.put("progXML", this.progXML);
            if (this.configName != null) {
                jsonO.put("configName", this.configName);
            }
            if (this.confXML != null) {
                jsonO.put("confXML", this.confXML);
            }
            jsonO.put("lastChanged", this.lastChanged);
        } catch (JSONException e) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }
    
    @Override
    public String toString() {
        return "ListingResponse [immutable=" + this.immutable + ", cmd=" + this.cmd + ", rc=" + this.rc + ", message=" + this.message + ", cause=" + this.cause + ", parameters=" + this.parameters + ", initToken=" + this.initToken + ", serverTime=" + this.serverTime + ", serverVersion=" + this.serverVersion + ", robotWait=" + this.robotWait + ", robotBattery=" + this.robotBattery + ", robotName=" + this.robotName + ", robotVersion=" + this.robotVersion + ", robotFirmwareName=" + this.robotFirmwareName + ", robotSensorvalues=" + this.robotSensorvalues + ", robotNepoexitvalue=" + this.robotNepoexitvalue + ", robotState=" + this.robotState + ", notificationsAvailable=" + this.notificationsAvailable + ", programName=" + this.programName + ", progXML=" + this.progXML + ", configName=" + this.configName + ", confXML=" + this.confXML + ", lastChanged=" + this.lastChanged + " ]";
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
