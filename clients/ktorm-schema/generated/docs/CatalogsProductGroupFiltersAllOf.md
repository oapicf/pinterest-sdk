
# Table `CatalogsProductGroupFiltersAllOf`
(mapped from: CatalogsProductGroupFiltersAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**allOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupFilterKeys&gt;**](CatalogsProductGroupFilterKeys.md) |  |  [optional]


# **Table `CatalogsProductGroupFiltersAllOfCatalogsProductGroupFilterKeys`**
(mapped from: CatalogsProductGroupFiltersAllOfCatalogsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFiltersAllOf | catalogsProductGroupFiltersAllOf | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupFilterKeys | catalogsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



