
# CatalogsFeedIngestionErrors

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **LINE_LEVEL_INTERNAL_ERROR** | **kotlin.Int** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. |  [optional] |
| **LARGE_PRODUCT_COUNT_DECREASE** | [**inline**](#LARGEPRODUCTCOUNTDECREASE) | The product count has decreased by more than 99% compared to the last successful ingestion. |  [optional] |
| **ACCOUNT_FLAGGED** | **kotlin.Int** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. |  [optional] |
| **IMAGE_LEVEL_INTERNAL_ERROR** | **kotlin.Int** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. |  [optional] |
| **IMAGE_FILE_NOT_ACCESSIBLE** | **kotlin.Int** | Image files are unreadable. Please upload new files to continue. |  [optional] |
| **IMAGE_MALFORMED_URL** | **kotlin.Int** | Image files are unreadable. Please check your link and upload new files to continue. |  [optional] |
| **IMAGE_FILE_NOT_FOUND** | **kotlin.Int** | Image files are unreadable. Please upload new files to continue. |  [optional] |
| **IMAGE_INVALID_FILE** | **kotlin.Int** | Image files are unreadable. Please upload new files to continue. |  [optional] |


<a id="LARGEPRODUCTCOUNTDECREASE"></a>
## Enum: LARGE_PRODUCT_COUNT_DECREASE
| Name | Value |
| ---- | ----- |
| LARGE_PRODUCT_COUNT_DECREASE | 1 |



