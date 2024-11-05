goog.provide('API.Client.Board');

/**
 * Board
 * @record
 */
API.Client.Board = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Board.prototype.id;

/**
 * Date and time of board creation.
 * @type {!Date}
 * @export
 */
API.Client.Board.prototype.createdAt;

/**
 * Date and time of last board pins modified.
 * @type {!Date}
 * @export
 */
API.Client.Board.prototype.boardPinsModifiedAt;

/**
 * @type {!string}
 * @export
 */
API.Client.Board.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.Board.prototype.description;

/**
 * Count of collaborators on the board.
 * @type {!number}
 * @export
 */
API.Client.Board.prototype.collaboratorCount;

/**
 * Count of pins on the board.
 * @type {!number}
 * @export
 */
API.Client.Board.prototype.pinCount;

/**
 * Board follower count.
 * @type {!number}
 * @export
 */
API.Client.Board.prototype.followerCount;

/**
 * @type {!API.Client.Board_media}
 * @export
 */
API.Client.Board.prototype.media;

/**
 * @type {!API.Client.BoardOwner}
 * @export
 */
API.Client.Board.prototype.owner;

/**
 * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
 * @type {!string}
 * @export
 */
API.Client.Board.prototype.privacy;

/** @enum {string} */
API.Client.Board.PrivacyEnum = { 
  PUBLIC: 'PUBLIC',
  PROTECTED: 'PROTECTED',
  SECRET: 'SECRET',
}
