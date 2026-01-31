
# Table `LocalStoreUpdate`
(mapped from: LocalStoreUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of the local store. | 
**addressPrimary** | address_primary | text |  | **kotlin.String** | Primary address line of the store. |  [optional]
**addressSecondary** | address_secondary | text |  | **kotlin.String** | Secondary address line of the store. |  [optional]
**city** | city | text |  | **kotlin.String** | City where the store is located. |  [optional]
**country** | country | long |  | [**Country**](Country.md) | Country code where the store is located. |  [optional] [foreignkey]
**latitude** | latitude | float |  | **kotlin.Float** | Geographic latitude coordinate of the store. |  [optional]
**longitude** | longitude | float |  | **kotlin.Float** | Geographic longitude coordinate of the store. |  [optional]
**name** | name | text |  | **kotlin.String** | The name of the local store. |  [optional]
**postalCode** | postal_code | text |  | **kotlin.String** | Postal or ZIP code of the store. |  [optional]
**region** | region | text |  | **kotlin.String** | State or region code where the store is located. |  [optional]
**storeCode** | store_code | text |  | **kotlin.String** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. |  [optional]













