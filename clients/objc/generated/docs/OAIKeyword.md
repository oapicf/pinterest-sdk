# OAIKeyword

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **NSNumber*** |  | [optional] 
**bid** | **NSNumber*** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**_id** | **NSString*** | Keyword ID . | 
**matchType** | [**OAIMatchType***](OAIMatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**parentId** | **NSString*** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] 
**parentType** | **NSString*** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] 
**type** | **NSString*** | Always keyword | [optional] [readonly] 
**value** | **NSString*** | Keyword value (120 chars max). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


