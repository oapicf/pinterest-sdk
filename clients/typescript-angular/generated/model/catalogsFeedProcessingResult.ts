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
import { CatalogsFeedProductCounts } from './catalogsFeedProductCounts';
import { CatalogsFeedValidationDetails } from './catalogsFeedValidationDetails';
import { CatalogsFeedProcessingStatus } from './catalogsFeedProcessingStatus';
import { CatalogsFeedIngestionDetails } from './catalogsFeedIngestionDetails';


export interface CatalogsFeedProcessingResult { 
    created_at?: string;
    id?: string;
    updated_at?: string;
    ingestion_details: CatalogsFeedIngestionDetails;
    status: CatalogsFeedProcessingStatus;
    product_counts: CatalogsFeedProductCounts | null;
    validation_details: CatalogsFeedValidationDetails;
}
export namespace CatalogsFeedProcessingResult {
}

