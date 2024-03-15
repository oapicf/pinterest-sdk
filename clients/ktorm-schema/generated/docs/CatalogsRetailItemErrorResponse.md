
# Table `CatalogsRetailItemErrorResponse`
(mapped from: CatalogsRetailItemErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**itemId** | item_id | text |  | **kotlin.String** | The catalog item id in the merchant namespace |  [optional]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  [optional]




# **Table `CatalogsRetailItemErrorResponseItemValidationEvent`**
(mapped from: CatalogsRetailItemErrorResponseItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailItemErrorResponse | catalogsRetailItemErrorResponse | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



