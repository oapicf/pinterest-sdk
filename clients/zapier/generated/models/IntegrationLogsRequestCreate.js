const utils = require('../utils/utils');
const IntegrationLog = require('../models/IntegrationLog');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}logs`,
                label: `[${labelPrefix}logs]`,
                children: IntegrationLog.fields(`${keyPrefix}logs${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'logs': utils.childMapping(bundle.inputData?.[`${keyPrefix}logs`], `${keyPrefix}logs`, IntegrationLog),
        }
    },
}
