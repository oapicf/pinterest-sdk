
# Table `CatalogsHotelProductGroupFiltersAnyOf`
(mapped from: CatalogsHotelProductGroupFiltersAnyOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**anyOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsHotelProductGroupFilterKeys&gt;**](CatalogsHotelProductGroupFilterKeys.md) |  | 


# **Table `CatalogsHotelProductGroupFiltersAnyOfCatalogsHotelProductGroupFilterKeys`**
(mapped from: CatalogsHotelProductGroupFiltersAnyOfCatalogsHotelProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelProductGroupFiltersAnyOf | catalogsHotelProductGroupFiltersAnyOf | long | | kotlin.Long | Primary Key | *one*
catalogsHotelProductGroupFilterKeys | catalogsHotelProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



