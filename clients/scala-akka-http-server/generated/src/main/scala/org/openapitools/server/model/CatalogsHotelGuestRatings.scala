package org.openapitools.server.model


/**
 * @param maxScore Max value for the hotel rating score. for example: ''null''
 * @param numberOfReviewers Total number of people who have rated this hotel. for example: ''null''
 * @param ratingSystem System you use for guest reviews. for example: ''null''
 * @param score Your hotel's rating. for example: ''null''
*/
final case class CatalogsHotelGuestRatings (
  maxScore: Option[Double] = None,
  numberOfReviewers: Option[Int] = None,
  ratingSystem: Option[String] = None,
  score: Option[Double] = None
)

