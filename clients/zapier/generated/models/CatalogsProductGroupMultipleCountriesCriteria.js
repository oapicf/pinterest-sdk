const utils = require('../utils/utils');
const Country = require('../models/Country');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}values`,
                list: true,
                type: 'string',
                ...Country.fields(`${keyPrefix}values`, isInput),
            },
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, Country),
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
        }
    },
}
