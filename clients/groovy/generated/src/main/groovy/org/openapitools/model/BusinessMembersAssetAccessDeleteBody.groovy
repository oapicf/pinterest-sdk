package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DeleteMemberAssetAccessItem;

@Canonical
class BusinessMembersAssetAccessDeleteBody {
    /* List of members asset access to be deleted */
    List<DeleteMemberAssetAccessItem> accesses = new ArrayList<>()
}
