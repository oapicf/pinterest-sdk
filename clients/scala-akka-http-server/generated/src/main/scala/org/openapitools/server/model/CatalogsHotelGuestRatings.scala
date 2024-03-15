package org.openapitools.server.model


/**
 * If specified, you must provide all properties
 *
 * @param score Your hotel's rating. for example: ''null''
 * @param numberOfReviewers Total number of people who have rated this hotel. for example: ''null''
 * @param maxScore Max value for the hotel rating score. for example: ''null''
 * @param ratingSystem System you use for guest reviews. for example: ''null''
*/
final case class CatalogsHotelGuestRatings (
  score: Option[Double] = None,
  numberOfReviewers: Option[Int] = None,
  maxScore: Option[Double] = None,
  ratingSystem: Option[String] = None
)

