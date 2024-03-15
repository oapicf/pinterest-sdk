
# Table `AudienceInsightsResponse`
(mapped from: AudienceInsightsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**categories** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AudienceCategory&gt;**](AudienceCategory.md) | Category interest distribution |  [optional]
**demographics** | demographics | long |  | [**AudienceDemographics**](AudienceDemographics.md) |  |  [optional] [foreignkey]
**type** | type | long |  | [**AudienceInsightType**](AudienceInsightType.md) |  |  [optional] [foreignkey]
**date** | date | text |  | **kotlin.String** | Generation date |  [optional]
**propertySize** | size | int |  | **kotlin.Int** | Population count. |  [optional]
**sizeIsUpperBound** | size_is_upper_bound | boolean |  | **kotlin.Boolean** | Indicates whether the audience size has been rounded up to the next highest upper boundary. |  [optional]


# **Table `AudienceInsightsResponseAudienceCategory`**
(mapped from: AudienceInsightsResponseAudienceCategory)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceInsightsResponse | audienceInsightsResponse | long | | kotlin.Long | Primary Key | *one*
audienceCategory | audienceCategory | long | | kotlin.Long | Foreign Key | *many*








