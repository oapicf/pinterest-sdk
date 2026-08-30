# Org.OpenAPITools.Model.Keyword

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Keyword ID . | 
**ParentId** | **string** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] 
**Value** | **string** | Keyword value (120 chars max). | 
**Archived** | **bool** |  | [optional] 
**Bid** | **int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | **MatchType** | Keyword [match type](/docs/api-features/targeting-overview/) | 
**ParentType** | **string** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] 
**Type** | **string** | Always keyword | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

