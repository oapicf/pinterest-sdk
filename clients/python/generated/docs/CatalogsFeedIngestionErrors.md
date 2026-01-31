# CatalogsFeedIngestionErrors


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_flagged** | **int** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] 
**fetch_google_sheet_not_shared** | **int** | Update your Google Sheets sharing settings to &#39;Anyone with link&#39; as a Viewer so that Pinterest can access your file. | [optional] 
**image_file_not_accessible** | **int** | Image files are unreadable. Please upload new files to continue. | [optional] 
**image_file_not_found** | **int** | Image files are unreadable. Please upload new files to continue. | [optional] 
**image_invalid_file** | **int** | Image files are unreadable. Please upload new files to continue. | [optional] 
**image_level_internal_error** | **int** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] 
**image_malformed_url** | **int** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] 
**large_product_count_decrease** | **int** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] 
**line_level_internal_error** | **int** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_feed_ingestion_errors import CatalogsFeedIngestionErrors

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedIngestionErrors from a JSON string
catalogs_feed_ingestion_errors_instance = CatalogsFeedIngestionErrors.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedIngestionErrors.to_json())

# convert the object into a dict
catalogs_feed_ingestion_errors_dict = catalogs_feed_ingestion_errors_instance.to_dict()
# create an instance of CatalogsFeedIngestionErrors from a dict
catalogs_feed_ingestion_errors_from_dict = CatalogsFeedIngestionErrors.from_dict(catalogs_feed_ingestion_errors_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


