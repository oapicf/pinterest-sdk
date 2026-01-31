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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'owner_user_id': bundle.inputData?.[`${keyPrefix}owner_user_id`],
        }
    },
}
