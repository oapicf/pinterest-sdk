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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface UserWebsiteVerificationCode
 */
export interface UserWebsiteVerificationCode  {
    /**
     * Code to check against the user claiming the website
     * @type {string}
     * @memberof UserWebsiteVerificationCode
     */
    verificationCode?: string;
    /**
     * DNS TXT record to check against for the website to be claimed
     * @type {string}
     * @memberof UserWebsiteVerificationCode
     */
    dnsTxtRecord?: string;
    /**
     * Metatag the verification process searchs for the website to be claimed
     * @type {string}
     * @memberof UserWebsiteVerificationCode
     */
    metatag?: string;
    /**
     * File expected to find on the website being claimed
     * @type {string}
     * @memberof UserWebsiteVerificationCode
     */
    filename?: string;
    /**
     * A full html file to upload to the website in order for it to be claimed
     * @type {string}
     * @memberof UserWebsiteVerificationCode
     */
    fileContent?: string;
}

export function UserWebsiteVerificationCodeFromJSON(json: any): UserWebsiteVerificationCode {
    return {
        'verificationCode': !exists(json, 'verification_code') ? undefined : json['verification_code'],
        'dnsTxtRecord': !exists(json, 'dns_txt_record') ? undefined : json['dns_txt_record'],
        'metatag': !exists(json, 'metatag') ? undefined : json['metatag'],
        'filename': !exists(json, 'filename') ? undefined : json['filename'],
        'fileContent': !exists(json, 'file_content') ? undefined : json['file_content'],
    };
}

export function UserWebsiteVerificationCodeToJSON(value?: UserWebsiteVerificationCode): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'verification_code': value.verificationCode,
        'dns_txt_record': value.dnsTxtRecord,
        'metatag': value.metatag,
        'filename': value.filename,
        'file_content': value.fileContent,
    };
}


