

# Keyword

The class is defined in **[Keyword.java](../../src/main/java/org/openapitools/model/Keyword.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | `Boolean` |  |  [optional property]
**bid** | `Integer` | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. |  [optional property]
**id** | `String` | Keyword ID . | 
**matchType** | `MatchType` | Keyword [match type](/docs/api-features/targeting-overview/) | 
**parentId** | `String` | Keyword parent entity ID (advertiser, campaign, ad group). |  [readonly property]
**parentType** | `String` | Parent entity type (advertiser, campaign, ad group). |  [optional property] [readonly property]
**type** | `String` | Always keyword |  [optional property] [readonly property]
**value** | `String` | Keyword value (120 chars max). | 










