const utils = require('../utils/utils');
const AdCommon_tracking_urls = require('../models/AdCommon_tracking_urls');
const CreativeType = require('../models/CreativeType');
const EntityStatus = require('../models/EntityStatus');
const PinPromotionSummaryStatus = require('../models/PinPromotionSummaryStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_group_id`,
                label: `ID of the ad group that contains the ad. - [${labelPrefix}ad_group_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}android_deep_link`,
                label: `Deep link URL for Android devices. Not currently available. Using this field will generate an error. - [${labelPrefix}android_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_android_deep_links`,
                label: `Comma-separated deep links for the carousel pin on Android. - [${labelPrefix}carousel_android_deep_links]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_destination_urls`,
                label: `Comma-separated destination URLs for the carousel pin to promote. - [${labelPrefix}carousel_destination_urls]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}carousel_ios_deep_links`,
                label: `Comma-separated deep links for the carousel pin on iOS. - [${labelPrefix}carousel_ios_deep_links]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}click_tracking_url`,
                label: `Tracking url for the ad clicks. - [${labelPrefix}click_tracking_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_type`,
                ...CreativeType.fields(`${keyPrefix}creative_type`, isInput),
            },
            {
                key: `${keyPrefix}destination_url`,
                label: `Destination URL. - [${labelPrefix}destination_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ios_deep_link`,
                label: `Deep link URL for iOS devices. Not currently available. Using this field will generate an error. - [${labelPrefix}ios_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_pin_deleted`,
                label: `Is original pin deleted? - [${labelPrefix}is_pin_deleted]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_removable`,
                label: `Is pin repinnable? - [${labelPrefix}is_removable]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}name`,
                label: `Name of the ad - 255 chars max. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pin_id`,
                label: `Pin ID. - [${labelPrefix}pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            ...AdCommon_tracking_urls.fields(`${keyPrefix}tracking_urls`, isInput),
            {
                key: `${keyPrefix}view_tracking_url`,
                label: `Tracking URL for ad impressions. - [${labelPrefix}view_tracking_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The ID of the advertiser that this ad belongs to. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_id`,
                label: `ID of the ad campaign that contains this ad. - [${labelPrefix}campaign_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}collection_items_destination_url_template`,
                label: `Destination URL template for all items within a collections drawer. - [${labelPrefix}collection_items_destination_url_template]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Pin creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `The ID of this ad. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}rejected_reasons`,
                label: `Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". - [${labelPrefix}rejected_reasons]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}rejection_labels`,
                label: `Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". - [${labelPrefix}rejection_labels]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}review_status`,
                label: `Ad review status - [${labelPrefix}review_status]`,
                type: 'string',
                choices: [
                    'OTHER',
                    'PENDING',
                    'REJECTED',
                    'APPROVED',
                ],
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"ad\". - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Last update time. Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}summary_status`,
                ...PinPromotionSummaryStatus.fields(`${keyPrefix}summary_status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'android_deep_link': bundle.inputData?.[`${keyPrefix}android_deep_link`],
            'carousel_android_deep_links': bundle.inputData?.[`${keyPrefix}carousel_android_deep_links`],
            'carousel_destination_urls': bundle.inputData?.[`${keyPrefix}carousel_destination_urls`],
            'carousel_ios_deep_links': bundle.inputData?.[`${keyPrefix}carousel_ios_deep_links`],
            'click_tracking_url': bundle.inputData?.[`${keyPrefix}click_tracking_url`],
            'creative_type': bundle.inputData?.[`${keyPrefix}creative_type`],
            'destination_url': bundle.inputData?.[`${keyPrefix}destination_url`],
            'ios_deep_link': bundle.inputData?.[`${keyPrefix}ios_deep_link`],
            'is_pin_deleted': bundle.inputData?.[`${keyPrefix}is_pin_deleted`],
            'is_removable': bundle.inputData?.[`${keyPrefix}is_removable`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'tracking_urls': utils.removeIfEmpty(AdCommon_tracking_urls.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'view_tracking_url': bundle.inputData?.[`${keyPrefix}view_tracking_url`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'collection_items_destination_url_template': bundle.inputData?.[`${keyPrefix}collection_items_destination_url_template`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'rejected_reasons': bundle.inputData?.[`${keyPrefix}rejected_reasons`],
            'rejection_labels': bundle.inputData?.[`${keyPrefix}rejection_labels`],
            'review_status': bundle.inputData?.[`${keyPrefix}review_status`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'summary_status': bundle.inputData?.[`${keyPrefix}summary_status`],
        }
    },
}
