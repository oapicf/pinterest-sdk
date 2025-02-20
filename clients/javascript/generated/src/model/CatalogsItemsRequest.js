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
import CatalogsItemsPostFilters from './CatalogsItemsPostFilters';
import CatalogsItemsRequestLanguage from './CatalogsItemsRequestLanguage';
import Country from './Country';

/**
 * The CatalogsItemsRequest model module.
 * @module model/CatalogsItemsRequest
 * @version 1.1.1-pre.0
 */
class CatalogsItemsRequest {
    /**
     * Constructs a new <code>CatalogsItemsRequest</code>.
     * Request object of catalogs items
     * @alias module:model/CatalogsItemsRequest
     * @param country {module:model/Country} 
     * @param language {module:model/CatalogsItemsRequestLanguage} 
     * @param filters {module:model/CatalogsItemsPostFilters} 
     */
    constructor(country, language, filters) { 
        
        CatalogsItemsRequest.initialize(this, country, language, filters);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, country, language, filters) { 
        obj['country'] = country;
        obj['language'] = language;
        obj['filters'] = filters;
    }

    /**
     * Constructs a <code>CatalogsItemsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsItemsRequest} obj Optional instance to populate.
     * @return {module:model/CatalogsItemsRequest} The populated <code>CatalogsItemsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsItemsRequest();

            if (data.hasOwnProperty('country')) {
                obj['country'] = Country.constructFromObject(data['country']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = CatalogsItemsRequestLanguage.constructFromObject(data['language']);
            }
            if (data.hasOwnProperty('filters')) {
                obj['filters'] = CatalogsItemsPostFilters.constructFromObject(data['filters']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsItemsRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsItemsRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsItemsRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `language`
        if (data['language']) { // data not null
          CatalogsItemsRequestLanguage.validateJSON(data['language']);
        }
        // validate the optional field `filters`
        if (data['filters']) { // data not null
          CatalogsItemsPostFilters.validateJSON(data['filters']);
        }

        return true;
    }


}

CatalogsItemsRequest.RequiredProperties = ["country", "language", "filters"];

/**
 * @member {module:model/Country} country
 */
CatalogsItemsRequest.prototype['country'] = undefined;

/**
 * @member {module:model/CatalogsItemsRequestLanguage} language
 */
CatalogsItemsRequest.prototype['language'] = undefined;

/**
 * @member {module:model/CatalogsItemsPostFilters} filters
 */
CatalogsItemsRequest.prototype['filters'] = undefined;






export default CatalogsItemsRequest;

