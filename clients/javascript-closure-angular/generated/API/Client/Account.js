goog.provide('API.Client.Account');

/**
 * @record
 */
API.Client.Account = function() {}

/**
 * Type of account
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.accountType;

/**
 * User account ID.
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.profileImage;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.websiteUrl;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.username;

/**
 * Profile about description.
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.about;

/**
 * @type {!string}
 * @export
 */
API.Client.Account.prototype.businessName;

/**
 * User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.boardCount;

/**
 * User account pin count. This includes both created and saved pins.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.pinCount;

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
 * User account monthly views.
 * @type {!number}
 * @export
 */
API.Client.Account.prototype.monthlyViews;

/** @enum {string} */
API.Client.Account.AccountTypeEnum = { 
  PINNER: 'PINNER',
  BUSINESS: 'BUSINESS',
}
