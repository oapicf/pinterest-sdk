
# Table `Label`
(mapped from: Label)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Label ID. |  [optional]
**labelType** | label_type | long |  | [**LabelType**](LabelType.md) |  |  [optional] [foreignkey]
**parentId** | parent_id | text |  | **kotlin.String** | Label parent entity ID. |  [optional]
**parentType** | parent_type | text |  | [**parent_type**](#ParentType) | Label parent entity type. |  [optional]
**status** | status | long |  | [**LabelStatus**](LabelStatus.md) |  |  [optional] [foreignkey]
**value** | value | text |  | **kotlin.String** | Label name. |  [optional]








