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
 * The DeletePartnerAssetAccessBodyAccessesInner model module.
 * @module model/DeletePartnerAssetAccessBodyAccessesInner
 * @version 1.1.1-pre.0
 */
class DeletePartnerAssetAccessBodyAccessesInner {
    /**
     * Constructs a new <code>DeletePartnerAssetAccessBodyAccessesInner</code>.
     * @alias module:model/DeletePartnerAssetAccessBodyAccessesInner
     * @param partnerId {String} Unique identifier of a business partner to update asset access to.
     * @param assetId {String} Unique identifier of the business asset.
     */
    constructor(partnerId, assetId) { 
        
        DeletePartnerAssetAccessBodyAccessesInner.initialize(this, partnerId, assetId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, partnerId, assetId) { 
        obj['partner_id'] = partnerId;
        obj['asset_id'] = assetId;
        obj['partner_type'] = 'INTERNAL';
    }

    /**
     * Constructs a <code>DeletePartnerAssetAccessBodyAccessesInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DeletePartnerAssetAccessBodyAccessesInner} obj Optional instance to populate.
     * @return {module:model/DeletePartnerAssetAccessBodyAccessesInner} The populated <code>DeletePartnerAssetAccessBodyAccessesInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DeletePartnerAssetAccessBodyAccessesInner();

            if (data.hasOwnProperty('partner_id')) {
                obj['partner_id'] = ApiClient.convertToType(data['partner_id'], 'String');
            }
            if (data.hasOwnProperty('asset_id')) {
                obj['asset_id'] = ApiClient.convertToType(data['asset_id'], 'String');
            }
            if (data.hasOwnProperty('partner_type')) {
                obj['partner_type'] = ApiClient.convertToType(data['partner_type'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>DeletePartnerAssetAccessBodyAccessesInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DeletePartnerAssetAccessBodyAccessesInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of DeletePartnerAssetAccessBodyAccessesInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['partner_id'] && !(typeof data['partner_id'] === 'string' || data['partner_id'] instanceof String)) {
            throw new Error("Expected the field `partner_id` to be a primitive type in the JSON string but got " + data['partner_id']);
        }
        // ensure the json data is a string
        if (data['asset_id'] && !(typeof data['asset_id'] === 'string' || data['asset_id'] instanceof String)) {
            throw new Error("Expected the field `asset_id` to be a primitive type in the JSON string but got " + data['asset_id']);
        }
        // ensure the json data is a string
        if (data['partner_type'] && !(typeof data['partner_type'] === 'string' || data['partner_type'] instanceof String)) {
            throw new Error("Expected the field `partner_type` to be a primitive type in the JSON string but got " + data['partner_type']);
        }

        return true;
    }


}

DeletePartnerAssetAccessBodyAccessesInner.RequiredProperties = ["partner_id", "asset_id"];

/**
 * Unique identifier of a business partner to update asset access to.
 * @member {String} partner_id
 */
DeletePartnerAssetAccessBodyAccessesInner.prototype['partner_id'] = undefined;

/**
 * Unique identifier of the business asset.
 * @member {String} asset_id
 */
DeletePartnerAssetAccessBodyAccessesInner.prototype['asset_id'] = undefined;

/**
 * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
 * @member {module:model/DeletePartnerAssetAccessBodyAccessesInner.PartnerTypeEnum} partner_type
 * @default 'INTERNAL'
 */
DeletePartnerAssetAccessBodyAccessesInner.prototype['partner_type'] = 'INTERNAL';





/**
 * Allowed values for the <code>partner_type</code> property.
 * @enum {String}
 * @readonly
 */
DeletePartnerAssetAccessBodyAccessesInner['PartnerTypeEnum'] = {

    /**
     * value: "INTERNAL"
     * @const
     */
    "INTERNAL": "INTERNAL",

    /**
     * value: "EXTERNAL"
     * @const
     */
    "EXTERNAL": "EXTERNAL"
};



export default DeletePartnerAssetAccessBodyAccessesInner;

