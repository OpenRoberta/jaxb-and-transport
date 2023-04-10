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
 * for future use! Replaces the bad dottet names. Data about the state of the robot<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class RobotInfo {
    protected boolean immutable = false;
    protected long wait;
    protected boolean waitDefined = false;
    protected String battery;
    protected String name;
    protected String version;
    protected String firmwareName;
    protected JSONObject sensorvalues;
    protected int nepoexitvalue;
    protected boolean nepoexitvalueDefined = false;
    
    /**
     * for future use! Replaces the bad dottet names. Data about the state of the robot
     */
    public static RobotInfo make() {
        return new RobotInfo();
    }
    
    /**
     * for future use! Replaces the bad dottet names. Data about the state of the robot
     */
    public static RobotInfo makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch (JSONException e) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }
    
    /**
     * for future use! Replaces the bad dottet names. Data about the state of the robot
     */
    public static RobotInfo makeFromProperties(long wait,String battery,String name,String version,String firmwareName,JSONObject sensorvalues,int nepoexitvalue) {
        RobotInfo entity = new RobotInfo();
        entity.setWait(wait);
        entity.setBattery(battery);
        entity.setName(name);
        entity.setVersion(version);
        entity.setFirmwareName(firmwareName);
        entity.setSensorvalues(sensorvalues);
        entity.setNepoexitvalue(nepoexitvalue);
        entity.immutable();
        return entity;
    }
    
    /**
     * for future use! Replaces the bad dottet names. Data about the state of the robot
     */
    public static RobotInfo make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }
    
    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public RobotInfo merge(JSONObject jsonO) {
        try {
            for (String key : JSONObject.getNames(jsonO)) {
                if ("_version".equals(key)) {
                } else if ("wait".equals(key)) {
                    setWait(jsonO.getLong(key));
                } else if ("battery".equals(key)) {
                    setBattery(jsonO.getString(key));
                } else if ("name".equals(key)) {
                    setName(jsonO.getString(key));
                } else if ("version".equals(key)) {
                    setVersion(jsonO.getString(key));
                } else if ("firmwareName".equals(key)) {
                    setFirmwareName(jsonO.getString(key));
                } else if ("sensorvalues".equals(key)) {
                    setSensorvalues(jsonO.getJSONObject(key));
                } else if ("nepoexitvalue".equals(key)) {
                    setNepoexitvalue(jsonO.getInt(key));
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
    public RobotInfo immutable() {
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
    private RobotInfo validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "RobotInfo-object is already immutable: " + toString();
        }
        if ( !waitDefined) {
            _message = "required property wait of RobotInfo-object is not set: " + toString();
        }
        if ( battery == null) {
            _message = "required property battery of RobotInfo-object is not set: " + toString();
        }
        if ( name == null) {
            _message = "required property name of RobotInfo-object is not set: " + toString();
        }
        if ( version == null) {
            _message = "required property version of RobotInfo-object is not set: " + toString();
        }
        if ( firmwareName == null) {
            _message = "required property firmwareName of RobotInfo-object is not set: " + toString();
        }
        if ( sensorvalues == null) {
            _message = "required property sensorvalues of RobotInfo-object is not set: " + toString();
        }
        if ( !nepoexitvalueDefined) {
            _message = "required property nepoexitvalue of RobotInfo-object is not set: " + toString();
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }
    
    /**
     * GET wait. Object must be immutable. Never return null or an undefined/default value.
     */
    public long getWait() {
        if (!this.immutable) {
            throw new RuntimeException("no wait from an object under construction: " + toString());
        }
        return this.wait;
    }
    
    /**
     * SET wait. Object must be mutable.
     */
    public RobotInfo setWait(long wait) {
        if (this.immutable) {
            throw new RuntimeException("wait assigned to an immutable object: " + toString());
        }
        this.wait = wait;
        this.waitDefined = true;
        return this;
    }
    
    /**
     * GET battery. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getBattery() {
        if (!this.immutable) {
            throw new RuntimeException("no battery from an object under construction: " + toString());
        }
        return this.battery;
    }
    
    /**
     * SET battery. Object must be mutable.
     */
    public RobotInfo setBattery(String battery) {
        if (this.immutable) {
            throw new RuntimeException("battery assigned to an immutable object: " + toString());
        }
        this.battery = battery;
        return this;
    }
    
    /**
     * GET name. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getName() {
        if (!this.immutable) {
            throw new RuntimeException("no name from an object under construction: " + toString());
        }
        return this.name;
    }
    
    /**
     * SET name. Object must be mutable.
     */
    public RobotInfo setName(String name) {
        if (this.immutable) {
            throw new RuntimeException("name assigned to an immutable object: " + toString());
        }
        this.name = name;
        return this;
    }
    
    /**
     * GET version. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getVersion() {
        if (!this.immutable) {
            throw new RuntimeException("no version from an object under construction: " + toString());
        }
        return this.version;
    }
    
    /**
     * SET version. Object must be mutable.
     */
    public RobotInfo setVersion(String version) {
        if (this.immutable) {
            throw new RuntimeException("version assigned to an immutable object: " + toString());
        }
        this.version = version;
        return this;
    }
    
    /**
     * GET firmwareName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getFirmwareName() {
        if (!this.immutable) {
            throw new RuntimeException("no firmwareName from an object under construction: " + toString());
        }
        return this.firmwareName;
    }
    
    /**
     * SET firmwareName. Object must be mutable.
     */
    public RobotInfo setFirmwareName(String firmwareName) {
        if (this.immutable) {
            throw new RuntimeException("firmwareName assigned to an immutable object: " + toString());
        }
        this.firmwareName = firmwareName;
        return this;
    }
    
    /**
     * GET sensorvalues. Object must be immutable. Never return null or an undefined/default value.
     */
    public JSONObject getSensorvalues() {
        if (!this.immutable) {
            throw new RuntimeException("no sensorvalues from an object under construction: " + toString());
        }
        return this.sensorvalues;
    }
    
    /**
     * SET sensorvalues. Object must be mutable.
     */
    public RobotInfo setSensorvalues(JSONObject sensorvalues) {
        if (this.immutable) {
            throw new RuntimeException("sensorvalues assigned to an immutable object: " + toString());
        }
        this.sensorvalues = sensorvalues;
        return this;
    }
    
    /**
     * GET nepoexitvalue. Object must be immutable. Never return null or an undefined/default value.
     */
    public int getNepoexitvalue() {
        if (!this.immutable) {
            throw new RuntimeException("no nepoexitvalue from an object under construction: " + toString());
        }
        return this.nepoexitvalue;
    }
    
    /**
     * SET nepoexitvalue. Object must be mutable.
     */
    public RobotInfo setNepoexitvalue(int nepoexitvalue) {
        if (this.immutable) {
            throw new RuntimeException("nepoexitvalue assigned to an immutable object: " + toString());
        }
        this.nepoexitvalue = nepoexitvalue;
        this.nepoexitvalueDefined = true;
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
            jsonO.put("wait", this.wait);
            jsonO.put("battery", this.battery);
            jsonO.put("name", this.name);
            jsonO.put("version", this.version);
            jsonO.put("firmwareName", this.firmwareName);
            jsonO.put("sensorvalues", this.sensorvalues);
            jsonO.put("nepoexitvalue", this.nepoexitvalue);
        } catch (JSONException e) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }
    
    @Override
    public String toString() {
        return "RobotInfo [immutable=" + this.immutable + ", wait=" + this.wait + ", battery=" + this.battery + ", name=" + this.name + ", version=" + this.version + ", firmwareName=" + this.firmwareName + ", sensorvalues=" + this.sensorvalues + ", nepoexitvalue=" + this.nepoexitvalue + " ]";
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