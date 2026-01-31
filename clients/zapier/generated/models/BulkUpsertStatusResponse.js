const utils = require('../utils/utils');
const BulkUpsertStatus = require('../models/BulkUpsertStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}result_url`,
                label: `[${labelPrefix}result_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...BulkUpsertStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'result_url': bundle.inputData?.[`${keyPrefix}result_url`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
