const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}x-amz-date`,
                label: `[${labelPrefix}x-amz-date]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-signature`,
                label: `[${labelPrefix}x-amz-signature]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-security-token`,
                label: `[${labelPrefix}x-amz-security-token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}x-amz-algorithm`,
                label: `[${labelPrefix}x-amz-algorithm]`,
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
                key: `${keyPrefix}x-amz-credential`,
                label: `[${labelPrefix}x-amz-credential]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}Content-Type`,
                label: `[${labelPrefix}Content-Type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'x-amz-date': bundle.inputData?.[`${keyPrefix}x-amz-date`],
            'x-amz-signature': bundle.inputData?.[`${keyPrefix}x-amz-signature`],
            'x-amz-security-token': bundle.inputData?.[`${keyPrefix}x-amz-security-token`],
            'x-amz-algorithm': bundle.inputData?.[`${keyPrefix}x-amz-algorithm`],
            'key': bundle.inputData?.[`${keyPrefix}key`],
            'policy': bundle.inputData?.[`${keyPrefix}policy`],
            'x-amz-credential': bundle.inputData?.[`${keyPrefix}x-amz-credential`],
            'Content-Type': bundle.inputData?.[`${keyPrefix}Content-Type`],
        }
    },
}
