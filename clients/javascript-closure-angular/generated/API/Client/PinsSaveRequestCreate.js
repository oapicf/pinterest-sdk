goog.provide('API.Client.PinsSaveRequestCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.PinsSaveRequestCreate = function() {}

/**
 * Unique identifier of the board to which the pin will be saved.
 * @type {!string}
 * @export
 */
API.Client.PinsSaveRequestCreate.prototype.boardId;

/**
 * Unique identifier of the board section to which the pin will be saved.
 * @type {!string}
 * @export
 */
API.Client.PinsSaveRequestCreate.prototype.boardSectionId;

