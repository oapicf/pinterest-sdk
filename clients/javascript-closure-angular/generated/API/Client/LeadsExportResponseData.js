goog.provide('API.Client.LeadsExportResponseData');

/**
 * @record
 */
API.Client.LeadsExportResponseData = function() {}

/**
 * @type {!API.Client.LeadsExportStatus}
 * @export
 */
API.Client.LeadsExportResponseData.prototype.exportStatus;

/**
 * @type {!string}
 * @export
 */
API.Client.LeadsExportResponseData.prototype.downloadUrl;

