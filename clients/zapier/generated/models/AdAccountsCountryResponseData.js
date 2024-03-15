const utils = require('../utils/utils');
const AdCountry = require('../models/AdCountry');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                ...AdCountry.fields(`${keyPrefix}code`, isInput),
            },
            {
                key: `${keyPrefix}currency`,
                label: `Country currency. - [${labelPrefix}currency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}index`,
                label: `Country index - [${labelPrefix}index]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Country name - [${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
