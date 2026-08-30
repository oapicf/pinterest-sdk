const utils = require('../utils/utils');
const TargetingSpecListOperation = require('../models/TargetingSpecListOperation');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}field`,
                label: `[${labelPrefix}field]`,
                required: true,
                type: 'string',
                choices: [
                    'INTEREST',
                ],
            },
            {
                key: `${keyPrefix}operation`,
                ...TargetingSpecListOperation.fields(`${keyPrefix}operation`, isInput),
            },
            {
                key: `${keyPrefix}values`,
                label: `[${labelPrefix}values]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'field': bundle.inputData?.[`${keyPrefix}field`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'values': bundle.inputData?.[`${keyPrefix}values`],
        }
    },
}
