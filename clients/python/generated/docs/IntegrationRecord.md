# IntegrationRecord

Integration record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_id_1** | **str** |  | [optional] 
**connected_advertiser_id** | **str** |  | [optional] [readonly] 
**connected_lba_id** | **str** |  | [optional] 
**connected_merchant_id** | **str** |  | [optional] 
**connected_tag_id** | **str** |  | [optional] 
**connected_user_id** | **str** |  | [optional] [readonly] 
**created_time** | **int** |  | [optional] 
**external_business_id** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**partner_access_token** | **str** |  | [optional] 
**partner_access_token_expiry** | **int** |  | [optional] 
**partner_metadata** | **str** |  | [optional] 
**partner_primary_email** | **str** |  | [optional] 
**partner_refresh_token** | **str** |  | [optional] 
**partner_refresh_token_expiry** | **int** |  | [optional] 
**scopes** | **str** |  | [optional] 
**updated_time** | **int** |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_record import IntegrationRecord

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationRecord from a JSON string
integration_record_instance = IntegrationRecord.from_json(json)
# print the JSON string representation of the object
print(IntegrationRecord.to_json())

# convert the object into a dict
integration_record_dict = integration_record_instance.to_dict()
# create an instance of IntegrationRecord from a dict
integration_record_from_dict = IntegrationRecord.from_dict(integration_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


