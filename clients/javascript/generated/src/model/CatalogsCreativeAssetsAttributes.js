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
import CatalogsUpdatableCreativeAssetsAttributes from './CatalogsUpdatableCreativeAssetsAttributes';

/**
 * The CatalogsCreativeAssetsAttributes model module.
 * @module model/CatalogsCreativeAssetsAttributes
 * @version 1.1.1-pre.0
 */
class CatalogsCreativeAssetsAttributes {
    /**
     * Constructs a new <code>CatalogsCreativeAssetsAttributes</code>.
     * @alias module:model/CatalogsCreativeAssetsAttributes
     * @implements module:model/CatalogsUpdatableCreativeAssetsAttributes
     */
    constructor() { 
        CatalogsUpdatableCreativeAssetsAttributes.initialize(this);
        CatalogsCreativeAssetsAttributes.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CatalogsCreativeAssetsAttributes</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsCreativeAssetsAttributes} obj Optional instance to populate.
     * @return {module:model/CatalogsCreativeAssetsAttributes} The populated <code>CatalogsCreativeAssetsAttributes</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsCreativeAssetsAttributes();
            CatalogsUpdatableCreativeAssetsAttributes.constructFromObject(data, obj);

            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
            if (data.hasOwnProperty('ios_deep_link')) {
                obj['ios_deep_link'] = ApiClient.convertToType(data['ios_deep_link'], 'String');
            }
            if (data.hasOwnProperty('android_deep_link')) {
                obj['android_deep_link'] = ApiClient.convertToType(data['android_deep_link'], 'String');
            }
            if (data.hasOwnProperty('google_product_category')) {
                obj['google_product_category'] = ApiClient.convertToType(data['google_product_category'], 'String');
            }
            if (data.hasOwnProperty('custom_label_0')) {
                obj['custom_label_0'] = ApiClient.convertToType(data['custom_label_0'], 'String');
            }
            if (data.hasOwnProperty('custom_label_1')) {
                obj['custom_label_1'] = ApiClient.convertToType(data['custom_label_1'], 'String');
            }
            if (data.hasOwnProperty('custom_label_2')) {
                obj['custom_label_2'] = ApiClient.convertToType(data['custom_label_2'], 'String');
            }
            if (data.hasOwnProperty('custom_label_3')) {
                obj['custom_label_3'] = ApiClient.convertToType(data['custom_label_3'], 'String');
            }
            if (data.hasOwnProperty('custom_label_4')) {
                obj['custom_label_4'] = ApiClient.convertToType(data['custom_label_4'], 'String');
            }
            if (data.hasOwnProperty('visibility')) {
                obj['visibility'] = ApiClient.convertToType(data['visibility'], 'String');
            }
            if (data.hasOwnProperty('image_link')) {
                obj['image_link'] = ApiClient.convertToType(data['image_link'], 'String');
            }
            if (data.hasOwnProperty('video_link')) {
                obj['video_link'] = ApiClient.convertToType(data['video_link'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsCreativeAssetsAttributes</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsCreativeAssetsAttributes</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }
        // ensure the json data is a string
        if (data['link'] && !(typeof data['link'] === 'string' || data['link'] instanceof String)) {
            throw new Error("Expected the field `link` to be a primitive type in the JSON string but got " + data['link']);
        }
        // ensure the json data is a string
        if (data['ios_deep_link'] && !(typeof data['ios_deep_link'] === 'string' || data['ios_deep_link'] instanceof String)) {
            throw new Error("Expected the field `ios_deep_link` to be a primitive type in the JSON string but got " + data['ios_deep_link']);
        }
        // ensure the json data is a string
        if (data['android_deep_link'] && !(typeof data['android_deep_link'] === 'string' || data['android_deep_link'] instanceof String)) {
            throw new Error("Expected the field `android_deep_link` to be a primitive type in the JSON string but got " + data['android_deep_link']);
        }
        // ensure the json data is a string
        if (data['google_product_category'] && !(typeof data['google_product_category'] === 'string' || data['google_product_category'] instanceof String)) {
            throw new Error("Expected the field `google_product_category` to be a primitive type in the JSON string but got " + data['google_product_category']);
        }
        // ensure the json data is a string
        if (data['custom_label_0'] && !(typeof data['custom_label_0'] === 'string' || data['custom_label_0'] instanceof String)) {
            throw new Error("Expected the field `custom_label_0` to be a primitive type in the JSON string but got " + data['custom_label_0']);
        }
        // ensure the json data is a string
        if (data['custom_label_1'] && !(typeof data['custom_label_1'] === 'string' || data['custom_label_1'] instanceof String)) {
            throw new Error("Expected the field `custom_label_1` to be a primitive type in the JSON string but got " + data['custom_label_1']);
        }
        // ensure the json data is a string
        if (data['custom_label_2'] && !(typeof data['custom_label_2'] === 'string' || data['custom_label_2'] instanceof String)) {
            throw new Error("Expected the field `custom_label_2` to be a primitive type in the JSON string but got " + data['custom_label_2']);
        }
        // ensure the json data is a string
        if (data['custom_label_3'] && !(typeof data['custom_label_3'] === 'string' || data['custom_label_3'] instanceof String)) {
            throw new Error("Expected the field `custom_label_3` to be a primitive type in the JSON string but got " + data['custom_label_3']);
        }
        // ensure the json data is a string
        if (data['custom_label_4'] && !(typeof data['custom_label_4'] === 'string' || data['custom_label_4'] instanceof String)) {
            throw new Error("Expected the field `custom_label_4` to be a primitive type in the JSON string but got " + data['custom_label_4']);
        }
        // ensure the json data is a string
        if (data['visibility'] && !(typeof data['visibility'] === 'string' || data['visibility'] instanceof String)) {
            throw new Error("Expected the field `visibility` to be a primitive type in the JSON string but got " + data['visibility']);
        }
        // ensure the json data is a string
        if (data['image_link'] && !(typeof data['image_link'] === 'string' || data['image_link'] instanceof String)) {
            throw new Error("Expected the field `image_link` to be a primitive type in the JSON string but got " + data['image_link']);
        }
        // ensure the json data is a string
        if (data['video_link'] && !(typeof data['video_link'] === 'string' || data['video_link'] instanceof String)) {
            throw new Error("Expected the field `video_link` to be a primitive type in the JSON string but got " + data['video_link']);
        }

        return true;
    }


}



/**
 * The name of the creative assets.
 * @member {String} title
 */
CatalogsCreativeAssetsAttributes.prototype['title'] = undefined;

/**
 * Brief description of the creative assets.
 * @member {String} description
 */
CatalogsCreativeAssetsAttributes.prototype['description'] = undefined;

/**
 * Link to the creative assets page.
 * @member {String} link
 */
CatalogsCreativeAssetsAttributes.prototype['link'] = undefined;

/**
 * IOS deep link to the creative assets page.
 * @member {String} ios_deep_link
 */
CatalogsCreativeAssetsAttributes.prototype['ios_deep_link'] = undefined;

/**
 * Link to the creative assets page.
 * @member {String} android_deep_link
 */
CatalogsCreativeAssetsAttributes.prototype['android_deep_link'] = undefined;

/**
 * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @member {String} google_product_category
 */
CatalogsCreativeAssetsAttributes.prototype['google_product_category'] = undefined;

/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_0
 */
CatalogsCreativeAssetsAttributes.prototype['custom_label_0'] = undefined;

/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_1
 */
CatalogsCreativeAssetsAttributes.prototype['custom_label_1'] = undefined;

/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_2
 */
CatalogsCreativeAssetsAttributes.prototype['custom_label_2'] = undefined;

/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_3
 */
CatalogsCreativeAssetsAttributes.prototype['custom_label_3'] = undefined;

/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_4
 */
CatalogsCreativeAssetsAttributes.prototype['custom_label_4'] = undefined;

/**
 * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
 * @member {String} visibility
 */
CatalogsCreativeAssetsAttributes.prototype['visibility'] = undefined;

/**
 * The creative assets image.
 * @member {String} image_link
 */
CatalogsCreativeAssetsAttributes.prototype['image_link'] = undefined;

/**
 * The creative assets video.
 * @member {String} video_link
 */
CatalogsCreativeAssetsAttributes.prototype['video_link'] = undefined;


// Implement CatalogsUpdatableCreativeAssetsAttributes interface:
/**
 * The name of the creative assets.
 * @member {String} title
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['title'] = undefined;
/**
 * Brief description of the creative assets.
 * @member {String} description
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['description'] = undefined;
/**
 * Link to the creative assets page.
 * @member {String} link
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['link'] = undefined;
/**
 * IOS deep link to the creative assets page.
 * @member {String} ios_deep_link
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['ios_deep_link'] = undefined;
/**
 * Link to the creative assets page.
 * @member {String} android_deep_link
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['android_deep_link'] = undefined;
/**
 * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @member {String} google_product_category
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['google_product_category'] = undefined;
/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_0
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['custom_label_0'] = undefined;
/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_1
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['custom_label_1'] = undefined;
/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_2
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['custom_label_2'] = undefined;
/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_3
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['custom_label_3'] = undefined;
/**
 * Custom grouping of creative assets.
 * @member {String} custom_label_4
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['custom_label_4'] = undefined;
/**
 * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
 * @member {String} visibility
 */
CatalogsUpdatableCreativeAssetsAttributes.prototype['visibility'] = undefined;




export default CatalogsCreativeAssetsAttributes;

