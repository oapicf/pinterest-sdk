goog.provide('API.Client.BoardBase');

/**
 * @record
 */
API.Client.BoardBase = function() {}

/**
 * Date and time of last board pins modified.
 * @type {!Date}
 * @export
 */
API.Client.BoardBase.prototype.boardPinsModifiedAt;

/**
 * Count of collaborators on the board.
 * @type {!number}
 * @export
 */
API.Client.BoardBase.prototype.collaboratorCount;

/**
 * Date and time of board creation.
 * @type {!Date}
 * @export
 */
API.Client.BoardBase.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardBase.prototype.description;

/**
 * Board follower count.
 * @type {!number}
 * @export
 */
API.Client.BoardBase.prototype.followerCount;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardBase.prototype.id;

/**
 * If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @type {!boolean}
 * @export
 */
API.Client.BoardBase.prototype.isAdsOnly;

/**
 * Board media.
 * @type {!API.Client.BoardMedia}
 * @export
 */
API.Client.BoardBase.prototype.media;

/**
 *      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @type {!string}
 * @export
 */
API.Client.BoardBase.prototype.name;

/**
 * @type {!API.Client.BoardOwner}
 * @export
 */
API.Client.BoardBase.prototype.owner;

/**
 * Count of Pins on the board.
 * @type {!number}
 * @export
 */
API.Client.BoardBase.prototype.pinCount;

