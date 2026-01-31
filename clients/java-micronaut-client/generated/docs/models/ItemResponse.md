

# ItemResponse

Object describing an item record

The class is defined in **[ItemResponse.java](../../src/main/java/org/openapitools/model/ItemResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | `CatalogsType` |  | 
**itemId** | `String` | The catalog item id in the merchant namespace |  [optional property]
**pins** | [`List&lt;Pin&gt;`](Pin.md) | The pins mapped to the item |  [optional property]
**attributes** | [`CatalogsCreativeAssetsAttributes`](CatalogsCreativeAssetsAttributes.md) |  |  [optional property]
**hotelId** | `String` | The catalog hotel id in the merchant namespace |  [optional property]
**creativeAssetsId** | `String` | The catalog creative assets id in the merchant namespace |  [optional property]
**errors** | [`List&lt;ItemValidationEvent&gt;`](ItemValidationEvent.md) | Array with the errors for the item id requested |  [optional property]









