# Keyword

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **bool** |  | [optional] [default to None]
**bid** | **i32** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to None]
**id** | **String** | Keyword ID . | 
**match_type** | [***models::MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**parent_id** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] 
**parent_type** | **String** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] [default to None]
**r#type** | **String** | Always keyword | [optional] [readonly] [default to None]
**value** | **String** | Keyword value (120 chars max). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


