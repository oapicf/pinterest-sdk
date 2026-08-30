
# Table `CatalogsBaseFiltersAnyOf`
(mapped from: CatalogsBaseFiltersAnyOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**anyOf** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsBaseFilterKeys&gt;**](CatalogsBaseFilterKeys.md) |  | 


# **Table `CatalogsBaseFiltersAnyOfCatalogsBaseFilterKeys`**
(mapped from: CatalogsBaseFiltersAnyOfCatalogsBaseFilterKeys)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsBaseFiltersAnyOf | catalogsBaseFiltersAnyOf | long | | kotlin.Long | Primary Key | *one*
catalogsBaseFilterKeys | catalogsBaseFilterKeys | long | | kotlin.Long | Foreign Key | *many*



