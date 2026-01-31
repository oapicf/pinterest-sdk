# BrandAccountsCreate200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand_account_id** | **str** | id of the newly created brand account | [optional] 

## Example

```python
from pinterestsdk.models.brand_accounts_create200_response import BrandAccountsCreate200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BrandAccountsCreate200Response from a JSON string
brand_accounts_create200_response_instance = BrandAccountsCreate200Response.from_json(json)
# print the JSON string representation of the object
print(BrandAccountsCreate200Response.to_json())

# convert the object into a dict
brand_accounts_create200_response_dict = brand_accounts_create200_response_instance.to_dict()
# create an instance of BrandAccountsCreate200Response from a dict
brand_accounts_create200_response_from_dict = BrandAccountsCreate200Response.from_dict(brand_accounts_create200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


