
# Table `CatalogsCreativeAssetsItemsBatch`
(mapped from: CatalogsCreativeAssetsItemsBatch)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**batchId** | batch_id | text |  | **kotlin.String** | Id of the catalogs items batch |  [optional]
**completedTime** | completed_time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional]
**createdTime** | created_time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreativeAssetsProcessingRecord&gt;**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch |  [optional]
**status** | status | long |  | [**BatchOperationStatus**](BatchOperationStatus.md) |  |  [optional] [foreignkey]






# **Table `CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord`**
(mapped from: CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsCreativeAssetsItemsBatch | catalogsCreativeAssetsItemsBatch | long | | kotlin.Long | Primary Key | *one*
creativeAssetsProcessingRecord | creativeAssetsProcessingRecord | long | | kotlin.Long | Foreign Key | *many*




