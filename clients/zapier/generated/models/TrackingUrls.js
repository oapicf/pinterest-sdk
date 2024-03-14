const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}impression`,
                label: `[${labelPrefix}impression]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}click`,
                label: `[${labelPrefix}click]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}engagement`,
                label: `[${labelPrefix}engagement]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}buyable_button`,
                label: `[${labelPrefix}buyable_button]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}audience_verification`,
                label: `[${labelPrefix}audience_verification]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'impression': bundle.inputData?.[`${keyPrefix}impression`],
            'click': bundle.inputData?.[`${keyPrefix}click`],
            'engagement': bundle.inputData?.[`${keyPrefix}engagement`],
            'buyable_button': bundle.inputData?.[`${keyPrefix}buyable_button`],
            'audience_verification': bundle.inputData?.[`${keyPrefix}audience_verification`],
        }
    },
}
