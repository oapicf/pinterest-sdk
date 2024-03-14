const utils = require('../utils/utils');
const BulkUpsertStatus = require('../models/BulkUpsertStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                ...BulkUpsertStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}result_url`,
                label: `[${labelPrefix}result_url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'result_url': bundle.inputData?.[`${keyPrefix}result_url`],
        }
    },
}
