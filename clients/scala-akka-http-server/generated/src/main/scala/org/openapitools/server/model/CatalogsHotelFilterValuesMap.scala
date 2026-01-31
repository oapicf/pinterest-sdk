package org.openapitools.server.model


/**
 * = catalogs_hotel_filter_values_map =
 *
 * A map of filter attributes to their available values.
 *
 * @param brand  for example: ''null''
 * @param customLabel0  for example: ''null''
 * @param customLabel1  for example: ''null''
 * @param customLabel2  for example: ''null''
 * @param customLabel3  for example: ''null''
 * @param customLabel4  for example: ''null''
*/
final case class CatalogsHotelFilterValuesMap (
  brand: Option[Seq[String]] = None,
  customLabel0: Option[Seq[String]] = None,
  customLabel1: Option[Seq[String]] = None,
  customLabel2: Option[Seq[String]] = None,
  customLabel3: Option[Seq[String]] = None,
  customLabel4: Option[Seq[String]] = None
)

