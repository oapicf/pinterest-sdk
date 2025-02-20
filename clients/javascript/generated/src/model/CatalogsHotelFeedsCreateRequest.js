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
import CatalogsFeedCredentials from './CatalogsFeedCredentials';
import CatalogsFeedProcessingSchedule from './CatalogsFeedProcessingSchedule';
import CatalogsFeedsCreateRequestDefaultLocale from './CatalogsFeedsCreateRequestDefaultLocale';
import CatalogsFormat from './CatalogsFormat';
import CatalogsStatus from './CatalogsStatus';
import CatalogsType from './CatalogsType';
import NullableCurrency from './NullableCurrency';

/**
 * The CatalogsHotelFeedsCreateRequest model module.
 * @module model/CatalogsHotelFeedsCreateRequest
 * @version 1.1.1-pre.0
 */
class CatalogsHotelFeedsCreateRequest {
    /**
     * Constructs a new <code>CatalogsHotelFeedsCreateRequest</code>.
     * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
     * @alias module:model/CatalogsHotelFeedsCreateRequest
     * @param name {String} A human-friendly name associated to a given feed.
     * @param format {module:model/CatalogsFormat} 
     * @param defaultLocale {module:model/CatalogsFeedsCreateRequestDefaultLocale} 
     * @param location {String} The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @param catalogType {module:model/CatalogsType} 
     */
    constructor(name, format, defaultLocale, location, catalogType) { 
        
        CatalogsHotelFeedsCreateRequest.initialize(this, name, format, defaultLocale, location, catalogType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, format, defaultLocale, location, catalogType) { 
        obj['name'] = name;
        obj['format'] = format;
        obj['default_locale'] = defaultLocale;
        obj['location'] = location;
        obj['catalog_type'] = catalogType;
    }

    /**
     * Constructs a <code>CatalogsHotelFeedsCreateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsHotelFeedsCreateRequest} obj Optional instance to populate.
     * @return {module:model/CatalogsHotelFeedsCreateRequest} The populated <code>CatalogsHotelFeedsCreateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsHotelFeedsCreateRequest();

            if (data.hasOwnProperty('default_currency')) {
                obj['default_currency'] = NullableCurrency.constructFromObject(data['default_currency']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('format')) {
                obj['format'] = CatalogsFormat.constructFromObject(data['format']);
            }
            if (data.hasOwnProperty('default_locale')) {
                obj['default_locale'] = CatalogsFeedsCreateRequestDefaultLocale.constructFromObject(data['default_locale']);
            }
            if (data.hasOwnProperty('credentials')) {
                obj['credentials'] = CatalogsFeedCredentials.constructFromObject(data['credentials']);
            }
            if (data.hasOwnProperty('location')) {
                obj['location'] = ApiClient.convertToType(data['location'], 'String');
            }
            if (data.hasOwnProperty('preferred_processing_schedule')) {
                obj['preferred_processing_schedule'] = CatalogsFeedProcessingSchedule.constructFromObject(data['preferred_processing_schedule']);
            }
            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = CatalogsType.constructFromObject(data['catalog_type']);
            }
            if (data.hasOwnProperty('catalog_id')) {
                obj['catalog_id'] = ApiClient.convertToType(data['catalog_id'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], CatalogsStatus);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsHotelFeedsCreateRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsHotelFeedsCreateRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsHotelFeedsCreateRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // validate the optional field `default_locale`
        if (data['default_locale']) { // data not null
          CatalogsFeedsCreateRequestDefaultLocale.validateJSON(data['default_locale']);
        }
        // validate the optional field `credentials`
        if (data['credentials']) { // data not null
          CatalogsFeedCredentials.validateJSON(data['credentials']);
        }
        // ensure the json data is a string
        if (data['location'] && !(typeof data['location'] === 'string' || data['location'] instanceof String)) {
            throw new Error("Expected the field `location` to be a primitive type in the JSON string but got " + data['location']);
        }
        // validate the optional field `preferred_processing_schedule`
        if (data['preferred_processing_schedule']) { // data not null
          CatalogsFeedProcessingSchedule.validateJSON(data['preferred_processing_schedule']);
        }
        // ensure the json data is a string
        if (data['catalog_id'] && !(typeof data['catalog_id'] === 'string' || data['catalog_id'] instanceof String)) {
            throw new Error("Expected the field `catalog_id` to be a primitive type in the JSON string but got " + data['catalog_id']);
        }
        // ensure the json data is a string
        if (data['status'] && !(typeof data['status'] === 'string' || data['status'] instanceof String)) {
            throw new Error("Expected the field `status` to be a primitive type in the JSON string but got " + data['status']);
        }
        // validate the optional field `status`
        if (data['status']) { // data not null
          CatalogsStatus.validateJSON(data['status']);
        }

        return true;
    }


}

CatalogsHotelFeedsCreateRequest.RequiredProperties = ["name", "format", "default_locale", "location", "catalog_type"];

/**
 * @member {module:model/NullableCurrency} default_currency
 */
CatalogsHotelFeedsCreateRequest.prototype['default_currency'] = undefined;

/**
 * A human-friendly name associated to a given feed.
 * @member {String} name
 */
CatalogsHotelFeedsCreateRequest.prototype['name'] = undefined;

/**
 * @member {module:model/CatalogsFormat} format
 */
CatalogsHotelFeedsCreateRequest.prototype['format'] = undefined;

/**
 * @member {module:model/CatalogsFeedsCreateRequestDefaultLocale} default_locale
 */
CatalogsHotelFeedsCreateRequest.prototype['default_locale'] = undefined;

/**
 * @member {module:model/CatalogsFeedCredentials} credentials
 */
CatalogsHotelFeedsCreateRequest.prototype['credentials'] = undefined;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @member {String} location
 */
CatalogsHotelFeedsCreateRequest.prototype['location'] = undefined;

/**
 * @member {module:model/CatalogsFeedProcessingSchedule} preferred_processing_schedule
 */
CatalogsHotelFeedsCreateRequest.prototype['preferred_processing_schedule'] = undefined;

/**
 * @member {module:model/CatalogsType} catalog_type
 */
CatalogsHotelFeedsCreateRequest.prototype['catalog_type'] = undefined;

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
 * @member {String} catalog_id
 */
CatalogsHotelFeedsCreateRequest.prototype['catalog_id'] = undefined;

/**
 * @member {module:model/CatalogsStatus} status
 */
CatalogsHotelFeedsCreateRequest.prototype['status'] = undefined;






export default CatalogsHotelFeedsCreateRequest;

