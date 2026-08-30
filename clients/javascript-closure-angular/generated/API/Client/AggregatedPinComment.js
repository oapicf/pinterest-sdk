goog.provide('API.Client.AggregatedPinComment');

/**
 * @record
 */
API.Client.AggregatedPinComment = function() {}

/**
 * AI disclosure declarations the creator has made about this Pin.
 * @type {!API.Client.AiDisclosures}
 * @export
 */
API.Client.AggregatedPinComment.prototype.aiDisclosures;

/**
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.altText;

/**
 * The board to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.boardId;

/**
 * @type {!API.Client.BoardOwner}
 * @export
 */
API.Client.AggregatedPinComment.prototype.boardOwner;

/**
 * The board section to which this Pin belongs.
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.boardSectionId;

/**
 * @type {!Date}
 * @export
 */
API.Client.AggregatedPinComment.prototype.createdAt;

/**
 * @type {!API.Client.CreativeType}
 * @export
 */
API.Client.AggregatedPinComment.prototype.creativeType;

/**
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.description;

/**
 * Dominant pin color. Hex number, e.g. `#6E7874`.
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.dominantColor;

/**
 * Whether the Pin has been promoted or not.
 * @type {!boolean}
 * @export
 */
API.Client.AggregatedPinComment.prototype.hasBeenPromoted;

/**
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.id;

/**
 * Whether the \"operation user_account\" is the Pin owner.
 * @type {!boolean}
 * @export
 */
API.Client.AggregatedPinComment.prototype.isOwner;

/**
 * Whether the Pin is a product Pin.
 * @type {!boolean}
 * @export
 */
API.Client.AggregatedPinComment.prototype.isProduct;

/**
 * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.AggregatedPinComment.prototype.isStandard;

/**
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.link;

/**
 * @type {!API.Client.PinMedia}
 * @export
 */
API.Client.AggregatedPinComment.prototype.media;

/**
 * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.parentPinId;

/**
 * Pin metrics with associated time intervals if any.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AggregatedPinComment.prototype.pinMetrics;

/**
 * @type {!string}
 * @export
 */
API.Client.AggregatedPinComment.prototype.title;

