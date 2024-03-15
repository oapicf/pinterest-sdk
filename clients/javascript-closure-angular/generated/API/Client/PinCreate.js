goog.provide('API.Client.PinCreate');

/**
 * Pin
 * @record
 */
API.Client.PinCreate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.id;

/**
 * @type {!Date}
 * @export
 */
API.Client.PinCreate.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.link;

/**
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.description;

/**
 * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.dominantColor;

/**
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.altText;

/**
 * The board to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.boardId;

/**
 * The board section to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.boardSectionId;

/**
 * @type {!API.Client.Board_owner}
 * @export
 */
API.Client.PinCreate.prototype.boardOwner;

/**
 * @type {!API.Client.SummaryPin_media}
 * @export
 */
API.Client.PinCreate.prototype.media;

/**
 * @type {!API.Client.PinMediaSource}
 * @export
 */
API.Client.PinCreate.prototype.mediaSource;

/**
 * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.parentPinId;

/**
 * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.note;

