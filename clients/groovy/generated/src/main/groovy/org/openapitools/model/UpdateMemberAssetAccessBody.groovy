package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateMemberAssetAccessItem;

@Canonical
class UpdateMemberAssetAccessBody {
    /* List of member asset accesses to assign or update. */
    List<UpdateMemberAssetAccessItem> accesses = new ArrayList<>()
}
