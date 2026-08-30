const utils = require('../utils/utils');
const TargetingSpecAppType = require('../models/TargetingSpecAppType');
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
                    'APPTYPE',
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
                ...TargetingSpecAppType.fields(`${keyPrefix}values`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'field': bundle.inputData?.[`${keyPrefix}field`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, TargetingSpecAppType),
        }
    },
}
