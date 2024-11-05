
# Table `CatalogsCreativeAssetsItemResponse`
(mapped from: CatalogsCreativeAssetsItemResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**creativeAssetsId** | creative_assets_id | text |  | **kotlin.String** | The catalog creative assets id in the merchant namespace |  [optional]
**pins** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]
**attributes** | attributes | long |  | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  |  [optional] [foreignkey]




# **Table `CatalogsCreativeAssetsItemResponsePin`**
(mapped from: CatalogsCreativeAssetsItemResponsePin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsItemResponse | catalogsCreativeAssetsItemResponse | long | | kotlin.Long | Primary Key | *one*
pin | pin | long | | kotlin.Long | Foreign Key | *many*




