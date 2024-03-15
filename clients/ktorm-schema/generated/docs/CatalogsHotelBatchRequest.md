
# Table `CatalogsHotelBatchRequest`
(mapped from: CatalogsHotelBatchRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsHotelBatchItem&gt;**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog |  [optional]





# **Table `CatalogsHotelBatchRequestCatalogsHotelBatchItem`**
(mapped from: CatalogsHotelBatchRequestCatalogsHotelBatchItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelBatchRequest | catalogsHotelBatchRequest | long | | kotlin.Long | Primary Key | *one*
catalogsHotelBatchItem | catalogsHotelBatchItem | long | | kotlin.Long | Foreign Key | *many*




