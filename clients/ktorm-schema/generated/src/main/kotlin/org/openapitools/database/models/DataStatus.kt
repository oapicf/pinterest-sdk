/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
* Metrics availablity, e.g., \"READY\".
* Values: PROCESSING,READY,ESTIMATE,BEFORE_BUSINESS_CREATED,BEFORE_DATA_RETENTION_PERIOD,BEFORE_PIN_DATA_RETENTION_PERIOD,BEFORE_METRIC_START_DATE,BEFORE_CORE_METRIC_START_DATE,BEFORE_PIN_FORMAT_METRIC_START_DATE,BEFORE_AUDIENCE_METRIC_START_DATE,BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE,BEFORE_VIDEO_METRIC_START_DATE,BEFORE_CONVERSION_METRIC_START_DATE,PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD,IN_BAD_TAG_DATE,BEFORE_PUBLISHED_METRIC_START_DATE,BEFORE_ASSIST_METRIC_START_DATE,BEFORE_PIN_CREATED,BEFORE_ACCOUNT_CLAIMED,BEFORE_DEMOGRAPHIC_FILTERS_START_DATE,AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD,AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD,BEFORE_PRODUCT_GROUP_FILTER_START_DATE
*/

enum class DataStatus(val value: kotlin.String){


    PROCESSING("PROCESSING"),


    READY("READY"),


    ESTIMATE("ESTIMATE"),


    BEFORE_BUSINESS_CREATED("BEFORE_BUSINESS_CREATED"),


    BEFORE_DATA_RETENTION_PERIOD("BEFORE_DATA_RETENTION_PERIOD"),


    BEFORE_PIN_DATA_RETENTION_PERIOD("BEFORE_PIN_DATA_RETENTION_PERIOD"),


    BEFORE_METRIC_START_DATE("BEFORE_METRIC_START_DATE"),


    BEFORE_CORE_METRIC_START_DATE("BEFORE_CORE_METRIC_START_DATE"),


    BEFORE_PIN_FORMAT_METRIC_START_DATE("BEFORE_PIN_FORMAT_METRIC_START_DATE"),


    BEFORE_AUDIENCE_METRIC_START_DATE("BEFORE_AUDIENCE_METRIC_START_DATE"),


    BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE"),


    BEFORE_VIDEO_METRIC_START_DATE("BEFORE_VIDEO_METRIC_START_DATE"),


    BEFORE_CONVERSION_METRIC_START_DATE("BEFORE_CONVERSION_METRIC_START_DATE"),


    PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD"),


    IN_BAD_TAG_DATE("IN_BAD_TAG_DATE"),


    BEFORE_PUBLISHED_METRIC_START_DATE("BEFORE_PUBLISHED_METRIC_START_DATE"),


    BEFORE_ASSIST_METRIC_START_DATE("BEFORE_ASSIST_METRIC_START_DATE"),


    BEFORE_PIN_CREATED("BEFORE_PIN_CREATED"),


    BEFORE_ACCOUNT_CLAIMED("BEFORE_ACCOUNT_CLAIMED"),


    BEFORE_DEMOGRAPHIC_FILTERS_START_DATE("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE"),


    AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD"),


    AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD"),


    BEFORE_PRODUCT_GROUP_FILTER_START_DATE("BEFORE_PRODUCT_GROUP_FILTER_START_DATE");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}
