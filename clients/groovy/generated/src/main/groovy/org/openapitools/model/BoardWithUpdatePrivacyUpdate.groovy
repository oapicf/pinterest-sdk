package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardUpdatePrivacy;

@Canonical
class BoardWithUpdatePrivacyUpdate {
    
    String description
    /*      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
    String name
    
    BoardUpdatePrivacy privacy
}
