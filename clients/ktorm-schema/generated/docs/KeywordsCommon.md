
# Table `KeywordsCommon`
(mapped from: KeywordsCommon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**matchType** | match_type | long NOT NULL |  | [**MatchTypeResponse**](MatchTypeResponse.md) |  |  [foreignkey]
**value** | value | text NOT NULL |  | **kotlin.String** | Keyword value (120 chars max). | 
**bid** | bid | int |  | **kotlin.Int** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. |  [optional]





