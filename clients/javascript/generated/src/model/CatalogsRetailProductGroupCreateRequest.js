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
import CatalogsLocale from './CatalogsLocale';
import CatalogsProductGroupFiltersRequest from './CatalogsProductGroupFiltersRequest';
import Country from './Country';

/**
 * The CatalogsRetailProductGroupCreateRequest model module.
 * @module model/CatalogsRetailProductGroupCreateRequest
 * @version 1.1.1-pre.0
 */
class CatalogsRetailProductGroupCreateRequest {
    /**
     * Constructs a new <code>CatalogsRetailProductGroupCreateRequest</code>.
     * Request object for creating a product group.
     * @alias module:model/CatalogsRetailProductGroupCreateRequest
     * @param catalogType {module:model/CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum} Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @param name {String} 
     * @param filters {module:model/CatalogsProductGroupFiltersRequest} 
     * @param catalogId {String} Catalog id pertaining to the retail product group.
     * @param country {module:model/Country} 
     * @param locale {module:model/CatalogsLocale} 
     */
    constructor(catalogType, name, filters, catalogId, country, locale) { 
        
        CatalogsRetailProductGroupCreateRequest.initialize(this, catalogType, name, filters, catalogId, country, locale);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, catalogType, name, filters, catalogId, country, locale) { 
        obj['catalog_type'] = catalogType;
        obj['name'] = name;
        obj['filters'] = filters;
        obj['catalog_id'] = catalogId;
        obj['country'] = country;
        obj['locale'] = locale;
    }

    /**
     * Constructs a <code>CatalogsRetailProductGroupCreateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsRetailProductGroupCreateRequest} obj Optional instance to populate.
     * @return {module:model/CatalogsRetailProductGroupCreateRequest} The populated <code>CatalogsRetailProductGroupCreateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsRetailProductGroupCreateRequest();

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
                obj['filters'] = CatalogsProductGroupFiltersRequest.constructFromObject(data['filters']);
            }
            if (data.hasOwnProperty('catalog_id')) {
                obj['catalog_id'] = ApiClient.convertToType(data['catalog_id'], 'String');
            }
            if (data.hasOwnProperty('country')) {
                obj['country'] = Country.constructFromObject(data['country']);
            }
            if (data.hasOwnProperty('locale')) {
                obj['locale'] = CatalogsLocale.constructFromObject(data['locale']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsRetailProductGroupCreateRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsRetailProductGroupCreateRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsRetailProductGroupCreateRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
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
          CatalogsProductGroupFiltersRequest.validateJSON(data['filters']);
        }
        // ensure the json data is a string
        if (data['catalog_id'] && !(typeof data['catalog_id'] === 'string' || data['catalog_id'] instanceof String)) {
            throw new Error("Expected the field `catalog_id` to be a primitive type in the JSON string but got " + data['catalog_id']);
        }

        return true;
    }


}

CatalogsRetailProductGroupCreateRequest.RequiredProperties = ["catalog_type", "name", "filters", "catalog_id", "country", "locale"];

/**
 * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @member {module:model/CatalogsRetailProductGroupCreateRequest.CatalogTypeEnum} catalog_type
 */
CatalogsRetailProductGroupCreateRequest.prototype['catalog_type'] = undefined;

/**
 * @member {String} name
 */
CatalogsRetailProductGroupCreateRequest.prototype['name'] = undefined;

/**
 * @member {String} description
 */
CatalogsRetailProductGroupCreateRequest.prototype['description'] = undefined;

/**
 * @member {module:model/CatalogsProductGroupFiltersRequest} filters
 */
CatalogsRetailProductGroupCreateRequest.prototype['filters'] = undefined;

/**
 * Catalog id pertaining to the retail product group.
 * @member {String} catalog_id
 */
CatalogsRetailProductGroupCreateRequest.prototype['catalog_id'] = undefined;

/**
 * @member {module:model/Country} country
 */
CatalogsRetailProductGroupCreateRequest.prototype['country'] = undefined;

/**
 * @member {module:model/CatalogsLocale} locale
 */
CatalogsRetailProductGroupCreateRequest.prototype['locale'] = undefined;





/**
 * Allowed values for the <code>catalog_type</code> property.
 * @enum {String}
 * @readonly
 */
CatalogsRetailProductGroupCreateRequest['CatalogTypeEnum'] = {

    /**
     * value: "RETAIL"
     * @const
     */
    "RETAIL": "RETAIL"
};



export default CatalogsRetailProductGroupCreateRequest;

