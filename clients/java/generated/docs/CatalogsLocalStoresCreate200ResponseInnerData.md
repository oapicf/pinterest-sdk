

# CatalogsLocalStoresCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressPrimary** | **String** | Primary address line of the store. |  [optional] |
|**addressSecondary** | **String** | Secondary address line of the store. |  [optional] |
|**city** | **String** | City where the store is located. |  [optional] |
|**country** | **Country** | Country code where the store is located. |  |
|**createdAt** | **OffsetDateTime** | Creation timestamp |  [readonly] |
|**id** | **String** | The ID of the local store. |  |
|**latitude** | **Float** | Geographic latitude coordinate of the store. |  [optional] |
|**longitude** | **Float** | Geographic longitude coordinate of the store. |  [optional] |
|**name** | **String** | The name of the local store. |  |
|**postalCode** | **String** | Postal or ZIP code of the store. |  [optional] |
|**region** | **String** | State or region code where the store is located. |  [optional] |
|**storeCode** | **String** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. |  |
|**updatedAt** | **OffsetDateTime** | Last update timestamp |  [readonly] |
|**exceptions** | [**PinterestLibError**](PinterestLibError.md) |  |  |



