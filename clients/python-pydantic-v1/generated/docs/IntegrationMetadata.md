# IntegrationMetadata

Integration metadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_id_1** | **str** |  | [optional] 
**connected_advertiser_id** | **str** |  | [optional] 
**connected_lba_id** | **str** |  | [optional] 
**connected_merchant_id** | **str** |  | [optional] 
**connected_tag_id** | **str** |  | [optional] 
**connected_user_id** | **str** |  | [optional] [readonly] 
**created_timestamp** | **float** |  | [optional] [readonly] 
**external_business_id** | **str** | External business ID for the integration. | [optional] 
**id** | **str** |  | [optional] [readonly] 
**partner_access_token_expiry** | **float** |  | [optional] 
**partner_metadata** | **str** |  | [optional] 
**partner_refresh_token_expiry** | **float** |  | [optional] 
**scopes** | **str** |  | [optional] 
**updated_timestamp** | **float** |  | [optional] [readonly] 

## Example

```python
from openapi_client.models.integration_metadata import IntegrationMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationMetadata from a JSON string
integration_metadata_instance = IntegrationMetadata.from_json(json)
# print the JSON string representation of the object
print IntegrationMetadata.to_json()

# convert the object into a dict
integration_metadata_dict = integration_metadata_instance.to_dict()
# create an instance of IntegrationMetadata from a dict
integration_metadata_from_dict = IntegrationMetadata.from_dict(integration_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


