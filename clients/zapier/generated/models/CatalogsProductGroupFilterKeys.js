const utils = require('../utils/utils');
const CatalogsBaseFilterKeys = require('../models/CatalogsBaseFilterKeys');
const CatalogsProductGroupCurrencyCriteria = require('../models/CatalogsProductGroupCurrencyCriteria');
const CatalogsProductGroupFilterOperatorTypeCriteria = require('../models/CatalogsProductGroupFilterOperatorTypeCriteria');
const CatalogsProductGroupMultipleGenderCriteria = require('../models/CatalogsProductGroupMultipleGenderCriteria');
const CatalogsProductGroupMultipleMediaTypesCriteria = require('../models/CatalogsProductGroupMultipleMediaTypesCriteria');
const CatalogsProductGroupMultiplePinterestProductCategoryCriteria = require('../models/CatalogsProductGroupMultiplePinterestProductCategoryCriteria');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');
const CatalogsProductGroupMultipleStringListCriteria = require('../models/CatalogsProductGroupMultipleStringListCriteria');
const CatalogsProductGroupPricingCriteria = require('../models/CatalogsProductGroupPricingCriteria');
const CatalogsProductGroupUint32Criteria = require('../models/CatalogsProductGroupUint32Criteria');
const ProductGroupReferenceFilter = require('../models/ProductGroupReferenceFilter');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupPricingCriteria.fields(`${keyPrefix}MIN_PRICE`, isInput),
            ...CatalogsProductGroupPricingCriteria.fields(`${keyPrefix}MAX_PRICE`, isInput),
            ...CatalogsProductGroupCurrencyCriteria.fields(`${keyPrefix}CURRENCY`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}ITEM_ID`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}AVAILABILITY`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}BRAND`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}CONDITION`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_0`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_1`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_2`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_3`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_4`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}ITEM_GROUP_ID`, isInput),
            ...CatalogsProductGroupMultipleGenderCriteria.fields(`${keyPrefix}GENDER`, isInput),
            ...CatalogsProductGroupMultipleMediaTypesCriteria.fields(`${keyPrefix}MEDIA_TYPE`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}PRODUCT_TYPE_4`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}PRODUCT_TYPE_3`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}PRODUCT_TYPE_2`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}PRODUCT_TYPE_1`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}PRODUCT_TYPE_0`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}GOOGLE_PRODUCT_CATEGORY_6`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}GOOGLE_PRODUCT_CATEGORY_5`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}GOOGLE_PRODUCT_CATEGORY_4`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}GOOGLE_PRODUCT_CATEGORY_3`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}GOOGLE_PRODUCT_CATEGORY_2`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}GOOGLE_PRODUCT_CATEGORY_1`, isInput),
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}GOOGLE_PRODUCT_CATEGORY_0`, isInput),
            ...CatalogsProductGroupUint32Criteria.fields(`${keyPrefix}CUSTOM_NUMBER_0`, isInput),
            ...CatalogsProductGroupUint32Criteria.fields(`${keyPrefix}CUSTOM_NUMBER_1`, isInput),
            ...CatalogsProductGroupUint32Criteria.fields(`${keyPrefix}CUSTOM_NUMBER_2`, isInput),
            ...CatalogsProductGroupUint32Criteria.fields(`${keyPrefix}CUSTOM_NUMBER_3`, isInput),
            ...CatalogsProductGroupUint32Criteria.fields(`${keyPrefix}CUSTOM_NUMBER_4`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}TITLE_KEYWORDS`, isInput),
            ...CatalogsProductGroupMultiplePinterestProductCategoryCriteria.fields(`${keyPrefix}PINTEREST_PRODUCT_CATEGORIES`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}PRODUCT_GROUP`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'MIN_PRICE': utils.removeIfEmpty(CatalogsProductGroupPricingCriteria.mapping(bundle, `${keyPrefix}MIN_PRICE`)),
            'MAX_PRICE': utils.removeIfEmpty(CatalogsProductGroupPricingCriteria.mapping(bundle, `${keyPrefix}MAX_PRICE`)),
            'CURRENCY': utils.removeIfEmpty(CatalogsProductGroupCurrencyCriteria.mapping(bundle, `${keyPrefix}CURRENCY`)),
            'ITEM_ID': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}ITEM_ID`)),
            'AVAILABILITY': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}AVAILABILITY`)),
            'BRAND': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}BRAND`)),
            'CONDITION': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}CONDITION`)),
            'CUSTOM_LABEL_0': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_0`)),
            'CUSTOM_LABEL_1': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_1`)),
            'CUSTOM_LABEL_2': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_2`)),
            'CUSTOM_LABEL_3': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_3`)),
            'CUSTOM_LABEL_4': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_4`)),
            'ITEM_GROUP_ID': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}ITEM_GROUP_ID`)),
            'GENDER': utils.removeIfEmpty(CatalogsProductGroupMultipleGenderCriteria.mapping(bundle, `${keyPrefix}GENDER`)),
            'MEDIA_TYPE': utils.removeIfEmpty(CatalogsProductGroupMultipleMediaTypesCriteria.mapping(bundle, `${keyPrefix}MEDIA_TYPE`)),
            'PRODUCT_TYPE_4': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}PRODUCT_TYPE_4`)),
            'PRODUCT_TYPE_3': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}PRODUCT_TYPE_3`)),
            'PRODUCT_TYPE_2': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}PRODUCT_TYPE_2`)),
            'PRODUCT_TYPE_1': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}PRODUCT_TYPE_1`)),
            'PRODUCT_TYPE_0': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}PRODUCT_TYPE_0`)),
            'GOOGLE_PRODUCT_CATEGORY_6': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_6`)),
            'GOOGLE_PRODUCT_CATEGORY_5': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_5`)),
            'GOOGLE_PRODUCT_CATEGORY_4': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_4`)),
            'GOOGLE_PRODUCT_CATEGORY_3': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_3`)),
            'GOOGLE_PRODUCT_CATEGORY_2': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_2`)),
            'GOOGLE_PRODUCT_CATEGORY_1': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_1`)),
            'GOOGLE_PRODUCT_CATEGORY_0': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_0`)),
            'CUSTOM_NUMBER_0': utils.removeIfEmpty(CatalogsProductGroupUint32Criteria.mapping(bundle, `${keyPrefix}CUSTOM_NUMBER_0`)),
            'CUSTOM_NUMBER_1': utils.removeIfEmpty(CatalogsProductGroupUint32Criteria.mapping(bundle, `${keyPrefix}CUSTOM_NUMBER_1`)),
            'CUSTOM_NUMBER_2': utils.removeIfEmpty(CatalogsProductGroupUint32Criteria.mapping(bundle, `${keyPrefix}CUSTOM_NUMBER_2`)),
            'CUSTOM_NUMBER_3': utils.removeIfEmpty(CatalogsProductGroupUint32Criteria.mapping(bundle, `${keyPrefix}CUSTOM_NUMBER_3`)),
            'CUSTOM_NUMBER_4': utils.removeIfEmpty(CatalogsProductGroupUint32Criteria.mapping(bundle, `${keyPrefix}CUSTOM_NUMBER_4`)),
            'TITLE_KEYWORDS': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}TITLE_KEYWORDS`)),
            'PINTEREST_PRODUCT_CATEGORIES': utils.removeIfEmpty(CatalogsProductGroupMultiplePinterestProductCategoryCriteria.mapping(bundle, `${keyPrefix}PINTEREST_PRODUCT_CATEGORIES`)),
            'PRODUCT_GROUP': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}PRODUCT_GROUP`)),
        }
    },
}
