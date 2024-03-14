const utils = require('../utils/utils');
const AvailabilityFilter = require('../models/AvailabilityFilter');
const BrandFilter = require('../models/BrandFilter');
const CatalogsProductGroupCurrencyCriteria = require('../models/CatalogsProductGroupCurrencyCriteria');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');
const CatalogsProductGroupMultipleStringListCriteria = require('../models/CatalogsProductGroupMultipleStringListCriteria');
const CatalogsProductGroupPricingCriteria = require('../models/CatalogsProductGroupPricingCriteria');
const ConditionFilter = require('../models/ConditionFilter');
const CurrencyFilter = require('../models/CurrencyFilter');
const CustomLabel0Filter = require('../models/CustomLabel0Filter');
const CustomLabel1Filter = require('../models/CustomLabel1Filter');
const CustomLabel2Filter = require('../models/CustomLabel2Filter');
const CustomLabel3Filter = require('../models/CustomLabel3Filter');
const CustomLabel4Filter = require('../models/CustomLabel4Filter');
const GenderFilter = require('../models/GenderFilter');
const GoogleProductCategory0Filter = require('../models/GoogleProductCategory0Filter');
const GoogleProductCategory1Filter = require('../models/GoogleProductCategory1Filter');
const GoogleProductCategory2Filter = require('../models/GoogleProductCategory2Filter');
const GoogleProductCategory3Filter = require('../models/GoogleProductCategory3Filter');
const GoogleProductCategory4Filter = require('../models/GoogleProductCategory4Filter');
const GoogleProductCategory5Filter = require('../models/GoogleProductCategory5Filter');
const GoogleProductCategory6Filter = require('../models/GoogleProductCategory6Filter');
const ItemGroupIdFilter = require('../models/ItemGroupIdFilter');
const ItemIdFilter = require('../models/ItemIdFilter');
const MaxPriceFilter = require('../models/MaxPriceFilter');
const MinPriceFilter = require('../models/MinPriceFilter');
const ProductType0Filter = require('../models/ProductType0Filter');
const ProductType1Filter = require('../models/ProductType1Filter');
const ProductType2Filter = require('../models/ProductType2Filter');
const ProductType3Filter = require('../models/ProductType3Filter');
const ProductType4Filter = require('../models/ProductType4Filter');

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
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}CUSTOM_LABEL_0`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}CUSTOM_LABEL_1`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}CUSTOM_LABEL_2`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}CUSTOM_LABEL_3`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}CUSTOM_LABEL_4`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}ITEM_GROUP_ID`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}GENDER`, isInput),
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
            'CUSTOM_LABEL_0': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_0`)),
            'CUSTOM_LABEL_1': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_1`)),
            'CUSTOM_LABEL_2': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_2`)),
            'CUSTOM_LABEL_3': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_3`)),
            'CUSTOM_LABEL_4': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_4`)),
            'ITEM_GROUP_ID': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}ITEM_GROUP_ID`)),
            'GENDER': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}GENDER`)),
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
        }
    },
}
