# AdAccountsCountryResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdAccountsCountryResponseData]**](AdAccountsCountryResponseData.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_accounts_country_response import AdAccountsCountryResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsCountryResponse from a JSON string
ad_accounts_country_response_instance = AdAccountsCountryResponse.from_json(json)
# print the JSON string representation of the object
print(AdAccountsCountryResponse.to_json())

# convert the object into a dict
ad_accounts_country_response_dict = ad_accounts_country_response_instance.to_dict()
# create an instance of AdAccountsCountryResponse from a dict
ad_accounts_country_response_from_dict = AdAccountsCountryResponse.from_dict(ad_accounts_country_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


