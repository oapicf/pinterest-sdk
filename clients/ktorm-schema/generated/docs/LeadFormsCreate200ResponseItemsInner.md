
# Table `lead_forms_create_200_response_items_inner`
(mapped from: LeadFormsCreate200ResponseItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**LeadForm**](LeadForm.md) |  |  [optional] [foreignkey]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinterestLibBatchItemException&gt;**](PinterestLibBatchItemException.md) |  |  [optional]



# **Table `LeadFormsCreate200ResponseItemsInnerPinterestLibBatchItemException`**
(mapped from: LeadFormsCreate200ResponseItemsInnerPinterestLibBatchItemException)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormsCreate200ResponseItemsInner | leadFormsCreate200ResponseItemsInner | long | | kotlin.Long | Primary Key | *one*
pinterestLibBatchItemException | pinterestLibBatchItemException | long | | kotlin.Long | Foreign Key | *many*



