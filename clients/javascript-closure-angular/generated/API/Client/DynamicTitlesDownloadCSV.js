goog.provide('API.Client.DynamicTitlesDownloadCSV');

/**
 * @record
 */
API.Client.DynamicTitlesDownloadCSV = function() {}

/**
 * Pre-signed S3 URL to download the CSV file.
 * @type {!string}
 * @export
 */
API.Client.DynamicTitlesDownloadCSV.prototype.downloadUrl;

