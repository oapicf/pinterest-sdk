# CatalogsRetailFeed

Catalogs Retail Feed object

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


