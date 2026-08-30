# openapi::Keyword


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **character** |  | [optional] 
**bid** | **integer** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**id** | **character** | Keyword ID . | [Pattern: ^\\d+$] 
**match_type** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | [Enum: ] 
**parent_id** | **character** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] [Pattern: ^\\d+$] 
**parent_type** | **character** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] 
**type** | **character** | Always keyword | [optional] [readonly] 
**value** | **character** | Keyword value (120 chars max). | 


