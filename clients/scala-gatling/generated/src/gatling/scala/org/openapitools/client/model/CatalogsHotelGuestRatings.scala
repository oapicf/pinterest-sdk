
package org.openapitools.client.model


case class CatalogsHotelGuestRatings (
    /* Your hotel's rating. */
    _score: Option[Number],
    /* Total number of people who have rated this hotel. */
    _numberOfReviewers: Option[Integer],
    /* Max value for the hotel rating score. */
    _maxScore: Option[Number],
    /* System you use for guest reviews. */
    _ratingSystem: Option[String]
)
object CatalogsHotelGuestRatings {
    def toStringBody(var_score: Object, var_numberOfReviewers: Object, var_maxScore: Object, var_ratingSystem: Object) =
        s"""
        | {
        | "score":$var_score,"numberOfReviewers":$var_numberOfReviewers,"maxScore":$var_maxScore,"ratingSystem":$var_ratingSystem
        | }
        """.stripMargin
}
