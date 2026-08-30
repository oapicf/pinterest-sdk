
# Table `CatalogsRetailItemsBatch`
(mapped from: CatalogsRetailItemsBatch)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**createdTime** | created_time | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | 
**batchId** | batch_id | text |  | **kotlin.String** | Id of the catalogs items batch |  [optional]
**completedTime** | completed_time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemProcessingRecord&gt;**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional]
**status** | status | long |  | [**BatchOperationStatus**](BatchOperationStatus.md) |  |  [optional] [foreignkey]






# **Table `CatalogsRetailItemsBatchItemProcessingRecord`**
(mapped from: CatalogsRetailItemsBatchItemProcessingRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsRetailItemsBatch | catalogsRetailItemsBatch | long | | kotlin.Long | Primary Key | *one*
itemProcessingRecord | itemProcessingRecord | long | | kotlin.Long | Foreign Key | *many*




