const utils = require('../utils/utils');
const BulkReportingJobStatus = require('../models/BulkReportingJobStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}report_status`,
                ...BulkReportingJobStatus.fields(`${keyPrefix}report_status`, isInput),
            },
            {
                key: `${keyPrefix}token`,
                label: `[${labelPrefix}token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `[${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `[${labelPrefix}status]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'report_status': bundle.inputData?.[`${keyPrefix}report_status`],
            'token': bundle.inputData?.[`${keyPrefix}token`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
