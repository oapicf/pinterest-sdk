
# Table `EntityLabel`
(mapped from: EntityLabel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entityId** | entity_id | text NOT NULL |  | **kotlin.String** | Entity ID to apply label to. | 
**labelId** | label_id | text NOT NULL |  | **kotlin.String** | Label ID. | 
**entityType** | entity_type | long |  | [**LabelParentType**](LabelParentType.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**EntityLabelStatus**](EntityLabelStatus.md) |  |  [optional] [foreignkey]






