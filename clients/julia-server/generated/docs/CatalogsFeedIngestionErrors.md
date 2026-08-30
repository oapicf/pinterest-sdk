# CatalogsFeedIngestionErrors


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ACCOUNT_FLAGGED`** | **`Int64`** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] [default to nothing]
**`FETCH_GOOGLE_SHEET_NOT_SHARED`** | **`Int64`** | Update your Google Sheets sharing settings to &#39;Anyone with link&#39; as a Viewer so that Pinterest can access your file. | [optional] [default to nothing]
**`IMAGE_FILE_NOT_ACCESSIBLE`** | **`Int64`** | Image files are unreadable. Please upload new files to continue. | [optional] [default to nothing]
**`IMAGE_FILE_NOT_FOUND`** | **`Int64`** | Image files are unreadable. Please upload new files to continue. | [optional] [default to nothing]
**`IMAGE_INVALID_FILE`** | **`Int64`** | Image files are unreadable. Please upload new files to continue. | [optional] [default to nothing]
**`IMAGE_LEVEL_INTERNAL_ERROR`** | **`Int64`** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] [default to nothing]
**`IMAGE_MALFORMED_URL`** | **`Int64`** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] [default to nothing]
**`LARGE_PRODUCT_COUNT_DECREASE`** | **`Int64`** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] [default to nothing]
**`LINE_LEVEL_INTERNAL_ERROR`** | **`Int64`** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


