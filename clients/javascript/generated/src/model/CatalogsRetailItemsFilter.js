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

/**
 * The CatalogsRetailItemsFilter model module.
 * @module model/CatalogsRetailItemsFilter
 * @version 1.1.1-pre.0
 */
class CatalogsRetailItemsFilter {
    /**
     * Constructs a new <code>CatalogsRetailItemsFilter</code>.
     * @alias module:model/CatalogsRetailItemsFilter
     * @param catalogType {module:model/CatalogsRetailItemsFilter.CatalogTypeEnum} 
     * @param itemIds {Array.<String>} 
     */
    constructor(catalogType, itemIds) { 
        
        CatalogsRetailItemsFilter.initialize(this, catalogType, itemIds);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, catalogType, itemIds) { 
        obj['catalog_type'] = catalogType;
        obj['item_ids'] = itemIds;
    }

    /**
     * Constructs a <code>CatalogsRetailItemsFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsRetailItemsFilter} obj Optional instance to populate.
     * @return {module:model/CatalogsRetailItemsFilter} The populated <code>CatalogsRetailItemsFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsRetailItemsFilter();

            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = ApiClient.convertToType(data['catalog_type'], 'String');
            }
            if (data.hasOwnProperty('item_ids')) {
                obj['item_ids'] = ApiClient.convertToType(data['item_ids'], ['String']);
            }
            if (data.hasOwnProperty('catalog_id')) {
                obj['catalog_id'] = ApiClient.convertToType(data['catalog_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsRetailItemsFilter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsRetailItemsFilter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsRetailItemsFilter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['catalog_type'] && !(typeof data['catalog_type'] === 'string' || data['catalog_type'] instanceof String)) {
            throw new Error("Expected the field `catalog_type` to be a primitive type in the JSON string but got " + data['catalog_type']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['item_ids'])) {
            throw new Error("Expected the field `item_ids` to be an array in the JSON data but got " + data['item_ids']);
        }
        // ensure the json data is a string
        if (data['catalog_id'] && !(typeof data['catalog_id'] === 'string' || data['catalog_id'] instanceof String)) {
            throw new Error("Expected the field `catalog_id` to be a primitive type in the JSON string but got " + data['catalog_id']);
        }

        return true;
    }


}

CatalogsRetailItemsFilter.RequiredProperties = ["catalog_type", "item_ids"];

/**
 * @member {module:model/CatalogsRetailItemsFilter.CatalogTypeEnum} catalog_type
 */
CatalogsRetailItemsFilter.prototype['catalog_type'] = undefined;

/**
 * @member {Array.<String>} item_ids
 */
CatalogsRetailItemsFilter.prototype['item_ids'] = undefined;

/**
 * Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 * @member {String} catalog_id
 */
CatalogsRetailItemsFilter.prototype['catalog_id'] = undefined;





/**
 * Allowed values for the <code>catalog_type</code> property.
 * @enum {String}
 * @readonly
 */
CatalogsRetailItemsFilter['CatalogTypeEnum'] = {

    /**
     * value: "RETAIL"
     * @const
     */
    "RETAIL": "RETAIL"
};



export default CatalogsRetailItemsFilter;

