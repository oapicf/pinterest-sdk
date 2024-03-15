

# CatalogsFeedIngestionErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LINE_LEVEL_INTERNAL_ERROR** | **Integer** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. |  [optional]
**LARGE_PRODUCT_COUNT_DECREASE** | [**LARGE_PRODUCT_COUNT_DECREASEEnum**](#LARGE_PRODUCT_COUNT_DECREASEEnum) | The product count has decreased by more than 99% compared to the last successful ingestion. |  [optional]
**ACCOUNT_FLAGGED** | **Integer** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. |  [optional]
**IMAGE_LEVEL_INTERNAL_ERROR** | **Integer** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. |  [optional]
**IMAGE_FILE_NOT_ACCESSIBLE** | **Integer** | Image files are unreadable. Please upload new files to continue. |  [optional]
**IMAGE_MALFORMED_URL** | **Integer** | Image files are unreadable. Please check your link and upload new files to continue. |  [optional]
**IMAGE_FILE_NOT_FOUND** | **Integer** | Image files are unreadable. Please upload new files to continue. |  [optional]
**IMAGE_INVALID_FILE** | **Integer** | Image files are unreadable. Please upload new files to continue. |  [optional]


## Enum: LARGE_PRODUCT_COUNT_DECREASEEnum

Name | Value
---- | -----




