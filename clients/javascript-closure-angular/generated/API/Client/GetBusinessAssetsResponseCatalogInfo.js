goog.provide('API.Client.GetBusinessAssetsResponse_catalog_info');

/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
 * @record
 */
API.Client.GetBusinessAssetsResponseCatalogInfo = function() {}

/**
 * Catalog type
 * @type {!string}
 * @export
 */
API.Client.GetBusinessAssetsResponseCatalogInfo.prototype.catalogType;

/**
 * Catalog ID.
 * @type {!string}
 * @export
 */
API.Client.GetBusinessAssetsResponseCatalogInfo.prototype.id;

/**
 * Catalog name
 * @type {!string}
 * @export
 */
API.Client.GetBusinessAssetsResponseCatalogInfo.prototype.name;

