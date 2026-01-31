goog.provide('API.Client.Label');

/**
 * @record
 */
API.Client.Label = function() {}

/**
 * Label ID.
 * @type {!string}
 * @export
 */
API.Client.Label.prototype.id;

/**
 * @type {!API.Client.LabelType}
 * @export
 */
API.Client.Label.prototype.labelType;

/**
 * Label parent entity ID.
 * @type {!string}
 * @export
 */
API.Client.Label.prototype.parentId;

/**
 * Label parent entity type.
 * @type {!string}
 * @export
 */
API.Client.Label.prototype.parentType;

/**
 * @type {!API.Client.LabelStatus}
 * @export
 */
API.Client.Label.prototype.status;

/**
 * Label name.
 * @type {!string}
 * @export
 */
API.Client.Label.prototype.value;

/** @enum {string} */
API.Client.Label.ParentTypeEnum = { 
  CAMPAIGN: 'CAMPAIGN',
  : '',
}
