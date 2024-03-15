const utils = require('../utils/utils');
const IntegrationLogClientError = require('../models/IntegrationLogClientError');
const IntegrationLogClientRequest = require('../models/IntegrationLogClientRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}client_timestamp`,
                label: `Timestamp in milliseconds of when the log was executed at the client. - [${labelPrefix}client_timestamp]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}event_type`,
                label: `Log event type - [${labelPrefix}event_type]`,
                required: true,
                type: 'string',
                choices: [
                    'APP',
                    'API',
                ],
            },
            {
                key: `${keyPrefix}log_level`,
                label: `Log level type - [${labelPrefix}log_level]`,
                required: true,
                type: 'string',
                choices: [
                    'INFO',
                    'WARN',
                    'ERROR',
                ],
            },
            {
                key: `${keyPrefix}external_business_id`,
                label: `[${labelPrefix}external_business_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}advertiser_id`,
                label: `[${labelPrefix}advertiser_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}merchant_id`,
                label: `[${labelPrefix}merchant_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tag_id`,
                label: `[${labelPrefix}tag_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}feed_profile_id`,
                label: `[${labelPrefix}feed_profile_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `Explanation of the event that occured. - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_version_number`,
                label: `Version number of the integration application. - [${labelPrefix}app_version_number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}platform_version_number`,
                label: `Version number of the platform the integration application is running on. - [${labelPrefix}platform_version_number]`,
                type: 'string',
            },
            ...IntegrationLogClientError.fields(`${keyPrefix}error`, isInput),
            ...IntegrationLogClientRequest.fields(`${keyPrefix}request`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'client_timestamp': bundle.inputData?.[`${keyPrefix}client_timestamp`],
            'event_type': bundle.inputData?.[`${keyPrefix}event_type`],
            'log_level': bundle.inputData?.[`${keyPrefix}log_level`],
            'external_business_id': bundle.inputData?.[`${keyPrefix}external_business_id`],
            'advertiser_id': bundle.inputData?.[`${keyPrefix}advertiser_id`],
            'merchant_id': bundle.inputData?.[`${keyPrefix}merchant_id`],
            'tag_id': bundle.inputData?.[`${keyPrefix}tag_id`],
            'feed_profile_id': bundle.inputData?.[`${keyPrefix}feed_profile_id`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'app_version_number': bundle.inputData?.[`${keyPrefix}app_version_number`],
            'platform_version_number': bundle.inputData?.[`${keyPrefix}platform_version_number`],
            'error': utils.removeIfEmpty(IntegrationLogClientError.mapping(bundle, `${keyPrefix}error`)),
            'request': utils.removeIfEmpty(IntegrationLogClientRequest.mapping(bundle, `${keyPrefix}request`)),
        }
    },
}
