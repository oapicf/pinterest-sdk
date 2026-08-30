
# Table `AudienceInsights`
(mapped from: AudienceInsights)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**categories** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AudienceCategory&gt;**](AudienceCategory.md) | Category interest distribution |  [optional]
**date** | date | text |  | **kotlin.String** | Generation date |  [optional]
**demographics** | demographics | long |  | [**AudienceDemographics**](AudienceDemographics.md) |  |  [optional] [foreignkey]
**propertySize** | size | int |  | **kotlin.Int** | Population count. |  [optional]
**sizeIsUpperBound** | size_is_upper_bound | boolean |  | **kotlin.Boolean** | Indicates whether the audience size has been rounded up to the next highest upper boundary. |  [optional]
**type** | type | long |  | [**AudienceInsightType**](AudienceInsightType.md) |  |  [optional] [foreignkey]


# **Table `AudienceInsightsAudienceCategory`**
(mapped from: AudienceInsightsAudienceCategory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceInsights | audienceInsights | long | | kotlin.Long | Primary Key | *one*
audienceCategory | audienceCategory | long | | kotlin.Long | Foreign Key | *many*








