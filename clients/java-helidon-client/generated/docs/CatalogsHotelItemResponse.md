

# CatalogsHotelItemResponse

Object describing a hotel record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  |  [optional] |
|**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  |  |
|**hotelId** | **String** | The catalog hotel id in the merchant namespace |  [optional] |
|**itemResponseKind** | [**ItemResponseKindEnum**](#ItemResponseKindEnum) | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |
|**pins** | [**List&lt;Pin&gt;**](Pin.md) | The pins mapped to the item |  [optional] |



## Enum: CatalogTypeEnum

| Name | Value |
|---- | -----|
| HOTEL | &quot;HOTEL&quot; |



## Enum: ItemResponseKindEnum

| Name | Value |
|---- | -----|
| HOTEL_ITEM | &quot;hotel_item&quot; |



