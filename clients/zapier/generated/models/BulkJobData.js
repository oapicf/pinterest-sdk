const utils = require('../utils/utils');
const BulkRequestStatus = require('../models/BulkRequestStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}result_url`,
                label: `Presigned s3 file url for the bulk request result. - [${labelPrefix}result_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...BulkRequestStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}workload_id`,
                label: `Bulk Workload Id. - [${labelPrefix}workload_id]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'result_url': bundle.inputData?.[`${keyPrefix}result_url`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'workload_id': bundle.inputData?.[`${keyPrefix}workload_id`],
        }
    },
}
