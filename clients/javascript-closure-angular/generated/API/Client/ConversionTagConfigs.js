goog.provide('API.Client.ConversionTagConfigs');

/**
 * @record
 */
API.Client.ConversionTagConfigs = function() {}

/**
 * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemDbEnabled;

/**
 * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemEnabled;

/**
 * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemExternalIdEnabled;

/**
 * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemFnlnEnabled;

/**
 * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemGeEnabled;

/**
 * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemLocEnabled;

/**
 * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.aemPhEnabled;

/**
 * Metadata ingestion frequency.
 * @type {!number}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.mdFrequency;

/**
 * List of advertiser subdomains configured for NoCodeCAPI calls.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionTagConfigs.prototype.noCodeCapiDomains;

