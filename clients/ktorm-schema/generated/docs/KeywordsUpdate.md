
# Table `KeywordsUpdate`
(mapped from: KeywordsUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordUpdateItem&gt;**](KeywordUpdateItem.md) | Keywords |  [optional]


# **Table `KeywordsUpdateKeywordUpdateItem`**
(mapped from: KeywordsUpdateKeywordUpdateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordsUpdate | keywordsUpdate | long | | kotlin.Long | Primary Key | *one*
keywordUpdateItem | keywordUpdateItem | long | | kotlin.Long | Foreign Key | *many*



