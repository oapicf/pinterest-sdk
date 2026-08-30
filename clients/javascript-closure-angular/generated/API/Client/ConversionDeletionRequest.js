goog.provide('API.Client.ConversionDeletionRequest');

/**
 * Conversion deletion request
 * @record
 */
API.Client.ConversionDeletionRequest = function() {}

/**
 * Timestamp when the conversion deletion request was succesfully created.
 * @type {!API.Client.date}
 * @export
 */
API.Client.ConversionDeletionRequest.prototype.createdTime;

/**
 * Timestamp when the conversion deletion request was processed.
 * @type {!API.Client.date}
 * @export
 */
API.Client.ConversionDeletionRequest.prototype.processedTime;

/**
 * Unique identifier of the conversion deletion request
 * @type {!string}
 * @export
 */
API.Client.ConversionDeletionRequest.prototype.requestId;

/**
 * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
 * @type {!API.Client.ConversionDeletionRequestStatus}
 * @export
 */
API.Client.ConversionDeletionRequest.prototype.status;

