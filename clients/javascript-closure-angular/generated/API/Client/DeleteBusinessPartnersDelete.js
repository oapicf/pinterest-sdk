goog.provide('API.Client.DeleteBusinessPartnersDelete');

/**
 * @record
 */
API.Client.DeleteBusinessPartnersDelete = function() {}

/**
 * A list of partner ids to be deleted
 * @type {!Array<!string>}
 * @export
 */
API.Client.DeleteBusinessPartnersDelete.prototype.partnerIds;

/**
 * @type {!API.Client.NullablePartnerType}
 * @export
 */
API.Client.DeleteBusinessPartnersDelete.prototype.partnerType;

