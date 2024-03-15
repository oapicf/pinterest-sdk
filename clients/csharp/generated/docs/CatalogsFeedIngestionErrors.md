# Org.OpenAPITools.Model.CatalogsFeedIngestionErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LINE_LEVEL_INTERNAL_ERROR** | **int** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] 
**LARGE_PRODUCT_COUNT_DECREASE** | **int** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] 
**ACCOUNT_FLAGGED** | **int** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] 
**IMAGE_LEVEL_INTERNAL_ERROR** | **int** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] 
**IMAGE_FILE_NOT_ACCESSIBLE** | **int** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGE_MALFORMED_URL** | **int** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] 
**IMAGE_FILE_NOT_FOUND** | **int** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGE_INVALID_FILE** | **int** | Image files are unreadable. Please upload new files to continue. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

