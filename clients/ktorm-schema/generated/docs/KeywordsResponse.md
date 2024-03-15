
# Table `KeywordsResponse`
(mapped from: KeywordsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordError&gt;**](KeywordError.md) |  |  [optional]
**keywords** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Keyword&gt;**](Keyword.md) |  |  [optional]


# **Table `KeywordsResponseKeywordError`**
(mapped from: KeywordsResponseKeywordError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordsResponse | keywordsResponse | long | | kotlin.Long | Primary Key | *one*
keywordError | keywordError | long | | kotlin.Long | Foreign Key | *many*



# **Table `KeywordsResponseKeyword`**
(mapped from: KeywordsResponseKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordsResponse | keywordsResponse | long | | kotlin.Long | Primary Key | *one*
keyword | keyword | long | | kotlin.Long | Foreign Key | *many*



