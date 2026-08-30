
# Table `IneligibleProductTagsErrorDetails`
(mapped from: IneligibleProductTagsErrorDetails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**productTags** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;IneligibleProductTagErrorItem&gt;**](IneligibleProductTagErrorItem.md) | List of product tags that failed eligibility check. | 


# **Table `IneligibleProductTagsErrorDetailsIneligibleProductTagErrorItem`**
(mapped from: IneligibleProductTagsErrorDetailsIneligibleProductTagErrorItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ineligibleProductTagsErrorDetails | ineligibleProductTagsErrorDetails | long | | kotlin.Long | Primary Key | *one*
ineligibleProductTagErrorItem | ineligibleProductTagErrorItem | long | | kotlin.Long | Foreign Key | *many*



