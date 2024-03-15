package org.openapitools.server.model


/**
 * @param name The hotel's name. for example: ''null''
 * @param link Link to the product page for example: ''null''
 * @param description Brief description of the hotel. for example: ''null''
 * @param brand The brand to which this hotel belongs to. for example: ''null''
 * @param latitude Latitude of the hotel. for example: ''null''
 * @param longitude Longitude of the hotel. for example: ''null''
 * @param neighborhood A list of neighborhoods where the hotel is located for example: ''null''
 * @param address  for example: ''null''
 * @param customLabel0 Custom grouping of hotels for example: ''null''
 * @param customLabel1 Custom grouping of hotels for example: ''null''
 * @param customLabel2 Custom grouping of hotels for example: ''null''
 * @param customLabel3 Custom grouping of hotels for example: ''null''
 * @param customLabel4 Custom grouping of hotels for example: ''null''
 * @param category The type of property. The category can be any type of internal description desired. for example: ''null''
 * @param basePrice Base price of the hotel room per night followed by the ISO currency code for example: ''100 USD''
 * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. for example: ''90 USD''
 * @param guestRatings  for example: ''null''
*/
final case class CatalogsUpdatableHotelAttributes (
  name: Option[String] = None,
  link: Option[String] = None,
  description: Option[String] = None,
  brand: Option[String] = None,
  latitude: Option[Double] = None,
  longitude: Option[Double] = None,
  neighborhood: Option[Seq[String]] = None,
  address: Option[CatalogsHotelAddress] = None,
  customLabel0: Option[String] = None,
  customLabel1: Option[String] = None,
  customLabel2: Option[String] = None,
  customLabel3: Option[String] = None,
  customLabel4: Option[String] = None,
  category: Option[String] = None,
  basePrice: Option[String] = None,
  salePrice: Option[String] = None,
  guestRatings: Option[CatalogsHotelGuestRatings] = None
)

