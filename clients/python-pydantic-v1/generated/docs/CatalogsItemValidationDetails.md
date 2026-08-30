# CatalogsItemValidationDetails


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute_name** | [**NullableCatalogsItemFieldType**](NullableCatalogsItemFieldType.md) | Attribute that has a validation issue. | 
**provided_value** | **str** | Provided value that caused the validation issue. | 

## Example

```python
from openapi_client.models.catalogs_item_validation_details import CatalogsItemValidationDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemValidationDetails from a JSON string
catalogs_item_validation_details_instance = CatalogsItemValidationDetails.from_json(json)
# print the JSON string representation of the object
print CatalogsItemValidationDetails.to_json()

# convert the object into a dict
catalogs_item_validation_details_dict = catalogs_item_validation_details_instance.to_dict()
# create an instance of CatalogsItemValidationDetails from a dict
catalogs_item_validation_details_from_dict = CatalogsItemValidationDetails.from_dict(catalogs_item_validation_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


