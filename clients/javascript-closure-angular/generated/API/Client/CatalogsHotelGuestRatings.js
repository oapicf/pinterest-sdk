goog.provide('API.Client.CatalogsHotelGuestRatings');

/**
 * If specified, you must provide all properties
 * @record
 */
API.Client.CatalogsHotelGuestRatings = function() {}

/**
 * Your hotel's rating.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.score;

/**
 * Total number of people who have rated this hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.numberOfReviewers;

/**
 * Max value for the hotel rating score.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.maxScore;

/**
 * System you use for guest reviews.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelGuestRatings.prototype.ratingSystem;

