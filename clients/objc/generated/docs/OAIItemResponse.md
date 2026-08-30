# OAIItemResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**OAICatalogsCreativeAssetsAttributes***](OAICatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalogType** | **NSString*** |  | 
**itemId** | **NSString*** | The catalog item id in the merchant namespace | [optional] 
**itemResponseKind** | **NSString*** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**NSArray&lt;OAIPin&gt;***](OAIPin.md) | The pins mapped to the item | [optional] 
**hotelId** | **NSString*** | The catalog hotel id in the merchant namespace | [optional] 
**creativeAssetsId** | **NSString*** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**NSArray&lt;OAIItemValidationEvent&gt;***](OAIItemValidationEvent.md) | Array with the errors for the item id requested | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


