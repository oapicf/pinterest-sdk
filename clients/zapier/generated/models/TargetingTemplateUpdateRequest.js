const utils = require('../utils/utils');
const TargetingSpec = require('../models/TargetingSpec');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Targeting template ID - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation_type`,
                label: `[${labelPrefix}operation_type]`,
                required: true,
                type: 'string',
                choices: [
                    'REMOVE',
                    'UPDATE',
                ],
            },
            ...TargetingSpec.fields(`${keyPrefix}targeting_attributes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'operation_type': bundle.inputData?.[`${keyPrefix}operation_type`],
            'targeting_attributes': utils.removeIfEmpty(TargetingSpec.mapping(bundle, `${keyPrefix}targeting_attributes`)),
        }
    },
}
