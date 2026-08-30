goog.provide('API.Client.EntityDataChangeHistory');

/**
 * @record
 */
API.Client.EntityDataChangeHistory = function() {}

/**
 * A string identifier representing the changed field on the entity
 * @type {!string}
 * @export
 */
API.Client.EntityDataChangeHistory.prototype.changedFieldId;

/**
 * The human readable name of the changed field on the entity
 * @type {!string}
 * @export
 */
API.Client.EntityDataChangeHistory.prototype.changedFieldName;

/**
 * Specifies the type of the field's data values
 * @type {!API.Client.ChangeHistoryDataType}
 * @export
 */
API.Client.EntityDataChangeHistory.prototype.dataType;

/**
 * A string representation of the value of the changed field, after the change
 * @type {!string}
 * @export
 */
API.Client.EntityDataChangeHistory.prototype.newDataValue;

/**
 * A string representation of the value of the changed field, before the change
 * @type {!string}
 * @export
 */
API.Client.EntityDataChangeHistory.prototype.oldDataValue;

