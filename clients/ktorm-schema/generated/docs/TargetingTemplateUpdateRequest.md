
# Table `TargetingTemplateUpdateRequest`
(mapped from: TargetingTemplateUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Targeting template ID | 
**operationType** | operation_type | text NOT NULL |  | [**operation_type**](#OperationType) |  | 
**targetingAttributes** | targeting_attributes | long |  | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] [foreignkey]





