
# Table `CatalogsProductGroupFiltersRequest`
(mapped from: CatalogsProductGroupFiltersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**anyOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupFilterKeys&gt;**](CatalogsProductGroupFilterKeys.md) |  | 
**allOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupFilterKeys&gt;**](CatalogsProductGroupFilterKeys.md) |  | 


# **Table `CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys`**
(mapped from: CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFiltersRequest | catalogsProductGroupFiltersRequest | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupFilterKeys | catalogsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



# **Table `CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys`**
(mapped from: CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFiltersRequest | catalogsProductGroupFiltersRequest | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupFilterKeys | catalogsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



