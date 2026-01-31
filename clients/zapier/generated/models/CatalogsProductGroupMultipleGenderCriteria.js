const utils = require('../utils/utils');
const Gender = require('../models/Gender');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}values`,
                list: true,
                type: 'string',
                ...Gender.fields(`${keyPrefix}values`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, Gender),
        }
    },
}
