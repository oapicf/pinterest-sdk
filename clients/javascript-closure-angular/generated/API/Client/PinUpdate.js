goog.provide('API.Client.PinUpdate');

/**
 * Pin fields for updates
 * @record
 */
API.Client.PinUpdate = function() {}

/**
 * Pin's alternative text.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.altText;

/**
 * The id of the board to move the Pin onto.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.boardId;

/**
 * <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.boardSectionId;

/**
 * Pin description - 800 characters maximum.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.description;

/**
 * URL viewer is taken to when they click pin.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.link;

/**
 * The native pin title that creators explicitly prefer to display.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.title;

/**
 * Carousel Pin slots data.
 * @type {!Array<!API.Client.PinUpdate_carousel_slots_inner>}
 * @export
 */
API.Client.PinUpdate.prototype.carouselSlots;

/**
 * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 * @type {!string}
 * @export
 */
API.Client.PinUpdate.prototype.note;

