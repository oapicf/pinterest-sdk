
# Table `AudienceUpdateRequest`
(mapped from: AudienceUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**name** | name | text |  | **kotlin.String** | Audience name. |  [optional]
**rule** | rule | long |  | [**AudienceRule**](AudienceRule.md) |  |  [optional] [foreignkey]
**description** | description | text |  | **kotlin.String** | Audience description. |  [optional]
**operationType** | operation_type | long |  | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  |  [optional] [foreignkey]







