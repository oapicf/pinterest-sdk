
# Table `AudienceCategory`
(mapped from: AudienceCategory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**key** | key | text |  | **kotlin.String** | Interest unique key (same as ID). |  [optional]
**name** | name | text |  | **kotlin.String** | Interest name. |  [optional]
**ratio** | ratio | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Interest&#39;s percent of category&#39;s total audience. |  [optional]
**index** | index | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Interest affinity index. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Interest ID. |  [optional]
**subcategories** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AudienceSubcategory&gt;**](AudienceSubcategory.md) | Subcategory interest distribution |  [optional]







# **Table `AudienceCategoryAudienceSubcategory`**
(mapped from: AudienceCategoryAudienceSubcategory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceCategory | audienceCategory | long | | kotlin.Long | Primary Key | *one*
audienceSubcategory | audienceSubcategory | long | | kotlin.Long | Foreign Key | *many*



