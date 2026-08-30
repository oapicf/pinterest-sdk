# openapi::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **character** | Unique identifier of an audience | [Pattern: ^\\d+$] 
**operation_type** | [**OperationType**](OperationType.md) |  | [Enum: ] 
**recipient_account_ids** | **array[character]** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 


