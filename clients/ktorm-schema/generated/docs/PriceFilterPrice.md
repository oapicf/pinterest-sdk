
# Table `PriceFilterPrice`
(mapped from: PriceFilterPrice)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**currency** | currency | long NOT NULL |  | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  |  [foreignkey]
**operator** | operator | long NOT NULL |  | [**NumericFilterOperatorType**](NumericFilterOperatorType.md) |  |  [foreignkey]
**value** | value | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**negated** | negated | boolean |  | **kotlin.Boolean** |  |  [optional]






