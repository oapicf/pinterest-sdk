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


/**
 * User website verification request
 */
export interface UserWebsiteVerifyRequest { 
    website?: string;
    verification_method?: UserWebsiteVerifyRequest.VerificationMethodEnum;
}
export namespace UserWebsiteVerifyRequest {
    export type VerificationMethodEnum = 'FILENAME' | 'METATAG' | 'DNSTXT';
    export const VerificationMethodEnum = {
        Filename: 'FILENAME' as VerificationMethodEnum,
        Metatag: 'METATAG' as VerificationMethodEnum,
        Dnstxt: 'DNSTXT' as VerificationMethodEnum
    }
}