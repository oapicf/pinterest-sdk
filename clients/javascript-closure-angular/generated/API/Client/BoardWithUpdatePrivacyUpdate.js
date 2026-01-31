goog.provide('API.Client.BoardWithUpdatePrivacyUpdate');

/**
 * Resource create or update operation model.
 * @record
 */
API.Client.BoardWithUpdatePrivacyUpdate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BoardWithUpdatePrivacyUpdate.prototype.description;

/**
 *      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @type {!string}
 * @export
 */
API.Client.BoardWithUpdatePrivacyUpdate.prototype.name;

/**
 * @type {!API.Client.BoardUpdatePrivacy}
 * @export
 */
API.Client.BoardWithUpdatePrivacyUpdate.prototype.privacy;

