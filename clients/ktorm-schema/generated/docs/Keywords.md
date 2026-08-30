
# Table `Keywords`
(mapped from: Keywords)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordError&gt;**](KeywordError.md) | Keyword error |  [readonly]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Keyword&gt;**](Keyword.md) | Keywords | 


# **Table `KeywordsKeywordError`**
(mapped from: KeywordsKeywordError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywords | keywords | long | | kotlin.Long | Primary Key | *one*
keywordError | keywordError | long | | kotlin.Long | Foreign Key | *many*



# **Table `KeywordsKeyword`**
(mapped from: KeywordsKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywords | keywords | long | | kotlin.Long | Primary Key | *one*
keyword | keyword | long | | kotlin.Long | Foreign Key | *many*



