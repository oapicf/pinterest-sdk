
# Table `TrendingProductCategory`
(mapped from: TrendingProductCategory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**engagementType** | engagement_type | long NOT NULL |  | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) | Engagement type |  [foreignkey]
**pctChangeMom** | pct_change_mom | int NOT NULL |  | **kotlin.Int** | Month-over-month change percentage | 
**percentRelativeVolume** | percent_relative_volume | int NOT NULL |  | **kotlin.Int** | Relative volume percentage | 
**productCategory** | product_category | text NOT NULL |  | **kotlin.String** | Product Category Name | 
**verticals** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VerticalProductCategory&gt;**](VerticalProductCategory.md) | Vertical name associated with the product category |  [optional]






# **Table `TrendingProductCategoryVerticalProductCategory`**
(mapped from: TrendingProductCategoryVerticalProductCategory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendingProductCategory | trendingProductCategory | long | | kotlin.Long | Primary Key | *one*
verticalProductCategory | verticalProductCategory | long | | kotlin.Long | Foreign Key | *many*



