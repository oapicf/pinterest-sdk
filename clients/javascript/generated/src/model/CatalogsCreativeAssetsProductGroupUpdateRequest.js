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
 * The CatalogsCreativeAssetsProductGroupUpdateRequest model module.
 * @module model/CatalogsCreativeAssetsProductGroupUpdateRequest
 * @version 1.1.1-pre.0
 */
class CatalogsCreativeAssetsProductGroupUpdateRequest {
    /**
     * Constructs a new <code>CatalogsCreativeAssetsProductGroupUpdateRequest</code>.
     * Request object for updating a creative assets product group.
     * @alias module:model/CatalogsCreativeAssetsProductGroupUpdateRequest
     */
    constructor() { 
        
        CatalogsCreativeAssetsProductGroupUpdateRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CatalogsCreativeAssetsProductGroupUpdateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsCreativeAssetsProductGroupUpdateRequest} obj Optional instance to populate.
     * @return {module:model/CatalogsCreativeAssetsProductGroupUpdateRequest} The populated <code>CatalogsCreativeAssetsProductGroupUpdateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsCreativeAssetsProductGroupUpdateRequest();

            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = ApiClient.convertToType(data['catalog_type'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('filters')) {
                obj['filters'] = CatalogsCreativeAssetsProductGroupFilters.constructFromObject(data['filters']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsCreativeAssetsProductGroupUpdateRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsCreativeAssetsProductGroupUpdateRequest</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['catalog_type'] && !(typeof data['catalog_type'] === 'string' || data['catalog_type'] instanceof String)) {
            throw new Error("Expected the field `catalog_type` to be a primitive type in the JSON string but got " + data['catalog_type']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }
        // validate the optional field `filters`
        if (data['filters']) { // data not null
          CatalogsCreativeAssetsProductGroupFilters.validateJSON(data['filters']);
        }

        return true;
    }


}



/**
 * @member {module:model/CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogTypeEnum} catalog_type
 */
CatalogsCreativeAssetsProductGroupUpdateRequest.prototype['catalog_type'] = undefined;

/**
 * @member {String} name
 */
CatalogsCreativeAssetsProductGroupUpdateRequest.prototype['name'] = undefined;

/**
 * @member {String} description
 */
CatalogsCreativeAssetsProductGroupUpdateRequest.prototype['description'] = undefined;

/**
 * @member {module:model/CatalogsCreativeAssetsProductGroupFilters} filters
 */
CatalogsCreativeAssetsProductGroupUpdateRequest.prototype['filters'] = undefined;





/**
 * Allowed values for the <code>catalog_type</code> property.
 * @enum {String}
 * @readonly
 */
CatalogsCreativeAssetsProductGroupUpdateRequest['CatalogTypeEnum'] = {

    /**
     * value: "CREATIVE_ASSETS"
     * @const
     */
    "CREATIVE_ASSETS": "CREATIVE_ASSETS"
};



export default CatalogsCreativeAssetsProductGroupUpdateRequest;

