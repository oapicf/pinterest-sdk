package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.InviteType;
import org.openapitools.model.Permissions;

@Canonical
class CreateAssetInvitesRequestItem {
    /* Unique identifier of an invite. */
    String inviteId
    
    InviteType inviteType
    /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
    Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>()
}
