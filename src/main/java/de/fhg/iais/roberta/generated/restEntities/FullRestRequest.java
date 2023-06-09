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
 * full request for the /init call with initToken, logging and request data<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class FullRestRequest {
    protected boolean immutable = false;
    protected String initToken;
    protected List<String> log;
    protected JSONObject data;
    
    /**
     * full request for the /init call with initToken, logging and request data
     */
    public static FullRestRequest make() {
        return new FullRestRequest();
    }
    
    /**
     * full request for the /init call with initToken, logging and request data
     */
    public static FullRestRequest makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch (JSONException e) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }
    
    /**
     * full request for the /init call with initToken, logging and request data
     */
    public static FullRestRequest makeFromProperties(String initToken,List<String> log,JSONObject data) {
        FullRestRequest entity = new FullRestRequest();
        entity.setInitToken(initToken);
        entity.setLog(log);
        entity.setData(data);
        entity.immutable();
        return entity;
    }
    
    /**
     * full request for the /init call with initToken, logging and request data
     */
    public static FullRestRequest make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }
    
    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public FullRestRequest merge(JSONObject jsonO) {
        try {
            for (String key : JSONObject.getNames(jsonO)) {
                if ("_version".equals(key)) {
                } else if ("initToken".equals(key)) {
                    setInitToken(jsonO.getString(key));
                } else if ("log".equals(key)) {
                    JSONArray array = jsonO.optJSONArray(key);
                    if (array != null && array.length() > 0) {
                        for (int i = 0; i < array.length(); i++) {
                            addLog(array.getString(i));
                        }
                    } else {
                        setLog(new ArrayList<String>());
                    }
                } else if ("data".equals(key)) {
                    setData(jsonO.getJSONObject(key));
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
    public FullRestRequest immutable() {
        if (this.immutable) {
            return this;
        }
        this.immutable = true;
        this.log = (this.log != null) ? Collections.unmodifiableList(this.log) : null;
        return validate();
    }
    
    /**
     * Checks whether all required fields are set.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    private FullRestRequest validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "FullRestRequest-object is already immutable: " + toString();
        }
        if ( initToken == null) {
            _message = "required property initToken of FullRestRequest-object is not set: " + toString();
        }
        if ( log == null) {
            _message = "required property log of FullRestRequest-object is not set: " + toString();
        }
        if ( data == null) {
            _message = "required property data of FullRestRequest-object is not set: " + toString();
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }
    
    /**
     * GET initToken. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getInitToken() {
        if (!this.immutable) {
            throw new RuntimeException("no initToken from an object under construction: " + toString());
        }
        return this.initToken;
    }
    
    /**
     * SET initToken. Object must be mutable.
     */
    public FullRestRequest setInitToken(String initToken) {
        if (this.immutable) {
            throw new RuntimeException("initToken assigned to an immutable object: " + toString());
        }
        this.initToken = initToken;
        return this;
    }
    
    /**
     * GET log. Object must be immutable. Never return null or an undefined/default value.
     */
    public List<String> getLog() {
        if (!this.immutable) {
            throw new RuntimeException("no log from an object under construction: " + toString());
        }
        return this.log;
    }
    
    /**
     * SET log. Object must be mutable.
     */
    public FullRestRequest setLog(List<String> log) {
        if (this.immutable) {
            throw new RuntimeException("log assigned to an immutable object: " + toString());
        }
        if ( this.log == null ) {
            this.log = new ArrayList<String>();
        }
        this.log.addAll(log);
        return this;
    }
    
    /**
     * ADD log. Object must be mutable.
     */
    public FullRestRequest addLog(String log) {
        if (this.immutable) {
            throw new RuntimeException("log assigned to an immutable object: " + toString());
        }
        if ( this.log == null ) {
            this.log = new ArrayList<String>();
        }
        this.log.add(log);
        return this;
    }
    
    /**
     * ADD ALL log. Object must be mutable.
     */
    public FullRestRequest addAllLog(List<String> log) {
        if (this.immutable) {
            throw new RuntimeException("log assigned to an immutable object: " + toString());
        }
        if ( this.log == null ) {
            this.log = new ArrayList<String>();
        }
        this.log.addAll(log);
        return this;
    }
    
    /**
     * GET data. Object must be immutable. Never return null or an undefined/default value.
     */
    public JSONObject getData() {
        if (!this.immutable) {
            throw new RuntimeException("no data from an object under construction: " + toString());
        }
        return this.data;
    }
    
    /**
     * SET data. Object must be mutable.
     */
    public FullRestRequest setData(JSONObject data) {
        if (this.immutable) {
            throw new RuntimeException("data assigned to an immutable object: " + toString());
        }
        this.data = data;
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
            jsonO.put("initToken", this.initToken);
            {
                JSONArray array = new JSONArray();
                for (String item : this.log) {
                    array.put(item);
                }
                jsonO.put("log", array);
            }
            jsonO.put("data", this.data);
        } catch (JSONException e) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }
    
    @Override
    public String toString() {
        return "FullRestRequest [immutable=" + this.immutable + ", initToken=" + this.initToken + ", log=" + this.log + ", data=" + this.data + " ]";
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
