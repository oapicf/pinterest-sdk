# AdAccountsCountry


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**Country**](Country.md) |  | 
**currency** | **str** | Country currency. | 
**index** | **float** | Country index | 
**name** | **str** | Country name | 

## Example

```python
from openapi_client.models.ad_accounts_country import AdAccountsCountry

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountsCountry from a JSON string
ad_accounts_country_instance = AdAccountsCountry.from_json(json)
# print the JSON string representation of the object
print AdAccountsCountry.to_json()

# convert the object into a dict
ad_accounts_country_dict = ad_accounts_country_instance.to_dict()
# create an instance of AdAccountsCountry from a dict
ad_accounts_country_from_dict = AdAccountsCountry.from_dict(ad_accounts_country_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


