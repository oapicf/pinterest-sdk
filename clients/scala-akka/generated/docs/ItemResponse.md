

# ItemResponse

Object describing an item record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | **CatalogsType** |  | 
**itemId** | **String** | The catalog item id in the merchant namespace |  [optional]
**pins** | [**Seq&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional]
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  |  [optional]
**hotelId** | **String** | The catalog hotel id in the merchant namespace |  [optional]
**errors** | [**Seq&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  [optional]



