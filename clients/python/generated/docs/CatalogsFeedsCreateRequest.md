# CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_country** | [**Country**](Country.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **str** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **str** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to 'ACTIVE']

## Example

```python
from pinterestsdk.models.catalogs_feeds_create_request import CatalogsFeedsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedsCreateRequest from a JSON string
catalogs_feeds_create_request_instance = CatalogsFeedsCreateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedsCreateRequest.to_json())

# convert the object into a dict
catalogs_feeds_create_request_dict = catalogs_feeds_create_request_instance.to_dict()
# create an instance of CatalogsFeedsCreateRequest from a dict
catalogs_feeds_create_request_from_dict = CatalogsFeedsCreateRequest.from_dict(catalogs_feeds_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


