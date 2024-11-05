
# Table `CatalogsHotelItemsBatch`
(mapped from: CatalogsHotelItemsBatch)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**batchId** | batch_id | text |  | **kotlin.String** | Id of the catalogs items batch |  [optional]
**createdTime** | created_time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly]
**completedTime** | completed_time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional] [readonly]
**status** | status | long |  | [**BatchOperationStatus**](BatchOperationStatus.md) |  |  [optional] [foreignkey]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;HotelProcessingRecord&gt;**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional]







# **Table `CatalogsHotelItemsBatchHotelProcessingRecord`**
(mapped from: CatalogsHotelItemsBatchHotelProcessingRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsHotelItemsBatch | catalogsHotelItemsBatch | long | | kotlin.Long | Primary Key | *one*
hotelProcessingRecord | hotelProcessingRecord | long | | kotlin.Long | Foreign Key | *many*



