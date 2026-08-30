goog.provide('API.Client.Board');

/**
 * @record
 */
API.Client.Board = function() {}

/**
 * Date and time of last board pins modified.
 * @type {!Date}
 * @export
 */
API.Client.Board.prototype.boardPinsModifiedAt;

/**
 * Count of collaborators on the board.
 * @type {!number}
 * @export
 */
API.Client.Board.prototype.collaboratorCount;

/**
 * Date and time of board creation.
 * @type {!Date}
 * @export
 */
API.Client.Board.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.Board.prototype.description;

/**
 * Board follower count.
 * @type {!number}
 * @export
 */
API.Client.Board.prototype.followerCount;

/**
 * @type {!string}
 * @export
 */
API.Client.Board.prototype.id;

/**
 * If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @type {!boolean}
 * @export
 */
API.Client.Board.prototype.isAdsOnly;

/**
 * Board media.
 * @type {!API.Client.BoardMedia}
 * @export
 */
API.Client.Board.prototype.media;

/**
 *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @type {!string}
 * @export
 */
API.Client.Board.prototype.name;

/**
 * @type {!API.Client.BoardOwner}
 * @export
 */
API.Client.Board.prototype.owner;

/**
 * Count of Pins on the board.
 * @type {!number}
 * @export
 */
API.Client.Board.prototype.pinCount;

/**
 *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
 * @type {!API.Client.BoardPrivacy}
 * @export
 */
API.Client.Board.prototype.privacy;

