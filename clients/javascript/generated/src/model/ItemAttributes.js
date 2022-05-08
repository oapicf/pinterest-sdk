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

/**
 * The ItemAttributes model module.
 * @module model/ItemAttributes
 * @version 1.0.0-pre.0
 */
class ItemAttributes {
    /**
     * Constructs a new <code>ItemAttributes</code>.
     * @alias module:model/ItemAttributes
     */
    constructor() { 
        
        ItemAttributes.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ItemAttributes</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ItemAttributes} obj Optional instance to populate.
     * @return {module:model/ItemAttributes} The populated <code>ItemAttributes</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ItemAttributes();

            if (data.hasOwnProperty('ad_link')) {
                obj['ad_link'] = ApiClient.convertToType(data['ad_link'], 'String');
            }
            if (data.hasOwnProperty('additional_image_link')) {
                obj['additional_image_link'] = ApiClient.convertToType(data['additional_image_link'], ['String']);
            }
            if (data.hasOwnProperty('adult')) {
                obj['adult'] = ApiClient.convertToType(data['adult'], 'Boolean');
            }
            if (data.hasOwnProperty('age_group')) {
                obj['age_group'] = ApiClient.convertToType(data['age_group'], 'String');
            }
            if (data.hasOwnProperty('availability')) {
                obj['availability'] = ApiClient.convertToType(data['availability'], 'String');
            }
            if (data.hasOwnProperty('average_review_rating')) {
                obj['average_review_rating'] = ApiClient.convertToType(data['average_review_rating'], 'Number');
            }
            if (data.hasOwnProperty('brand')) {
                obj['brand'] = ApiClient.convertToType(data['brand'], 'String');
            }
            if (data.hasOwnProperty('color')) {
                obj['color'] = ApiClient.convertToType(data['color'], 'String');
            }
            if (data.hasOwnProperty('condition')) {
                obj['condition'] = ApiClient.convertToType(data['condition'], 'String');
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
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('free_shipping_label')) {
                obj['free_shipping_label'] = ApiClient.convertToType(data['free_shipping_label'], 'Boolean');
            }
            if (data.hasOwnProperty('free_shipping_limit')) {
                obj['free_shipping_limit'] = ApiClient.convertToType(data['free_shipping_limit'], 'String');
            }
            if (data.hasOwnProperty('gender')) {
                obj['gender'] = ApiClient.convertToType(data['gender'], 'String');
            }
            if (data.hasOwnProperty('google_product_category')) {
                obj['google_product_category'] = ApiClient.convertToType(data['google_product_category'], 'String');
            }
            if (data.hasOwnProperty('gtin')) {
                obj['gtin'] = ApiClient.convertToType(data['gtin'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('image_link')) {
                obj['image_link'] = ApiClient.convertToType(data['image_link'], ['String']);
            }
            if (data.hasOwnProperty('item_group_id')) {
                obj['item_group_id'] = ApiClient.convertToType(data['item_group_id'], 'String');
            }
            if (data.hasOwnProperty('last_updated_time')) {
                obj['last_updated_time'] = ApiClient.convertToType(data['last_updated_time'], 'Number');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
            if (data.hasOwnProperty('material')) {
                obj['material'] = ApiClient.convertToType(data['material'], 'String');
            }
            if (data.hasOwnProperty('min_ad_price')) {
                obj['min_ad_price'] = ApiClient.convertToType(data['min_ad_price'], 'String');
            }
            if (data.hasOwnProperty('mobile_link')) {
                obj['mobile_link'] = ApiClient.convertToType(data['mobile_link'], 'String');
            }
            if (data.hasOwnProperty('mpn')) {
                obj['mpn'] = ApiClient.convertToType(data['mpn'], 'String');
            }
            if (data.hasOwnProperty('number_of_ratings')) {
                obj['number_of_ratings'] = ApiClient.convertToType(data['number_of_ratings'], 'Number');
            }
            if (data.hasOwnProperty('number_of_reviews')) {
                obj['number_of_reviews'] = ApiClient.convertToType(data['number_of_reviews'], 'Number');
            }
            if (data.hasOwnProperty('pattern')) {
                obj['pattern'] = ApiClient.convertToType(data['pattern'], 'String');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'String');
            }
            if (data.hasOwnProperty('product_type')) {
                obj['product_type'] = ApiClient.convertToType(data['product_type'], 'String');
            }
            if (data.hasOwnProperty('sale_price')) {
                obj['sale_price'] = ApiClient.convertToType(data['sale_price'], 'String');
            }
            if (data.hasOwnProperty('shipping')) {
                obj['shipping'] = ApiClient.convertToType(data['shipping'], 'String');
            }
            if (data.hasOwnProperty('shipping_height')) {
                obj['shipping_height'] = ApiClient.convertToType(data['shipping_height'], 'String');
            }
            if (data.hasOwnProperty('shipping_weight')) {
                obj['shipping_weight'] = ApiClient.convertToType(data['shipping_weight'], 'String');
            }
            if (data.hasOwnProperty('shipping_width')) {
                obj['shipping_width'] = ApiClient.convertToType(data['shipping_width'], 'String');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'String');
            }
            if (data.hasOwnProperty('size_system')) {
                obj['size_system'] = ApiClient.convertToType(data['size_system'], 'String');
            }
            if (data.hasOwnProperty('size_type')) {
                obj['size_type'] = ApiClient.convertToType(data['size_type'], 'String');
            }
            if (data.hasOwnProperty('tax')) {
                obj['tax'] = ApiClient.convertToType(data['tax'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
 * @member {String} ad_link
 */
ItemAttributes.prototype['ad_link'] = undefined;

/**
 * The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
 * @member {Array.<String>} additional_image_link
 */
ItemAttributes.prototype['additional_image_link'] = undefined;

/**
 * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
 * @member {Boolean} adult
 */
ItemAttributes.prototype['adult'] = undefined;

/**
 * The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
 * @member {String} age_group
 */
ItemAttributes.prototype['age_group'] = undefined;

/**
 * The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
 * @member {String} availability
 */
ItemAttributes.prototype['availability'] = undefined;

/**
 * Average reviews for the item. Can be a number from 1-5.
 * @member {Number} average_review_rating
 */
ItemAttributes.prototype['average_review_rating'] = undefined;

/**
 * The brand of the product.
 * @member {String} brand
 */
ItemAttributes.prototype['brand'] = undefined;

/**
 * The primary color of the product.
 * @member {String} color
 */
ItemAttributes.prototype['color'] = undefined;

/**
 * The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
 * @member {String} condition
 */
ItemAttributes.prototype['condition'] = undefined;

/**
 * Custom grouping of products.
 * @member {String} custom_label_0
 */
ItemAttributes.prototype['custom_label_0'] = undefined;

/**
 * Custom grouping of products.
 * @member {String} custom_label_1
 */
ItemAttributes.prototype['custom_label_1'] = undefined;

/**
 * Custom grouping of products.
 * @member {String} custom_label_2
 */
ItemAttributes.prototype['custom_label_2'] = undefined;

/**
 * Custom grouping of products.
 * @member {String} custom_label_3
 */
ItemAttributes.prototype['custom_label_3'] = undefined;

/**
 * Custom grouping of products.
 * @member {String} custom_label_4
 */
ItemAttributes.prototype['custom_label_4'] = undefined;

/**
 * The description of the product.
 * @member {String} description
 */
ItemAttributes.prototype['description'] = undefined;

/**
 * The item is free to ship.
 * @member {Boolean} free_shipping_label
 */
ItemAttributes.prototype['free_shipping_label'] = undefined;

/**
 * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
 * @member {String} free_shipping_limit
 */
ItemAttributes.prototype['free_shipping_limit'] = undefined;

/**
 * The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
 * @member {String} gender
 */
ItemAttributes.prototype['gender'] = undefined;

/**
 * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @member {String} google_product_category
 */
ItemAttributes.prototype['google_product_category'] = undefined;

/**
 * The unique universal product identifier.
 * @member {Number} gtin
 */
ItemAttributes.prototype['gtin'] = undefined;

/**
 * The user-created unique ID that represents the product. Only Unicode characters are accepted.
 * @member {String} id
 */
ItemAttributes.prototype['id'] = undefined;

/**
 * The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
 * @member {Array.<String>} image_link
 */
ItemAttributes.prototype['image_link'] = undefined;

/**
 * The parent ID of the product.
 * @member {String} item_group_id
 */
ItemAttributes.prototype['item_group_id'] = undefined;

/**
 * The millisecond timestamp when the item was lastly modified by the merchant.
 * @member {Number} last_updated_time
 */
ItemAttributes.prototype['last_updated_time'] = undefined;

/**
 * The landing page for the product.
 * @member {String} link
 */
ItemAttributes.prototype['link'] = undefined;

/**
 * The material used to make the product.
 * @member {String} material
 */
ItemAttributes.prototype['material'] = undefined;

/**
 * The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
 * @member {String} min_ad_price
 */
ItemAttributes.prototype['min_ad_price'] = undefined;

/**
 * The mobile-optimized version of your landing page. Must begin with http:// or https://.
 * @member {String} mobile_link
 */
ItemAttributes.prototype['mobile_link'] = undefined;

/**
 * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
 * @member {String} mpn
 */
ItemAttributes.prototype['mpn'] = undefined;

/**
 * The number of ratings for the item.
 * @member {Number} number_of_ratings
 */
ItemAttributes.prototype['number_of_ratings'] = undefined;

/**
 * The number of reviews available for the item.
 * @member {Number} number_of_reviews
 */
ItemAttributes.prototype['number_of_reviews'] = undefined;

/**
 * The description of the pattern used for the product.
 * @member {String} pattern
 */
ItemAttributes.prototype['pattern'] = undefined;

/**
 * The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 * @member {String} price
 */
ItemAttributes.prototype['price'] = undefined;

/**
 * The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
 * @member {String} product_type
 */
ItemAttributes.prototype['product_type'] = undefined;

/**
 * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
 * @member {String} sale_price
 */
ItemAttributes.prototype['sale_price'] = undefined;

/**
 * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
 * @member {String} shipping
 */
ItemAttributes.prototype['shipping'] = undefined;

/**
 * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @member {String} shipping_height
 */
ItemAttributes.prototype['shipping_height'] = undefined;

/**
 * The weight of the product. Ensure there is a space between the numeric string and the metric.
 * @member {String} shipping_weight
 */
ItemAttributes.prototype['shipping_weight'] = undefined;

/**
 * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @member {String} shipping_width
 */
ItemAttributes.prototype['shipping_width'] = undefined;

/**
 * The size of the product.
 * @member {String} size
 */
ItemAttributes.prototype['size'] = undefined;

/**
 * Indicates the country’s sizing system in which you are submitting your product.
 * @member {String} size_system
 */
ItemAttributes.prototype['size_system'] = undefined;

/**
 * Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
 * @member {String} size_type
 */
ItemAttributes.prototype['size_type'] = undefined;

/**
 * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
 * @member {String} tax
 */
ItemAttributes.prototype['tax'] = undefined;

/**
 * The name of the product.
 * @member {String} title
 */
ItemAttributes.prototype['title'] = undefined;






export default ItemAttributes;
