/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The OauthAccessTokenRequest model module.
 * @module model/OauthAccessTokenRequest
 * @version 1.0.0-pre.0
 */
class OauthAccessTokenRequest {
    /**
     * Constructs a new <code>OauthAccessTokenRequest</code>.
     * Describes the valid schema for possible OAuth access token requests.
     * @alias module:model/OauthAccessTokenRequest
     * @param grantType {module:model/OauthAccessTokenRequest.GrantTypeEnum} 
     */
    constructor(grantType) { 
        
        OauthAccessTokenRequest.initialize(this, grantType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, grantType) { 
        obj['grant_type'] = grantType;
    }

    /**
     * Constructs a <code>OauthAccessTokenRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OauthAccessTokenRequest} obj Optional instance to populate.
     * @return {module:model/OauthAccessTokenRequest} The populated <code>OauthAccessTokenRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OauthAccessTokenRequest();

            if (data.hasOwnProperty('grant_type')) {
                obj['grant_type'] = ApiClient.convertToType(data['grant_type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/OauthAccessTokenRequest.GrantTypeEnum} grant_type
 */
OauthAccessTokenRequest.prototype['grant_type'] = undefined;





/**
 * Allowed values for the <code>grant_type</code> property.
 * @enum {String}
 * @readonly
 */
OauthAccessTokenRequest['GrantTypeEnum'] = {

    /**
     * value: "authorization_code"
     * @const
     */
    "authorization_code": "authorization_code",

    /**
     * value: "refresh_token"
     * @const
     */
    "refresh_token": "refresh_token"
};



export default OauthAccessTokenRequest;
