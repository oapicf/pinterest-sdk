goog.provide('API.Client.CatalogsHotelGuestRatings');

/**
 * @record
 */
API.Client.CatalogsHotelGuestRatings = function() {}

/**
 * Max value for the hotel rating score.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.maxScore;

/**
 * Total number of people who have rated this hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.numberOfReviewers;

/**
 * System you use for guest reviews.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.ratingSystem;

/**
 * Your hotel's rating.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.score;

