package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class BoardMedia {
    /* Board cover image. */
    String imageCoverUrl
    /* Board pin thumbnail urls. */
    List<String> pinThumbnailUrls
}
