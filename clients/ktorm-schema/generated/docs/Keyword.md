
# Table `Keyword`
(mapped from: Keyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Keyword ID . | 
**matchType** | match_type | long NOT NULL |  | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) |  [foreignkey]
**parentId** | parent_id | text NOT NULL |  | **kotlin.String** | Keyword parent entity ID (advertiser, campaign, ad group). |  [readonly]
**value** | value | text NOT NULL |  | **kotlin.String** | Keyword value (120 chars max). | 
**archived** | archived | boolean |  | **kotlin.Boolean** |  |  [optional]
**bid** | bid | int |  | **kotlin.Int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. |  [optional]
**parentType** | parent_type | text |  | **kotlin.String** | Parent entity type (advertiser, campaign, ad group). |  [optional] [readonly]
**type** | type | text |  | **kotlin.String** | Always keyword |  [optional] [readonly]










