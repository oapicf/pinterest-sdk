/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The OauthAccessTokenResponseIntegrationRefresh model module.
 * @module model/OauthAccessTokenResponseIntegrationRefresh
 * @version 1.1.1-pre.0
 */
class OauthAccessTokenResponseIntegrationRefresh {
    /**
     * Constructs a new <code>OauthAccessTokenResponseIntegrationRefresh</code>.
     * A successful OAuth access token response for the refresh token flow, with an added refresh token.
     * @alias module:model/OauthAccessTokenResponseIntegrationRefresh
     * @param refreshToken {String} 
     * @param refreshTokenExpiresIn {Number} 
     */
    constructor(refreshToken, refreshTokenExpiresIn) { 
        
        OauthAccessTokenResponseIntegrationRefresh.initialize(this, refreshToken, refreshTokenExpiresIn);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, refreshToken, refreshTokenExpiresIn) { 
        obj['access_token'] = accessToken;
        obj['token_type'] = tokenType || 'bearer';
        obj['expires_in'] = expiresIn;
        obj['scope'] = scope;
        obj['refresh_token'] = refreshToken;
        obj['refresh_token_expires_in'] = refreshTokenExpiresIn;
    }

    /**
     * Constructs a <code>OauthAccessTokenResponseIntegrationRefresh</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OauthAccessTokenResponseIntegrationRefresh} obj Optional instance to populate.
     * @return {module:model/OauthAccessTokenResponseIntegrationRefresh} The populated <code>OauthAccessTokenResponseIntegrationRefresh</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OauthAccessTokenResponseIntegrationRefresh();

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
            if (data.hasOwnProperty('refresh_token')) {
                obj['refresh_token'] = ApiClient.convertToType(data['refresh_token'], 'String');
            }
            if (data.hasOwnProperty('refresh_token_expires_in')) {
                obj['refresh_token_expires_in'] = ApiClient.convertToType(data['refresh_token_expires_in'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OauthAccessTokenResponseIntegrationRefresh</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OauthAccessTokenResponseIntegrationRefresh</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OauthAccessTokenResponseIntegrationRefresh.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['response_type'] && !(typeof data['response_type'] === 'string' || data['response_type'] instanceof String)) {
            throw new Error("Expected the field `response_type` to be a primitive type in the JSON string but got " + data['response_type']);
        }
        // ensure the json data is a string
        if (data['access_token'] && !(typeof data['access_token'] === 'string' || data['access_token'] instanceof String)) {
            throw new Error("Expected the field `access_token` to be a primitive type in the JSON string but got " + data['access_token']);
        }
        // ensure the json data is a string
        if (data['token_type'] && !(typeof data['token_type'] === 'string' || data['token_type'] instanceof String)) {
            throw new Error("Expected the field `token_type` to be a primitive type in the JSON string but got " + data['token_type']);
        }
        // ensure the json data is a string
        if (data['scope'] && !(typeof data['scope'] === 'string' || data['scope'] instanceof String)) {
            throw new Error("Expected the field `scope` to be a primitive type in the JSON string but got " + data['scope']);
        }
        // ensure the json data is a string
        if (data['refresh_token'] && !(typeof data['refresh_token'] === 'string' || data['refresh_token'] instanceof String)) {
            throw new Error("Expected the field `refresh_token` to be a primitive type in the JSON string but got " + data['refresh_token']);
        }

        return true;
    }


}

OauthAccessTokenResponseIntegrationRefresh.RequiredProperties = ["access_token", "token_type", "expires_in", "scope", "refresh_token", "refresh_token_expires_in"];

/**
 * @member {module:model/OauthAccessTokenResponseIntegrationRefresh.ResponseTypeEnum} response_type
 */
OauthAccessTokenResponseIntegrationRefresh.prototype['response_type'] = undefined;

/**
 * @member {String} access_token
 */
OauthAccessTokenResponseIntegrationRefresh.prototype['access_token'] = undefined;

/**
 * @member {String} token_type
 * @default 'bearer'
 */
OauthAccessTokenResponseIntegrationRefresh.prototype['token_type'] = 'bearer';

/**
 * @member {Number} expires_in
 */
OauthAccessTokenResponseIntegrationRefresh.prototype['expires_in'] = undefined;

/**
 * @member {String} scope
 */
OauthAccessTokenResponseIntegrationRefresh.prototype['scope'] = undefined;

/**
 * @member {String} refresh_token
 */
OauthAccessTokenResponseIntegrationRefresh.prototype['refresh_token'] = undefined;

/**
 * @member {Number} refresh_token_expires_in
 */
OauthAccessTokenResponseIntegrationRefresh.prototype['refresh_token_expires_in'] = undefined;





/**
 * Allowed values for the <code>response_type</code> property.
 * @enum {String}
 * @readonly
 */
OauthAccessTokenResponseIntegrationRefresh['ResponseTypeEnum'] = {

    /**
     * value: "authorization_code"
     * @const
     */
    "authorization_code": "authorization_code",

    /**
     * value: "refresh_token"
     * @const
     */
    "refresh_token": "refresh_token",

    /**
     * value: "client_credentials"
     * @const
     */
    "client_credentials": "client_credentials"
};



export default OauthAccessTokenResponseIntegrationRefresh;

