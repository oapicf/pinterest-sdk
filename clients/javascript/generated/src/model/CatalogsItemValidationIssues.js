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
import CatalogsItemValidationErrors from './CatalogsItemValidationErrors';
import CatalogsItemValidationWarnings from './CatalogsItemValidationWarnings';

/**
 * The CatalogsItemValidationIssues model module.
 * @module model/CatalogsItemValidationIssues
 * @version 1.1.1-pre.0
 */
class CatalogsItemValidationIssues {
    /**
     * Constructs a new <code>CatalogsItemValidationIssues</code>.
     * @alias module:model/CatalogsItemValidationIssues
     * @param itemNumber {Number} Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
     * @param itemId {String} The merchant-created unique ID that represents the product.
     * @param errors {module:model/CatalogsItemValidationErrors} 
     * @param warnings {module:model/CatalogsItemValidationWarnings} 
     */
    constructor(itemNumber, itemId, errors, warnings) { 
        
        CatalogsItemValidationIssues.initialize(this, itemNumber, itemId, errors, warnings);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, itemNumber, itemId, errors, warnings) { 
        obj['item_number'] = itemNumber;
        obj['item_id'] = itemId;
        obj['errors'] = errors;
        obj['warnings'] = warnings;
    }

    /**
     * Constructs a <code>CatalogsItemValidationIssues</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsItemValidationIssues} obj Optional instance to populate.
     * @return {module:model/CatalogsItemValidationIssues} The populated <code>CatalogsItemValidationIssues</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsItemValidationIssues();

            if (data.hasOwnProperty('item_number')) {
                obj['item_number'] = ApiClient.convertToType(data['item_number'], 'Number');
            }
            if (data.hasOwnProperty('item_id')) {
                obj['item_id'] = ApiClient.convertToType(data['item_id'], 'String');
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = CatalogsItemValidationErrors.constructFromObject(data['errors']);
            }
            if (data.hasOwnProperty('warnings')) {
                obj['warnings'] = CatalogsItemValidationWarnings.constructFromObject(data['warnings']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsItemValidationIssues</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsItemValidationIssues</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsItemValidationIssues.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['item_id'] && !(typeof data['item_id'] === 'string' || data['item_id'] instanceof String)) {
            throw new Error("Expected the field `item_id` to be a primitive type in the JSON string but got " + data['item_id']);
        }
        // validate the optional field `errors`
        if (data['errors']) { // data not null
          CatalogsItemValidationErrors.validateJSON(data['errors']);
        }
        // validate the optional field `warnings`
        if (data['warnings']) { // data not null
          CatalogsItemValidationWarnings.validateJSON(data['warnings']);
        }

        return true;
    }


}

CatalogsItemValidationIssues.RequiredProperties = ["item_number", "item_id", "errors", "warnings"];

/**
 * Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * @member {Number} item_number
 */
CatalogsItemValidationIssues.prototype['item_number'] = undefined;

/**
 * The merchant-created unique ID that represents the product.
 * @member {String} item_id
 */
CatalogsItemValidationIssues.prototype['item_id'] = undefined;

/**
 * @member {module:model/CatalogsItemValidationErrors} errors
 */
CatalogsItemValidationIssues.prototype['errors'] = undefined;

/**
 * @member {module:model/CatalogsItemValidationWarnings} warnings
 */
CatalogsItemValidationIssues.prototype['warnings'] = undefined;






export default CatalogsItemValidationIssues;

