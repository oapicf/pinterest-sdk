# LocalStore

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | Option<**String**> | Primary address line of the store. | [optional]
**address_secondary** | Option<**String**> | Secondary address line of the store. | [optional]
**city** | Option<**String**> | City where the store is located. | [optional]
**country** | [**models::Country**](Country.md) | Country code where the store is located. | 
**created_at** | **chrono::DateTime<chrono::FixedOffset>** | Creation timestamp | [readonly]
**id** | **String** | The ID of the local store. | 
**latitude** | Option<**f32**> | Geographic latitude coordinate of the store. | [optional]
**longitude** | Option<**f32**> | Geographic longitude coordinate of the store. | [optional]
**name** | **String** | The name of the local store. | 
**postal_code** | Option<**String**> | Postal or ZIP code of the store. | [optional]
**region** | Option<**String**> | State or region code where the store is located. | [optional]
**store_code** | **String** | Merchant provided code for the local store. Unique within the merchant's catalog. | 
**updated_at** | **chrono::DateTime<chrono::FixedOffset>** | Last update timestamp | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


