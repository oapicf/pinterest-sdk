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

/**
* This field is **OPTIONAL**. Use this if your feed file requires username and password.
*/
export class CatalogsFeedCredentials {
    /**
    * The required password for downloading a feed.
    */
    'password': string;
    /**
    * The required username for downloading a feed.
    */
    'username': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "password",
            "baseName": "password",
            "type": "string"
        },
        {
            "name": "username",
            "baseName": "username",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsFeedCredentials.attributeTypeMap;
    }
}
