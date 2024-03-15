

# HotelProcessingRecord

Object describing an item processing record

The class is defined in **[HotelProcessingRecord.java](../../src/main/java/org/openapitools/model/HotelProcessingRecord.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotelId** | `String` | The catalog hotel id in the merchant namespace |  [optional property]
**errors** | [`List&lt;ItemValidationEvent&gt;`](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional property]
**warnings** | [`List&lt;ItemValidationEvent&gt;`](ItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional property]
**status** | `ItemProcessingStatus` |  |  [optional property]






