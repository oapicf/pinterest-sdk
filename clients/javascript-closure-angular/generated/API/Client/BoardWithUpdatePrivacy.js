goog.provide('API.Client.BoardWithUpdatePrivacy');

/**
 * @record
 */
API.Client.BoardWithUpdatePrivacy = function() {}

/**
 * Date and time of last board pins modified.
 * @type {!Date}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.boardPinsModifiedAt;

/**
 * Count of collaborators on the board.
 * @type {!number}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.collaboratorCount;

/**
 * Date and time of board creation.
 * @type {!Date}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.description;

/**
 * Board follower count.
 * @type {!number}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.followerCount;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.id;

/**
 * If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @type {!boolean}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.isAdsOnly;

/**
 * Board media.
 * @type {!API.Client.BoardMedia}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.media;

/**
 *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @type {!string}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.name;

/**
 * @type {!API.Client.BoardOwner}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.owner;

/**
 * Count of Pins on the board.
 * @type {!number}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.pinCount;

/**
 * @type {!API.Client.BoardUpdatePrivacy}
 * @export
 */
API.Client.BoardWithUpdatePrivacy.prototype.privacy;

