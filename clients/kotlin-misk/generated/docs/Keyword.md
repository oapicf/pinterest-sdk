
# Keyword

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Keyword ID . | 
**matchType** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**parentId** | **kotlin.String** | Keyword parent entity ID (advertiser, campaign, ad group). |  [readonly]
**&#x60;value&#x60;** | **kotlin.String** | Keyword value (120 chars max). | 
**archived** | **kotlin.Boolean** |  |  [optional]
**bid** | **kotlin.Int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. |  [optional]
**parentType** | **kotlin.String** | Parent entity type (advertiser, campaign, ad group). |  [optional] [readonly]
**type** | **kotlin.String** | Always keyword |  [optional] [readonly]



