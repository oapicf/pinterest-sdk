/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CatalogsProductGroup } from '../models/CatalogsProductGroup';
import { CatalogsProductGroupFilters } from '../models/CatalogsProductGroupFilters';
import { CatalogsProductGroupStatus } from '../models/CatalogsProductGroupStatus';
import { CatalogsProductGroupType } from '../models/CatalogsProductGroupType';
import { CatalogsVerticalProductGroup } from '../models/CatalogsVerticalProductGroup';
import { HttpFile } from '../http/http';

export class CatalogsProductGroupsList200ResponseAllOfItemsInner {
    /**
    * ID of the catalog product group.
    */
    'id': string;
    /**
    * Name of catalog product group
    */
    'name'?: string;
    'description'?: string | null;
    'filters': CatalogsProductGroupFilters;
    /**
    * boolean indicator of whether the product group is being featured or not
    */
    'isFeatured'?: boolean;
    'type'?: CatalogsProductGroupType;
    'status'?: CatalogsProductGroupStatus;
    /**
    * Unix timestamp in seconds of when catalog product group was created.
    */
    'createdAt'?: number;
    /**
    * Unix timestamp in seconds of last time catalog product group was updated.
    */
    'updatedAt'?: number;
    /**
    * id of the catalogs feed belonging to this catalog product group
    */
    'feedId': string;
    'catalogType'?: CatalogsProductGroupsList200ResponseAllOfItemsInnerCatalogTypeEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "filters",
            "baseName": "filters",
            "type": "CatalogsProductGroupFilters",
            "format": ""
        },
        {
            "name": "isFeatured",
            "baseName": "is_featured",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "CatalogsProductGroupType",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "CatalogsProductGroupStatus",
            "format": ""
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "updatedAt",
            "baseName": "updated_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "feedId",
            "baseName": "feed_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsProductGroupsList200ResponseAllOfItemsInnerCatalogTypeEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CatalogsProductGroupsList200ResponseAllOfItemsInner.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum CatalogsProductGroupsList200ResponseAllOfItemsInnerCatalogTypeEnum {
    Retail = 'RETAIL'
}
