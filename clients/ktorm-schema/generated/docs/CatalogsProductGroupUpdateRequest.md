
# Table `CatalogsProductGroupUpdateRequest`
(mapped from: CatalogsProductGroupUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** |  |  [optional]
**description** | description | text |  | **kotlin.String** |  |  [optional]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**filters** | filters | long |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [optional] [foreignkey]






