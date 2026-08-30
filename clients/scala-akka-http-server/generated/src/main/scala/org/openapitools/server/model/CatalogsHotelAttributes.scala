package org.openapitools.server.model


/**
 * @param address Hotel address for example: ''null''
 * @param basePrice Base price of the hotel room per night followed by the ISO currency code for example: ''100 USD''
 * @param brand The brand to which this hotel belongs to. for example: ''null''
 * @param category The type of property. The category can be any type of internal description desired. for example: ''null''
 * @param customLabel0 Custom grouping of hotels for example: ''null''
 * @param customLabel1 Custom grouping of hotels for example: ''null''
 * @param customLabel2 Custom grouping of hotels for example: ''null''
 * @param customLabel3 Custom grouping of hotels for example: ''null''
 * @param customLabel4 Custom grouping of hotels for example: ''null''
 * @param description Brief description of the hotel. for example: ''null''
 * @param guestRatings If specified, you must provide all properties for example: ''null''
 * @param latitude Latitude of the hotel. for example: ''null''
 * @param link Link to the product page for example: ''null''
 * @param longitude Longitude of the hotel. for example: ''null''
 * @param name The hotel's name. for example: ''null''
 * @param neighborhood A list of neighborhoods where the hotel is located for example: ''null''
 * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. for example: ''90 USD''
 * @param additionalImageLink <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. for example: ''["https://scene.example.com/image/image_v2.jpg","https://scene.example.com/image/image_v3.jpg"]''
 * @param aiDisclosures AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. for example: ''[{"url":"https://scene.example.com/image/image_v3.jpg","disclosure":["ai_modified"]}]''
 * @param mainImage The main hotel image for example: ''null''
*/
final case class CatalogsHotelAttributes (
  address: Option[CatalogsHotelAddress] = None,
  basePrice: Option[String] = None,
  brand: Option[String] = None,
  category: Option[String] = None,
  customLabel0: Option[String] = None,
  customLabel1: Option[String] = None,
  customLabel2: Option[String] = None,
  customLabel3: Option[String] = None,
  customLabel4: Option[String] = None,
  description: Option[String] = None,
  guestRatings: Option[CatalogsHotelGuestRatings] = None,
  latitude: Option[Double] = None,
  link: Option[String] = None,
  longitude: Option[Double] = None,
  name: Option[String] = None,
  neighborhood: Option[Seq[String]] = None,
  salePrice: Option[String] = None,
  additionalImageLink: Option[Seq[String]] = None,
  aiDisclosures: Option[Seq[CatalogsAiContentDisclosure]] = None,
  mainImage: Option[CatalogsHotelMainImage] = None
)

