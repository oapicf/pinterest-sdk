# # CatalogsFeedIngestionErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_level_internal_error** | **int** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional]
**large_product_count_decrease** | **int** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional]
**account_flagged** | **int** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional]
**image_level_internal_error** | **int** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional]
**image_file_not_accessible** | **int** | Image files are unreadable. Please upload new files to continue. | [optional]
**image_malformed_url** | **int** | Image files are unreadable. Please check your link and upload new files to continue. | [optional]
**image_file_not_found** | **int** | Image files are unreadable. Please upload new files to continue. | [optional]
**image_invalid_file** | **int** | Image files are unreadable. Please upload new files to continue. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
