const utils = require('../utils/utils');
const CreateAssetAccessRequestErrorMessage_inner = require('../models/CreateAssetAccessRequestErrorMessage_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: CreateAssetAccessRequestErrorMessage_inner.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}invites`,
                label: `[${labelPrefix}invites]`,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, CreateAssetAccessRequestErrorMessage_inner),
            'invites': bundle.inputData?.[`${keyPrefix}invites`],
        }
    },
}
