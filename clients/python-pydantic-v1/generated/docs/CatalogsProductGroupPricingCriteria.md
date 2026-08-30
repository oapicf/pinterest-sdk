# CatalogsProductGroupPricingCriteria


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inclusion** | **bool** |  | [optional] [default to True]
**negated** | **bool** |  | [optional] 
**values** | **float** |  | 

## Example

```python
from openapi_client.models.catalogs_product_group_pricing_criteria import CatalogsProductGroupPricingCriteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupPricingCriteria from a JSON string
catalogs_product_group_pricing_criteria_instance = CatalogsProductGroupPricingCriteria.from_json(json)
# print the JSON string representation of the object
print CatalogsProductGroupPricingCriteria.to_json()

# convert the object into a dict
catalogs_product_group_pricing_criteria_dict = catalogs_product_group_pricing_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupPricingCriteria from a dict
catalogs_product_group_pricing_criteria_from_dict = CatalogsProductGroupPricingCriteria.from_dict(catalogs_product_group_pricing_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


