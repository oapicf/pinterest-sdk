package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedVideoCounts {
    /* The number of videos successfully ingested from the feed file. */
    Integer ingestedVideos
    /* The number of videos that were not ingested from the feed file. */
    Integer notIngestedVideos
    /* The number of videos in the feed file. */
    Integer totalVideos
}
