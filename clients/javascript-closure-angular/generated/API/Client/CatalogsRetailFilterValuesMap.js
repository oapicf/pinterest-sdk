goog.provide('API.Client.catalogs_retail_filter_values_map');

/**
 * A map of filter attributes to their available values.
 * @record
 */
API.Client.CatalogsRetailFilterValuesMap = function() {}

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.adImageTags;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.adVideoTags;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.availability;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.brand;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.condition;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.customLabel0;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.customLabel1;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.customLabel2;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.customLabel3;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.customLabel4;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.gender;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.googleProductCategory0;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.googleProductCategory1;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.googleProductCategory2;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.googleProductCategory3;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.googleProductCategory4;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.googleProductCategory5;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.googleProductCategory6;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.mediaType;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.productType0;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.productType1;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.productType2;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.productType3;

/**
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsRetailFilterValuesMap.prototype.productType4;

/** @enum {string} */
API.Client.CatalogsRetailFilterValuesMap.Array&lt;!AvailabilityEnum&gt; = { 
  IN_STOCK: 'IN_STOCK',
  OUT_OF_STOCK: 'OUT_OF_STOCK',
  PREORDER: 'PREORDER',
  UNAVAILABLE: 'UNAVAILABLE',
}
/** @enum {string} */
API.Client.CatalogsRetailFilterValuesMap.Array&lt;!ConditionEnum&gt; = { 
  NEW: 'NEW',
  USED: 'USED',
  REFURBISHED: 'REFURBISHED',
}
/** @enum {string} */
API.Client.CatalogsRetailFilterValuesMap.Array&lt;!GenderEnum&gt; = { 
  FEMALE: 'FEMALE',
  MALE: 'MALE',
  UNISEX: 'UNISEX',
}
/** @enum {string} */
API.Client.CatalogsRetailFilterValuesMap.Array&lt;!MediaTypeEnum&gt; = { 
  IMAGE: 'IMAGE',
  VIDEO: 'VIDEO',
}
