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
 * The OauthAccessTokenRequestRefresh model module.
 * @module model/OauthAccessTokenRequestRefresh
 * @version 1.1.1-pre.0
 */
class OauthAccessTokenRequestRefresh {
    /**
     * Constructs a new <code>OauthAccessTokenRequestRefresh</code>.
     * A request to exchange a refresh token for a new access token.
     * @alias module:model/OauthAccessTokenRequestRefresh
     * @param refreshToken {String} 
     */
    constructor(refreshToken) { 
        
        OauthAccessTokenRequestRefresh.initialize(this, refreshToken);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, refreshToken) { 
        obj['grant_type'] = grantType;
        obj['refresh_token'] = refreshToken;
    }

    /**
     * Constructs a <code>OauthAccessTokenRequestRefresh</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OauthAccessTokenRequestRefresh} obj Optional instance to populate.
     * @return {module:model/OauthAccessTokenRequestRefresh} The populated <code>OauthAccessTokenRequestRefresh</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OauthAccessTokenRequestRefresh();

            if (data.hasOwnProperty('grant_type')) {
                obj['grant_type'] = ApiClient.convertToType(data['grant_type'], 'String');
            }
            if (data.hasOwnProperty('refresh_token')) {
                obj['refresh_token'] = ApiClient.convertToType(data['refresh_token'], 'String');
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
            if (data.hasOwnProperty('refresh_on')) {
                obj['refresh_on'] = ApiClient.convertToType(data['refresh_on'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OauthAccessTokenRequestRefresh</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OauthAccessTokenRequestRefresh</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OauthAccessTokenRequestRefresh.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['grant_type'] && !(typeof data['grant_type'] === 'string' || data['grant_type'] instanceof String)) {
            throw new Error("Expected the field `grant_type` to be a primitive type in the JSON string but got " + data['grant_type']);
        }
        // ensure the json data is a string
        if (data['refresh_token'] && !(typeof data['refresh_token'] === 'string' || data['refresh_token'] instanceof String)) {
            throw new Error("Expected the field `refresh_token` to be a primitive type in the JSON string but got " + data['refresh_token']);
        }
        // ensure the json data is a string
        if (data['scope'] && !(typeof data['scope'] === 'string' || data['scope'] instanceof String)) {
            throw new Error("Expected the field `scope` to be a primitive type in the JSON string but got " + data['scope']);
        }

        return true;
    }


}

OauthAccessTokenRequestRefresh.RequiredProperties = ["grant_type", "refresh_token"];

/**
 * @member {module:model/OauthAccessTokenRequestRefresh.GrantTypeEnum} grant_type
 */
OauthAccessTokenRequestRefresh.prototype['grant_type'] = undefined;

/**
 * @member {String} refresh_token
 */
OauthAccessTokenRequestRefresh.prototype['refresh_token'] = undefined;

/**
 * @member {String} scope
 */
OauthAccessTokenRequestRefresh.prototype['scope'] = undefined;

/**
 * Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
 * @member {Boolean} refresh_on
 */
OauthAccessTokenRequestRefresh.prototype['refresh_on'] = undefined;





/**
 * Allowed values for the <code>grant_type</code> property.
 * @enum {String}
 * @readonly
 */
OauthAccessTokenRequestRefresh['GrantTypeEnum'] = {

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



export default OauthAccessTokenRequestRefresh;

