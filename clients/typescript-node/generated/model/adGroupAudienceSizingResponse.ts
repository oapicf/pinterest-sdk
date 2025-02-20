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

export class AdGroupAudienceSizingResponse {
    /**
    * The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    */
    'audienceSizeLowerBound'?: number;
    /**
    * The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    */
    'audienceSizeUpperBound'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "audienceSizeLowerBound",
            "baseName": "audience_size_lower_bound",
            "type": "number"
        },
        {
            "name": "audienceSizeUpperBound",
            "baseName": "audience_size_upper_bound",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AdGroupAudienceSizingResponse.attributeTypeMap;
    }
}

