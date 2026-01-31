# IntegrationRequest

Schema used for creating the integration metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_id_1** | **str** |  | [optional] 
**connected_advertiser_id** | **str** |  | [optional] 
**connected_lba_id** | **str** |  | [optional] 
**connected_merchant_id** | **str** |  | [optional] 
**connected_tag_id** | **str** |  | [optional] 
**external_business_id** | **str** | External business ID for the integration. | [optional] 
**partner_access_token** | **str** |  | [optional] 
**partner_access_token_expiry** | **int** |  | [optional] 
**partner_metadata** | **str** |  | [optional] 
**partner_primary_email** | **str** |  | [optional] 
**partner_refresh_token** | **str** |  | [optional] 
**partner_refresh_token_expiry** | **int** |  | [optional] 
**scopes** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_request import IntegrationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationRequest from a JSON string
integration_request_instance = IntegrationRequest.from_json(json)
# print the JSON string representation of the object
print(IntegrationRequest.to_json())

# convert the object into a dict
integration_request_dict = integration_request_instance.to_dict()
# create an instance of IntegrationRequest from a dict
integration_request_from_dict = IntegrationRequest.from_dict(integration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


