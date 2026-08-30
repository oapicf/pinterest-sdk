# CatalogsProductGroupCurrencyCriteria

A currency filter. This filter cannot be negated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**negated** | **bool** |  | [optional] 
**values** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_currency_criteria import CatalogsProductGroupCurrencyCriteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupCurrencyCriteria from a JSON string
catalogs_product_group_currency_criteria_instance = CatalogsProductGroupCurrencyCriteria.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupCurrencyCriteria.to_json())

# convert the object into a dict
catalogs_product_group_currency_criteria_dict = catalogs_product_group_currency_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupCurrencyCriteria from a dict
catalogs_product_group_currency_criteria_from_dict = CatalogsProductGroupCurrencyCriteria.from_dict(catalogs_product_group_currency_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


