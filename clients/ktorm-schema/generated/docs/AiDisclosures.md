
# Table `AiDisclosures`
(mapped from: AiDisclosures)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AiDisclosureItem&gt;**](AiDisclosureItem.md) | List of AI disclosure declarations the creator has made about this Pin. | 


# **Table `AiDisclosuresAiDisclosureItem`**
(mapped from: AiDisclosuresAiDisclosureItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
aiDisclosures | aiDisclosures | long | | kotlin.Long | Primary Key | *one*
aiDisclosureItem | aiDisclosureItem | long | | kotlin.Long | Foreign Key | *many*



