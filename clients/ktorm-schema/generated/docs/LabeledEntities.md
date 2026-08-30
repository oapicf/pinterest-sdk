
# Table `LabeledEntities`
(mapped from: LabeledEntities)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entitiesLabels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EntityLabel&gt;**](EntityLabel.md) |  |  [optional] [readonly]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EntityLabelError&gt;**](EntityLabelError.md) | Labels that were not successfully applied. |  [optional] [readonly]


# **Table `LabeledEntitiesEntityLabel`**
(mapped from: LabeledEntitiesEntityLabel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labeledEntities | labeledEntities | long | | kotlin.Long | Primary Key | *one*
entityLabel | entityLabel | long | | kotlin.Long | Foreign Key | *many*



# **Table `LabeledEntitiesEntityLabelError`**
(mapped from: LabeledEntitiesEntityLabelError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labeledEntities | labeledEntities | long | | kotlin.Long | Primary Key | *one*
entityLabelError | entityLabelError | long | | kotlin.Long | Foreign Key | *many*



