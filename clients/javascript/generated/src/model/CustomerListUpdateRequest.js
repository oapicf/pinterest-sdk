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
import Exception from './Exception';
import UserListOperationType from './UserListOperationType';

/**
 * The CustomerListUpdateRequest model module.
 * @module model/CustomerListUpdateRequest
 * @version 1.1.1-pre.0
 */
class CustomerListUpdateRequest {
    /**
     * Constructs a new <code>CustomerListUpdateRequest</code>.
     * @alias module:model/CustomerListUpdateRequest
     * @param records {String} Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @param operationType {module:model/UserListOperationType} 
     */
    constructor(records, operationType) { 
        
        CustomerListUpdateRequest.initialize(this, records, operationType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, records, operationType) { 
        obj['records'] = records;
        obj['operation_type'] = operationType;
    }

    /**
     * Constructs a <code>CustomerListUpdateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CustomerListUpdateRequest} obj Optional instance to populate.
     * @return {module:model/CustomerListUpdateRequest} The populated <code>CustomerListUpdateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CustomerListUpdateRequest();

            if (data.hasOwnProperty('records')) {
                obj['records'] = ApiClient.convertToType(data['records'], 'String');
            }
            if (data.hasOwnProperty('operation_type')) {
                obj['operation_type'] = ApiClient.convertToType(data['operation_type'], UserListOperationType);
            }
            if (data.hasOwnProperty('exceptions')) {
                obj['exceptions'] = Exception.constructFromObject(data['exceptions']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CustomerListUpdateRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CustomerListUpdateRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CustomerListUpdateRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['records'] && !(typeof data['records'] === 'string' || data['records'] instanceof String)) {
            throw new Error("Expected the field `records` to be a primitive type in the JSON string but got " + data['records']);
        }

        return true;
    }


}

CustomerListUpdateRequest.RequiredProperties = ["records", "operation_type"];

/**
 * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
 * @member {String} records
 */
CustomerListUpdateRequest.prototype['records'] = undefined;

/**
 * @member {module:model/UserListOperationType} operation_type
 */
CustomerListUpdateRequest.prototype['operation_type'] = undefined;

/**
 * @member {module:model/Exception} exceptions
 */
CustomerListUpdateRequest.prototype['exceptions'] = undefined;






export default CustomerListUpdateRequest;

