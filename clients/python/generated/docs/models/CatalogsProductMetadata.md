# pinterestsdk.model.catalogs_product_metadata.CatalogsProductMetadata

Product metadata entity

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Product metadata entity | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**item_id** | str,  | str,  | The user-created unique ID that represents the product. | 
**price** | decimal.Decimal, int, float,  | decimal.Decimal,  | The price of the product. | 
**item_group_id** | None, str,  | NoneClass, str,  | The parent ID of the product. | 
**currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  | 
**sale_price** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The discounted price of the product. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

