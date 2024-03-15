# CatalogsFeedIngestionErrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_level_internal_error** | **i32** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] [default to None]
**large_product_count_decrease** | **i32** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] [default to None]
**account_flagged** | **i32** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] [default to None]
**image_level_internal_error** | **i32** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] [default to None]
**image_file_not_accessible** | **i32** | Image files are unreadable. Please upload new files to continue. | [optional] [default to None]
**image_malformed_url** | **i32** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] [default to None]
**image_file_not_found** | **i32** | Image files are unreadable. Please upload new files to continue. | [optional] [default to None]
**image_invalid_file** | **i32** | Image files are unreadable. Please upload new files to continue. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


