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
import CatalogsProductGroupFiltersRequest from './CatalogsProductGroupFiltersRequest';

/**
 * The CatalogsProductGroupCreateRequest model module.
 * @module model/CatalogsProductGroupCreateRequest
 * @version 1.1.1-pre.0
 */
class CatalogsProductGroupCreateRequest {
    /**
     * Constructs a new <code>CatalogsProductGroupCreateRequest</code>.
     * Request object for creating a product group.
     * @alias module:model/CatalogsProductGroupCreateRequest
     * @param name {String} 
     * @param filters {module:model/CatalogsProductGroupFiltersRequest} 
     * @param feedId {String} Catalog Feed id pertaining to the catalog product group.
     */
    constructor(name, filters, feedId) { 
        
        CatalogsProductGroupCreateRequest.initialize(this, name, filters, feedId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, filters, feedId) { 
        obj['name'] = name;
        obj['is_featured'] = false;
        obj['filters'] = filters;
        obj['feed_id'] = feedId;
    }

    /**
     * Constructs a <code>CatalogsProductGroupCreateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsProductGroupCreateRequest} obj Optional instance to populate.
     * @return {module:model/CatalogsProductGroupCreateRequest} The populated <code>CatalogsProductGroupCreateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsProductGroupCreateRequest();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('is_featured')) {
                obj['is_featured'] = ApiClient.convertToType(data['is_featured'], 'Boolean');
            }
            if (data.hasOwnProperty('filters')) {
                obj['filters'] = CatalogsProductGroupFiltersRequest.constructFromObject(data['filters']);
            }
            if (data.hasOwnProperty('feed_id')) {
                obj['feed_id'] = ApiClient.convertToType(data['feed_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsProductGroupCreateRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsProductGroupCreateRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsProductGroupCreateRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
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
          CatalogsProductGroupFiltersRequest.validateJSON(data['filters']);
        }
        // ensure the json data is a string
        if (data['feed_id'] && !(typeof data['feed_id'] === 'string' || data['feed_id'] instanceof String)) {
            throw new Error("Expected the field `feed_id` to be a primitive type in the JSON string but got " + data['feed_id']);
        }

        return true;
    }


}

CatalogsProductGroupCreateRequest.RequiredProperties = ["name", "filters", "feed_id"];

/**
 * @member {String} name
 */
CatalogsProductGroupCreateRequest.prototype['name'] = undefined;

/**
 * @member {String} description
 */
CatalogsProductGroupCreateRequest.prototype['description'] = undefined;

/**
 * boolean indicator of whether the product group is being featured or not
 * @member {Boolean} is_featured
 * @default false
 */
CatalogsProductGroupCreateRequest.prototype['is_featured'] = false;

/**
 * @member {module:model/CatalogsProductGroupFiltersRequest} filters
 */
CatalogsProductGroupCreateRequest.prototype['filters'] = undefined;

/**
 * Catalog Feed id pertaining to the catalog product group.
 * @member {String} feed_id
 */
CatalogsProductGroupCreateRequest.prototype['feed_id'] = undefined;






export default CatalogsProductGroupCreateRequest;

