const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `raw string name of the event, usually logged as raw_event_name in our dataset - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}mapped_conversion_type`,
                label: `standard type mapped to ADE for optimization - [${labelPrefix}mapped_conversion_type]`,
                type: 'string',
                choices: [
                    'PAGE_LOAD',
                    'UNKNOWN',
                    'INITIALIZED',
                    'PAGE_VISIT',
                    'SIGNUP',
                    'CHECKOUT',
                    'CUSTOM',
                    'VIEW_CATEGORY',
                    'SEARCH',
                    'ADD_TO_CART',
                    'WATCH_VIDEO',
                    'LEAD',
                    'APP_INSTALL',
                    'WEB_SESSION',
                    'EXTERNAL_MEASUREMENT',
                    'ADD_PAYMENT_INFO',
                    'ADD_TO_WISHLIST',
                    'INITIATE_CHECKOUT',
                    'SUBSCRIBE',
                    'VIEW_CONTENT',
                    'ADVERTISER_DEFINED_EVENT',
                    'APP_OPEN',
                    'CONTACT',
                    'SCHEDULE',
                    'FIND_LOCATION',
                    'CUSTOMIZE_PRODUCT',
                    'SUBMIT_APPLICATION',
                    'START_TRIAL',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'mapped_conversion_type': bundle.inputData?.[`${keyPrefix}mapped_conversion_type`],
        }
    },
}
