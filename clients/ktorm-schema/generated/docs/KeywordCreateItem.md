
# Table `KeywordCreateItem`
(mapped from: KeywordCreateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**matchType** | match_type | long NOT NULL |  | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) |  [foreignkey]
**value** | value | text NOT NULL |  | **kotlin.String** | Keyword value (120 chars max). | 
**bid** | bid | int |  | **kotlin.Int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. |  [optional]





