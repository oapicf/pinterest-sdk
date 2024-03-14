const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}IMAGE_DOWNLOAD_ERROR`,
                label: `Some items include images that can't be found. - [${labelPrefix}IMAGE_DOWNLOAD_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}LINE_LEVEL_INTERNAL_ERROR`,
                label: `We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. - [${labelPrefix}LINE_LEVEL_INTERNAL_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}LARGE_PRODUCT_COUNT_DECREASE`,
                label: `The product count has decreased by more than 99% compared to the last successful ingestion. - [${labelPrefix}LARGE_PRODUCT_COUNT_DECREASE]`,
                type: 'integer',
                choices: [
                    '1',
                ],
            },
            {
                key: `${keyPrefix}ACCOUNT_FLAGGED`,
                label: `We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. - [${labelPrefix}ACCOUNT_FLAGGED]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'IMAGE_DOWNLOAD_ERROR': bundle.inputData?.[`${keyPrefix}IMAGE_DOWNLOAD_ERROR`],
            'LINE_LEVEL_INTERNAL_ERROR': bundle.inputData?.[`${keyPrefix}LINE_LEVEL_INTERNAL_ERROR`],
            'LARGE_PRODUCT_COUNT_DECREASE': bundle.inputData?.[`${keyPrefix}LARGE_PRODUCT_COUNT_DECREASE`],
            'ACCOUNT_FLAGGED': bundle.inputData?.[`${keyPrefix}ACCOUNT_FLAGGED`],
        }
    },
}
