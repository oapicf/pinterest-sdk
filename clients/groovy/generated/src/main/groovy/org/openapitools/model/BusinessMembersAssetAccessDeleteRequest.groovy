package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequestAccessesInner;

@Canonical
class BusinessMembersAssetAccessDeleteRequest {
    /* List of members asset access to be deleted */
    List<BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses = new ArrayList<>()
}
