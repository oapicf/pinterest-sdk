const utils = require('../utils/utils');
const AdAccountOwner = require('../models/AdAccountOwner');
const BusinessAccessRole = require('../models/BusinessAccessRole');
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
                key: `${keyPrefix}created_time`,
                label: ` Creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}currency`,
                ...Currency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Ad account name. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...AdAccountOwner.fields(`${keyPrefix}owner`, isInput),
            {
                key: `${keyPrefix}permissions`,
                list: true,
                type: 'string',
                ...BusinessAccessRole.fields(`${keyPrefix}permissions`, isInput),
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `[${labelPrefix}updated_time]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'owner': utils.removeIfEmpty(AdAccountOwner.mapping(bundle, `${keyPrefix}owner`)),
            'permissions': utils.childMapping(bundle.inputData?.[`${keyPrefix}permissions`], `${keyPrefix}permissions`, BusinessAccessRole),
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
        }
    },
}
