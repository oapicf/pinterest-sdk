# CatalogsCreativeAssetsFeedsUpdateRequest

Request object for updating a feed.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**name** | **str** | A human-friendly name associated to a given feed. | [optional] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.catalogs_creative_assets_feeds_update_request import CatalogsCreativeAssetsFeedsUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsFeedsUpdateRequest from a JSON string
catalogs_creative_assets_feeds_update_request_instance = CatalogsCreativeAssetsFeedsUpdateRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsFeedsUpdateRequest.to_json()

# convert the object into a dict
catalogs_creative_assets_feeds_update_request_dict = catalogs_creative_assets_feeds_update_request_instance.to_dict()
# create an instance of CatalogsCreativeAssetsFeedsUpdateRequest from a dict
catalogs_creative_assets_feeds_update_request_from_dict = CatalogsCreativeAssetsFeedsUpdateRequest.from_dict(catalogs_creative_assets_feeds_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


