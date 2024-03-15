package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedIngestionWarnings {
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    Integer ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
    /* Additional image files are unreadable. Please upload new files to continue. */
    Integer ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
    /* Additional image files are unreadable. Please check your link and upload new files to continue. */
    Integer ADDITIONAL_IMAGE_MALFORMED_URL
    /* Additional image files are unreadable. Please upload new files to continue. */
    Integer ADDITIONAL_IMAGE_FILE_NOT_FOUND
    /* Additional image files are unreadable. Please upload new files to continue. */
    Integer ADDITIONAL_IMAGE_INVALID_FILE
    /* price is not a supported column. Use base_price and sale_price instead. */
    Integer HOTEL_PRICE_HEADER_IS_PRESENT
}
