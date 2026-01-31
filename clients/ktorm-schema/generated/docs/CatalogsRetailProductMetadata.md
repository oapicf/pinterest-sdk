
# Table `CatalogsRetailProductMetadata`
(mapped from: CatalogsRetailProductMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**availability** | availability | long NOT NULL |  | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  |  [foreignkey]
**currency** | currency | long NOT NULL |  | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  |  [foreignkey]
**itemGroupId** | item_group_id | text NOT NULL |  | **kotlin.String** | The parent ID of the product. | 
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The user-created unique ID that represents the product. | 
**price** | price | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The price of the product. | 
**salePrice** | sale_price | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The discounted price of the product. | 








