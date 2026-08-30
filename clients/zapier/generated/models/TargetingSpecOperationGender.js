const utils = require('../utils/utils');
const TargetingSpecGender = require('../models/TargetingSpecGender');
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
                    'GENDER',
                ],
            },
            {
                key: `${keyPrefix}operation`,
                ...TargetingSpecListOperation.fields(`${keyPrefix}operation`, isInput),
            },
            {
                key: `${keyPrefix}values`,
                list: true,
                type: 'string',
                ...TargetingSpecGender.fields(`${keyPrefix}values`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'field': bundle.inputData?.[`${keyPrefix}field`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, TargetingSpecGender),
        }
    },
}
