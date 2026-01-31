const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}Content-Type`,
                label: `[${labelPrefix}Content-Type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}key`,
                label: `[${labelPrefix}key]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}policy`,
                label: `[${labelPrefix}policy]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-algorithm`,
                label: `[${labelPrefix}x-amz-algorithm]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-credential`,
                label: `[${labelPrefix}x-amz-credential]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-date`,
                label: `[${labelPrefix}x-amz-date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-security-token`,
                label: `[${labelPrefix}x-amz-security-token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-signature`,
                label: `[${labelPrefix}x-amz-signature]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'Content-Type': bundle.inputData?.[`${keyPrefix}Content-Type`],
            'key': bundle.inputData?.[`${keyPrefix}key`],
            'policy': bundle.inputData?.[`${keyPrefix}policy`],
            'x-amz-algorithm': bundle.inputData?.[`${keyPrefix}x-amz-algorithm`],
            'x-amz-credential': bundle.inputData?.[`${keyPrefix}x-amz-credential`],
            'x-amz-date': bundle.inputData?.[`${keyPrefix}x-amz-date`],
            'x-amz-security-token': bundle.inputData?.[`${keyPrefix}x-amz-security-token`],
            'x-amz-signature': bundle.inputData?.[`${keyPrefix}x-amz-signature`],
        }
    },
}
