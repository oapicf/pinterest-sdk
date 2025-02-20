/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ConversionEventsDataInnerCustomDataContentsInner } from '../models/ConversionEventsDataInnerCustomDataContentsInner';
import { HttpFile } from '../http/http';

/**
* Object containing other custom data.
*/
export class ConversionEventsDataInnerCustomData {
    /**
    * The ISO-4217 currency code. If not provided, we will default to the advertiser\'s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
    */
    'currency'?: string | null;
    /**
    * Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
    */
    'value'?: string | null;
    /**
    * List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    */
    'contentIds'?: Array<string>;
    /**
    * The name of the page or product associated with the event.
    */
    'contentName'?: string | null;
    /**
    * The category of the content associated with the event.
    */
    'contentCategory'?: string | null;
    /**
    * The brand of the content associated with the event.
    */
    'contentBrand'?: string | null;
    /**
    * A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    */
    'contents'?: Array<ConversionEventsDataInnerCustomDataContentsInner>;
    /**
    * Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
    */
    'numItems'?: number;
    /**
    * The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
    */
    'orderId'?: string | null;
    /**
    * The search string related to the user conversion event.
    */
    'searchString'?: string | null;
    /**
    * Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
    */
    'optOutType'?: string | null;
    /**
    * Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
    */
    'np'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "currency",
            "baseName": "currency",
            "type": "string",
            "format": ""
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string",
            "format": ""
        },
        {
            "name": "contentIds",
            "baseName": "content_ids",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "contentName",
            "baseName": "content_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "contentCategory",
            "baseName": "content_category",
            "type": "string",
            "format": ""
        },
        {
            "name": "contentBrand",
            "baseName": "content_brand",
            "type": "string",
            "format": ""
        },
        {
            "name": "contents",
            "baseName": "contents",
            "type": "Array<ConversionEventsDataInnerCustomDataContentsInner>",
            "format": ""
        },
        {
            "name": "numItems",
            "baseName": "num_items",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "orderId",
            "baseName": "order_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "searchString",
            "baseName": "search_string",
            "type": "string",
            "format": ""
        },
        {
            "name": "optOutType",
            "baseName": "opt_out_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "np",
            "baseName": "np",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ConversionEventsDataInnerCustomData.attributeTypeMap;
    }

    public constructor() {
    }
}
