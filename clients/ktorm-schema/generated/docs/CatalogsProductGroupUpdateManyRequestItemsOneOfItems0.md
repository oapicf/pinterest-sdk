
# Table `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0`
(mapped from: CatalogsProductGroupUpdateManyRequestItemsOneOfItems0)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the product group. | 
**description** | description | text |  | **kotlin.String** |  |  [optional]
**filters** | filters | long |  | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  [optional] [foreignkey]
**isFeatured** | is_featured | boolean |  | **kotlin.Boolean** | boolean indicator of whether the product group is being featured or not |  [optional]
**name** | name | text |  | **kotlin.String** |  |  [optional]







