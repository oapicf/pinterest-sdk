
# Table `CatalogsBaseFiltersAllOf`
(mapped from: CatalogsBaseFiltersAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**allOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsBaseFilterKeys&gt;**](CatalogsBaseFilterKeys.md) |  | 


# **Table `CatalogsBaseFiltersAllOfCatalogsBaseFilterKeys`**
(mapped from: CatalogsBaseFiltersAllOfCatalogsBaseFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsBaseFiltersAllOf | catalogsBaseFiltersAllOf | long | | kotlin.Long | Primary Key | *one*
catalogsBaseFilterKeys | catalogsBaseFilterKeys | long | | kotlin.Long | Foreign Key | *many*



