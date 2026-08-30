const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}exceptions`,
                label: `List of exception messages if the operation failed - [${labelPrefix}exceptions]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Name of the advertiser defined event - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `Processing status (success or failure) - [${labelPrefix}status]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exceptions': bundle.inputData?.[`${keyPrefix}exceptions`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
