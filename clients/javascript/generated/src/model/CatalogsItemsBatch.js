/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BatchOperationStatus from './BatchOperationStatus';
import ItemProcessingRecord from './ItemProcessingRecord';

/**
 * The CatalogsItemsBatch model module.
 * @module model/CatalogsItemsBatch
 * @version 1.0.0-pre.0
 */
class CatalogsItemsBatch {
    /**
     * Constructs a new <code>CatalogsItemsBatch</code>.
     * Object describing the catalogs items batch
     * @alias module:model/CatalogsItemsBatch
     */
    constructor() { 
        
        CatalogsItemsBatch.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CatalogsItemsBatch</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsItemsBatch} obj Optional instance to populate.
     * @return {module:model/CatalogsItemsBatch} The populated <code>CatalogsItemsBatch</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsItemsBatch();

            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [ItemProcessingRecord]);
            }
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
        }
        return obj;
    }


}

/**
 * Array with the catalogs items processing records part of the catalogs items batch
 * @member {Array.<module:model/ItemProcessingRecord>} items
 */
CatalogsItemsBatch.prototype['items'] = undefined;

/**
 * Id of the catalogs items batch
 * @member {String} batch_id
 */
CatalogsItemsBatch.prototype['batch_id'] = undefined;

/**
 * Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
 * @member {Date} created_time
 */
CatalogsItemsBatch.prototype['created_time'] = undefined;

/**
 * Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
 * @member {Date} completed_time
 */
CatalogsItemsBatch.prototype['completed_time'] = undefined;

/**
 * @member {module:model/BatchOperationStatus} status
 */
CatalogsItemsBatch.prototype['status'] = undefined;






export default CatalogsItemsBatch;
