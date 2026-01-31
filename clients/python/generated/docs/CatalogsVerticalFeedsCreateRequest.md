# CatalogsVerticalFeedsCreateRequest

Request object for creating a feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. | [optional] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_country** | [**Country**](Country.md) |  | 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **str** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to 'ACTIVE']

## Example

```python
from pinterestsdk.models.catalogs_vertical_feeds_create_request import CatalogsVerticalFeedsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsVerticalFeedsCreateRequest from a JSON string
catalogs_vertical_feeds_create_request_instance = CatalogsVerticalFeedsCreateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsVerticalFeedsCreateRequest.to_json())

# convert the object into a dict
catalogs_vertical_feeds_create_request_dict = catalogs_vertical_feeds_create_request_instance.to_dict()
# create an instance of CatalogsVerticalFeedsCreateRequest from a dict
catalogs_vertical_feeds_create_request_from_dict = CatalogsVerticalFeedsCreateRequest.from_dict(catalogs_vertical_feeds_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


