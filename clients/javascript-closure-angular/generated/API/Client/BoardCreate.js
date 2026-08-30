goog.provide('API.Client.BoardCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.BoardCreate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BoardCreate.prototype.description;

/**
 * If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @type {!boolean}
 * @export
 */
API.Client.BoardCreate.prototype.isAdsOnly;

/**
 *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @type {!string}
 * @export
 */
API.Client.BoardCreate.prototype.name;

/**
 *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
 * @type {!API.Client.BoardPrivacy}
 * @export
 */
API.Client.BoardCreate.prototype.privacy;

