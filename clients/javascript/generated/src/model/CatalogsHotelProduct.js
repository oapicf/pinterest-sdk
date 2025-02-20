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
import CatalogsHotelProductMetadata from './CatalogsHotelProductMetadata';
import Pin from './Pin';

/**
 * The CatalogsHotelProduct model module.
 * @module model/CatalogsHotelProduct
 * @version 1.1.1-pre.0
 */
class CatalogsHotelProduct {
    /**
     * Constructs a new <code>CatalogsHotelProduct</code>.
     * @alias module:model/CatalogsHotelProduct
     * @param catalogType {module:model/CatalogsHotelProduct.CatalogTypeEnum} 
     * @param metadata {module:model/CatalogsHotelProductMetadata} 
     * @param pin {module:model/Pin} 
     */
    constructor(catalogType, metadata, pin) { 
        
        CatalogsHotelProduct.initialize(this, catalogType, metadata, pin);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, catalogType, metadata, pin) { 
        obj['catalog_type'] = catalogType;
        obj['metadata'] = metadata;
        obj['pin'] = pin;
    }

    /**
     * Constructs a <code>CatalogsHotelProduct</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsHotelProduct} obj Optional instance to populate.
     * @return {module:model/CatalogsHotelProduct} The populated <code>CatalogsHotelProduct</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsHotelProduct();

            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = ApiClient.convertToType(data['catalog_type'], 'String');
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = CatalogsHotelProductMetadata.constructFromObject(data['metadata']);
            }
            if (data.hasOwnProperty('pin')) {
                obj['pin'] = Pin.constructFromObject(data['pin']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsHotelProduct</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsHotelProduct</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsHotelProduct.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['catalog_type'] && !(typeof data['catalog_type'] === 'string' || data['catalog_type'] instanceof String)) {
            throw new Error("Expected the field `catalog_type` to be a primitive type in the JSON string but got " + data['catalog_type']);
        }
        // validate the optional field `metadata`
        if (data['metadata']) { // data not null
          CatalogsHotelProductMetadata.validateJSON(data['metadata']);
        }
        // validate the optional field `pin`
        if (data['pin']) { // data not null
          Pin.validateJSON(data['pin']);
        }

        return true;
    }


}

CatalogsHotelProduct.RequiredProperties = ["catalog_type", "metadata", "pin"];

/**
 * @member {module:model/CatalogsHotelProduct.CatalogTypeEnum} catalog_type
 */
CatalogsHotelProduct.prototype['catalog_type'] = undefined;

/**
 * @member {module:model/CatalogsHotelProductMetadata} metadata
 */
CatalogsHotelProduct.prototype['metadata'] = undefined;

/**
 * @member {module:model/Pin} pin
 */
CatalogsHotelProduct.prototype['pin'] = undefined;





/**
 * Allowed values for the <code>catalog_type</code> property.
 * @enum {String}
 * @readonly
 */
CatalogsHotelProduct['CatalogTypeEnum'] = {

    /**
     * value: "HOTEL"
     * @const
     */
    "HOTEL": "HOTEL"
};



export default CatalogsHotelProduct;

