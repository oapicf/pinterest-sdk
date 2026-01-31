goog.provide('API.Client.PinCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.PinCreate = function() {}

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
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.description;

/**
 * Dominant pin color. Hex number, e.g. `#6E7874`.
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.dominantColor;

/**
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.link;

/**
 * @type {!API.Client.PinMediaSource}
 * @export
 */
API.Client.PinCreate.prototype.mediaSource;

/**
 * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.parentPinId;

/**
 * The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.sponsorId;

/**
 * @type {!string}
 * @export
 */
API.Client.PinCreate.prototype.title;

