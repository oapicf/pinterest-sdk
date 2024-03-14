const utils = require('../utils/utils');
const TargetingSpec_SHOPPING_RETARGETING_1_inner = require('../models/TargetingSpec_SHOPPING_RETARGETING_1_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}AGE_BUCKET`,
                label: `Age ranges - [${labelPrefix}AGE_BUCKET]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}APPTYPE`,
                label: `Allowed devices - [${labelPrefix}APPTYPE]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}AUDIENCE_EXCLUDE`,
                label: `Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. - [${labelPrefix}AUDIENCE_EXCLUDE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}AUDIENCE_INCLUDE&#39;`,
                label: `Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them - [${labelPrefix}AUDIENCE_INCLUDE&#39;]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}GENDER`,
                label: `Targeted genders. Values: [\"unknown\",\"male\",\"female\"] - [${labelPrefix}GENDER]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}GEO`,
                label: `Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. - [${labelPrefix}GEO]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}INTEREST`,
                label: `Array of interest object IDs. - [${labelPrefix}INTEREST]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCALE`,
                label: `24 ISO 639-1 two letter language codes. - [${labelPrefix}LOCALE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCATION`,
                label: `22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. - [${labelPrefix}LOCATION]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}SHOPPING_RETARGETING`,
                label: `[${labelPrefix}SHOPPING_RETARGETING]`,
                children: TargetingSpec_SHOPPING_RETARGETING_1_inner.fields(`${keyPrefix}SHOPPING_RETARGETING${!isInput ? '[]' : ''}`, isInput, true), 
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
            'AGE_BUCKET': bundle.inputData?.[`${keyPrefix}AGE_BUCKET`],
            'APPTYPE': bundle.inputData?.[`${keyPrefix}APPTYPE`],
            'AUDIENCE_EXCLUDE': bundle.inputData?.[`${keyPrefix}AUDIENCE_EXCLUDE`],
            'AUDIENCE_INCLUDE&#39;': bundle.inputData?.[`${keyPrefix}AUDIENCE_INCLUDE&#39;`],
            'GENDER': bundle.inputData?.[`${keyPrefix}GENDER`],
            'GEO': bundle.inputData?.[`${keyPrefix}GEO`],
            'INTEREST': bundle.inputData?.[`${keyPrefix}INTEREST`],
            'LOCALE': bundle.inputData?.[`${keyPrefix}LOCALE`],
            'LOCATION': bundle.inputData?.[`${keyPrefix}LOCATION`],
            'SHOPPING_RETARGETING': utils.childMapping(bundle.inputData?.[`${keyPrefix}SHOPPING_RETARGETING`], `${keyPrefix}SHOPPING_RETARGETING`, TargetingSpec_SHOPPING_RETARGETING_1_inner),
            'TARGETING_STRATEGY': bundle.inputData?.[`${keyPrefix}TARGETING_STRATEGY`],
        }
    },
}
