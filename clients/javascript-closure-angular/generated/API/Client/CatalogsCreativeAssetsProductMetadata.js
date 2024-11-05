goog.provide('API.Client.CatalogsCreativeAssetsProductMetadata');

/**
 * Creative assets product metadata entity
 * @record
 */
API.Client.CatalogsCreativeAssetsProductMetadata = function() {}

/**
 * The user-created unique ID that represents the creative assets item.
 * @type {!string}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductMetadata.prototype.creativeAssetsId;

/**
 * @type {!API.Client.CreativeAssetsVisibilityType}
 * @export
 */
API.Client.CatalogsCreativeAssetsProductMetadata.prototype.visibility;

