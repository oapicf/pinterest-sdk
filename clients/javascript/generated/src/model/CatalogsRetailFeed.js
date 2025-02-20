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
import CatalogsDbItem from './CatalogsDbItem';
import CatalogsFeedCredentials from './CatalogsFeedCredentials';
import CatalogsFeedProcessingSchedule from './CatalogsFeedProcessingSchedule';
import CatalogsFormat from './CatalogsFormat';
import CatalogsStatus from './CatalogsStatus';
import CatalogsType from './CatalogsType';
import Country from './Country';
import NullableCurrency from './NullableCurrency';
import ProductAvailabilityType from './ProductAvailabilityType';

/**
 * The CatalogsRetailFeed model module.
 * @module model/CatalogsRetailFeed
 * @version 1.1.1-pre.0
 */
class CatalogsRetailFeed {
    /**
     * Constructs a new <code>CatalogsRetailFeed</code>.
     * Catalogs Retail Feed object
     * @alias module:model/CatalogsRetailFeed
     * @implements module:model/CatalogsDbItem
     * @param createdAt {Date} 
     * @param id {String} 
     * @param updatedAt {Date} 
     * @param name {String} A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
     * @param format {module:model/CatalogsFormat} 
     * @param catalogType {module:model/CatalogsType} 
     * @param credentials {module:model/CatalogsFeedCredentials} 
     * @param location {String} The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @param preferredProcessingSchedule {module:model/CatalogsFeedProcessingSchedule} 
     * @param status {module:model/CatalogsStatus} 
     * @param defaultCurrency {module:model/NullableCurrency} 
     * @param defaultLocale {String} The locale used within a feed for product descriptions.
     * @param defaultCountry {module:model/Country} 
     * @param defaultAvailability {module:model/ProductAvailabilityType} 
     */
    constructor(createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, defaultAvailability) { 
        CatalogsDbItem.initialize(this, createdAt, id, updatedAt);
        CatalogsRetailFeed.initialize(this, createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, defaultAvailability);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, defaultAvailability) { 
        obj['created_at'] = createdAt;
        obj['id'] = id;
        obj['updated_at'] = updatedAt;
        obj['name'] = name;
        obj['format'] = format;
        obj['catalog_type'] = catalogType;
        obj['credentials'] = credentials;
        obj['location'] = location;
        obj['preferred_processing_schedule'] = preferredProcessingSchedule;
        obj['status'] = status;
        obj['default_currency'] = defaultCurrency;
        obj['default_locale'] = defaultLocale;
        obj['default_country'] = defaultCountry;
        obj['default_availability'] = defaultAvailability;
    }

    /**
     * Constructs a <code>CatalogsRetailFeed</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsRetailFeed} obj Optional instance to populate.
     * @return {module:model/CatalogsRetailFeed} The populated <code>CatalogsRetailFeed</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsRetailFeed();
            CatalogsDbItem.constructFromObject(data, obj);

            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Date');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('updated_at')) {
                obj['updated_at'] = ApiClient.convertToType(data['updated_at'], 'Date');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('format')) {
                obj['format'] = CatalogsFormat.constructFromObject(data['format']);
            }
            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = CatalogsType.constructFromObject(data['catalog_type']);
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
            if (data.hasOwnProperty('status')) {
                obj['status'] = CatalogsStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('default_currency')) {
                obj['default_currency'] = NullableCurrency.constructFromObject(data['default_currency']);
            }
            if (data.hasOwnProperty('default_locale')) {
                obj['default_locale'] = ApiClient.convertToType(data['default_locale'], 'String');
            }
            if (data.hasOwnProperty('default_country')) {
                obj['default_country'] = Country.constructFromObject(data['default_country']);
            }
            if (data.hasOwnProperty('default_availability')) {
                obj['default_availability'] = ProductAvailabilityType.constructFromObject(data['default_availability']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsRetailFeed</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsRetailFeed</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsRetailFeed.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
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
        if (data['default_locale'] && !(typeof data['default_locale'] === 'string' || data['default_locale'] instanceof String)) {
            throw new Error("Expected the field `default_locale` to be a primitive type in the JSON string but got " + data['default_locale']);
        }

        return true;
    }


}

CatalogsRetailFeed.RequiredProperties = ["created_at", "id", "updated_at", "name", "format", "catalog_type", "credentials", "location", "preferred_processing_schedule", "status", "default_currency", "default_locale", "default_country", "default_availability"];

/**
 * @member {Date} created_at
 */
CatalogsRetailFeed.prototype['created_at'] = undefined;

/**
 * @member {String} id
 */
CatalogsRetailFeed.prototype['id'] = undefined;

/**
 * @member {Date} updated_at
 */
CatalogsRetailFeed.prototype['updated_at'] = undefined;

/**
 * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @member {String} name
 */
CatalogsRetailFeed.prototype['name'] = undefined;

/**
 * @member {module:model/CatalogsFormat} format
 */
CatalogsRetailFeed.prototype['format'] = undefined;

/**
 * @member {module:model/CatalogsType} catalog_type
 */
CatalogsRetailFeed.prototype['catalog_type'] = undefined;

/**
 * @member {module:model/CatalogsFeedCredentials} credentials
 */
CatalogsRetailFeed.prototype['credentials'] = undefined;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @member {String} location
 */
CatalogsRetailFeed.prototype['location'] = undefined;

/**
 * @member {module:model/CatalogsFeedProcessingSchedule} preferred_processing_schedule
 */
CatalogsRetailFeed.prototype['preferred_processing_schedule'] = undefined;

/**
 * @member {module:model/CatalogsStatus} status
 */
CatalogsRetailFeed.prototype['status'] = undefined;

/**
 * @member {module:model/NullableCurrency} default_currency
 */
CatalogsRetailFeed.prototype['default_currency'] = undefined;

/**
 * The locale used within a feed for product descriptions.
 * @member {String} default_locale
 */
CatalogsRetailFeed.prototype['default_locale'] = undefined;

/**
 * @member {module:model/Country} default_country
 */
CatalogsRetailFeed.prototype['default_country'] = undefined;

/**
 * @member {module:model/ProductAvailabilityType} default_availability
 */
CatalogsRetailFeed.prototype['default_availability'] = undefined;


// Implement CatalogsDbItem interface:
/**
 * @member {Date} created_at
 */
CatalogsDbItem.prototype['created_at'] = undefined;
/**
 * @member {String} id
 */
CatalogsDbItem.prototype['id'] = undefined;
/**
 * @member {Date} updated_at
 */
CatalogsDbItem.prototype['updated_at'] = undefined;




export default CatalogsRetailFeed;

