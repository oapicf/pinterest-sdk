// tslint:disable
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

import type {
    BatchOperationStatus,
    CatalogsType,
    CreativeAssetsProcessingRecord,
} from './';

/**
 * Object describing the catalogs creative assets items batch
 * @export
 * @interface CatalogsCreativeAssetsItemsBatch
 */
export interface CatalogsCreativeAssetsItemsBatch {
    /**
     * Id of the catalogs items batch
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsBatch
     */
    batch_id?: string;
    /**
     * Date and time (UTC) of the batch creation: YYYY-MM-DD\'T\'hh:mm:ss
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsBatch
     */
    readonly created_time?: string;
    /**
     * Date and time (UTC) of the batch completion: YYYY-MM-DD\'T\'hh:mm:ss
     * @type {string}
     * @memberof CatalogsCreativeAssetsItemsBatch
     */
    readonly completed_time?: string | null;
    /**
     * @type {BatchOperationStatus}
     * @memberof CatalogsCreativeAssetsItemsBatch
     */
    status?: BatchOperationStatus;
    /**
     * @type {CatalogsType}
     * @memberof CatalogsCreativeAssetsItemsBatch
     */
    catalog_type: CatalogsType;
    /**
     * Array with the catalogs items processing records part of the catalogs items batch
     * @type {Array<CreativeAssetsProcessingRecord>}
     * @memberof CatalogsCreativeAssetsItemsBatch
     */
    items?: Array<CreativeAssetsProcessingRecord>;
}


