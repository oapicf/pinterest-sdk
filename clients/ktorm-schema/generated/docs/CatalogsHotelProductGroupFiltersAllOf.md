
# Table `CatalogsHotelProductGroupFiltersAllOf`
(mapped from: CatalogsHotelProductGroupFiltersAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**allOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsHotelProductGroupFilterKeys&gt;**](CatalogsHotelProductGroupFilterKeys.md) |  | 


# **Table `CatalogsHotelProductGroupFiltersAllOfCatalogsHotelProductGroupFilterKeys`**
(mapped from: CatalogsHotelProductGroupFiltersAllOfCatalogsHotelProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelProductGroupFiltersAllOf | catalogsHotelProductGroupFiltersAllOf | long | | kotlin.Long | Primary Key | *one*
catalogsHotelProductGroupFilterKeys | catalogsHotelProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



