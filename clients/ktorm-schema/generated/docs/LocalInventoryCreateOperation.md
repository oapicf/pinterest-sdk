
# Table `LocalInventoryCreateOperation`
(mapped from: LocalInventoryCreateOperation)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**attributes** | attributes | long NOT NULL |  | [**RetailLocalInventoryItemAttributes**](RetailLocalInventoryItemAttributes.md) |  |  [foreignkey]
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | Catalog item id in the merchant namespace | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**storeCode** | store_code | text NOT NULL |  | **kotlin.String** | Store code for the local inventory item | 






