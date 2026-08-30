# openapi::CustomerSegmentUpdateRequestUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_ids** | **array[character]** | Audience IDs to update the customer segment to. Only applicable for UPDATE operations. | [optional] 
**id** | **character** | Customer segment ID. | [Pattern: ^\\d+$] 
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | [Enum: ] 


