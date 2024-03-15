# CATALOGS_FEED_INGESTION_ERRORS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LINE_LEVEL_INTERNAL_ERROR** | **INTEGER_32** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] [default to null]
**LARGE_PRODUCT_COUNT_DECREASE** | **INTEGER_32** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] [default to null]
**ACCOUNT_FLAGGED** | **INTEGER_32** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] [default to null]
**IMAGE_LEVEL_INTERNAL_ERROR** | **INTEGER_32** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] [default to null]
**IMAGE_FILE_NOT_ACCESSIBLE** | **INTEGER_32** | Image files are unreadable. Please upload new files to continue. | [optional] [default to null]
**IMAGE_MALFORMED_URL** | **INTEGER_32** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] [default to null]
**IMAGE_FILE_NOT_FOUND** | **INTEGER_32** | Image files are unreadable. Please upload new files to continue. | [optional] [default to null]
**IMAGE_INVALID_FILE** | **INTEGER_32** | Image files are unreadable. Please upload new files to continue. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


