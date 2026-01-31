goog.provide('API.Client.ConversionTagCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.ConversionTagCreate = function() {}

/**
 * Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemDbEnabled;

/**
 * Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemEnabled;

/**
 * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemExternalIdEnabled;

/**
 * Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemFnlnEnabled;

/**
 * Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemGeEnabled;

/**
 * Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemLocEnabled;

/**
 * Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
 * @type {!boolean}
 * @export
 */
API.Client.ConversionTagCreate.prototype.aemPhEnabled;

/**
 * Metadata ingestion frequency.
 * @type {!number}
 * @export
 */
API.Client.ConversionTagCreate.prototype.mdFrequency;

/**
 * Conversion tag name.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCreate.prototype.name;

