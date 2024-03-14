const utils = require('../utils/utils');
const Ad_account_owner = require('../models/Ad_account_owner');
const Country = require('../models/Country');
const Currency = require('../models/Currency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                type: 'string',
            },
            ...Ad_account_owner.fields(`${keyPrefix}owner`, isInput),
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}currency`,
                ...Currency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}permissions`,
                label: `[${labelPrefix}permissions]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'owner': utils.removeIfEmpty(Ad_account_owner.mapping(bundle, `${keyPrefix}owner`)),
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'permissions': bundle.inputData?.[`${keyPrefix}permissions`],
        }
    },
}