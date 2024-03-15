
# Table `catalogs_product_group_pricing_currency_criteria`
(mapped from: CatalogsProductGroupPricingCurrencyCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**operator** | operator | text NOT NULL |  | [**operator**](#Operator) |  | 
**value** | value | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**currency** | currency | long NOT NULL |  | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  |  [foreignkey]
**negated** | negated | boolean |  | **kotlin.Boolean** |  |  [optional]






