
# Table `KeywordUpdateBody`
(mapped from: KeywordUpdateBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordUpdate&gt;**](KeywordUpdate.md) | Keywords to update. Object array. Each object has 3 possible fields:&lt;br&gt;1. \&quot;id\&quot;: (required) keyword ID&lt;br&gt;2. \&quot;archived\&quot;: boolean. Should keyword be archived?&lt;br&gt;3. \&quot;bid\&quot;: number&lt;br&gt;For example: [{\&quot;id\&quot;:\&quot;2886610576653\&quot;, \&quot;archived\&quot;: false, \&quot;bid\&quot;: 20000}, {\&quot;id\&quot;:\&quot;2886610576654\&quot;,  \&quot;archived\&quot;: true, \&quot;bid\&quot;: 20000}, ...] | 


# **Table `KeywordUpdateBodyKeywordUpdate`**
(mapped from: KeywordUpdateBodyKeywordUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordUpdateBody | keywordUpdateBody | long | | kotlin.Long | Primary Key | *one*
keywordUpdate | keywordUpdate | long | | kotlin.Long | Foreign Key | *many*



