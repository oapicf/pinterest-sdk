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

/**
 * The CatalogsCreativeAssetsFeed model module.
 * @module model/CatalogsCreativeAssetsFeed
 * @version 1.1.1-pre.0
 */
class CatalogsCreativeAssetsFeed {
    /**
     * Constructs a new <code>CatalogsCreativeAssetsFeed</code>.
     * Catalogs Creative Asset Feed object
     * @alias module:model/CatalogsCreativeAssetsFeed
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
     * @param catalogId {String} Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
     */
    constructor(createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, catalogId) { 
        CatalogsDbItem.initialize(this, createdAt, id, updatedAt);
        CatalogsCreativeAssetsFeed.initialize(this, createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, catalogId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, defaultCountry, catalogId) { 
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
        obj['catalog_id'] = catalogId;
    }

    /**
     * Constructs a <code>CatalogsCreativeAssetsFeed</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsCreativeAssetsFeed} obj Optional instance to populate.
     * @return {module:model/CatalogsCreativeAssetsFeed} The populated <code>CatalogsCreativeAssetsFeed</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsCreativeAssetsFeed();
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
            if (data.hasOwnProperty('catalog_id')) {
                obj['catalog_id'] = ApiClient.convertToType(data['catalog_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsCreativeAssetsFeed</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsCreativeAssetsFeed</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsCreativeAssetsFeed.RequiredProperties) {
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
        // ensure the json data is a string
        if (data['catalog_id'] && !(typeof data['catalog_id'] === 'string' || data['catalog_id'] instanceof String)) {
            throw new Error("Expected the field `catalog_id` to be a primitive type in the JSON string but got " + data['catalog_id']);
        }

        return true;
    }


}

CatalogsCreativeAssetsFeed.RequiredProperties = ["created_at", "id", "updated_at", "name", "format", "catalog_type", "credentials", "location", "preferred_processing_schedule", "status", "default_currency", "default_locale", "default_country", "catalog_id"];

/**
 * @member {Date} created_at
 */
CatalogsCreativeAssetsFeed.prototype['created_at'] = undefined;

/**
 * @member {String} id
 */
CatalogsCreativeAssetsFeed.prototype['id'] = undefined;

/**
 * @member {Date} updated_at
 */
CatalogsCreativeAssetsFeed.prototype['updated_at'] = undefined;

/**
 * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
 * @member {String} name
 */
CatalogsCreativeAssetsFeed.prototype['name'] = undefined;

/**
 * @member {module:model/CatalogsFormat} format
 */
CatalogsCreativeAssetsFeed.prototype['format'] = undefined;

/**
 * @member {module:model/CatalogsType} catalog_type
 */
CatalogsCreativeAssetsFeed.prototype['catalog_type'] = undefined;

/**
 * @member {module:model/CatalogsFeedCredentials} credentials
 */
CatalogsCreativeAssetsFeed.prototype['credentials'] = undefined;

/**
 * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
 * @member {String} location
 */
CatalogsCreativeAssetsFeed.prototype['location'] = undefined;

/**
 * @member {module:model/CatalogsFeedProcessingSchedule} preferred_processing_schedule
 */
CatalogsCreativeAssetsFeed.prototype['preferred_processing_schedule'] = undefined;

/**
 * @member {module:model/CatalogsStatus} status
 */
CatalogsCreativeAssetsFeed.prototype['status'] = undefined;

/**
 * @member {module:model/NullableCurrency} default_currency
 */
CatalogsCreativeAssetsFeed.prototype['default_currency'] = undefined;

/**
 * The locale used within a feed for product descriptions.
 * @member {String} default_locale
 */
CatalogsCreativeAssetsFeed.prototype['default_locale'] = undefined;

/**
 * @member {module:model/Country} default_country
 */
CatalogsCreativeAssetsFeed.prototype['default_country'] = undefined;

/**
 * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
 * @member {String} catalog_id
 */
CatalogsCreativeAssetsFeed.prototype['catalog_id'] = undefined;


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




export default CatalogsCreativeAssetsFeed;

