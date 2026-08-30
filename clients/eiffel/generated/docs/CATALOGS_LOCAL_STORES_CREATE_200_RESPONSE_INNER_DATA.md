# CATALOGS_LOCAL_STORES_CREATE_200_RESPONSE_INNER_DATA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_primary** | [**STRING_32**](STRING_32.md) | Primary address line of the store. | [optional] [default to null]
**address_secondary** | [**STRING_32**](STRING_32.md) | Secondary address line of the store. | [optional] [default to null]
**city** | [**STRING_32**](STRING_32.md) | City where the store is located. | [optional] [default to null]
**country** | [**COUNTRY**](Country.md) | Country code where the store is located. | [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Creation timestamp | [readonly] [default to null]
**id** | [**STRING_32**](STRING_32.md) | The ID of the local store. | [default to null]
**latitude** | **REAL_32** | Geographic latitude coordinate of the store. | [optional] [default to null]
**longitude** | **REAL_32** | Geographic longitude coordinate of the store. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name of the local store. | [default to null]
**postal_code** | [**STRING_32**](STRING_32.md) | Postal or ZIP code of the store. | [optional] [default to null]
**region** | [**STRING_32**](STRING_32.md) | State or region code where the store is located. | [optional] [default to null]
**store_code** | [**STRING_32**](STRING_32.md) | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | [default to null]
**updated_at** | [**DATE_TIME**](DATE_TIME.md) | Last update timestamp | [readonly] [default to null]
**exceptions** | [**PINTEREST_LIB_ERROR**](Pinterest.Lib.Error.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


