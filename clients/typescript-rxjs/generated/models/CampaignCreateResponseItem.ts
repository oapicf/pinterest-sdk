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
    CampaignCreateResponseData,
    Exception,
} from './';

/**
 * @export
 * @interface CampaignCreateResponseItem
 */
export interface CampaignCreateResponseItem {
    /**
     * @type {CampaignCreateResponseData}
     * @memberof CampaignCreateResponseItem
     */
    data?: CampaignCreateResponseData;
    /**
     * @type {Array<Exception>}
     * @memberof CampaignCreateResponseItem
     */
    exceptions?: Array<Exception>;
}
