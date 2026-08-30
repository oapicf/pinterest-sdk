# CatalogsRetailFeed

Catalogs Retail Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**created_at** | **datetime** |  | [readonly] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_country** | [**Country**](Country.md) |  | 
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
from pinterestsdk.models.catalogs_retail_feed import CatalogsRetailFeed

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailFeed from a JSON string
catalogs_retail_feed_instance = CatalogsRetailFeed.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailFeed.to_json())

# convert the object into a dict
catalogs_retail_feed_dict = catalogs_retail_feed_instance.to_dict()
# create an instance of CatalogsRetailFeed from a dict
catalogs_retail_feed_from_dict = CatalogsRetailFeed.from_dict(catalogs_retail_feed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


