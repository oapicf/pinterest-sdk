const utils = require('../utils/utils');
const AdCommon_tracking_urls = require('../models/AdCommon_tracking_urls');
const CreativeType = require('../models/CreativeType');
const EntityStatus = require('../models/EntityStatus');

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
                key: `${keyPrefix}id`,
                label: `The ID of this ad. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
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
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
