package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BusinessAccessUserSummary;

@Canonical
class UserSingleAssetBinding {
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
    
    BusinessAccessUserSummary user
}
