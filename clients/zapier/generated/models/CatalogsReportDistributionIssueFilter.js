const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_id`,
                label: `Unique identifier of a catalog. If not given, oldest catalog will be used - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}report_type`,
                label: `[${labelPrefix}report_type]`,
                required: true,
                type: 'string',
                choices: [
                    'DISTRIBUTION_ISSUES',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'report_type': bundle.inputData?.[`${keyPrefix}report_type`],
        }
    },
}
