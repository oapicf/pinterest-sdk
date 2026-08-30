goog.provide('API.Client.PinUpdate');

/**
 * Resource create or update operation model.
 * @record
 */
API.Client.PinUpdate = function() {}

/**
 * AI disclosure declarations the creator has made about this Pin.
 * @type {!API.Client.AiDisclosuresUpdate}
 * @export
 */
API.Client.PinUpdate.prototype.aiDisclosures;

/**
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.altText;

/**
 * The board to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.boardId;

/**
 * The board section to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.boardSectionId;

/**
 * Carousel Pin slots data.
 * @type {!Array<!API.Client.CarouselSlot>}
 * @export
 */
API.Client.PinUpdate.prototype.carouselSlots;

/**
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.link;

/**
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.title;

