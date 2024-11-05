goog.provide('API.Client.business_assets_get_200_response');

/**
 * @record
 */
API.Client.BusinessAssetsGet200Response = function() {}

/**
 * List of assets the requesting business has access to.
 * @type {!Array<!API.Client.GetBusinessAssetsResponse>}
 * @export
 */
API.Client.BusinessAssetsGet200Response.prototype.items;

/**
 * @type {!string}
 * @export
 */
API.Client.BusinessAssetsGet200Response.prototype.bookmark;

