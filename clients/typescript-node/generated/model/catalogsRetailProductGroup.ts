/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { CatalogsProductGroupFilters } from './catalogsProductGroupFilters';
import { CatalogsProductGroupStatus } from './catalogsProductGroupStatus';
import { CatalogsProductGroupType } from './catalogsProductGroupType';

export class CatalogsRetailProductGroup {
    'catalogType': CatalogsRetailProductGroup.CatalogTypeEnum;
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
    'feedId': CatalogsRetailProductGroup.FeedIdEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsRetailProductGroup.CatalogTypeEnum"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "filters",
            "baseName": "filters",
            "type": "CatalogsProductGroupFilters"
        },
        {
            "name": "isFeatured",
            "baseName": "is_featured",
            "type": "boolean"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "CatalogsProductGroupType"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "CatalogsProductGroupStatus"
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "number"
        },
        {
            "name": "updatedAt",
            "baseName": "updated_at",
            "type": "number"
        },
        {
            "name": "feedId",
            "baseName": "feed_id",
            "type": "CatalogsRetailProductGroup.FeedIdEnum"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsRetailProductGroup.attributeTypeMap;
    }
}

export namespace CatalogsRetailProductGroup {
    export enum CatalogTypeEnum {
        Retail = <any> 'RETAIL'
    }
    export enum FeedIdEnum {
        Null = <any> 'null'
    }
}