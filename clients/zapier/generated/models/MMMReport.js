const utils = require('../utils/utils');
const BulkReportingJobStatus = require('../models/BulkReportingJobStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}message`,
                label: `[${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}report_status`,
                ...BulkReportingJobStatus.fields(`${keyPrefix}report_status`, isInput),
            },
            {
                key: `${keyPrefix}size`,
                label: `[${labelPrefix}size]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}status`,
                label: `[${labelPrefix}status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}token`,
                label: `[${labelPrefix}token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'report_status': bundle.inputData?.[`${keyPrefix}report_status`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'token': bundle.inputData?.[`${keyPrefix}token`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
        }
    },
}
