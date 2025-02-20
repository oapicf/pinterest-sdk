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

import * as models from './models';

export interface SSIOAccountResponse {
    /**
     * Advertiser eligible to create order lines
     */
    eligible?: boolean;

    /**
     * Advertiser eligible to update order lines
     */
    can_edit?: boolean;

    /**
     * An array of Salesforce account information that includes address, io terms, etc.
     */
    billto_infos?: Array<models.SSIOAccountItem>;

    currency?: string;

    pmp_names?: Array<models.SSIOAccountPMPName>;

    /**
     * Error indicator from Salesforce which could be \"No Error\"
     */
    error?: string;

}
