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
import BatchOperation from './BatchOperation';
import CatalogsItemsBatchRequest from './CatalogsItemsBatchRequest';
import CatalogsItemsRequestLanguage from './CatalogsItemsRequestLanguage';
import CatalogsVerticalBatchRequest from './CatalogsVerticalBatchRequest';
import Country from './Country';
import ItemDeleteBatchRecord from './ItemDeleteBatchRecord';

/**
 * The ItemsBatchPostRequest model module.
 * @module model/ItemsBatchPostRequest
 * @version 1.1.1-pre.0
 */
class ItemsBatchPostRequest {
    /**
     * Constructs a new <code>ItemsBatchPostRequest</code>.
     * @alias module:model/ItemsBatchPostRequest
     * @param {(module:model/CatalogsItemsBatchRequest|module:model/CatalogsVerticalBatchRequest)} instance The actual instance to initialize ItemsBatchPostRequest.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "CatalogsVerticalBatchRequest") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                CatalogsVerticalBatchRequest.validateJSON(instance); // throw an exception if no match
                // create CatalogsVerticalBatchRequest from JS object
                this.actualInstance = CatalogsVerticalBatchRequest.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into CatalogsVerticalBatchRequest
            errorMessages.push("Failed to construct CatalogsVerticalBatchRequest: " + err)
        }

        try {
            if (typeof instance === "CatalogsItemsBatchRequest") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                CatalogsItemsBatchRequest.validateJSON(instance); // throw an exception if no match
                // create CatalogsItemsBatchRequest from JS object
                this.actualInstance = CatalogsItemsBatchRequest.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into CatalogsItemsBatchRequest
            errorMessages.push("Failed to construct CatalogsItemsBatchRequest: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `ItemsBatchPostRequest` with oneOf schemas CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `ItemsBatchPostRequest` with oneOf schemas CatalogsItemsBatchRequest, CatalogsVerticalBatchRequest. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>ItemsBatchPostRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ItemsBatchPostRequest} obj Optional instance to populate.
     * @return {module:model/ItemsBatchPostRequest} The populated <code>ItemsBatchPostRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        return new ItemsBatchPostRequest(data);
    }

    /**
     * Gets the actual instance, which can be <code>CatalogsItemsBatchRequest</code>, <code>CatalogsVerticalBatchRequest</code>.
     * @return {(module:model/CatalogsItemsBatchRequest|module:model/CatalogsVerticalBatchRequest)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>CatalogsItemsBatchRequest</code>, <code>CatalogsVerticalBatchRequest</code>.
     * @param {(module:model/CatalogsItemsBatchRequest|module:model/CatalogsVerticalBatchRequest)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = ItemsBatchPostRequest.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of ItemsBatchPostRequest from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/ItemsBatchPostRequest} An instance of ItemsBatchPostRequest.
     */
    static fromJSON = function(json_string){
        return ItemsBatchPostRequest.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * @member {module:model/Country} country
 */
ItemsBatchPostRequest.prototype['country'] = undefined;

/**
 * @member {module:model/CatalogsItemsRequestLanguage} language
 */
ItemsBatchPostRequest.prototype['language'] = undefined;

/**
 * @member {module:model/BatchOperation} operation
 */
ItemsBatchPostRequest.prototype['operation'] = undefined;

/**
 * Array with catalogs items
 * @member {Array.<module:model/ItemDeleteBatchRecord>} items
 */
ItemsBatchPostRequest.prototype['items'] = undefined;


ItemsBatchPostRequest.OneOf = ["CatalogsItemsBatchRequest", "CatalogsVerticalBatchRequest"];

export default ItemsBatchPostRequest;

