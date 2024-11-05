
# Table `KeywordUpdate`
(mapped from: KeywordUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Keyword ID. | 
**archived** | archived | boolean |  | **kotlin.Boolean** | Is keyword archived? |  [optional]
**bid** | bid | int |  | **kotlin.Int** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. |  [optional]





