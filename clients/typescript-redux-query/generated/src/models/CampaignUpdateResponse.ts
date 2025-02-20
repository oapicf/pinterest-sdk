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

import {
    CampaignCreateResponseItem,
    CampaignCreateResponseItemFromJSON,
    CampaignCreateResponseItemToJSON,
} from './';

/**
 * @type CampaignUpdateResponse
 * @export
 */
export interface CampaignUpdateResponse extends CampaignCreateResponse {
}

export function CampaignUpdateResponseFromJSON(json: any): CampaignUpdateResponse {
    return {
        ...CampaignCreateResponseFromJSON(json),
    };
}

export function CampaignUpdateResponseToJSON(value?: CampaignUpdateResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...CampaignCreateResponseToJSON(value),
    };
}
