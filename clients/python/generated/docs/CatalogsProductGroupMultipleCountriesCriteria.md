# CatalogsProductGroupMultipleCountriesCriteria


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**negated** | **bool** |  | [optional] [default to False]
**values** | [**List[Country]**](Country.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_multiple_countries_criteria import CatalogsProductGroupMultipleCountriesCriteria

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupMultipleCountriesCriteria from a JSON string
catalogs_product_group_multiple_countries_criteria_instance = CatalogsProductGroupMultipleCountriesCriteria.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupMultipleCountriesCriteria.to_json())

# convert the object into a dict
catalogs_product_group_multiple_countries_criteria_dict = catalogs_product_group_multiple_countries_criteria_instance.to_dict()
# create an instance of CatalogsProductGroupMultipleCountriesCriteria from a dict
catalogs_product_group_multiple_countries_criteria_from_dict = CatalogsProductGroupMultipleCountriesCriteria.from_dict(catalogs_product_group_multiple_countries_criteria_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


