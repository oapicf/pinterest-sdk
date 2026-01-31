# AdAccountsCountryResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**AdCountry**](AdCountry.md) |  | [optional] 
**currency** | **str** | Country currency. | [optional] 
**index** | **float** | Country index | [optional] 
**name** | **str** | Country name | [optional] 

## Example

```python
from pinterestsdk.models.ad_accounts_country_response_data import AdAccountsCountryResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsCountryResponseData from a JSON string
ad_accounts_country_response_data_instance = AdAccountsCountryResponseData.from_json(json)
# print the JSON string representation of the object
print(AdAccountsCountryResponseData.to_json())

# convert the object into a dict
ad_accounts_country_response_data_dict = ad_accounts_country_response_data_instance.to_dict()
# create an instance of AdAccountsCountryResponseData from a dict
ad_accounts_country_response_data_from_dict = AdAccountsCountryResponseData.from_dict(ad_accounts_country_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


