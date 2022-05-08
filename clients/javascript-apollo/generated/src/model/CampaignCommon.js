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
import EntityStatus from './EntityStatus';
import TrackingUrls from './TrackingUrls';

/**
 * The CampaignCommon model module.
 * @module model/CampaignCommon
 * @version 5.3.0
 */
class CampaignCommon {
    /**
     * @member {String} ad_account_id
     * @type {String}
     */
    ad_account_id;
    /**
     * @member {String} name
     * @type {String}
     */
    name;
    /**
     * @member {EntityStatus} status
     * @type {EntityStatus}
     * @default 'ACTIVE'
     */
    status = 'ACTIVE';
    /**
     * @member {Number} lifetime_spend_cap
     * @type {Number}
     */
    lifetime_spend_cap;
    /**
     * @member {Number} daily_spend_cap
     * @type {Number}
     */
    daily_spend_cap;
    /**
     * @member {String} order_line_id
     * @type {String}
     */
    order_line_id;
    /**
     * @member {TrackingUrls} tracking_urls
     * @type {TrackingUrls}
     */
    tracking_urls;
    /**
     * @member {Number} start_time
     * @type {Number}
     */
    start_time;
    /**
     * @member {Number} end_time
     * @type {Number}
     */
    end_time;

    

    /**
     * Constructs a new <code>CampaignCommon</code>.
     * Campaign Data
     * @alias module:model/CampaignCommon
     * @param adAccountId {String} Campaign's Advertiser ID.
     */
    constructor(adAccountId) { 
        
        CampaignCommon.initialize(this, adAccountId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, adAccountId) { 
        obj['ad_account_id'] = adAccountId;
    }

    /**
     * Constructs a <code>CampaignCommon</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CampaignCommon} obj Optional instance to populate.
     * @return {module:model/CampaignCommon} The populated <code>CampaignCommon</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CampaignCommon();

            if (data.hasOwnProperty('ad_account_id')) {
                obj['ad_account_id'] = ApiClient.convertToType(data['ad_account_id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], EntityStatus);
            }
            if (data.hasOwnProperty('lifetime_spend_cap')) {
                obj['lifetime_spend_cap'] = ApiClient.convertToType(data['lifetime_spend_cap'], 'Number');
            }
            if (data.hasOwnProperty('daily_spend_cap')) {
                obj['daily_spend_cap'] = ApiClient.convertToType(data['daily_spend_cap'], 'Number');
            }
            if (data.hasOwnProperty('order_line_id')) {
                obj['order_line_id'] = ApiClient.convertToType(data['order_line_id'], 'String');
            }
            if (data.hasOwnProperty('tracking_urls')) {
                obj['tracking_urls'] = ApiClient.convertToType(data['tracking_urls'], TrackingUrls);
            }
            if (data.hasOwnProperty('start_time')) {
                obj['start_time'] = ApiClient.convertToType(data['start_time'], 'Number');
            }
            if (data.hasOwnProperty('end_time')) {
                obj['end_time'] = ApiClient.convertToType(data['end_time'], 'Number');
            }
        }
        return obj;
    }
}



export default CampaignCommon;
