# CountryFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**CatalogsProductGroupMultipleCountriesCriteria**](CatalogsProductGroupMultipleCountriesCriteria.md) |  | 

## Example

```python
from openapi_client.models.country_filter import CountryFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CountryFilter from a JSON string
country_filter_instance = CountryFilter.from_json(json)
# print the JSON string representation of the object
print CountryFilter.to_json()

# convert the object into a dict
country_filter_dict = country_filter_instance.to_dict()
# create an instance of CountryFilter from a dict
country_filter_from_dict = CountryFilter.from_dict(country_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


