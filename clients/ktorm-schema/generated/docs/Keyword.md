
# Table `Keyword`
(mapped from: Keyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**matchType** | match_type | long NOT NULL |  | [**MatchTypeResponse**](MatchTypeResponse.md) |  |  [foreignkey]
**value** | value | text NOT NULL |  | **kotlin.String** | Keyword value (120 chars max). | 
**bid** | bid | int |  | **kotlin.Int** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. |  [optional]
**archived** | archived | boolean |  | **kotlin.Boolean** |  |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Keyword ID . |  [optional]
**parentId** | parent_id | text |  | **kotlin.String** | Keyword parent entity ID (advertiser, campaign, ad group). |  [optional]
**parentType** | parent_type | text |  | **kotlin.String** | Parent entity type |  [optional]
**type** | type | text |  | **kotlin.String** | Always keyword |  [optional]










