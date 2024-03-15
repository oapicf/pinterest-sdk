package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedIngestionErrors {
    /* We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. */
    Integer LINE_LEVEL_INTERNAL_ERROR

    enum LARGEPRODUCTCOUNTDECREASEEnum {
    
        NUMBER_1(1)
    
        private final Integer value
    
        LARGEPRODUCTCOUNTDECREASEEnum(Integer value) {
            this.value = value
        }
    
        Integer getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The product count has decreased by more than 99% compared to the last successful ingestion. */
    LARGEPRODUCTCOUNTDECREASEEnum LARGE_PRODUCT_COUNT_DECREASE
    /* We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. */
    Integer ACCOUNT_FLAGGED
    /* We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. */
    Integer IMAGE_LEVEL_INTERNAL_ERROR
    /* Image files are unreadable. Please upload new files to continue. */
    Integer IMAGE_FILE_NOT_ACCESSIBLE
    /* Image files are unreadable. Please check your link and upload new files to continue. */
    Integer IMAGE_MALFORMED_URL
    /* Image files are unreadable. Please upload new files to continue. */
    Integer IMAGE_FILE_NOT_FOUND
    /* Image files are unreadable. Please upload new files to continue. */
    Integer IMAGE_INVALID_FILE
}
