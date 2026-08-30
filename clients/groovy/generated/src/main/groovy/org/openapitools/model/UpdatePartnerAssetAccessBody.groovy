package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdatePartnerAssetAccessItem;

@Canonical
class UpdatePartnerAssetAccessBody {
    /* List of partner asset accesses to assign or update. */
    List<UpdatePartnerAssetAccessItem> accesses = new ArrayList<>()
}
