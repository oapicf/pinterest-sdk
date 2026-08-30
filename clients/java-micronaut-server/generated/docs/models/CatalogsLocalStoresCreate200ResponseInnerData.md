

# CatalogsLocalStoresCreate200ResponseInnerData

Created/updated resource on success or error details on failure

The class is defined in **[CatalogsLocalStoresCreate200ResponseInnerData.java](../../src/main/java/org/openapitools/model/CatalogsLocalStoresCreate200ResponseInnerData.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressPrimary** | `String` | Primary address line of the store. |  [optional property]
**addressSecondary** | `String` | Secondary address line of the store. |  [optional property]
**city** | `String` | City where the store is located. |  [optional property]
**country** | `Country` | Country code where the store is located. | 
**createdAt** | `OffsetDateTime` | Creation timestamp |  [readonly property]
**id** | `String` | The ID of the local store. | 
**latitude** | `Float` | Geographic latitude coordinate of the store. |  [optional property]
**longitude** | `Float` | Geographic longitude coordinate of the store. |  [optional property]
**name** | `String` | The name of the local store. | 
**postalCode** | `String` | Postal or ZIP code of the store. |  [optional property]
**region** | `String` | State or region code where the store is located. |  [optional property]
**storeCode** | `String` | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 
**updatedAt** | `OffsetDateTime` | Last update timestamp |  [readonly property]
**exceptions** | [`PinterestLibError`](PinterestLibError.md) |  | 
















