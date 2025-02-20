/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { ItemAttributesRequestAllOfImageLink } from './ItemAttributesRequestAllOfImageLink';
import {
    ItemAttributesRequestAllOfImageLinkFromJSON,
    ItemAttributesRequestAllOfImageLinkFromJSONTyped,
    ItemAttributesRequestAllOfImageLinkToJSON,
    ItemAttributesRequestAllOfImageLinkToJSONTyped,
} from './ItemAttributesRequestAllOfImageLink';

/**
 * 
 * @export
 * @interface ItemAttributesRequest
 */
export interface ItemAttributesRequest {
    /**
     * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    adLink?: string | null;
    /**
     * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
     * @type {boolean}
     * @memberof ItemAttributesRequest
     */
    adult?: boolean | null;
    /**
     * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    ageGroup?: string | null;
    /**
     * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    availability?: string;
    /**
     * Average reviews for the item. Can be a number from 1-5.
     * @type {number}
     * @memberof ItemAttributesRequest
     */
    averageReviewRating?: number | null;
    /**
     * The brand of the product.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    brand?: string | null;
    /**
     * This attribute is not supported anymore.
     * @type {boolean}
     * @memberof ItemAttributesRequest
     * @deprecated
     */
    checkoutEnabled?: boolean | null;
    /**
     * The primary color of the product.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    color?: string | null;
    /**
     * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    condition?: string | null;
    /**
     * <p><= 1000 characters</p>
     * <p>Custom grouping of products.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    customLabel0?: string | null;
    /**
     * <p><= 1000 characters</p>
     * <p>Custom grouping of products.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    customLabel1?: string | null;
    /**
     * <p><= 1000 characters</p>
     * <p>Custom grouping of products.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    customLabel2?: string | null;
    /**
     * <p><= 1000 characters</p>
     * <p>Custom grouping of products.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    customLabel3?: string | null;
    /**
     * <p><= 1000 characters</p>
     * <p>Custom grouping of products.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    customLabel4?: string | null;
    /**
     * <p><= 10000 characters</p>
     * <p>The description of the product.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    description?: string;
    /**
     * The item is free to ship.
     * @type {boolean}
     * @memberof ItemAttributesRequest
     */
    freeShippingLabel?: boolean | null;
    /**
     * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    freeShippingLimit?: string | null;
    /**
     * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    gender?: string | null;
    /**
     * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    googleProductCategory?: string | null;
    /**
     * The unique universal product identifier.
     * @type {number}
     * @memberof ItemAttributesRequest
     */
    gtin?: number | null;
    /**
     * <p><= 127 characters</p>
     * <p>The user-created unique ID that represents the product. Only
     * Unicode characters are accepted.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     * @deprecated
     */
    id?: string;
    /**
     * <p><= 127 characters</p>
     * <p>The parent ID of the product.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    itemGroupId?: string | null;
    /**
     * The millisecond timestamp when the item was lastly modified by the merchant.
     * @type {number}
     * @memberof ItemAttributesRequest
     */
    lastUpdatedTime?: number | null;
    /**
     * <p><= 511 characters</p>
     * <p>The landing page for the product.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    link?: string;
    /**
     * The material used to make the product.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    material?: string | null;
    /**
     * The minimum advertised price of the product. It supports the following formats, "19.99 USD", "19.99USD" and "19.99". If the currency is not included, we default to US dollars.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    minAdPrice?: string | null;
    /**
     * The mobile-optimized version of your landing page. Must begin with http:// or https://.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    mobileLink?: string | null;
    /**
     * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    mpn?: string | null;
    /**
     * The number of ratings for the item.
     * @type {number}
     * @memberof ItemAttributesRequest
     */
    numberOfRatings?: number | null;
    /**
     * The number of reviews available for the item.
     * @type {number}
     * @memberof ItemAttributesRequest
     */
    numberOfReviews?: number | null;
    /**
     * The description of the pattern used for the product.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    pattern?: string | null;
    /**
     * The price of the product. It supports the following formats, "24.99 USD", "24.99USD" and "24.99". If the currency is not included, we default to US dollars.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    price?: string;
    /**
     * <p><= 1000 characters</p>
     * <p>The categorization of your product based on your custom product
     * taxonomy. Subcategories must be sent separated by “ > “. The > must be
     * wrapped by spaces. We do not recognize any other delimiters such as comma
     * or pipe.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    productType?: string | null;
    /**
     * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, "14.99 USD", "14.99USD" and "14.99". If the currency is not included, we default to US dollars.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    salePrice?: string | null;
    /**
     * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    shipping?: string | null;
    /**
     * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    shippingHeight?: string | null;
    /**
     * The weight of the product. Ensure there is a space between the numeric string and the metric.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    shippingWeight?: string | null;
    /**
     * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    shippingWidth?: string | null;
    /**
     * The size of the product.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    size?: string | null;
    /**
     * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    sizeSystem?: string | null;
    /**
     * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    sizeType?: string | null;
    /**
     * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    tax?: string | null;
    /**
     * <p><= 500 characters</p>
     * <p>The name of the product.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    title?: string;
    /**
     * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
     * @type {Array<string>}
     * @memberof ItemAttributesRequest
     */
    variantNames?: Array<string> | null;
    /**
     * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
     * @type {Array<string>}
     * @memberof ItemAttributesRequest
     */
    variantValues?: Array<string> | null;
    /**
     * <p><= 2000 characters</p>
     * <p>The links to additional images for your product. Up to ten
     * additional images can be used to show a product from different angles
     * or to show different stages. Must begin with http:// or https://.</p>
     * @type {Array<string>}
     * @memberof ItemAttributesRequest
     */
    additionalImageLink?: Array<string> | null;
    /**
     * 
     * @type {ItemAttributesRequestAllOfImageLink}
     * @memberof ItemAttributesRequest
     */
    imageLink?: ItemAttributesRequestAllOfImageLink;
    /**
     * <p><= 2,000 characters</p>
     * <p>Hosted link to the product video.</p>
     * <p>File types for linked videos must be .mp4, .mov or .m4v.</p>
     * <p>File size cannot exceed 2GB.</p>
     * @type {string}
     * @memberof ItemAttributesRequest
     */
    videoLink?: string | null;
}

/**
 * Check if a given object implements the ItemAttributesRequest interface.
 */
export function instanceOfItemAttributesRequest(value: object): value is ItemAttributesRequest {
    return true;
}

export function ItemAttributesRequestFromJSON(json: any): ItemAttributesRequest {
    return ItemAttributesRequestFromJSONTyped(json, false);
}

export function ItemAttributesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ItemAttributesRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'adLink': json['ad_link'] == null ? undefined : json['ad_link'],
        'adult': json['adult'] == null ? undefined : json['adult'],
        'ageGroup': json['age_group'] == null ? undefined : json['age_group'],
        'availability': json['availability'] == null ? undefined : json['availability'],
        'averageReviewRating': json['average_review_rating'] == null ? undefined : json['average_review_rating'],
        'brand': json['brand'] == null ? undefined : json['brand'],
        'checkoutEnabled': json['checkout_enabled'] == null ? undefined : json['checkout_enabled'],
        'color': json['color'] == null ? undefined : json['color'],
        'condition': json['condition'] == null ? undefined : json['condition'],
        'customLabel0': json['custom_label_0'] == null ? undefined : json['custom_label_0'],
        'customLabel1': json['custom_label_1'] == null ? undefined : json['custom_label_1'],
        'customLabel2': json['custom_label_2'] == null ? undefined : json['custom_label_2'],
        'customLabel3': json['custom_label_3'] == null ? undefined : json['custom_label_3'],
        'customLabel4': json['custom_label_4'] == null ? undefined : json['custom_label_4'],
        'description': json['description'] == null ? undefined : json['description'],
        'freeShippingLabel': json['free_shipping_label'] == null ? undefined : json['free_shipping_label'],
        'freeShippingLimit': json['free_shipping_limit'] == null ? undefined : json['free_shipping_limit'],
        'gender': json['gender'] == null ? undefined : json['gender'],
        'googleProductCategory': json['google_product_category'] == null ? undefined : json['google_product_category'],
        'gtin': json['gtin'] == null ? undefined : json['gtin'],
        'id': json['id'] == null ? undefined : json['id'],
        'itemGroupId': json['item_group_id'] == null ? undefined : json['item_group_id'],
        'lastUpdatedTime': json['last_updated_time'] == null ? undefined : json['last_updated_time'],
        'link': json['link'] == null ? undefined : json['link'],
        'material': json['material'] == null ? undefined : json['material'],
        'minAdPrice': json['min_ad_price'] == null ? undefined : json['min_ad_price'],
        'mobileLink': json['mobile_link'] == null ? undefined : json['mobile_link'],
        'mpn': json['mpn'] == null ? undefined : json['mpn'],
        'numberOfRatings': json['number_of_ratings'] == null ? undefined : json['number_of_ratings'],
        'numberOfReviews': json['number_of_reviews'] == null ? undefined : json['number_of_reviews'],
        'pattern': json['pattern'] == null ? undefined : json['pattern'],
        'price': json['price'] == null ? undefined : json['price'],
        'productType': json['product_type'] == null ? undefined : json['product_type'],
        'salePrice': json['sale_price'] == null ? undefined : json['sale_price'],
        'shipping': json['shipping'] == null ? undefined : json['shipping'],
        'shippingHeight': json['shipping_height'] == null ? undefined : json['shipping_height'],
        'shippingWeight': json['shipping_weight'] == null ? undefined : json['shipping_weight'],
        'shippingWidth': json['shipping_width'] == null ? undefined : json['shipping_width'],
        'size': json['size'] == null ? undefined : json['size'],
        'sizeSystem': json['size_system'] == null ? undefined : json['size_system'],
        'sizeType': json['size_type'] == null ? undefined : json['size_type'],
        'tax': json['tax'] == null ? undefined : json['tax'],
        'title': json['title'] == null ? undefined : json['title'],
        'variantNames': json['variant_names'] == null ? undefined : json['variant_names'],
        'variantValues': json['variant_values'] == null ? undefined : json['variant_values'],
        'additionalImageLink': json['additional_image_link'] == null ? undefined : json['additional_image_link'],
        'imageLink': json['image_link'] == null ? undefined : ItemAttributesRequestAllOfImageLinkFromJSON(json['image_link']),
        'videoLink': json['video_link'] == null ? undefined : json['video_link'],
    };
}

  export function ItemAttributesRequestToJSON(json: any): ItemAttributesRequest {
      return ItemAttributesRequestToJSONTyped(json, false);
  }

  export function ItemAttributesRequestToJSONTyped(value?: ItemAttributesRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'ad_link': value['adLink'],
        'adult': value['adult'],
        'age_group': value['ageGroup'],
        'availability': value['availability'],
        'average_review_rating': value['averageReviewRating'],
        'brand': value['brand'],
        'checkout_enabled': value['checkoutEnabled'],
        'color': value['color'],
        'condition': value['condition'],
        'custom_label_0': value['customLabel0'],
        'custom_label_1': value['customLabel1'],
        'custom_label_2': value['customLabel2'],
        'custom_label_3': value['customLabel3'],
        'custom_label_4': value['customLabel4'],
        'description': value['description'],
        'free_shipping_label': value['freeShippingLabel'],
        'free_shipping_limit': value['freeShippingLimit'],
        'gender': value['gender'],
        'google_product_category': value['googleProductCategory'],
        'gtin': value['gtin'],
        'id': value['id'],
        'item_group_id': value['itemGroupId'],
        'last_updated_time': value['lastUpdatedTime'],
        'link': value['link'],
        'material': value['material'],
        'min_ad_price': value['minAdPrice'],
        'mobile_link': value['mobileLink'],
        'mpn': value['mpn'],
        'number_of_ratings': value['numberOfRatings'],
        'number_of_reviews': value['numberOfReviews'],
        'pattern': value['pattern'],
        'price': value['price'],
        'product_type': value['productType'],
        'sale_price': value['salePrice'],
        'shipping': value['shipping'],
        'shipping_height': value['shippingHeight'],
        'shipping_weight': value['shippingWeight'],
        'shipping_width': value['shippingWidth'],
        'size': value['size'],
        'size_system': value['sizeSystem'],
        'size_type': value['sizeType'],
        'tax': value['tax'],
        'title': value['title'],
        'variant_names': value['variantNames'],
        'variant_values': value['variantValues'],
        'additional_image_link': value['additionalImageLink'],
        'image_link': ItemAttributesRequestAllOfImageLinkToJSON(value['imageLink']),
        'video_link': value['videoLink'],
    };
}

