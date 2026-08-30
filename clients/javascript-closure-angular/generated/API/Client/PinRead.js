goog.provide('API.Client.PinRead');

/**
 * @record
 */
API.Client.PinRead = function() {}

/**
 * AI disclosure declarations the creator has made about this Pin.
 * @type {!API.Client.AiDisclosures}
 * @export
 */
API.Client.PinRead.prototype.aiDisclosures;

/**
 * The board to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.boardId;

/**
 * @type {!API.Client.BoardOwner}
 * @export
 */
API.Client.PinRead.prototype.boardOwner;

/**
 * The board section to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.boardSectionId;

/**
 * @type {!Date}
 * @export
 */
API.Client.PinRead.prototype.createdAt;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.PinRead.prototype.creativeType;

/**
 * Dominant pin color. Hex number, e.g. `#6E7874`.
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.dominantColor;

/**
 * Whether the Pin has been promoted or not.
 * @type {!boolean}
 * @export
 */
API.Client.PinRead.prototype.hasBeenPromoted;

/**
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.id;

/**
 * Whether the \"operation user_account\" is the Pin owner.
 * @type {!boolean}
 * @export
 */
API.Client.PinRead.prototype.isOwner;

/**
 * Whether the Pin is a product Pin.
 * @type {!boolean}
 * @export
 */
API.Client.PinRead.prototype.isProduct;

/**
 * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.PinRead.prototype.isStandard;

/**
 * @type {!API.Client.PinMedia}
 * @export
 */
API.Client.PinRead.prototype.media;

/**
 * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.parentPinId;

/**
 * Pin metrics with associated time intervals if any.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.PinRead.prototype.pinMetrics;

/**
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.altText;

/**
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.link;

/**
 * @type {!string}
 * @export
 */
API.Client.PinRead.prototype.title;

