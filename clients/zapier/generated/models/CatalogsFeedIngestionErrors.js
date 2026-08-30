const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ACCOUNT_FLAGGED`,
                label: `We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. - [${labelPrefix}ACCOUNT_FLAGGED]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}FETCH_GOOGLE_SHEET_NOT_SHARED`,
                label: `Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file. - [${labelPrefix}FETCH_GOOGLE_SHEET_NOT_SHARED]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_FILE_NOT_ACCESSIBLE`,
                label: `Image files are unreadable. Please upload new files to continue. - [${labelPrefix}IMAGE_FILE_NOT_ACCESSIBLE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_FILE_NOT_FOUND`,
                label: `Image files are unreadable. Please upload new files to continue. - [${labelPrefix}IMAGE_FILE_NOT_FOUND]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_INVALID_FILE`,
                label: `Image files are unreadable. Please upload new files to continue. - [${labelPrefix}IMAGE_INVALID_FILE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_LEVEL_INTERNAL_ERROR`,
                label: `We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. - [${labelPrefix}IMAGE_LEVEL_INTERNAL_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_MALFORMED_URL`,
                label: `Image files are unreadable. Please check your link and upload new files to continue. - [${labelPrefix}IMAGE_MALFORMED_URL]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}LARGE_PRODUCT_COUNT_DECREASE`,
                label: `The product count has decreased by more than 99% compared to the last successful ingestion. - [${labelPrefix}LARGE_PRODUCT_COUNT_DECREASE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}LINE_LEVEL_INTERNAL_ERROR`,
                label: `We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. - [${labelPrefix}LINE_LEVEL_INTERNAL_ERROR]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ACCOUNT_FLAGGED': bundle.inputData?.[`${keyPrefix}ACCOUNT_FLAGGED`],
            'FETCH_GOOGLE_SHEET_NOT_SHARED': bundle.inputData?.[`${keyPrefix}FETCH_GOOGLE_SHEET_NOT_SHARED`],
            'IMAGE_FILE_NOT_ACCESSIBLE': bundle.inputData?.[`${keyPrefix}IMAGE_FILE_NOT_ACCESSIBLE`],
            'IMAGE_FILE_NOT_FOUND': bundle.inputData?.[`${keyPrefix}IMAGE_FILE_NOT_FOUND`],
            'IMAGE_INVALID_FILE': bundle.inputData?.[`${keyPrefix}IMAGE_INVALID_FILE`],
            'IMAGE_LEVEL_INTERNAL_ERROR': bundle.inputData?.[`${keyPrefix}IMAGE_LEVEL_INTERNAL_ERROR`],
            'IMAGE_MALFORMED_URL': bundle.inputData?.[`${keyPrefix}IMAGE_MALFORMED_URL`],
            'LARGE_PRODUCT_COUNT_DECREASE': bundle.inputData?.[`${keyPrefix}LARGE_PRODUCT_COUNT_DECREASE`],
            'LINE_LEVEL_INTERNAL_ERROR': bundle.inputData?.[`${keyPrefix}LINE_LEVEL_INTERNAL_ERROR`],
        }
    },
}
