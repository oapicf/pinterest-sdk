
# Table `CatalogsProductGroupFiltersRequest_anyOf`
(mapped from: CatalogsProductGroupFiltersRequestAnyOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**anyOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupFilterKeys&gt;**](CatalogsProductGroupFilterKeys.md) |  | 


# **Table `CatalogsProductGroupFiltersRequestAnyOfCatalogsProductGroupFilterKeys`**
(mapped from: CatalogsProductGroupFiltersRequestAnyOfCatalogsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFiltersRequestAnyOf | catalogsProductGroupFiltersRequestAnyOf | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupFilterKeys | catalogsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



