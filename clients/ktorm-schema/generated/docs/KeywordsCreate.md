
# Table `KeywordsCreate`
(mapped from: KeywordsCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordCreateItem&gt;**](KeywordCreateItem.md) | Keywords | 
**parentId** | parent_id | text NOT NULL |  | **kotlin.String** | Keyword data | 


# **Table `KeywordsCreateKeywordCreateItem`**
(mapped from: KeywordsCreateKeywordCreateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordsCreate | keywordsCreate | long | | kotlin.Long | Primary Key | *one*
keywordCreateItem | keywordCreateItem | long | | kotlin.Long | Foreign Key | *many*




