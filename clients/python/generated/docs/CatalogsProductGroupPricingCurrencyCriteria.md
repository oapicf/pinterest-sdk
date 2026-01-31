# CatalogsProductGroupPricingCurrencyCriteria


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**negated** | **bool** |  | [optional] [default to False]
**operator** | **str** |  | 
**value** | **float** |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_pricing_currency_criteria import CatalogsProductGroupPricingCurrencyCriteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupPricingCurrencyCriteria from a JSON string
catalogs_product_group_pricing_currency_criteria_instance = CatalogsProductGroupPricingCurrencyCriteria.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupPricingCurrencyCriteria.to_json())

# convert the object into a dict
catalogs_product_group_pricing_currency_criteria_dict = catalogs_product_group_pricing_currency_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupPricingCurrencyCriteria from a dict
catalogs_product_group_pricing_currency_criteria_from_dict = CatalogsProductGroupPricingCurrencyCriteria.from_dict(catalogs_product_group_pricing_currency_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


