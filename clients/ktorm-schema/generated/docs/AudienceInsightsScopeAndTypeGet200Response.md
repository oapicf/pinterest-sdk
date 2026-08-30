
# Table `audience_insights_scope_and_type_get_200_response`
(mapped from: AudienceInsightsScopeAndTypeGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AudienceDefinition&gt;**](AudienceDefinition.md) |  | 


# **Table `AudienceInsightsScopeAndTypeGet200ResponseAudienceDefinition`**
(mapped from: AudienceInsightsScopeAndTypeGet200ResponseAudienceDefinition)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audienceInsightsScopeAndTypeGet200Response | audienceInsightsScopeAndTypeGet200Response | long | | kotlin.Long | Primary Key | *one*
audienceDefinition | audienceDefinition | long | | kotlin.Long | Foreign Key | *many*



