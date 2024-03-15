goog.provide('API.Client.ConversionTagConfigs');

/**
 * @record
 */
API.Client.ConversionTagConfigs = function() {}

/**
 * Whether Automatic Enhanced Match email is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemEnabled;

/**
 * Metadata ingestion frequency.
 * @type {!number}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.mdFrequency;

/**
 * Whether Automatic Enhanced Match name is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemFnlnEnabled;

/**
 * Whether Automatic Enhanced Match phone is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemPhEnabled;

/**
 * Whether Automatic Enhanced Match gender is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemGeEnabled;

/**
 * Whether Automatic Enhanced Match birthdate is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemDbEnabled;

/**
 * Whether Automatic Enhanced Match location is enabled. See <a href=\"https://help.pinterest.com/en/business/article/enhanced-match\" target=\"_blank\">Enhanced match</a> for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemLocEnabled;

