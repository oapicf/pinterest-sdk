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
import CampaignCommon from './CampaignCommon';
import CampaignId from './CampaignId';
import CampaignSummaryStatus from './CampaignSummaryStatus';
import EntityStatus from './EntityStatus';
import ObjectiveType from './ObjectiveType';
import TrackingUrls from './TrackingUrls';

/**
 * The CampaignResponse model module.
 * @module model/CampaignResponse
 * @version 1.1.1-pre.0
 */
class CampaignResponse {
    /**
     * Constructs a new <code>CampaignResponse</code>.
     * @alias module:model/CampaignResponse
     * @implements module:model/CampaignId
     * @implements module:model/CampaignCommon
     */
    constructor() { 
        CampaignId.initialize(this);CampaignCommon.initialize(this);
        CampaignResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CampaignResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CampaignResponse} obj Optional instance to populate.
     * @return {module:model/CampaignResponse} The populated <code>CampaignResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CampaignResponse();
            CampaignId.constructFromObject(data, obj);
            CampaignCommon.constructFromObject(data, obj);

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
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
            if (data.hasOwnProperty('is_flexible_daily_budgets')) {
                obj['is_flexible_daily_budgets'] = ApiClient.convertToType(data['is_flexible_daily_budgets'], 'Boolean');
            }
            if (data.hasOwnProperty('objective_type')) {
                obj['objective_type'] = ObjectiveType.constructFromObject(data['objective_type']);
            }
            if (data.hasOwnProperty('created_time')) {
                obj['created_time'] = ApiClient.convertToType(data['created_time'], 'Number');
            }
            if (data.hasOwnProperty('updated_time')) {
                obj['updated_time'] = ApiClient.convertToType(data['updated_time'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('is_campaign_budget_optimization')) {
                obj['is_campaign_budget_optimization'] = ApiClient.convertToType(data['is_campaign_budget_optimization'], 'Boolean');
            }
            if (data.hasOwnProperty('summary_status')) {
                obj['summary_status'] = CampaignSummaryStatus.constructFromObject(data['summary_status']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CampaignResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CampaignResponse</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['ad_account_id'] && !(typeof data['ad_account_id'] === 'string' || data['ad_account_id'] instanceof String)) {
            throw new Error("Expected the field `ad_account_id` to be a primitive type in the JSON string but got " + data['ad_account_id']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['order_line_id'] && !(typeof data['order_line_id'] === 'string' || data['order_line_id'] instanceof String)) {
            throw new Error("Expected the field `order_line_id` to be a primitive type in the JSON string but got " + data['order_line_id']);
        }
        // validate the optional field `tracking_urls`
        if (data['tracking_urls']) { // data not null
          TrackingUrls.validateJSON(data['tracking_urls']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }

        return true;
    }


}



/**
 * Campaign ID.
 * @member {String} id
 */
CampaignResponse.prototype['id'] = undefined;

/**
 * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @member {String} ad_account_id
 */
CampaignResponse.prototype['ad_account_id'] = undefined;

/**
 * Campaign name.
 * @member {String} name
 */
CampaignResponse.prototype['name'] = undefined;

/**
 * @member {module:model/EntityStatus} status
 */
CampaignResponse.prototype['status'] = undefined;

/**
 * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @member {Number} lifetime_spend_cap
 */
CampaignResponse.prototype['lifetime_spend_cap'] = undefined;

/**
 * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @member {Number} daily_spend_cap
 */
CampaignResponse.prototype['daily_spend_cap'] = undefined;

/**
 * Order line ID that appears on the invoice.
 * @member {String} order_line_id
 */
CampaignResponse.prototype['order_line_id'] = undefined;

/**
 * @member {module:model/TrackingUrls} tracking_urls
 */
CampaignResponse.prototype['tracking_urls'] = undefined;

/**
 * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @member {Number} start_time
 */
CampaignResponse.prototype['start_time'] = undefined;

/**
 * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @member {Number} end_time
 */
CampaignResponse.prototype['end_time'] = undefined;

/**
 * Determine if a campaign has flexible daily budgets setup.
 * @member {Boolean} is_flexible_daily_budgets
 */
CampaignResponse.prototype['is_flexible_daily_budgets'] = undefined;

/**
 * @member {module:model/ObjectiveType} objective_type
 */
CampaignResponse.prototype['objective_type'] = undefined;

/**
 * Campaign creation time. Unix timestamp in seconds.
 * @member {Number} created_time
 */
CampaignResponse.prototype['created_time'] = undefined;

/**
 * UTC timestamp. Last update time.
 * @member {Number} updated_time
 */
CampaignResponse.prototype['updated_time'] = undefined;

/**
 * Always \"campaign\".
 * @member {String} type
 */
CampaignResponse.prototype['type'] = undefined;

/**
 * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 * @member {Boolean} is_campaign_budget_optimization
 */
CampaignResponse.prototype['is_campaign_budget_optimization'] = undefined;

/**
 * @member {module:model/CampaignSummaryStatus} summary_status
 */
CampaignResponse.prototype['summary_status'] = undefined;


// Implement CampaignId interface:
/**
 * Campaign ID.
 * @member {String} id
 */
CampaignId.prototype['id'] = undefined;
// Implement CampaignCommon interface:
/**
 * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @member {String} ad_account_id
 */
CampaignCommon.prototype['ad_account_id'] = undefined;
/**
 * Campaign name.
 * @member {String} name
 */
CampaignCommon.prototype['name'] = undefined;
/**
 * @member {module:model/EntityStatus} status
 */
CampaignCommon.prototype['status'] = undefined;
/**
 * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @member {Number} lifetime_spend_cap
 */
CampaignCommon.prototype['lifetime_spend_cap'] = undefined;
/**
 * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @member {Number} daily_spend_cap
 */
CampaignCommon.prototype['daily_spend_cap'] = undefined;
/**
 * Order line ID that appears on the invoice.
 * @member {String} order_line_id
 */
CampaignCommon.prototype['order_line_id'] = undefined;
/**
 * @member {module:model/TrackingUrls} tracking_urls
 */
CampaignCommon.prototype['tracking_urls'] = undefined;
/**
 * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @member {Number} start_time
 */
CampaignCommon.prototype['start_time'] = undefined;
/**
 * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @member {Number} end_time
 */
CampaignCommon.prototype['end_time'] = undefined;
/**
 * Determine if a campaign has flexible daily budgets setup.
 * @member {Boolean} is_flexible_daily_budgets
 */
CampaignCommon.prototype['is_flexible_daily_budgets'] = undefined;




export default CampaignResponse;

