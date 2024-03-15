const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`,
                label: `We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. - [${labelPrefix}ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`,
                label: `Additional image files are unreadable. Please upload new files to continue. - [${labelPrefix}ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ADDITIONAL_IMAGE_MALFORMED_URL`,
                label: `Additional image files are unreadable. Please check your link and upload new files to continue. - [${labelPrefix}ADDITIONAL_IMAGE_MALFORMED_URL]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ADDITIONAL_IMAGE_FILE_NOT_FOUND`,
                label: `Additional image files are unreadable. Please upload new files to continue. - [${labelPrefix}ADDITIONAL_IMAGE_FILE_NOT_FOUND]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ADDITIONAL_IMAGE_INVALID_FILE`,
                label: `Additional image files are unreadable. Please upload new files to continue. - [${labelPrefix}ADDITIONAL_IMAGE_INVALID_FILE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}HOTEL_PRICE_HEADER_IS_PRESENT`,
                label: `price is not a supported column. Use base_price and sale_price instead. - [${labelPrefix}HOTEL_PRICE_HEADER_IS_PRESENT]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR': bundle.inputData?.[`${keyPrefix}ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`],
            'ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE': bundle.inputData?.[`${keyPrefix}ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`],
            'ADDITIONAL_IMAGE_MALFORMED_URL': bundle.inputData?.[`${keyPrefix}ADDITIONAL_IMAGE_MALFORMED_URL`],
            'ADDITIONAL_IMAGE_FILE_NOT_FOUND': bundle.inputData?.[`${keyPrefix}ADDITIONAL_IMAGE_FILE_NOT_FOUND`],
            'ADDITIONAL_IMAGE_INVALID_FILE': bundle.inputData?.[`${keyPrefix}ADDITIONAL_IMAGE_INVALID_FILE`],
            'HOTEL_PRICE_HEADER_IS_PRESENT': bundle.inputData?.[`${keyPrefix}HOTEL_PRICE_HEADER_IS_PRESENT`],
        }
    },
}
