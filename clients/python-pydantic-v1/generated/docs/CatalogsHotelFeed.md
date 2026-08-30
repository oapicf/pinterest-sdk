# CatalogsHotelFeed

Catalogs Hotel Feed object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalog_type** | **str** |  | 
**created_at** | **datetime** |  | [readonly] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**default_locale** | **str** | The locale used within a feed for product descriptions. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**id** | **str** | ID of the feed entity. | [readonly] 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **str** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**updated_at** | **datetime** |  | [readonly] 

## Example

```python
from openapi_client.models.catalogs_hotel_feed import CatalogsHotelFeed

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelFeed from a JSON string
catalogs_hotel_feed_instance = CatalogsHotelFeed.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelFeed.to_json()

# convert the object into a dict
catalogs_hotel_feed_dict = catalogs_hotel_feed_instance.to_dict()
# create an instance of CatalogsHotelFeed from a dict
catalogs_hotel_feed_from_dict = CatalogsHotelFeed.from_dict(catalogs_hotel_feed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


