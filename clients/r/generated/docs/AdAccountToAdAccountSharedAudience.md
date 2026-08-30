# openapi::AdAccountToAdAccountSharedAudience


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **character** | Unique identifier of an audience | [Pattern: ^\\d+$] 
**permissions** | [**array[Role]**](Role.md) | Permissions granted to the recipients. | [optional] [readonly] 
**recipient_account_ids** | **array[character]** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 


