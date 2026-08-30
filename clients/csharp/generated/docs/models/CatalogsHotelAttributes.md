# Org.OpenAPITools.Model.CatalogsHotelAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional] 
**BasePrice** | **string** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**Brand** | **string** | The brand to which this hotel belongs to. | [optional] 
**Category** | **string** | The type of property. The category can be any type of internal description desired. | [optional] 
**CustomLabel0** | **string** | Custom grouping of hotels | [optional] 
**CustomLabel1** | **string** | Custom grouping of hotels | [optional] 
**CustomLabel2** | **string** | Custom grouping of hotels | [optional] 
**CustomLabel3** | **string** | Custom grouping of hotels | [optional] 
**CustomLabel4** | **string** | Custom grouping of hotels | [optional] 
**Description** | **string** | Brief description of the hotel. | [optional] 
**GuestRatings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional] 
**Latitude** | **decimal** | Latitude of the hotel. | [optional] 
**Link** | **string** | Link to the product page | [optional] 
**Longitude** | **decimal** | Longitude of the hotel. | [optional] 
**Name** | **string** | The hotel&#39;s name. | [optional] 
**Neighborhood** | **List&lt;string&gt;** | A list of neighborhoods where the hotel is located | [optional] 
**SalePrice** | **string** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**AdditionalImageLink** | **List&lt;string&gt;** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional] 
**AiDisclosures** | [**List&lt;CatalogsAiContentDisclosure&gt;**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional] 
**MainImage** | [**CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

