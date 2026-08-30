const utils = require('../utils/utils');
const Country = require('../models/Country');
const Currency = require('../models/Currency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}currency`,
                ...Currency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Ad account name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}owner_user_id`,
                label: `Advertiser's owning user ID. - [${labelPrefix}owner_user_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}time_zone`,
                label: `The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. - [${labelPrefix}time_zone]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'owner_user_id': bundle.inputData?.[`${keyPrefix}owner_user_id`],
            'time_zone': bundle.inputData?.[`${keyPrefix}time_zone`],
        }
    },
}
