# pinterestsdk.model.catalogs_item_validation_issues.CatalogsItemValidationIssues

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**item_id** | None, str,  | NoneClass, str,  | The merchant-created unique ID that represents the product. | 
**warnings** | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  | 
**item_number** | decimal.Decimal, int,  | decimal.Decimal,  | Item number based on order of appearance in the Catalogs Feed. For example, &#x27;0&#x27; refers to first item found in a feed that was downloaded from a &#x27;location&#x27; specified during feed creation. | 
**errors** | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

