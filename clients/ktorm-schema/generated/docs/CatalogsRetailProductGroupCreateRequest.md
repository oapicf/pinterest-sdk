
# Table `CatalogsRetailProductGroupCreateRequest`
(mapped from: CatalogsRetailProductGroupCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**filters** | filters | long NOT NULL |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [foreignkey]
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the retail product group. | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**locale** | locale | long NOT NULL |  | [**CatalogsLocale**](CatalogsLocale.md) |  |  [foreignkey]
**description** | description | text |  | **kotlin.String** |  |  [optional]









