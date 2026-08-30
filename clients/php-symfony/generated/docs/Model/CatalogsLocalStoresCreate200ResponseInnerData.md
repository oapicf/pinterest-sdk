# CatalogsLocalStoresCreate200ResponseInnerData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressPrimary** | **string** | Primary address line of the store. | [optional] 
**addressSecondary** | **string** | Secondary address line of the store. | [optional] 
**city** | **string** | City where the store is located. | [optional] 
**country** | [**OpenAPI\Server\Model\Country**](Country.md) | Country code where the store is located. | 
**createdAt** | **\DateTime** | Creation timestamp | [readonly] 
**id** | **string** | The ID of the local store. | 
**latitude** | **float** | Geographic latitude coordinate of the store. | [optional] 
**longitude** | **float** | Geographic longitude coordinate of the store. | [optional] 
**name** | **string** | The name of the local store. | 
**postalCode** | **string** | Postal or ZIP code of the store. | [optional] 
**region** | **string** | State or region code where the store is located. | [optional] 
**storeCode** | **string** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 
**updatedAt** | **\DateTime** | Last update timestamp | [readonly] 
**exceptions** | [**OpenAPI\Server\Model\PinterestLibError**](PinterestLibError.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


