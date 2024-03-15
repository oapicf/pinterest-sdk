
# Table `CatalogsProductGroupFilters`
(mapped from: CatalogsProductGroupFilters)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**anyOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupFilterKeys&gt;**](CatalogsProductGroupFilterKeys.md) |  | 
**allOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupFilterKeys&gt;**](CatalogsProductGroupFilterKeys.md) |  | 


# **Table `CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys`**
(mapped from: CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFilters | catalogsProductGroupFilters | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupFilterKeys | catalogsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



# **Table `CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys`**
(mapped from: CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFilters | catalogsProductGroupFilters | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupFilterKeys | catalogsProductGroupFilterKeys | long | | kotlin.Long | Foreign Key | *many*



