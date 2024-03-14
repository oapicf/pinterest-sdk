const utils = require('../utils/utils');
const CatalogsItemValidationDetails = require('../models/CatalogsItemValidationDetails');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}ADULT_INVALID`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}ADWORDS_FORMAT_INVALID`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}AVAILABILITY_INVALID`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}BLOCKLISTED_IMAGE_SIGNATURE`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}DESCRIPTION_MISSING`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}IMAGE_LINK_INVALID`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}IMAGE_LINK_LENGTH_TOO_LONG`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}IMAGE_LINK_MISSING`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}INVALID_DOMAIN`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}ITEMID_MISSING`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}LINK_FORMAT_INVALID`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}LINK_LENGTH_TOO_LONG`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}LIST_PRICE_INVALID`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}PARSE_LINE_ERROR`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}PINJOIN_CONTENT_UNSAFE`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}PRICE_CANNOT_BE_DETERMINED`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}PRICE_MISSING`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}PRODUCT_LINK_MISSING`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}PRODUCT_PRICE_INVALID`, isInput),
            ...CatalogsItemValidationDetails.fields(`${keyPrefix}TITLE_MISSING`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ADULT_INVALID': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}ADULT_INVALID`)),
            'ADWORDS_FORMAT_INVALID': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}ADWORDS_FORMAT_INVALID`)),
            'AVAILABILITY_INVALID': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}AVAILABILITY_INVALID`)),
            'BLOCKLISTED_IMAGE_SIGNATURE': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}BLOCKLISTED_IMAGE_SIGNATURE`)),
            'DESCRIPTION_MISSING': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}DESCRIPTION_MISSING`)),
            'IMAGE_LINK_INVALID': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}IMAGE_LINK_INVALID`)),
            'IMAGE_LINK_LENGTH_TOO_LONG': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}IMAGE_LINK_LENGTH_TOO_LONG`)),
            'IMAGE_LINK_MISSING': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}IMAGE_LINK_MISSING`)),
            'INVALID_DOMAIN': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}INVALID_DOMAIN`)),
            'ITEMID_MISSING': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}ITEMID_MISSING`)),
            'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`)),
            'LINK_FORMAT_INVALID': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}LINK_FORMAT_INVALID`)),
            'LINK_LENGTH_TOO_LONG': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}LINK_LENGTH_TOO_LONG`)),
            'LIST_PRICE_INVALID': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}LIST_PRICE_INVALID`)),
            'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`)),
            'PARSE_LINE_ERROR': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}PARSE_LINE_ERROR`)),
            'PINJOIN_CONTENT_UNSAFE': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}PINJOIN_CONTENT_UNSAFE`)),
            'PRICE_CANNOT_BE_DETERMINED': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}PRICE_CANNOT_BE_DETERMINED`)),
            'PRICE_MISSING': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}PRICE_MISSING`)),
            'PRODUCT_LINK_MISSING': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}PRODUCT_LINK_MISSING`)),
            'PRODUCT_PRICE_INVALID': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}PRODUCT_PRICE_INVALID`)),
            'TITLE_MISSING': utils.removeIfEmpty(CatalogsItemValidationDetails.mapping(bundle, `${keyPrefix}TITLE_MISSING`)),
        }
    },
}
