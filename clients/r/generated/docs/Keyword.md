# openapi::Keyword


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **character** |  | [optional] 
**id** | **character** | Keyword ID . | [optional] [Pattern: ^\\d+$] 
**parent_id** | **character** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] [Pattern: ^\\d+$] 
**parent_type** | **character** | Parent entity type | [optional] 
**type** | **character** | Always keyword | [optional] 
**bid** | **integer** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | [Enum: ] 
**value** | **character** | Keyword value (120 chars max). | 


