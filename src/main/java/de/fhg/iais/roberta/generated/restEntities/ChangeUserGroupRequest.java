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
 * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class ChangeUserGroupRequest extends BaseRequest {
    protected String groupName;
    protected List<String> groupMemberNames;
    
    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest make() {
        return new ChangeUserGroupRequest();
    }
    
    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch (JSONException e) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }
    
    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest makeFromProperties(String cmd,String groupName,List<String> groupMemberNames) {
        ChangeUserGroupRequest entity = new ChangeUserGroupRequest();
        entity.setCmd(cmd);
        entity.setGroupName(groupName);
        entity.setGroupMemberNames(groupMemberNames);
        entity.immutable();
        return entity;
    }
    
    /**
     * the request description for the /userGroup/createUserGroup and /userGroup/addGroupMembers REST request, returns UserGroupResponse
     */
    public static ChangeUserGroupRequest make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }
    
    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public ChangeUserGroupRequest merge(JSONObject jsonO) {
        try {
            for (String key : JSONObject.getNames(jsonO)) {
                if ("_version".equals(key)) {
                } else if ("cmd".equals(key)) {
                    setCmd(jsonO.optString(key));
                } else if ("groupName".equals(key)) {
                    setGroupName(jsonO.getString(key));
                } else if ("groupMemberNames".equals(key)) {
                    JSONArray array = jsonO.optJSONArray(key);
                    if (array != null && array.length() > 0) {
                        for (int i = 0; i < array.length(); i++) {
                            addGroupMemberNames(array.getString(i));
                        }
                    } else {
                        setGroupMemberNames(new ArrayList<String>());
                    }
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
    public ChangeUserGroupRequest immutable() {
        if (this.immutable) {
            return this;
        }
        this.immutable = true;
        this.groupMemberNames = (this.groupMemberNames != null) ? Collections.unmodifiableList(this.groupMemberNames) : null;
        return validate();
    }
    
    /**
     * Checks whether all required fields are set.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    private ChangeUserGroupRequest validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "ChangeUserGroupRequest-object is already immutable: " + toString();
        }
        if ( groupName == null) {
            _message = "required property groupName of ChangeUserGroupRequest-object is not set: " + toString();
        }
        if ( groupMemberNames == null) {
            _message = "required property groupMemberNames of ChangeUserGroupRequest-object is not set: " + toString();
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }
    
    /**
     * GET groupName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getGroupName() {
        if (!this.immutable) {
            throw new RuntimeException("no groupName from an object under construction: " + toString());
        }
        return this.groupName;
    }
    
    /**
     * SET groupName. Object must be mutable.
     */
    public ChangeUserGroupRequest setGroupName(String groupName) {
        if (this.immutable) {
            throw new RuntimeException("groupName assigned to an immutable object: " + toString());
        }
        this.groupName = groupName;
        return this;
    }
    
    /**
     * GET groupMemberNames. Object must be immutable. Never return null or an undefined/default value.
     */
    public List<String> getGroupMemberNames() {
        if (!this.immutable) {
            throw new RuntimeException("no groupMemberNames from an object under construction: " + toString());
        }
        return this.groupMemberNames;
    }
    
    /**
     * SET groupMemberNames. Object must be mutable.
     */
    public ChangeUserGroupRequest setGroupMemberNames(List<String> groupMemberNames) {
        if (this.immutable) {
            throw new RuntimeException("groupMemberNames assigned to an immutable object: " + toString());
        }
        if ( this.groupMemberNames == null ) {
            this.groupMemberNames = new ArrayList<String>();
        }
        this.groupMemberNames.addAll(groupMemberNames);
        return this;
    }
    
    /**
     * ADD groupMemberNames. Object must be mutable.
     */
    public ChangeUserGroupRequest addGroupMemberNames(String groupMemberNames) {
        if (this.immutable) {
            throw new RuntimeException("groupMemberNames assigned to an immutable object: " + toString());
        }
        if ( this.groupMemberNames == null ) {
            this.groupMemberNames = new ArrayList<String>();
        }
        this.groupMemberNames.add(groupMemberNames);
        return this;
    }
    
    /**
     * ADD ALL groupMemberNames. Object must be mutable.
     */
    public ChangeUserGroupRequest addAllGroupMemberNames(List<String> groupMemberNames) {
        if (this.immutable) {
            throw new RuntimeException("groupMemberNames assigned to an immutable object: " + toString());
        }
        if ( this.groupMemberNames == null ) {
            this.groupMemberNames = new ArrayList<String>();
        }
        this.groupMemberNames.addAll(groupMemberNames);
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
            jsonO.put("groupName", this.groupName);
            {
                JSONArray array = new JSONArray();
                for (String item : this.groupMemberNames) {
                    array.put(item);
                }
                jsonO.put("groupMemberNames", array);
            }
        } catch (JSONException e) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }
    
    @Override
    public String toString() {
        return "ChangeUserGroupRequest [immutable=" + this.immutable + ", cmd=" + this.cmd + ", groupName=" + this.groupName + ", groupMemberNames=" + this.groupMemberNames + " ]";
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