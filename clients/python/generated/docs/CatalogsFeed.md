# CatalogsFeed

Catalogs Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**id** | **str** |  | 
**updated_at** | **datetime** |  | 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**default_country** | [**Country**](Country.md) |  | 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | 
**default_locale** | **str** | The locale used within a feed for product descriptions. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **str** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**catalog_id** | **str** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

## Example

```python
from pinterestsdk.models.catalogs_feed import CatalogsFeed

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeed from a JSON string
catalogs_feed_instance = CatalogsFeed.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeed.to_json())

# convert the object into a dict
catalogs_feed_dict = catalogs_feed_instance.to_dict()
# create an instance of CatalogsFeed from a dict
catalogs_feed_from_dict = CatalogsFeed.from_dict(catalogs_feed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


