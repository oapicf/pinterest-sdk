const utils = require('../utils/utils');
const WebsiteVerificationMethod = require('../models/WebsiteVerificationMethod');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}verification_method`,
                ...WebsiteVerificationMethod.fields(`${keyPrefix}verification_method`, isInput),
            },
            {
                key: `${keyPrefix}website`,
                label: `Website with path or domain only - [${labelPrefix}website]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'verification_method': bundle.inputData?.[`${keyPrefix}verification_method`],
            'website': bundle.inputData?.[`${keyPrefix}website`],
        }
    },
}
