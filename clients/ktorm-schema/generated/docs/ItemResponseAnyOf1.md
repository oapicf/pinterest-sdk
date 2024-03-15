
# Table `ItemResponse_anyOf_1`
(mapped from: ItemResponseAnyOf1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**itemId** | item_id | text |  | **kotlin.String** | The catalog item id in the merchant namespace |  [optional]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  [optional]
**hotelId** | hotel_id | text |  | **kotlin.String** | The catalog hotel id in the merchant namespace |  [optional]




# **Table `ItemResponseAnyOf1ItemValidationEvent`**
(mapped from: ItemResponseAnyOf1ItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
itemResponseAnyOf1 | itemResponseAnyOf1 | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*




