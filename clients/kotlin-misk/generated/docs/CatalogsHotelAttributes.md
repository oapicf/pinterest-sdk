
# CatalogsHotelAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address |  [optional]
**basePrice** | **kotlin.String** | Base price of the hotel room per night followed by the ISO currency code |  [optional]
**brand** | **kotlin.String** | The brand to which this hotel belongs to. |  [optional]
**category** | **kotlin.String** | The type of property. The category can be any type of internal description desired. |  [optional]
**customLabel0** | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel1** | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel2** | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel3** | **kotlin.String** | Custom grouping of hotels |  [optional]
**customLabel4** | **kotlin.String** | Custom grouping of hotels |  [optional]
**description** | **kotlin.String** | Brief description of the hotel. |  [optional]
**guestRatings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties |  [optional]
**latitude** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Latitude of the hotel. |  [optional]
**link** | **kotlin.String** | Link to the product page |  [optional]
**longitude** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Longitude of the hotel. |  [optional]
**name** | **kotlin.String** | The hotel&#39;s name. |  [optional]
**neighborhood** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of neighborhoods where the hotel is located |  [optional]
**salePrice** | **kotlin.String** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. |  [optional]
**additionalImageLink** | **kotlin.collections.List&lt;kotlin.String&gt;** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. |  [optional]
**aiDisclosures** | [**kotlin.collections.List&lt;CatalogsAiContentDisclosure&gt;**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. |  [optional]
**mainImage** | [**CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image |  [optional]



