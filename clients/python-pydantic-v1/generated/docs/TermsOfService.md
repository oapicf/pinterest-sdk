# TermsOfService

The ID of the ad account.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | The ID of the ad account. | [optional] 
**has_accepted** | **bool** | Whether the ad account has accepted terms of service. | [optional] 
**html** | **str** | The terms of service content | [optional] 
**id** | **str** | The ID of the terms of service | [optional] 

## Example

```python
from openapi_client.models.terms_of_service import TermsOfService

# TODO update the JSON string below
json = "{}"
# create an instance of TermsOfService from a JSON string
terms_of_service_instance = TermsOfService.from_json(json)
# print the JSON string representation of the object
print TermsOfService.to_json()

# convert the object into a dict
terms_of_service_dict = terms_of_service_instance.to_dict()
# create an instance of TermsOfService from a dict
terms_of_service_from_dict = TermsOfService.from_dict(terms_of_service_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


