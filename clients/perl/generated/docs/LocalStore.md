# WWW::OpenAPIClient::Object::LocalStore

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LocalStore;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | **string** | Primary address line of the store. | [optional] 
**address_secondary** | **string** | Secondary address line of the store. | [optional] 
**city** | **string** | City where the store is located. | [optional] 
**country** | [**Country**](Country.md) | Country code where the store is located. | 
**created_at** | **DATE_TIME** | Creation timestamp | [readonly] 
**id** | **string** | The ID of the local store. | 
**latitude** | **double** | Geographic latitude coordinate of the store. | [optional] 
**longitude** | **double** | Geographic longitude coordinate of the store. | [optional] 
**name** | **string** | The name of the local store. | 
**postal_code** | **string** | Postal or ZIP code of the store. | [optional] 
**region** | **string** | State or region code where the store is located. | [optional] 
**store_code** | **string** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 
**updated_at** | **DATE_TIME** | Last update timestamp | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


