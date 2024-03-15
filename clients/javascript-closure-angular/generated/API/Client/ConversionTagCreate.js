goog.provide('API.Client.ConversionTagCreate');

/**
 * @record
 */
API.Client.ConversionTagCreate = function() {}

/**
 * Conversion tag name.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCreate.prototype.name;

/**
 * Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemEnabled;

/**
 * Metadata ingestion frequency.
 * @type {!number}
 * @export
 */
API.Client.ConversionTagCreate.prototype.mdFrequency;

/**
 * Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemFnlnEnabled;

/**
 * Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemPhEnabled;

/**
 * Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemGeEnabled;

/**
 * Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemDbEnabled;

/**
 * Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemLocEnabled;

