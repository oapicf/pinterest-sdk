const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}FETCH_ERROR`,
                label: `Pinterest couldn't download your feed. - [${labelPrefix}FETCH_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}FETCH_INACTIVE_FEED_ERROR`,
                label: `Your feed wasn't ingested because it hasn’t changed in the previous 90 days. - [${labelPrefix}FETCH_INACTIVE_FEED_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ENCODING_ERROR`,
                label: `Your feed includes data with an unsupported encoding format. - [${labelPrefix}ENCODING_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}DELIMITER_ERROR`,
                label: `Your feed includes data with formatting errors. - [${labelPrefix}DELIMITER_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}REQUIRED_COLUMNS_MISSING`,
                label: `Your feed is missing some required column headers. - [${labelPrefix}REQUIRED_COLUMNS_MISSING]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}DUPLICATE_PRODUCTS`,
                label: `Some products are duplicated. - [${labelPrefix}DUPLICATE_PRODUCTS]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_LINK_INVALID`,
                label: `Some image links are formatted incorrectly. - [${labelPrefix}IMAGE_LINK_INVALID]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ITEMID_MISSING`,
                label: `Some items are missing an item id in their product metadata, those items will not be published. - [${labelPrefix}ITEMID_MISSING]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}TITLE_MISSING`,
                label: `Some items are missing a title in their product metadata, those items will not be published. - [${labelPrefix}TITLE_MISSING]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}DESCRIPTION_MISSING`,
                label: `Some items are missing a description in their product metadata, those items will not be published. - [${labelPrefix}DESCRIPTION_MISSING]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PRODUCT_LINK_MISSING`,
                label: `Some items are missing a link URL in their product metadata, those items will not be published. - [${labelPrefix}PRODUCT_LINK_MISSING]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_LINK_MISSING`,
                label: `Some items are missing an image link URL in their product metadata, those items will not be published. - [${labelPrefix}IMAGE_LINK_MISSING]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}AVAILABILITY_INVALID`,
                label: `Some items are missing an availability value in their product metadata, those items will not be published. - [${labelPrefix}AVAILABILITY_INVALID]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PRODUCT_PRICE_INVALID`,
                label: `Some items have price formatting errors in their product metadata, those items will not be published. - [${labelPrefix}PRODUCT_PRICE_INVALID]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}LINK_FORMAT_INVALID`,
                label: `Some link values are formatted incorrectly. - [${labelPrefix}LINK_FORMAT_INVALID]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PARSE_LINE_ERROR`,
                label: `Your feed contains formatting errors for some items. - [${labelPrefix}PARSE_LINE_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ADWORDS_FORMAT_INVALID`,
                label: `Some adwords links contain too many characters. - [${labelPrefix}ADWORDS_FORMAT_INVALID]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}INTERNAL_SERVICE_ERROR`,
                label: `We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. - [${labelPrefix}INTERNAL_SERVICE_ERROR]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}NO_VERIFIED_DOMAIN`,
                label: `Your merchant domain needs to be claimed. - [${labelPrefix}NO_VERIFIED_DOMAIN]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ADULT_INVALID`,
                label: `Some items have invalid adult values. - [${labelPrefix}ADULT_INVALID]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}IMAGE_LINK_LENGTH_TOO_LONG`,
                label: `Some items have image_link URLs that contain too many characters, so those items will not be published. - [${labelPrefix}IMAGE_LINK_LENGTH_TOO_LONG]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}INVALID_DOMAIN`,
                label: `Some of your product link values don't match the verified domain associated with this account. - [${labelPrefix}INVALID_DOMAIN]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}FEED_LENGTH_TOO_LONG`,
                label: `Your feed contains too many items, some items will not be published. - [${labelPrefix}FEED_LENGTH_TOO_LONG]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}LINK_LENGTH_TOO_LONG`,
                label: `Some product links contain too many characters, those items will not be published. - [${labelPrefix}LINK_LENGTH_TOO_LONG]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}MALFORMED_XML`,
                label: `Your feed couldn't be validated because the xml file is formatted incorrectly. - [${labelPrefix}MALFORMED_XML]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PRICE_MISSING`,
                label: `Some products are missing a price, those items will not be published. - [${labelPrefix}PRICE_MISSING]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}FEED_TOO_SMALL`,
                label: `Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. - [${labelPrefix}FEED_TOO_SMALL]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`,
                label: `Some items exceed the maximum number of items per item group, those items will not be published. - [${labelPrefix}MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`,
                label: `Some items' main images can't be found. - [${labelPrefix}ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PINJOIN_CONTENT_UNSAFE`,
                label: `Some items were not published because they don't meet Pinterest's Merchant Guidelines. - [${labelPrefix}PINJOIN_CONTENT_UNSAFE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}BLOCKLISTED_IMAGE_SIGNATURE`,
                label: `Some items were not published because they don't meet Pinterest's Merchant Guidelines. - [${labelPrefix}BLOCKLISTED_IMAGE_SIGNATURE]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}LIST_PRICE_INVALID`,
                label: `Some items have list price formatting errors in their product metadata, those items will not be published. - [${labelPrefix}LIST_PRICE_INVALID]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}PRICE_CANNOT_BE_DETERMINED`,
                label: `Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. - [${labelPrefix}PRICE_CANNOT_BE_DETERMINED]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'FETCH_ERROR': bundle.inputData?.[`${keyPrefix}FETCH_ERROR`],
            'FETCH_INACTIVE_FEED_ERROR': bundle.inputData?.[`${keyPrefix}FETCH_INACTIVE_FEED_ERROR`],
            'ENCODING_ERROR': bundle.inputData?.[`${keyPrefix}ENCODING_ERROR`],
            'DELIMITER_ERROR': bundle.inputData?.[`${keyPrefix}DELIMITER_ERROR`],
            'REQUIRED_COLUMNS_MISSING': bundle.inputData?.[`${keyPrefix}REQUIRED_COLUMNS_MISSING`],
            'DUPLICATE_PRODUCTS': bundle.inputData?.[`${keyPrefix}DUPLICATE_PRODUCTS`],
            'IMAGE_LINK_INVALID': bundle.inputData?.[`${keyPrefix}IMAGE_LINK_INVALID`],
            'ITEMID_MISSING': bundle.inputData?.[`${keyPrefix}ITEMID_MISSING`],
            'TITLE_MISSING': bundle.inputData?.[`${keyPrefix}TITLE_MISSING`],
            'DESCRIPTION_MISSING': bundle.inputData?.[`${keyPrefix}DESCRIPTION_MISSING`],
            'PRODUCT_LINK_MISSING': bundle.inputData?.[`${keyPrefix}PRODUCT_LINK_MISSING`],
            'IMAGE_LINK_MISSING': bundle.inputData?.[`${keyPrefix}IMAGE_LINK_MISSING`],
            'AVAILABILITY_INVALID': bundle.inputData?.[`${keyPrefix}AVAILABILITY_INVALID`],
            'PRODUCT_PRICE_INVALID': bundle.inputData?.[`${keyPrefix}PRODUCT_PRICE_INVALID`],
            'LINK_FORMAT_INVALID': bundle.inputData?.[`${keyPrefix}LINK_FORMAT_INVALID`],
            'PARSE_LINE_ERROR': bundle.inputData?.[`${keyPrefix}PARSE_LINE_ERROR`],
            'ADWORDS_FORMAT_INVALID': bundle.inputData?.[`${keyPrefix}ADWORDS_FORMAT_INVALID`],
            'INTERNAL_SERVICE_ERROR': bundle.inputData?.[`${keyPrefix}INTERNAL_SERVICE_ERROR`],
            'NO_VERIFIED_DOMAIN': bundle.inputData?.[`${keyPrefix}NO_VERIFIED_DOMAIN`],
            'ADULT_INVALID': bundle.inputData?.[`${keyPrefix}ADULT_INVALID`],
            'IMAGE_LINK_LENGTH_TOO_LONG': bundle.inputData?.[`${keyPrefix}IMAGE_LINK_LENGTH_TOO_LONG`],
            'INVALID_DOMAIN': bundle.inputData?.[`${keyPrefix}INVALID_DOMAIN`],
            'FEED_LENGTH_TOO_LONG': bundle.inputData?.[`${keyPrefix}FEED_LENGTH_TOO_LONG`],
            'LINK_LENGTH_TOO_LONG': bundle.inputData?.[`${keyPrefix}LINK_LENGTH_TOO_LONG`],
            'MALFORMED_XML': bundle.inputData?.[`${keyPrefix}MALFORMED_XML`],
            'PRICE_MISSING': bundle.inputData?.[`${keyPrefix}PRICE_MISSING`],
            'FEED_TOO_SMALL': bundle.inputData?.[`${keyPrefix}FEED_TOO_SMALL`],
            'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED': bundle.inputData?.[`${keyPrefix}MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`],
            'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE': bundle.inputData?.[`${keyPrefix}ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`],
            'PINJOIN_CONTENT_UNSAFE': bundle.inputData?.[`${keyPrefix}PINJOIN_CONTENT_UNSAFE`],
            'BLOCKLISTED_IMAGE_SIGNATURE': bundle.inputData?.[`${keyPrefix}BLOCKLISTED_IMAGE_SIGNATURE`],
            'LIST_PRICE_INVALID': bundle.inputData?.[`${keyPrefix}LIST_PRICE_INVALID`],
            'PRICE_CANNOT_BE_DETERMINED': bundle.inputData?.[`${keyPrefix}PRICE_CANNOT_BE_DETERMINED`],
        }
    },
}
