/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CatalogsProductGroupFiltersRequest } from './catalogsProductGroupFiltersRequest';


/**
 * Request object for updating a product group.
 */
export interface CatalogsProductGroupUpdateRequest { 
    name?: string;
    description?: string | null;
    /**
     * boolean indicator of whether the product group is being featured or not
     * @deprecated
     */
    is_featured?: boolean;
    filters?: CatalogsProductGroupFiltersRequest;
}

