# CatalogsItemValidationIssues


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  | 
**item_id** | **str** | The merchant-created unique ID that represents the product. | 
**item_number** | **int** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | 
**warnings** | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_item_validation_issues import CatalogsItemValidationIssues

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemValidationIssues from a JSON string
catalogs_item_validation_issues_instance = CatalogsItemValidationIssues.from_json(json)
# print the JSON string representation of the object
print(CatalogsItemValidationIssues.to_json())

# convert the object into a dict
catalogs_item_validation_issues_dict = catalogs_item_validation_issues_instance.to_dict()
# create an instance of CatalogsItemValidationIssues from a dict
catalogs_item_validation_issues_from_dict = CatalogsItemValidationIssues.from_dict(catalogs_item_validation_issues_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


