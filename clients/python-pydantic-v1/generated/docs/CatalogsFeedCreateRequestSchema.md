# CatalogsFeedCreateRequestSchema


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_country** | [**Country**](Country.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**default_locale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **str** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.catalogs_feed_create_request_schema import CatalogsFeedCreateRequestSchema

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedCreateRequestSchema from a JSON string
catalogs_feed_create_request_schema_instance = CatalogsFeedCreateRequestSchema.from_json(json)
# print the JSON string representation of the object
print CatalogsFeedCreateRequestSchema.to_json()

# convert the object into a dict
catalogs_feed_create_request_schema_dict = catalogs_feed_create_request_schema_instance.to_dict()
# create an instance of CatalogsFeedCreateRequestSchema from a dict
catalogs_feed_create_request_schema_from_dict = CatalogsFeedCreateRequestSchema.from_dict(catalogs_feed_create_request_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


