# openapi::AdAccountsAudienceUpdate

Resource create or update operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Ad account ID. | [optional] [Pattern: ^\\d+$] 
**audience_type** | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [Enum: ] 
**description** | **character** | Audience description. | [optional] 
**name** | **character** | Audience name. | [optional] 
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) | Audience operation type (update or remove). Only valid in update request body. | [optional] [Enum: ] 
**rule** | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  | [optional] 


