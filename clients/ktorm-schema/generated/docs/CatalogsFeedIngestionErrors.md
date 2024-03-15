
# Table `CatalogsFeedIngestionErrors`
(mapped from: CatalogsFeedIngestionErrors)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**LINE_LEVEL_INTERNAL_ERROR** | LINE_LEVEL_INTERNAL_ERROR | int |  | **kotlin.Int** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. |  [optional]
**LARGE_PRODUCT_COUNT_DECREASE** | LARGE_PRODUCT_COUNT_DECREASE | int |  | [**LARGE_PRODUCT_COUNT_DECREASE**](#LARGEPRODUCTCOUNTDECREASE) | The product count has decreased by more than 99% compared to the last successful ingestion. |  [optional]
**ACCOUNT_FLAGGED** | ACCOUNT_FLAGGED | int |  | **kotlin.Int** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. |  [optional]
**IMAGE_LEVEL_INTERNAL_ERROR** | IMAGE_LEVEL_INTERNAL_ERROR | int |  | **kotlin.Int** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. |  [optional]
**IMAGE_FILE_NOT_ACCESSIBLE** | IMAGE_FILE_NOT_ACCESSIBLE | int |  | **kotlin.Int** | Image files are unreadable. Please upload new files to continue. |  [optional]
**IMAGE_MALFORMED_URL** | IMAGE_MALFORMED_URL | int |  | **kotlin.Int** | Image files are unreadable. Please check your link and upload new files to continue. |  [optional]
**IMAGE_FILE_NOT_FOUND** | IMAGE_FILE_NOT_FOUND | int |  | **kotlin.Int** | Image files are unreadable. Please upload new files to continue. |  [optional]
**IMAGE_INVALID_FILE** | IMAGE_INVALID_FILE | int |  | **kotlin.Int** | Image files are unreadable. Please upload new files to continue. |  [optional]










