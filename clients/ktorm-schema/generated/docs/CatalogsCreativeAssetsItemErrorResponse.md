
# Table `CatalogsCreativeAssetsItemErrorResponse`
(mapped from: CatalogsCreativeAssetsItemErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**itemResponseKind** | item_response_kind | text NOT NULL |  | [**item_response_kind**](#ItemResponseKind) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**creativeAssetsId** | creative_assets_id | text |  | **kotlin.String** | The catalog creative assets id in the merchant namespace |  [optional]



# **Table `CatalogsCreativeAssetsItemErrorResponseItemValidationEvent`**
(mapped from: CatalogsCreativeAssetsItemErrorResponseItemValidationEvent)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsItemErrorResponse | catalogsCreativeAssetsItemErrorResponse | long | | kotlin.Long | Primary Key | *one*
itemValidationEvent | itemValidationEvent | long | | kotlin.Long | Foreign Key | *many*





