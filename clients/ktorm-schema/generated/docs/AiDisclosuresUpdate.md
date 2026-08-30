
# Table `AiDisclosuresUpdate`
(mapped from: AiDisclosuresUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AiDisclosureItem&gt;**](AiDisclosureItem.md) | List of AI disclosure declarations the creator has made about this Pin. |  [optional]


# **Table `AiDisclosuresUpdateAiDisclosureItem`**
(mapped from: AiDisclosuresUpdateAiDisclosureItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
aiDisclosuresUpdate | aiDisclosuresUpdate | long | | kotlin.Long | Primary Key | *one*
aiDisclosureItem | aiDisclosureItem | long | | kotlin.Long | Foreign Key | *many*



