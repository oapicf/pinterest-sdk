goog.provide('API.Client.ConversionEventDeviceInfo');

/**
 * Object containing information about the device where event occurred.
 * @record
 */
API.Client.ConversionEventDeviceInfo = function() {}

/**
 * Battery charge level percentage
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.batteryLevel;

/**
 * Device brand
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.brand;

/**
 * User device's mobile carrier.
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.carrier;

/**
 * Number of CPU cores
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.cpuCores;

/**
 * External storage size in GB
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.externalStorageFreeSpace;

/**
 * External storage size in GB
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.externalStorageSize;

/**
 * Device form factor
 * @type {!API.Client.FormFactor}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.formFactor;

/**
 * Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.kernelVersion;

/**
 * List of user installed languages. ISO 639-1 format
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.languages;

/**
 * Device locale BCP-47 format
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.locale;

/**
 * Device model name
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.model;

/**
 * Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
 * @type {!API.Client.NetworkType}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.networkType;

/**
 * OS Family
 * @type {!API.Client.OsFamily}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.osFamily;

/**
 * Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.osName;

/**
 * Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.osReleaseName;

/**
 * Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.osVersion;

/**
 * Screen density, PPI
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.screenDensity;

/**
 * Screen height in pixels
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.screenHeight;

/**
 * Screen width in pixels
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.screenWidth;

/**
 * Internal storage size in GB
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.storageFreeSpace;

/**
 * Internal storage size in GB
 * @type {!number}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.storageSize;

/**
 * Device timezone
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.timezone;

/**
 * Timezone abbreviation
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.timezoneAbbr;

/**
 * Device type
 * @type {!string}
 * @export
 */
API.Client.ConversionEventDeviceInfo.prototype.type;

