/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CatalogsCreativeAssetsProductGroupFilters from './CatalogsCreativeAssetsProductGroupFilters';

/**
 * The CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest model module.
 * @module model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
 * @version 1.1.1-pre.0
 */
class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
    /**
     * Constructs a new <code>CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest</code>.
     * Request object to list products for a given creative assets catalog_id and product group filter.
     * @alias module:model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
     * @param catalogType {module:model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum} 
     * @param catalogId {String} Catalog id pertaining to the creative assets product group.
     * @param filters {module:model/CatalogsCreativeAssetsProductGroupFilters} 
     */
    constructor(catalogType, catalogId, filters) { 
        
        CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.initialize(this, catalogType, catalogId, filters);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, catalogType, catalogId, filters) { 
        obj['catalog_type'] = catalogType;
        obj['catalog_id'] = catalogId;
        obj['filters'] = filters;
    }

    /**
     * Constructs a <code>CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest} obj Optional instance to populate.
     * @return {module:model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest} The populated <code>CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest();

            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = ApiClient.convertToType(data['catalog_type'], 'String');
            }
            if (data.hasOwnProperty('catalog_id')) {
                obj['catalog_id'] = ApiClient.convertToType(data['catalog_id'], 'String');
            }
            if (data.hasOwnProperty('filters')) {
                obj['filters'] = CatalogsCreativeAssetsProductGroupFilters.constructFromObject(data['filters']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['catalog_type'] && !(typeof data['catalog_type'] === 'string' || data['catalog_type'] instanceof String)) {
            throw new Error("Expected the field `catalog_type` to be a primitive type in the JSON string but got " + data['catalog_type']);
        }
        // ensure the json data is a string
        if (data['catalog_id'] && !(typeof data['catalog_id'] === 'string' || data['catalog_id'] instanceof String)) {
            throw new Error("Expected the field `catalog_id` to be a primitive type in the JSON string but got " + data['catalog_id']);
        }
        // validate the optional field `filters`
        if (data['filters']) { // data not null
          CatalogsCreativeAssetsProductGroupFilters.validateJSON(data['filters']);
        }

        return true;
    }


}

CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.RequiredProperties = ["catalog_type", "catalog_id", "filters"];

/**
 * @member {module:model/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.CatalogTypeEnum} catalog_type
 */
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.prototype['catalog_type'] = undefined;

/**
 * Catalog id pertaining to the creative assets product group.
 * @member {String} catalog_id
 */
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.prototype['catalog_id'] = undefined;

/**
 * @member {module:model/CatalogsCreativeAssetsProductGroupFilters} filters
 */
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.prototype['filters'] = undefined;





/**
 * Allowed values for the <code>catalog_type</code> property.
 * @enum {String}
 * @readonly
 */
CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest['CatalogTypeEnum'] = {

    /**
     * value: "CREATIVE_ASSETS"
     * @const
     */
    "CREATIVE_ASSETS": "CREATIVE_ASSETS"
};



export default CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest;

