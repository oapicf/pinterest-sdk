
# Table `CatalogsItemsRequest`
(mapped from: CatalogsItemsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | text NOT NULL |  | [**language**](#Language) | We recommend using the CatalogsLocale values. | 
**filters** | filters | long NOT NULL |  | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  |  [foreignkey]





