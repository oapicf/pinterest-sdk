# ItemResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**models::CatalogsType**](CatalogsType.md) |  | 
**item_id** | Option<**String**> | The catalog item id in the merchant namespace | [optional]
**pins** | Option<[**Vec<models::Pin>**](Pin.md)> | The pins mapped to the item | [optional]
**attributes** | Option<[**models::CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md)> |  | [optional]
**hotel_id** | Option<**String**> | The catalog hotel id in the merchant namespace | [optional]
**creative_assets_id** | Option<**String**> | The catalog creative assets id in the merchant namespace | [optional]
**errors** | Option<[**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md)> | Array with the errors for the item id requested | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


