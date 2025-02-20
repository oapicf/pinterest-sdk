#
# Pinterest REST API
# Pinterest's REST API
# Version: 5.14.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Enum DataStatus.

.DESCRIPTION

Metrics availablity, e.g., ""READY"".
#>

enum DataStatus {
    # enum value: "PROCESSING"
    PROCESSING
    # enum value: "READY"
    READY
    # enum value: "ESTIMATE"
    ESTIMATE
    # enum value: "BEFORE_BUSINESS_CREATED"
    BEFORE_BUSINESS_CREATED
    # enum value: "BEFORE_DATA_RETENTION_PERIOD"
    BEFORE_DATA_RETENTION_PERIOD
    # enum value: "BEFORE_PIN_DATA_RETENTION_PERIOD"
    BEFORE_PIN_DATA_RETENTION_PERIOD
    # enum value: "BEFORE_METRIC_START_DATE"
    BEFORE_METRIC_START_DATE
    # enum value: "BEFORE_CORE_METRIC_START_DATE"
    BEFORE_CORE_METRIC_START_DATE
    # enum value: "BEFORE_PIN_FORMAT_METRIC_START_DATE"
    BEFORE_PIN_FORMAT_METRIC_START_DATE
    # enum value: "BEFORE_AUDIENCE_METRIC_START_DATE"
    BEFORE_AUDIENCE_METRIC_START_DATE
    # enum value: "BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE"
    BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE
    # enum value: "BEFORE_VIDEO_METRIC_START_DATE"
    BEFORE_VIDEO_METRIC_START_DATE
    # enum value: "BEFORE_CONVERSION_METRIC_START_DATE"
    BEFORE_CONVERSION_METRIC_START_DATE
    # enum value: "PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD"
    PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD
    # enum value: "IN_BAD_TAG_DATE"
    IN_BAD_TAG_DATE
    # enum value: "BEFORE_PUBLISHED_METRIC_START_DATE"
    BEFORE_PUBLISHED_METRIC_START_DATE
    # enum value: "BEFORE_ASSIST_METRIC_START_DATE"
    BEFORE_ASSIST_METRIC_START_DATE
    # enum value: "BEFORE_PIN_CREATED"
    BEFORE_PIN_CREATED
    # enum value: "BEFORE_ACCOUNT_CLAIMED"
    BEFORE_ACCOUNT_CLAIMED
    # enum value: "BEFORE_DEMOGRAPHIC_FILTERS_START_DATE"
    BEFORE_DEMOGRAPHIC_FILTERS_START_DATE
    # enum value: "AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD"
    AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD
    # enum value: "AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD"
    AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD
    # enum value: "BEFORE_PRODUCT_GROUP_FILTER_START_DATE"
    BEFORE_PRODUCT_GROUP_FILTER_START_DATE
}

