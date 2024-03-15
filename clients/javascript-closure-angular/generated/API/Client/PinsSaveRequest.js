goog.provide('API.Client.pins_save_request');

/**
 * @record
 */
API.Client.PinsSaveRequest = function() {}

/**
 * Unique identifier of the board to which the pin will be saved.
 * @type {!string}
 * @export
 */
API.Client.PinsSaveRequest.prototype.boardId;

/**
 * Unique identifier of the board section to which the pin will be saved.
 * @type {!string}
 * @export
 */
API.Client.PinsSaveRequest.prototype.boardSectionId;

