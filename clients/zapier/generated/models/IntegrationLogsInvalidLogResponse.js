const utils = require('../utils/utils');
const IntegrationLogsInvalidLogResponseRejectedLogsItems = require('../models/IntegrationLogsInvalidLogResponseRejectedLogsItems');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}rejected_logs`,
                label: `[${labelPrefix}rejected_logs]`,
                children: IntegrationLogsInvalidLogResponseRejectedLogsItems.fields(`${keyPrefix}rejected_logs${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'rejected_logs': utils.childMapping(bundle.inputData?.[`${keyPrefix}rejected_logs`], `${keyPrefix}rejected_logs`, IntegrationLogsInvalidLogResponseRejectedLogsItems),
        }
    },
}
