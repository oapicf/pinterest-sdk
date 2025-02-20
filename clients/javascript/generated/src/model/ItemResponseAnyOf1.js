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
import CatalogsCreativeAssetsItemErrorResponse from './CatalogsCreativeAssetsItemErrorResponse';
import CatalogsHotelItemErrorResponse from './CatalogsHotelItemErrorResponse';
import CatalogsRetailItemErrorResponse from './CatalogsRetailItemErrorResponse';
import CatalogsType from './CatalogsType';
import ItemValidationEvent from './ItemValidationEvent';

/**
 * The ItemResponseAnyOf1 model module.
 * @module model/ItemResponseAnyOf1
 * @version 1.1.1-pre.0
 */
class ItemResponseAnyOf1 {
    /**
     * Constructs a new <code>ItemResponseAnyOf1</code>.
     * @alias module:model/ItemResponseAnyOf1
     * @param {(module:model/CatalogsCreativeAssetsItemErrorResponse|module:model/CatalogsHotelItemErrorResponse|module:model/CatalogsRetailItemErrorResponse)} instance The actual instance to initialize ItemResponseAnyOf1.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "CatalogsRetailItemErrorResponse") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                CatalogsRetailItemErrorResponse.validateJSON(instance); // throw an exception if no match
                // create CatalogsRetailItemErrorResponse from JS object
                this.actualInstance = CatalogsRetailItemErrorResponse.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into CatalogsRetailItemErrorResponse
            errorMessages.push("Failed to construct CatalogsRetailItemErrorResponse: " + err)
        }

        try {
            if (typeof instance === "CatalogsHotelItemErrorResponse") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                CatalogsHotelItemErrorResponse.validateJSON(instance); // throw an exception if no match
                // create CatalogsHotelItemErrorResponse from JS object
                this.actualInstance = CatalogsHotelItemErrorResponse.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into CatalogsHotelItemErrorResponse
            errorMessages.push("Failed to construct CatalogsHotelItemErrorResponse: " + err)
        }

        try {
            if (typeof instance === "CatalogsCreativeAssetsItemErrorResponse") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                CatalogsCreativeAssetsItemErrorResponse.validateJSON(instance); // throw an exception if no match
                // create CatalogsCreativeAssetsItemErrorResponse from JS object
                this.actualInstance = CatalogsCreativeAssetsItemErrorResponse.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into CatalogsCreativeAssetsItemErrorResponse
            errorMessages.push("Failed to construct CatalogsCreativeAssetsItemErrorResponse: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `ItemResponseAnyOf1` with oneOf schemas CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemErrorResponse. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `ItemResponseAnyOf1` with oneOf schemas CatalogsCreativeAssetsItemErrorResponse, CatalogsHotelItemErrorResponse, CatalogsRetailItemErrorResponse. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>ItemResponseAnyOf1</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ItemResponseAnyOf1} obj Optional instance to populate.
     * @return {module:model/ItemResponseAnyOf1} The populated <code>ItemResponseAnyOf1</code> instance.
     */
    static constructFromObject(data, obj) {
        return new ItemResponseAnyOf1(data);
    }

    /**
     * Gets the actual instance, which can be <code>CatalogsCreativeAssetsItemErrorResponse</code>, <code>CatalogsHotelItemErrorResponse</code>, <code>CatalogsRetailItemErrorResponse</code>.
     * @return {(module:model/CatalogsCreativeAssetsItemErrorResponse|module:model/CatalogsHotelItemErrorResponse|module:model/CatalogsRetailItemErrorResponse)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>CatalogsCreativeAssetsItemErrorResponse</code>, <code>CatalogsHotelItemErrorResponse</code>, <code>CatalogsRetailItemErrorResponse</code>.
     * @param {(module:model/CatalogsCreativeAssetsItemErrorResponse|module:model/CatalogsHotelItemErrorResponse|module:model/CatalogsRetailItemErrorResponse)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = ItemResponseAnyOf1.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of ItemResponseAnyOf1 from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/ItemResponseAnyOf1} An instance of ItemResponseAnyOf1.
     */
    static fromJSON = function(json_string){
        return ItemResponseAnyOf1.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * @member {module:model/CatalogsType} catalog_type
 */
ItemResponseAnyOf1.prototype['catalog_type'] = undefined;

/**
 * The catalog item id in the merchant namespace
 * @member {String} item_id
 */
ItemResponseAnyOf1.prototype['item_id'] = undefined;

/**
 * Array with the errors for the item id requested
 * @member {Array.<module:model/ItemValidationEvent>} errors
 */
ItemResponseAnyOf1.prototype['errors'] = undefined;

/**
 * The catalog hotel id in the merchant namespace
 * @member {String} hotel_id
 */
ItemResponseAnyOf1.prototype['hotel_id'] = undefined;

/**
 * The catalog creative assets id in the merchant namespace
 * @member {String} creative_assets_id
 */
ItemResponseAnyOf1.prototype['creative_assets_id'] = undefined;


ItemResponseAnyOf1.OneOf = ["CatalogsCreativeAssetsItemErrorResponse", "CatalogsHotelItemErrorResponse", "CatalogsRetailItemErrorResponse"];

export default ItemResponseAnyOf1;

