# CatalogsFeedValidationDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**CatalogsFeedValidationErrors**](CatalogsFeedValidationErrors.md) |  | 
**warnings** | [**CatalogsFeedValidationWarnings**](CatalogsFeedValidationWarnings.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_feed_validation_details import CatalogsFeedValidationDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedValidationDetails from a JSON string
catalogs_feed_validation_details_instance = CatalogsFeedValidationDetails.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedValidationDetails.to_json())

# convert the object into a dict
catalogs_feed_validation_details_dict = catalogs_feed_validation_details_instance.to_dict()
# create an instance of CatalogsFeedValidationDetails from a dict
catalogs_feed_validation_details_from_dict = CatalogsFeedValidationDetails.from_dict(catalogs_feed_validation_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


