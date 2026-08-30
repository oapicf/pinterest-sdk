# openapi::AdAccountToBusinessSharedAudience


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **character** | Unique identifier of an audience | [Pattern: ^\\d+$] 
**permissions** | [**array[Role]**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**recipient_business_ids** | **array[character]** | Business IDs to share with or revoke from (request) / that received the audience (response). | 


