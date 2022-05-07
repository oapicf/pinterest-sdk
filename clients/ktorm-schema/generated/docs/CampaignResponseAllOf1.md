
# Table `CampaignResponse_allOf_1`
(mapped from: CampaignResponseAllOf1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**objectiveType** | objective_type | long |  | [**ObjectiveType**](ObjectiveType.md) |  |  [optional] [foreignkey]
**createdTime** | created_time | int |  | **kotlin.Int** | Campaign creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | UTC timestamp. Last update time. |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;campaign\&quot;. |  [optional]






