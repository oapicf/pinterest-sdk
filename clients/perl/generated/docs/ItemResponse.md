# WWW::OpenAPIClient::Object::ItemResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ItemResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalog_type** | **string** |  | 
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] 
**item_response_kind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**ARRAY[Pin]**](Pin.md) | The pins mapped to the item | [optional] 
**hotel_id** | **string** | The catalog hotel id in the merchant namespace | [optional] 
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**ARRAY[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


