
# Table `CatalogsProductGroupFiltersAnyOf`
(mapped from: CatalogsProductGroupFiltersAnyOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**anyOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupFilterKeys&gt;**](CatalogsProductGroupFilterKeys.md) |  | 


# **Table `CatalogsProductGroupFiltersAnyOfCatalogsProductGroupFilterKeys`**
(mapped from: CatalogsProductGroupFiltersAnyOfCatalogsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFiltersAnyOf | catalogsProductGroupFiltersAnyOf | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupFilterKeys | catalogsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



