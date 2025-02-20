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

/**
 * @export
 * @interface CreateAssetAccessRequestErrorMessageInner
 */
export interface CreateAssetAccessRequestErrorMessageInner {
    /**
     * Error code associated with the error in requesting asset access.
     * @type {number}
     * @memberof CreateAssetAccessRequestErrorMessageInner
     */
    code?: number;
    /**
     * @type {Array<string>}
     * @memberof CreateAssetAccessRequestErrorMessageInner
     */
    messages?: Array<string>;
}
