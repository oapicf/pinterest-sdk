goog.provide('API.Client.Account');

/**
 * @record
 */
API.Client.Account = function() {}

/**
 * Profile about description.
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.about;

/**
 * Type of account
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.accountType;

/**
 * User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.boardCount;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.businessName;

/**
 * User account follower count.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.followerCount;

/**
 * User account following count.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.followingCount;

/**
 * User account ID.
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.id;

/**
 * User account monthly views.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.monthlyViews;

/**
 * User account pin count. This includes both created and saved pins.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.pinCount;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.profileImage;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.username;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.websiteUrl;

/** @enum {string} */
API.Client.Account.AccountTypeEnum = { 
  PINNER: 'PINNER',
  BUSINESS: 'BUSINESS',
}
