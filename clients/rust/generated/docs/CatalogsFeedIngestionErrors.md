# CatalogsFeedIngestionErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_level_internal_error** | Option<**i32**> | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional]
**large_product_count_decrease** | Option<**i32**> | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional]
**account_flagged** | Option<**i32**> | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional]
**image_level_internal_error** | Option<**i32**> | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional]
**image_file_not_accessible** | Option<**i32**> | Image files are unreadable. Please upload new files to continue. | [optional]
**image_malformed_url** | Option<**i32**> | Image files are unreadable. Please check your link and upload new files to continue. | [optional]
**image_file_not_found** | Option<**i32**> | Image files are unreadable. Please upload new files to continue. | [optional]
**image_invalid_file** | Option<**i32**> | Image files are unreadable. Please upload new files to continue. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


