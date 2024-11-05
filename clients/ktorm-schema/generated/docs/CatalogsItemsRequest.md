
# Table `CatalogsItemsRequest`
(mapped from: CatalogsItemsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  |  [foreignkey]
**filters** | filters | long NOT NULL |  | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  |  [foreignkey]





