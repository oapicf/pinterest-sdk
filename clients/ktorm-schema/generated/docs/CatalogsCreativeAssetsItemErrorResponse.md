
# Table `CatalogsCreativeAssetsItemErrorResponse`
(mapped from: CatalogsCreativeAssetsItemErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**creativeAssetsId** | creative_assets_id | text |  | **kotlin.String** | The catalog creative assets id in the merchant namespace |  [optional]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  [optional]




# **Table `CatalogsCreativeAssetsItemErrorResponseItemValidationEvent`**
(mapped from: CatalogsCreativeAssetsItemErrorResponseItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsItemErrorResponse | catalogsCreativeAssetsItemErrorResponse | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*



