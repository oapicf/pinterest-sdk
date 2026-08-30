
# Table `StoreMetadata`
(mapped from: StoreMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**storeCode** | store_code | text NOT NULL |  | **kotlin.String** | Merchant provided store code | 
**storeId** | store_id | text NOT NULL |  | **kotlin.String** | Internal store code | 
**geohash** | geohash | text |  | **kotlin.String** | Geohash of the store location |  [optional]
**latitude** | latitude | double |  | **kotlin.Double** | Geographic latitude coordinate of the store |  [optional]
**longitude** | longitude | double |  | **kotlin.Double** | Geographic longitude coordinate of the store |  [optional]
**storeName** | store_name | text |  | **kotlin.String** | Store name |  [optional]








