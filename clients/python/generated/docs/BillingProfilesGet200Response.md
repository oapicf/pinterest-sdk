# BillingProfilesGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[BillingProfilesResponse]**](BillingProfilesResponse.md) |  | 

## Example

```python
from pinterestsdk.models.billing_profiles_get200_response import BillingProfilesGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BillingProfilesGet200Response from a JSON string
billing_profiles_get200_response_instance = BillingProfilesGet200Response.from_json(json)
# print the JSON string representation of the object
print(BillingProfilesGet200Response.to_json())

# convert the object into a dict
billing_profiles_get200_response_dict = billing_profiles_get200_response_instance.to_dict()
# create an instance of BillingProfilesGet200Response from a dict
billing_profiles_get200_response_from_dict = BillingProfilesGet200Response.from_dict(billing_profiles_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


