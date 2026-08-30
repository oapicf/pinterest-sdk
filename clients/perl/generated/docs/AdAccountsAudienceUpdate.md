# WWW::OpenAPIClient::Object::AdAccountsAudienceUpdate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdAccountsAudienceUpdate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] 
**audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] 
**description** | **string** | Audience description. | [optional] 
**name** | **string** | Audience name. | [optional] 
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) | Audience operation type (update or remove). Only valid in update request body. | [optional] 
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


