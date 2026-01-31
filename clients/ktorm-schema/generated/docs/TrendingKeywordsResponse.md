
# Table `TrendingKeywordsResponse`
(mapped from: TrendingKeywordsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**trends** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TrendingKeyword&gt;**](TrendingKeyword.md) | The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend. |  [optional]


# **Table `TrendingKeywordsResponseTrendingKeyword`**
(mapped from: TrendingKeywordsResponseTrendingKeyword)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendingKeywordsResponse | trendingKeywordsResponse | long | | kotlin.Long | Primary Key | *one*
trendingKeyword | trendingKeyword | long | | kotlin.Long | Foreign Key | *many*



