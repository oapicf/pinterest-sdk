/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BatchOperationStatus from './BatchOperationStatus';
import CatalogsType from './CatalogsType';
import ItemProcessingRecord from './ItemProcessingRecord';

/**
 * The CatalogsRetailItemsBatch model module.
 * @module model/CatalogsRetailItemsBatch
 * @version 1.1.1-pre.0
 */
class CatalogsRetailItemsBatch {
    /**
     * Constructs a new <code>CatalogsRetailItemsBatch</code>.
     * Object describing the catalogs retail items batch
     * @alias module:model/CatalogsRetailItemsBatch
     * @param catalogType {module:model/CatalogsType} 
     */
    constructor(catalogType) { 
        
        CatalogsRetailItemsBatch.initialize(this, catalogType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, catalogType) { 
        obj['catalog_type'] = catalogType;
    }

    /**
     * Constructs a <code>CatalogsRetailItemsBatch</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsRetailItemsBatch} obj Optional instance to populate.
     * @return {module:model/CatalogsRetailItemsBatch} The populated <code>CatalogsRetailItemsBatch</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsRetailItemsBatch();

            if (data.hasOwnProperty('batch_id')) {
                obj['batch_id'] = ApiClient.convertToType(data['batch_id'], 'String');
            }
            if (data.hasOwnProperty('created_time')) {
                obj['created_time'] = ApiClient.convertToType(data['created_time'], 'Date');
            }
            if (data.hasOwnProperty('completed_time')) {
                obj['completed_time'] = ApiClient.convertToType(data['completed_time'], 'Date');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = BatchOperationStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = CatalogsType.constructFromObject(data['catalog_type']);
            }
            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [ItemProcessingRecord]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsRetailItemsBatch</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsRetailItemsBatch</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsRetailItemsBatch.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['batch_id'] && !(typeof data['batch_id'] === 'string' || data['batch_id'] instanceof String)) {
            throw new Error("Expected the field `batch_id` to be a primitive type in the JSON string but got " + data['batch_id']);
        }
        if (data['items']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['items'])) {
                throw new Error("Expected the field `items` to be an array in the JSON data but got " + data['items']);
            }
            // validate the optional field `items` (array)
            for (const item of data['items']) {
                ItemProcessingRecord.validateJSON(item);
            };
        }

        return true;
    }


}

CatalogsRetailItemsBatch.RequiredProperties = ["catalog_type"];

/**
 * Id of the catalogs items batch
 * @member {String} batch_id
 */
CatalogsRetailItemsBatch.prototype['batch_id'] = undefined;

/**
 * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
 * @member {Date} created_time
 */
CatalogsRetailItemsBatch.prototype['created_time'] = undefined;

/**
 * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
 * @member {Date} completed_time
 */
CatalogsRetailItemsBatch.prototype['completed_time'] = undefined;

/**
 * @member {module:model/BatchOperationStatus} status
 */
CatalogsRetailItemsBatch.prototype['status'] = undefined;

/**
 * @member {module:model/CatalogsType} catalog_type
 */
CatalogsRetailItemsBatch.prototype['catalog_type'] = undefined;

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @member {Array.<module:model/ItemProcessingRecord>} items
 */
CatalogsRetailItemsBatch.prototype['items'] = undefined;






export default CatalogsRetailItemsBatch;
