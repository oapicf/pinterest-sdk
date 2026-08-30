
# Table `LocalStore`
(mapped from: LocalStore)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) | Country code where the store is located. |  [foreignkey]
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Creation timestamp |  [readonly]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of the local store. | 
**name** | name | text NOT NULL |  | **kotlin.String** | The name of the local store. | 
**storeCode** | store_code | text NOT NULL |  | **kotlin.String** | Merchant provided code for the local store. Unique within the merchant&#39;s catalog. | 
**updatedAt** | updated_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Last update timestamp |  [readonly]
**addressPrimary** | address_primary | text |  | **kotlin.String** | Primary address line of the store. |  [optional]
**addressSecondary** | address_secondary | text |  | **kotlin.String** | Secondary address line of the store. |  [optional]
**city** | city | text |  | **kotlin.String** | City where the store is located. |  [optional]
**latitude** | latitude | float |  | **kotlin.Float** | Geographic latitude coordinate of the store. |  [optional]
**longitude** | longitude | float |  | **kotlin.Float** | Geographic longitude coordinate of the store. |  [optional]
**postalCode** | postal_code | text |  | **kotlin.String** | Postal or ZIP code of the store. |  [optional]
**region** | region | text |  | **kotlin.String** | State or region code where the store is located. |  [optional]















