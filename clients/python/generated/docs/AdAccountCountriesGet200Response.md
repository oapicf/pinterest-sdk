# AdAccountCountriesGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdAccountsCountry]**](AdAccountsCountry.md) |  | 

## Example

```python
from pinterestsdk.models.ad_account_countries_get200_response import AdAccountCountriesGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountCountriesGet200Response from a JSON string
ad_account_countries_get200_response_instance = AdAccountCountriesGet200Response.from_json(json)
# print the JSON string representation of the object
print(AdAccountCountriesGet200Response.to_json())

# convert the object into a dict
ad_account_countries_get200_response_dict = ad_account_countries_get200_response_instance.to_dict()
# create an instance of AdAccountCountriesGet200Response from a dict
ad_account_countries_get200_response_from_dict = AdAccountCountriesGet200Response.from_dict(ad_account_countries_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


