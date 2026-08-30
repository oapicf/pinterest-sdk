# openapi::CatalogsHotelAttributes


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**CatalogsHotelAddress**](CatalogsHotelAddress.md) | Hotel address | [optional] 
**base_price** | **character** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**brand** | **character** | The brand to which this hotel belongs to. | [optional] 
**category** | **character** | The type of property. The category can be any type of internal description desired. | [optional] 
**custom_label_0** | **character** | Custom grouping of hotels | [optional] 
**custom_label_1** | **character** | Custom grouping of hotels | [optional] 
**custom_label_2** | **character** | Custom grouping of hotels | [optional] 
**custom_label_3** | **character** | Custom grouping of hotels | [optional] 
**custom_label_4** | **character** | Custom grouping of hotels | [optional] 
**description** | **character** | Brief description of the hotel. | [optional] 
**guest_ratings** | [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) | If specified, you must provide all properties | [optional] 
**latitude** | **numeric** | Latitude of the hotel. | [optional] 
**link** | **character** | Link to the product page | [optional] 
**longitude** | **numeric** | Longitude of the hotel. | [optional] 
**name** | **character** | The hotel&#39;s name. | [optional] 
**neighborhood** | **array[character]** | A list of neighborhoods where the hotel is located | [optional] 
**sale_price** | **character** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**additional_image_link** | **array[character]** | &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. | [optional] 
**ai_disclosures** | [**array[CatalogsAiContentDisclosure]**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. | [optional] 
**main_image** | [**CatalogsHotelMainImage**](CatalogsHotelMainImage.md) | The main hotel image | [optional] 


