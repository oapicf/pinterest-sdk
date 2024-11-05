
# Table `CatalogsCreativeAssetsProductGroupFiltersAnyOf`
(mapped from: CatalogsCreativeAssetsProductGroupFiltersAnyOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**anyOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsCreativeAssetsProductGroupFilterKeys&gt;**](CatalogsCreativeAssetsProductGroupFilterKeys.md) |  | 


# **Table `CatalogsCreativeAssetsProductGroupFiltersAnyOfCatalogsCreativeAssetsProductGroupFilterKeys`**
(mapped from: CatalogsCreativeAssetsProductGroupFiltersAnyOfCatalogsCreativeAssetsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsProductGroupFiltersAnyOf | catalogsCreativeAssetsProductGroupFiltersAnyOf | long | | kotlin.Long | Primary Key | *one*
catalogsCreativeAssetsProductGroupFilterKeys | catalogsCreativeAssetsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



