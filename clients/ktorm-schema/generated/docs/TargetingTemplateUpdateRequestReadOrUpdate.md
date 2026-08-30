
# Table `TargetingTemplateUpdateRequestReadOrUpdate`
(mapped from: TargetingTemplateUpdateRequestReadOrUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Targeting template ID | 
**operationType** | operation_type | long NOT NULL |  | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  |  [foreignkey]
**targetingAttributes** | targeting_attributes | long |  | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes |  [optional] [foreignkey]





