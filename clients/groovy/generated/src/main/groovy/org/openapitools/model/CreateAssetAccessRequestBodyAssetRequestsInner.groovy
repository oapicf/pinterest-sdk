package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.Permissions;

@Canonical
class CreateAssetAccessRequestBodyAssetRequestsInner {
    /* Unique identifier of a business partner to request asset access to. */
    String partnerId
    /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
    Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>()
}
