package org.openapitools.server.model


/**
 * @param addr1 Primary street address of hotel. for example: ''null''
 * @param city City where the hotel is located. for example: ''null''
 * @param region State, county, province, where the hotel is located. for example: ''null''
 * @param country Country where the hotel is located. for example: ''null''
 * @param postalCode Required for countries with a postal code system. Postal or zip code of the hotel. for example: ''null''
*/
final case class CatalogsHotelAddress (
  addr1: Option[String] = None,
  city: Option[String] = None,
  region: Option[String] = None,
  country: Option[String] = None,
  postalCode: Option[String] = None
)

