
# Table `KeywordsMetricsArrayResponse`
(mapped from: KeywordsMetricsArrayResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;KeywordMetricsResponse&gt;**](KeywordMetricsResponse.md) |  |  [optional]


# **Table `KeywordsMetricsArrayResponseKeywordMetricsResponse`**
(mapped from: KeywordsMetricsArrayResponseKeywordMetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
keywordsMetricsArrayResponse | keywordsMetricsArrayResponse | long | | kotlin.Long | Primary Key | *one*
keywordMetricsResponse | keywordMetricsResponse | long | | kotlin.Long | Foreign Key | *many*



