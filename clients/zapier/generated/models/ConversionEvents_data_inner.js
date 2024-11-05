const utils = require('../utils/utils');
const ConversionEventsUserData = require('../models/ConversionEventsUserData');
const ConversionEvents_data_inner_custom_data = require('../models/ConversionEvents_data_inner_custom_data');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event_name`,
                label: `<p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p>  - [${labelPrefix}event_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}action_source`,
                label: `<p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p>  - [${labelPrefix}action_source]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}event_time`,
                label: `The time when the event happened. Unix timestamp in seconds. - [${labelPrefix}event_time]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}event_id`,
                label: `A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. - [${labelPrefix}event_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}event_source_url`,
                label: `URL of the web conversion event. - [${labelPrefix}event_source_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}opt_out`,
                label: `When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. - [${labelPrefix}opt_out]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}partner_name`,
                label: `The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ - [${labelPrefix}partner_name]`,
                type: 'string',
            },
            ...ConversionEventsUserData.fields(`${keyPrefix}user_data`, isInput),
            ...ConversionEvents_data_inner_custom_data.fields(`${keyPrefix}custom_data`, isInput),
            {
                key: `${keyPrefix}app_id`,
                label: `The app store app ID. - [${labelPrefix}app_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_name`,
                label: `Name of the app. - [${labelPrefix}app_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_version`,
                label: `Version of the app. - [${labelPrefix}app_version]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}device_brand`,
                label: `Brand of the user device. - [${labelPrefix}device_brand]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}device_carrier`,
                label: `User device's mobile carrier. - [${labelPrefix}device_carrier]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}device_model`,
                label: `Model of the user device. - [${labelPrefix}device_model]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}device_type`,
                label: `Type of the user device. - [${labelPrefix}device_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}os_version`,
                label: `Version of the device operating system. - [${labelPrefix}os_version]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}wifi`,
                label: `Whether the event occurred when the user device was connected to wifi. - [${labelPrefix}wifi]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}language`,
                label: `Two-character ISO-639-1 language code indicating the user's language. - [${labelPrefix}language]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event_name': bundle.inputData?.[`${keyPrefix}event_name`],
            'action_source': bundle.inputData?.[`${keyPrefix}action_source`],
            'event_time': bundle.inputData?.[`${keyPrefix}event_time`],
            'event_id': bundle.inputData?.[`${keyPrefix}event_id`],
            'event_source_url': bundle.inputData?.[`${keyPrefix}event_source_url`],
            'opt_out': bundle.inputData?.[`${keyPrefix}opt_out`],
            'partner_name': bundle.inputData?.[`${keyPrefix}partner_name`],
            'user_data': utils.removeIfEmpty(ConversionEventsUserData.mapping(bundle, `${keyPrefix}user_data`)),
            'custom_data': utils.removeIfEmpty(ConversionEvents_data_inner_custom_data.mapping(bundle, `${keyPrefix}custom_data`)),
            'app_id': bundle.inputData?.[`${keyPrefix}app_id`],
            'app_name': bundle.inputData?.[`${keyPrefix}app_name`],
            'app_version': bundle.inputData?.[`${keyPrefix}app_version`],
            'device_brand': bundle.inputData?.[`${keyPrefix}device_brand`],
            'device_carrier': bundle.inputData?.[`${keyPrefix}device_carrier`],
            'device_model': bundle.inputData?.[`${keyPrefix}device_model`],
            'device_type': bundle.inputData?.[`${keyPrefix}device_type`],
            'os_version': bundle.inputData?.[`${keyPrefix}os_version`],
            'wifi': bundle.inputData?.[`${keyPrefix}wifi`],
            'language': bundle.inputData?.[`${keyPrefix}language`],
        }
    },
}
