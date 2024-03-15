
# Table `AudienceInsightCategoryArrayResponse`
(mapped from: AudienceInsightCategoryArrayResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AudienceInsightCategoryCommon&gt;**](AudienceInsightCategoryCommon.md) |  |  [optional]


# **Table `AudienceInsightCategoryArrayResponseAudienceInsightCategoryCommon`**
(mapped from: AudienceInsightCategoryArrayResponseAudienceInsightCategoryCommon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceInsightCategoryArrayResponse | audienceInsightCategoryArrayResponse | long | | kotlin.Long | Primary Key | *one*
audienceInsightCategoryCommon | audienceInsightCategoryCommon | long | | kotlin.Long | Foreign Key | *many*



