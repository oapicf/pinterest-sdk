# WWW::OpenAPIClient::Object::CatalogsHotelItemErrorResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsHotelItemErrorResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  | 
**errors** | [**ARRAY[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**hotel_id** | **string** | The catalog hotel id in the merchant namespace | [optional] 
**item_response_kind** | **string** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


