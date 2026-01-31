
package org.openapitools.client.model


case class CatalogsHotelGuestRatings (
    /* Max value for the hotel rating score. */
    _maxScore: Option[Number],
    /* Total number of people who have rated this hotel. */
    _numberOfReviewers: Option[Integer],
    /* System you use for guest reviews. */
    _ratingSystem: Option[String],
    /* Your hotel's rating. */
    _score: Option[Number]
)
object CatalogsHotelGuestRatings {
    def toStringBody(var_maxScore: Object, var_numberOfReviewers: Object, var_ratingSystem: Object, var_score: Object) =
        s"""
        | {
        | "maxScore":$var_maxScore,"numberOfReviewers":$var_numberOfReviewers,"ratingSystem":$var_ratingSystem,"score":$var_score
        | }
        """.stripMargin
}
