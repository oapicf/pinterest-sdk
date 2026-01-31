# ProductCategoriesDemographic

Age and gender distribution who engaged with this product category in the past 3 months

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **Dict[str, float]** | Age demographic distribution | 
**gender** | [**GenderDemographics**](GenderDemographics.md) |  | 

## Example

```python
from pinterestsdk.models.product_categories_demographic import ProductCategoriesDemographic

# TODO update the JSON string below
json = "{}"
# create an instance of ProductCategoriesDemographic from a JSON string
product_categories_demographic_instance = ProductCategoriesDemographic.from_json(json)
# print the JSON string representation of the object
print(ProductCategoriesDemographic.to_json())

# convert the object into a dict
product_categories_demographic_dict = product_categories_demographic_instance.to_dict()
# create an instance of ProductCategoriesDemographic from a dict
product_categories_demographic_from_dict = ProductCategoriesDemographic.from_dict(product_categories_demographic_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


