# CatalogsFeedUpdateRequestSchema


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**name** | **str** | A human-friendly name associated to a given feed. | [optional] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 

## Example

```python
from openapi_client.models.catalogs_feed_update_request_schema import CatalogsFeedUpdateRequestSchema

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedUpdateRequestSchema from a JSON string
catalogs_feed_update_request_schema_instance = CatalogsFeedUpdateRequestSchema.from_json(json)
# print the JSON string representation of the object
print CatalogsFeedUpdateRequestSchema.to_json()

# convert the object into a dict
catalogs_feed_update_request_schema_dict = catalogs_feed_update_request_schema_instance.to_dict()
# create an instance of CatalogsFeedUpdateRequestSchema from a dict
catalogs_feed_update_request_schema_from_dict = CatalogsFeedUpdateRequestSchema.from_dict(catalogs_feed_update_request_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


