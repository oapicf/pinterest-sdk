# openapi::LocalStoreCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | **character** | Primary address line of the store. | [optional] 
**address_secondary** | **character** | Secondary address line of the store. | [optional] 
**city** | **character** | City where the store is located. | [optional] 
**country** | [**Country**](Country.md) | Country code where the store is located. | [Enum: ] 
**latitude** | **numeric** | Geographic latitude coordinate of the store. | [optional] 
**longitude** | **numeric** | Geographic longitude coordinate of the store. | [optional] 
**name** | **character** | The name of the local store. | 
**postal_code** | **character** | Postal or ZIP code of the store. | [optional] 
**region** | **character** | State or region code where the store is located. | [optional] 
**store_code** | **character** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 


