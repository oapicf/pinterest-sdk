const utils = require('../utils/utils');
const TargetingSpec_SHOPPING_RETARGETING = require('../models/TargetingSpec_SHOPPING_RETARGETING');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}AGE_BUCKET`,
                label: `Values: [\"18-24\",\"21+\",\"25-34\",\"35-44\", \"45-49\",\"50-54\",\"55-64\",\"65+\"] - [${labelPrefix}AGE_BUCKET]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}APPTYPE`,
                label: `Values: [\"android_mobile\", \"android_tablet\", \"ipad\", \"iphone\", \"web\", \"web_mobile\"] - [${labelPrefix}APPTYPE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}AUDIENCE_EXCLUDE`,
                label: `Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. - [${labelPrefix}AUDIENCE_EXCLUDE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}AUDIENCE_INCLUDE`,
                label: `Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them - [${labelPrefix}AUDIENCE_INCLUDE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}GENDER`,
                label: `Targeted genders. Values: [\"unknown\",\"male\",\"female\"] - [${labelPrefix}GENDER]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}GEO`,
                label: `Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. - [${labelPrefix}GEO]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}INTEREST`,
                label: `<a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">Interest object IDs</a>. - [${labelPrefix}INTEREST]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCALE`,
                label: `24 <a href=\"https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\" target=\"_blank\">ISO 639-1 two letter language codes</a>. Values: [\"cs\",\"da\",\"de\",\"el\",\"en\",\"es\",\"fi\",\"fr\",\"hu\", \"id\",\"in\",\"it\",\"ja\",\"ko\",\"no\",\"pl\",\"pt\",\"ro\",\"ru\",\"sk\",\"sv\",\"tr\",\"uk\",\"zh\"] - [${labelPrefix}LOCALE]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCATION`,
                label: `22 <a href=\"https://www.nationsonline.org/oneworld/country_code_list.htm\" target=\"_blank\">ISO Alpha 2</a> two letter country codes or <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">US Nielsen DMA (Designated Market Area) codes</a> (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\">click here</a>. Location-Country and Location-Metro codes apply. - [${labelPrefix}LOCATION]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}SHOPPING_RETARGETING`,
                label: `[${labelPrefix}SHOPPING_RETARGETING]`,
                children: TargetingSpec_SHOPPING_RETARGETING.fields(`${keyPrefix}SHOPPING_RETARGETING${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}TARGETING_STRATEGY`,
                label: `Values: [\"CHOOSE_YOUR_OWN\", \"FIND_NEW_CUSTOMERS\", \"RECONNECT_WITH_USERS\"] - [${labelPrefix}TARGETING_STRATEGY]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'AGE_BUCKET': bundle.inputData?.[`${keyPrefix}AGE_BUCKET`],
            'APPTYPE': bundle.inputData?.[`${keyPrefix}APPTYPE`],
            'AUDIENCE_EXCLUDE': bundle.inputData?.[`${keyPrefix}AUDIENCE_EXCLUDE`],
            'AUDIENCE_INCLUDE': bundle.inputData?.[`${keyPrefix}AUDIENCE_INCLUDE`],
            'GENDER': bundle.inputData?.[`${keyPrefix}GENDER`],
            'GEO': bundle.inputData?.[`${keyPrefix}GEO`],
            'INTEREST': bundle.inputData?.[`${keyPrefix}INTEREST`],
            'LOCALE': bundle.inputData?.[`${keyPrefix}LOCALE`],
            'LOCATION': bundle.inputData?.[`${keyPrefix}LOCATION`],
            'SHOPPING_RETARGETING': utils.childMapping(bundle.inputData?.[`${keyPrefix}SHOPPING_RETARGETING`], `${keyPrefix}SHOPPING_RETARGETING`, TargetingSpec_SHOPPING_RETARGETING),
            'TARGETING_STRATEGY': bundle.inputData?.[`${keyPrefix}TARGETING_STRATEGY`],
        }
    },
}
