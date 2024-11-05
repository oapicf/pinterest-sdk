goog.provide('API.Client.Pin');

/**
 * Pin
 * @record
 */
API.Client.Pin = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.id;

/**
 * @type {!Date}
 * @export
 */
API.Client.Pin.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.link;

/**
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.title;

/**
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.description;

/**
 * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.dominantColor;

/**
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.altText;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.Pin.prototype.creativeType;

/**
 * The board to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.boardId;

/**
 * The board section to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.boardSectionId;

/**
 * @type {!API.Client.BoardOwner}
 * @export
 */
API.Client.Pin.prototype.boardOwner;

/**
 * Whether the \"operation user_account\" is the Pin owner.
 * @type {!boolean}
 * @export
 */
API.Client.Pin.prototype.isOwner;

/**
 * @type {!API.Client.PinMedia}
 * @export
 */
API.Client.Pin.prototype.media;

/**
 * @type {!API.Client.PinMediaSource}
 * @export
 */
API.Client.Pin.prototype.mediaSource;

/**
 * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.parentPinId;

/**
 * Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.Pin.prototype.isStandard;

/**
 * Whether the Pin has been promoted or not.
 * @type {!boolean}
 * @export
 */
API.Client.Pin.prototype.hasBeenPromoted;

/**
 * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 * @type {!string}
 * @export
 */
API.Client.Pin.prototype.note;

/**
 * Pin metrics with associated time intervals if any.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Pin.prototype.pinMetrics;

