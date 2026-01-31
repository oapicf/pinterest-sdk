
# Table `FeaturedTrend`
(mapped from: FeaturedTrend)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**interest** | interest | long NOT NULL |  | [**InterestsEnum**](InterestsEnum.md) | The main interest category |  [foreignkey]
**market** | market | long |  | [**ProductCategoryRegion**](ProductCategoryRegion.md) | Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.) |  [optional] [foreignkey]
**trends** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TrendingTopic&gt;**](TrendingTopic.md) | List of trending topics within this interest category |  [optional]




# **Table `FeaturedTrendTrendingTopic`**
(mapped from: FeaturedTrendTrendingTopic)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
featuredTrend | featuredTrend | long | | kotlin.Long | Primary Key | *one*
trendingTopic | trendingTopic | long | | kotlin.Long | Foreign Key | *many*



