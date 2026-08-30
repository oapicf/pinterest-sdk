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
                label: `Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>. - [${labelPrefix}GEO]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}GEO_EXCLUDE`,
                label: `Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br /> - [${labelPrefix}GEO_EXCLUDE]`,
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
                label: `Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>. - [${labelPrefix}LOCATION]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCATION_EXCLUDE`,
                label: `Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information. - [${labelPrefix}LOCATION_EXCLUDE]`,
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
                label: `[${labelPrefix}TARGETING_STRATEGY]`,
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
            'GEO_EXCLUDE': bundle.inputData?.[`${keyPrefix}GEO_EXCLUDE`],
            'INTEREST': bundle.inputData?.[`${keyPrefix}INTEREST`],
            'LOCALE': bundle.inputData?.[`${keyPrefix}LOCALE`],
            'LOCATION': bundle.inputData?.[`${keyPrefix}LOCATION`],
            'LOCATION_EXCLUDE': bundle.inputData?.[`${keyPrefix}LOCATION_EXCLUDE`],
            'MAXIMUM_AGE': bundle.inputData?.[`${keyPrefix}MAXIMUM_AGE`],
            'MINIMUM_AGE': bundle.inputData?.[`${keyPrefix}MINIMUM_AGE`],
            'SHOPPING_RETARGETING': utils.childMapping(bundle.inputData?.[`${keyPrefix}SHOPPING_RETARGETING`], `${keyPrefix}SHOPPING_RETARGETING`, TargetingSpecShoppingRetargeting),
            'TARGETING_STRATEGY': bundle.inputData?.[`${keyPrefix}TARGETING_STRATEGY`],
        }
    },
}
