const utils = require('../utils/utils');
const CatalogsProductGroupMultipleMediaTypesCriteria = require('../models/CatalogsProductGroupMultipleMediaTypesCriteria');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');
const CatalogsProductGroupMultipleStringListCriteria = require('../models/CatalogsProductGroupMultipleStringListCriteria');
const CreativeAssetsIdFilter = require('../models/CreativeAssetsIdFilter');
const CustomLabel0Filter = require('../models/CustomLabel0Filter');
const CustomLabel1Filter = require('../models/CustomLabel1Filter');
const CustomLabel2Filter = require('../models/CustomLabel2Filter');
const CustomLabel3Filter = require('../models/CustomLabel3Filter');
const CustomLabel4Filter = require('../models/CustomLabel4Filter');
const GoogleProductCategory0Filter = require('../models/GoogleProductCategory0Filter');
const GoogleProductCategory1Filter = require('../models/GoogleProductCategory1Filter');
const GoogleProductCategory2Filter = require('../models/GoogleProductCategory2Filter');
const GoogleProductCategory3Filter = require('../models/GoogleProductCategory3Filter');
const GoogleProductCategory4Filter = require('../models/GoogleProductCategory4Filter');
const GoogleProductCategory5Filter = require('../models/GoogleProductCategory5Filter');
const GoogleProductCategory6Filter = require('../models/GoogleProductCategory6Filter');
const MediaTypeFilter = require('../models/MediaTypeFilter');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'CREATIVE_ASSETS_ID': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CREATIVE_ASSETS_ID`)),
            'CUSTOM_LABEL_0': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_0`)),
            'CUSTOM_LABEL_1': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_1`)),
            'CUSTOM_LABEL_2': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_2`)),
            'CUSTOM_LABEL_3': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_3`)),
            'CUSTOM_LABEL_4': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_4`)),
            'GOOGLE_PRODUCT_CATEGORY_6': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_6`)),
            'GOOGLE_PRODUCT_CATEGORY_5': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_5`)),
            'GOOGLE_PRODUCT_CATEGORY_4': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_4`)),
            'GOOGLE_PRODUCT_CATEGORY_3': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_3`)),
            'GOOGLE_PRODUCT_CATEGORY_2': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_2`)),
            'GOOGLE_PRODUCT_CATEGORY_1': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_1`)),
            'GOOGLE_PRODUCT_CATEGORY_0': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_0`)),
            'MEDIA_TYPE': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}MEDIA_TYPE`)),
        }
    },
}
