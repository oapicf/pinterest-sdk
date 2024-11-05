# Org.OpenAPITools.Model.CatalogsHotelItemsBatch
Object describing the catalogs hotel items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchId** | **string** | Id of the catalogs items batch | [optional] 
**CreatedTime** | **DateTime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**CompletedTime** | **DateTime?** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**Status** | **BatchOperationStatus** |  | [optional] 
**CatalogType** | **CatalogsType** |  | 
**Items** | [**List&lt;HotelProcessingRecord&gt;**](HotelProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

