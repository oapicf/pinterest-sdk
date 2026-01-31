
# Table `LabelsResponse`
(mapped from: LabelsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelError&gt;**](LabelError.md) | Labels that were not successfully applied. |  [optional]
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Label&gt;**](Label.md) |  |  [optional]


# **Table `LabelsResponseLabelError`**
(mapped from: LabelsResponseLabelError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelsResponse | labelsResponse | long | | kotlin.Long | Primary Key | *one*
labelError | labelError | long | | kotlin.Long | Foreign Key | *many*



# **Table `LabelsResponseLabel`**
(mapped from: LabelsResponseLabel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelsResponse | labelsResponse | long | | kotlin.Long | Primary Key | *one*
label | label | long | | kotlin.Long | Foreign Key | *many*



