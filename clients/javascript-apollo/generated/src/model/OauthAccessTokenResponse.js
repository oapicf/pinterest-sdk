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
 * The OauthAccessTokenResponse model module.
 * @module model/OauthAccessTokenResponse
 * @version 5.3.0
 */
class OauthAccessTokenResponse {
    /**
     * @member {OauthAccessTokenResponse.ResponseTypeEnum} response_type
     * @type {OauthAccessTokenResponse.ResponseTypeEnum}
     */
    response_type;
    /**
     * @member {String} access_token
     * @type {String}
     */
    access_token;
    /**
     * @member {String} token_type
     * @type {String}
     * @default 'bearer'
     */
    token_type = 'bearer';
    /**
     * @member {Number} expires_in
     * @type {Number}
     */
    expires_in;
    /**
     * @member {String} scope
     * @type {String}
     */
    scope;

    

    /**
     * Constructs a new <code>OauthAccessTokenResponse</code>.
     * A successful OAuth access token response.
     * @alias module:model/OauthAccessTokenResponse
     * @param accessToken {String} 
     * @param tokenType {String} 
     * @param expiresIn {Number} 
     * @param scope {String} 
     */
    constructor(accessToken, tokenType, expiresIn, scope) { 
        
        OauthAccessTokenResponse.initialize(this, accessToken, tokenType, expiresIn, scope);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, accessToken, tokenType, expiresIn, scope) { 
        obj['access_token'] = accessToken;
        obj['token_type'] = tokenType;
        obj['expires_in'] = expiresIn;
        obj['scope'] = scope;
    }

    /**
     * Constructs a <code>OauthAccessTokenResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OauthAccessTokenResponse} obj Optional instance to populate.
     * @return {module:model/OauthAccessTokenResponse} The populated <code>OauthAccessTokenResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OauthAccessTokenResponse();

            if (data.hasOwnProperty('response_type')) {
                obj['response_type'] = ApiClient.convertToType(data['response_type'], 'String');
            }
            if (data.hasOwnProperty('access_token')) {
                obj['access_token'] = ApiClient.convertToType(data['access_token'], 'String');
            }
            if (data.hasOwnProperty('token_type')) {
                obj['token_type'] = ApiClient.convertToType(data['token_type'], 'String');
            }
            if (data.hasOwnProperty('expires_in')) {
                obj['expires_in'] = ApiClient.convertToType(data['expires_in'], 'Number');
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
        }
        return obj;
    }
}


/**
 * Allowed values for the <code>response_type</code> property.
 * @enum {String}
 * @readonly
 */
OauthAccessTokenResponse['ResponseTypeEnum'] = {

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



export default OauthAccessTokenResponse;
