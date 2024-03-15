const utils = require('../utils/utils');
const Gender = require('../models/Gender');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}values`,
                list: true,
                type: 'string',
                ...Gender.fields(`${keyPrefix}values`, isInput),
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
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, Gender),
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
        }
    },
}
