goog.provide('API.Client.DeleteMemberAccessResult');

/**
 * The terminated asset access.
 * @record
 */
API.Client.DeleteMemberAccessResult = function() {}

/**
 * Unique identifier of the business asset.
 * @type {!string}
 * @export
 */
API.Client.DeleteMemberAccessResult.prototype.assetId;

/**
 * Unique identifier of the business member.
 * @type {!string}
 * @export
 */
API.Client.DeleteMemberAccessResult.prototype.memberId;

