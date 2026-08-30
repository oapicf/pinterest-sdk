# CatalogsRetailFeedsCreateRequest

Request object for creating a retail feed.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] 
**catalog_type** | **str** |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_country** | [**Country**](Country.md) |  | 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**default_locale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **str** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.catalogs_retail_feeds_create_request import CatalogsRetailFeedsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailFeedsCreateRequest from a JSON string
catalogs_retail_feeds_create_request_instance = CatalogsRetailFeedsCreateRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsRetailFeedsCreateRequest.to_json()

# convert the object into a dict
catalogs_retail_feeds_create_request_dict = catalogs_retail_feeds_create_request_instance.to_dict()
# create an instance of CatalogsRetailFeedsCreateRequest from a dict
catalogs_retail_feeds_create_request_from_dict = CatalogsRetailFeedsCreateRequest.from_dict(catalogs_retail_feeds_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


