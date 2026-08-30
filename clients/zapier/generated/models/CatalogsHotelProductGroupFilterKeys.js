const utils = require('../utils/utils');
const BrandFilter = require('../models/BrandFilter');
const CatalogsProductGroupFilterOperatorTypeCriteria = require('../models/CatalogsProductGroupFilterOperatorTypeCriteria');
const CatalogsProductGroupMultipleCountriesCriteria = require('../models/CatalogsProductGroupMultipleCountriesCriteria');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');
const CountryFilter = require('../models/CountryFilter');
const CustomLabel0Filter = require('../models/CustomLabel0Filter');
const CustomLabel1Filter = require('../models/CustomLabel1Filter');
const CustomLabel2Filter = require('../models/CustomLabel2Filter');
const CustomLabel3Filter = require('../models/CustomLabel3Filter');
const CustomLabel4Filter = require('../models/CustomLabel4Filter');
const HotelIdFilter = require('../models/HotelIdFilter');
const PriceFilter = require('../models/PriceFilter');
const PriceFilterPrice = require('../models/PriceFilterPrice');
const TitleKeywordsFilter = require('../models/TitleKeywordsFilter');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...PriceFilterPrice.fields(`${keyPrefix}PRICE`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}HOTEL_ID`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}BRAND`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_0`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_1`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_2`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_3`, isInput),
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_4`, isInput),
            ...CatalogsProductGroupMultipleCountriesCriteria.fields(`${keyPrefix}COUNTRY`, isInput),
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}TITLE_KEYWORDS`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PRICE': utils.removeIfEmpty(PriceFilterPrice.mapping(bundle, `${keyPrefix}PRICE`)),
            'HOTEL_ID': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}HOTEL_ID`)),
            'BRAND': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}BRAND`)),
            'CUSTOM_LABEL_0': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_0`)),
            'CUSTOM_LABEL_1': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_1`)),
            'CUSTOM_LABEL_2': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_2`)),
            'CUSTOM_LABEL_3': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_3`)),
            'CUSTOM_LABEL_4': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_4`)),
            'COUNTRY': utils.removeIfEmpty(CatalogsProductGroupMultipleCountriesCriteria.mapping(bundle, `${keyPrefix}COUNTRY`)),
            'TITLE_KEYWORDS': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}TITLE_KEYWORDS`)),
        }
    },
}
