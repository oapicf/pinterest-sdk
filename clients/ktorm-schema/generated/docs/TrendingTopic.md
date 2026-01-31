
# Table `TrendingTopic`
(mapped from: TrendingTopic)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**description** | description | text NOT NULL |  | **kotlin.String** | Description of the trending topic | 
**percentGrowthMom** | percent_growth_mom | int NOT NULL |  | **kotlin.Int** | Month-over-month growth percentage | 
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TrendingPin&gt;**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**relatedInterests** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of related interest categories | 
**relatedSearches** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of related search terms | 
**timeSeries** | time_series | blob NOT NULL |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | Time series data showing trend values over time, with dates as keys and values as numeric | 
**title** | title | text NOT NULL |  | **kotlin.String** | Title of the trending topic | 




# **Table `TrendingTopicTrendingPin`**
(mapped from: TrendingTopicTrendingPin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendingTopic | trendingTopic | long | | kotlin.Long | Primary Key | *one*
trendingPin | trendingPin | long | | kotlin.Long | Foreign Key | *many*



# **Table `TrendingTopicRelatedInterests`**
(mapped from: TrendingTopicRelatedInterests)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendingTopic | trendingTopic | long | | kotlin.Long | Primary Key | *one*
relatedInterests | relatedInterests | text | | kotlin.String | Foreign Key | *many*



# **Table `TrendingTopicRelatedSearches`**
(mapped from: TrendingTopicRelatedSearches)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendingTopic | trendingTopic | long | | kotlin.Long | Primary Key | *one*
relatedSearches | relatedSearches | text | | kotlin.String | Foreign Key | *many*





