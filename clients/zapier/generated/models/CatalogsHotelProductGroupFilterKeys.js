const utils = require('../utils/utils');
const BrandFilter = require('../models/BrandFilter');
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
const catalogs_product_group_pricing_currency_criteria = require('../models/catalogs_product_group_pricing_currency_criteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...catalogs_product_group_pricing_currency_criteria.fields(`${keyPrefix}PRICE`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PRICE': utils.removeIfEmpty(catalogs_product_group_pricing_currency_criteria.mapping(bundle, `${keyPrefix}PRICE`)),
            'HOTEL_ID': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}HOTEL_ID`)),
            'BRAND': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}BRAND`)),
            'CUSTOM_LABEL_0': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_0`)),
            'CUSTOM_LABEL_1': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_1`)),
            'CUSTOM_LABEL_2': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_2`)),
            'CUSTOM_LABEL_3': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_3`)),
            'CUSTOM_LABEL_4': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_4`)),
            'COUNTRY': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}COUNTRY`)),
        }
    },
}
