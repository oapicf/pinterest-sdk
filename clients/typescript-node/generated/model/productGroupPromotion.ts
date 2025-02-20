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

import { RequestFile } from './models';
import { EntityStatus } from './entityStatus';
import { GridClickType } from './gridClickType';

export class ProductGroupPromotion {
    /**
    * ID of the product group promotion.
    */
    'id'?: string;
    /**
    * ID of the ad group the product group belongs to.
    */
    'adGroupId'?: string;
    /**
    * The bid in micro currency.
    */
    'bidInMicroCurrency'?: number | null;
    /**
    * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
    */
    'included'?: boolean | null;
    /**
    * The full product group definition path
    */
    'definition'?: string | null;
    /**
    * The definition of the product group, relative to its parent - an attribute name/value pair
    */
    'relativeDefinition'?: string | null;
    /**
    * The parent Product Group ID of this Product Group
    */
    'parentId'?: string | null;
    /**
    * Slideshow Collections Title
    */
    'slideshowCollectionsTitle'?: string | null;
    /**
    * Slideshow Collections Description
    */
    'slideshowCollectionsDescription'?: string | null;
    /**
    * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
    */
    'isMdl'?: boolean | null;
    'status'?: EntityStatus;
    /**
    * Tracking template for proudct group promotions. 4000 limit
    */
    'trackingUrl'?: string | null;
    /**
    * ID of the catalogs product group that this product group promotion references
    */
    'catalogProductGroupId'?: string | null;
    /**
    * Catalogs product group name
    */
    'catalogProductGroupName'?: string | null;
    /**
    * Hero Pin ID if this PG is promoted as a Collection
    */
    'collectionsHeroPinId'?: string | null;
    /**
    * Collections Hero Destination Url
    */
    'collectionsHeroDestinationUrl'?: string | null;
    'gridClickType'?: GridClickType | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "adGroupId",
            "baseName": "ad_group_id",
            "type": "string"
        },
        {
            "name": "bidInMicroCurrency",
            "baseName": "bid_in_micro_currency",
            "type": "number"
        },
        {
            "name": "included",
            "baseName": "included",
            "type": "boolean"
        },
        {
            "name": "definition",
            "baseName": "definition",
            "type": "string"
        },
        {
            "name": "relativeDefinition",
            "baseName": "relative_definition",
            "type": "string"
        },
        {
            "name": "parentId",
            "baseName": "parent_id",
            "type": "string"
        },
        {
            "name": "slideshowCollectionsTitle",
            "baseName": "slideshow_collections_title",
            "type": "string"
        },
        {
            "name": "slideshowCollectionsDescription",
            "baseName": "slideshow_collections_description",
            "type": "string"
        },
        {
            "name": "isMdl",
            "baseName": "is_mdl",
            "type": "boolean"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "EntityStatus"
        },
        {
            "name": "trackingUrl",
            "baseName": "tracking_url",
            "type": "string"
        },
        {
            "name": "catalogProductGroupId",
            "baseName": "catalog_product_group_id",
            "type": "string"
        },
        {
            "name": "catalogProductGroupName",
            "baseName": "catalog_product_group_name",
            "type": "string"
        },
        {
            "name": "collectionsHeroPinId",
            "baseName": "collections_hero_pin_id",
            "type": "string"
        },
        {
            "name": "collectionsHeroDestinationUrl",
            "baseName": "collections_hero_destination_url",
            "type": "string"
        },
        {
            "name": "gridClickType",
            "baseName": "grid_click_type",
            "type": "GridClickType"
        }    ];

    static getAttributeTypeMap() {
        return ProductGroupPromotion.attributeTypeMap;
    }
}

export namespace ProductGroupPromotion {
}
