
# Table `CatalogsRetailProductMetadata`
(mapped from: CatalogsRetailProductMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The user-created unique ID that represents the product. | 
**itemGroupId** | item_group_id | text NOT NULL |  | **kotlin.String** | The parent ID of the product. | 
**availability** | availability | long NOT NULL |  | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  |  [foreignkey]
**price** | price | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The price of the product. | 
**salePrice** | sale_price | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The discounted price of the product. | 
**currency** | currency | long NOT NULL |  | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  |  [foreignkey]








