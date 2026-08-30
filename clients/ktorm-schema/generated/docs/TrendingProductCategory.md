
# Table `TrendingProductCategory`
(mapped from: TrendingProductCategory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**engagementType** | engagement_type | long NOT NULL |  | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) | Engagement type |  [foreignkey]
**pctChangeMom** | pct_change_mom | int NOT NULL |  | **kotlin.Int** | Month-over-month change percentage | 
**percentRelativeVolume** | percent_relative_volume | int NOT NULL |  | **kotlin.Int** | Relative volume percentage | 
**pinterestProductCategoryId** | pinterest_product_category_id | int NOT NULL |  | **kotlin.Int** | Pinterest Product Category Id | 
**productCategory** | product_category | text NOT NULL |  | **kotlin.String** | Product Category Name | 
**verticals** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Vertical name associated with the product category |  [optional]







# **Table `TrendingProductCategoryVerticals`**
(mapped from: TrendingProductCategoryVerticals)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
trendingProductCategory | trendingProductCategory | long | | kotlin.Long | Primary Key | *one*
verticals | verticals | text | | kotlin.String | Foreign Key | *many*



