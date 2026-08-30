
# Table `LabeledEntitiesCreate`
(mapped from: LabeledEntitiesCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entityIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Entity IDs to apply label to. | 


# **Table `LabeledEntitiesCreateEntityIds`**
(mapped from: LabeledEntitiesCreateEntityIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labeledEntitiesCreate | labeledEntitiesCreate | long | | kotlin.Long | Primary Key | *one*
entityIds | entityIds | text | | kotlin.String | Foreign Key | *many*



