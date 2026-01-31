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
                key: `${keyPrefix}template_id`,
                label: `Unique identifier of a template. - [${labelPrefix}template_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}token`,
                label: `[${labelPrefix}token]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'report_status': bundle.inputData?.[`${keyPrefix}report_status`],
            'template_id': bundle.inputData?.[`${keyPrefix}template_id`],
            'token': bundle.inputData?.[`${keyPrefix}token`],
        }
    },
}
