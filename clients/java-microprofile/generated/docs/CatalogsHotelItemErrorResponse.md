

# CatalogsHotelItemErrorResponse

Object describing a hotel item error

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**errors** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  |
|**hotelId** | **String** | The catalog hotel id in the merchant namespace |  [optional] |
|**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| HOTEL | &quot;HOTEL&quot; |



## Enum: ItemResponseKindEnum

| Name | Value |
|---- | -----|
| HOTEL_ITEM_ERROR | &quot;hotel_item_error&quot; |



