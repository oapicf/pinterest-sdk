const utils = require('../utils/utils');
const IntegrationLogsInvalidLogResponse_rejected_logs_inner = require('../models/IntegrationLogsInvalidLogResponse_rejected_logs_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rejected_logs`,
                label: `[${labelPrefix}rejected_logs]`,
                children: IntegrationLogsInvalidLogResponse_rejected_logs_inner.fields(`${keyPrefix}rejected_logs${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rejected_logs': utils.childMapping(bundle.inputData?.[`${keyPrefix}rejected_logs`], `${keyPrefix}rejected_logs`, IntegrationLogsInvalidLogResponse_rejected_logs_inner),
        }
    },
}
