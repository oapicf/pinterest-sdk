# keyword_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **int** |  | [optional] 
**bid** | **int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**id** | **char \*** | Keyword ID . | 
**match_type** | **match_type_t \*** | Keyword [match type](/docs/api-features/targeting-overview/) | 
**parent_id** | **char \*** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] 
**parent_type** | **char \*** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] 
**type** | **char \*** | Always keyword | [optional] [readonly] 
**value** | **char \*** | Keyword value (120 chars max). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


