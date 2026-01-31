# openapi::FeaturedTrend

Featured trending topics for a specific interest and market

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interest** | [**InterestsEnum**](InterestsEnum.md) | The main interest category | [Enum: ] 
**market** | [**ProductCategoryRegion**](ProductCategoryRegion.md) | Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.) | [optional] [Enum: ] 
**trends** | [**array[TrendingTopic]**](TrendingTopic.md) | List of trending topics within this interest category | [optional] 


