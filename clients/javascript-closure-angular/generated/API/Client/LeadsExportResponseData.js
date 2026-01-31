goog.provide('API.Client.LeadsExportResponseData');

/**
 * @record
 */
API.Client.LeadsExportResponseData = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.LeadsExportResponseData.prototype.downloadUrl;

/**
 * @type {!API.Client.LeadsExportStatus}
 * @export
 */
API.Client.LeadsExportResponseData.prototype.exportStatus;

