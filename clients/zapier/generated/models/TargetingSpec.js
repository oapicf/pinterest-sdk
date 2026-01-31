const utils = require('../utils/utils');
const TargetingSpecAgeBucket = require('../models/TargetingSpecAgeBucket');
const TargetingSpecAppType = require('../models/TargetingSpecAppType');
const TargetingSpecGender = require('../models/TargetingSpecGender');
const TargetingSpecShoppingRetargeting = require('../models/TargetingSpecShoppingRetargeting');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}AGE_BUCKET`,
                list: true,
                type: 'string',
                ...TargetingSpecAgeBucket.fields(`${keyPrefix}AGE_BUCKET`, isInput),
            },
            {
                key: `${keyPrefix}APPTYPE`,
                list: true,
                type: 'string',
                ...TargetingSpecAppType.fields(`${keyPrefix}APPTYPE`, isInput),
            },
            {
                key: `${keyPrefix}AUDIENCE_EXCLUDE`,
                label: `Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. - [${labelPrefix}AUDIENCE_EXCLUDE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}AUDIENCE_INCLUDE`,
                label: `Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. - [${labelPrefix}AUDIENCE_INCLUDE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}GENDER`,
                list: true,
                type: 'string',
                ...TargetingSpecGender.fields(`${keyPrefix}GENDER`, isInput),
            },
            {
                key: `${keyPrefix}GEO`,
                label: `Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). - [${labelPrefix}GEO]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}INTEREST`,
                label: `Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. - [${labelPrefix}INTEREST]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCALE`,
                label: `24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. - [${labelPrefix}LOCALE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCATION`,
                label: `22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a>. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). - [${labelPrefix}LOCATION]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}MAXIMUM_AGE`,
                label: `Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. - [${labelPrefix}MAXIMUM_AGE]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}MINIMUM_AGE`,
                label: `Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. - [${labelPrefix}MINIMUM_AGE]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}SHOPPING_RETARGETING`,
                label: `[${labelPrefix}SHOPPING_RETARGETING]`,
                children: TargetingSpecShoppingRetargeting.fields(`${keyPrefix}SHOPPING_RETARGETING${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}TARGETING_STRATEGY`,
                label: ` - [${labelPrefix}TARGETING_STRATEGY]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'AGE_BUCKET': utils.childMapping(bundle.inputData?.[`${keyPrefix}AGE_BUCKET`], `${keyPrefix}AGE_BUCKET`, TargetingSpecAgeBucket),
            'APPTYPE': utils.childMapping(bundle.inputData?.[`${keyPrefix}APPTYPE`], `${keyPrefix}APPTYPE`, TargetingSpecAppType),
            'AUDIENCE_EXCLUDE': bundle.inputData?.[`${keyPrefix}AUDIENCE_EXCLUDE`],
            'AUDIENCE_INCLUDE': bundle.inputData?.[`${keyPrefix}AUDIENCE_INCLUDE`],
            'GENDER': utils.childMapping(bundle.inputData?.[`${keyPrefix}GENDER`], `${keyPrefix}GENDER`, TargetingSpecGender),
            'GEO': bundle.inputData?.[`${keyPrefix}GEO`],
            'INTEREST': bundle.inputData?.[`${keyPrefix}INTEREST`],
            'LOCALE': bundle.inputData?.[`${keyPrefix}LOCALE`],
            'LOCATION': bundle.inputData?.[`${keyPrefix}LOCATION`],
            'MAXIMUM_AGE': bundle.inputData?.[`${keyPrefix}MAXIMUM_AGE`],
            'MINIMUM_AGE': bundle.inputData?.[`${keyPrefix}MINIMUM_AGE`],
            'SHOPPING_RETARGETING': utils.childMapping(bundle.inputData?.[`${keyPrefix}SHOPPING_RETARGETING`], `${keyPrefix}SHOPPING_RETARGETING`, TargetingSpecShoppingRetargeting),
            'TARGETING_STRATEGY': bundle.inputData?.[`${keyPrefix}TARGETING_STRATEGY`],
        }
    },
}
