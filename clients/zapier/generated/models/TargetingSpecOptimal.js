const utils = require('../utils/utils');
const TargetingSpecAgeBucket = require('../models/TargetingSpecAgeBucket');
const TargetingSpecAppType = require('../models/TargetingSpecAppType');
const TargetingSpecGender = require('../models/TargetingSpecGender');
const TargetingSpecShoppingRetargeting = require('../models/TargetingSpecShoppingRetargeting');
const TargetingStrategy = require('../models/TargetingStrategy');

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
                label: `Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: `US-CA` is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: `94103` is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like `US-CA` or a more granular postal code within that regon, such as `94103`.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the `region_codes` key and a postal code value with the `postal_codes` key. Examples:  ``` \"geo\": {   \"region_codes\": [\"US-CA\"] } ```  ``` \"geo\": {   \"postal_codes\": [\"94103\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION`.  If you do not specifiy a `GEO` code, only `LOCATION` values will be targeted (See `LOCATION` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). - [${labelPrefix}GEO]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}GEO_EXCLUDE`,
                label: `[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See `GEO` parameter in this targeting spec for rules, syntax, and other information. - [${labelPrefix}GEO_EXCLUDE]`,
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
                label: `Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the `country_codes` key and metro code values with `metro_codes` key. Example:  ``` \"location\": {   \"country_codes\": [\"US\", \"CA\"],   \"metro_codes\": [\"501\", \"602\"] } ```  For each ad group, specify at least one `GEO` or `LOCATION` code.  If you do not specify a `LOCATION` code, only `GEO` values will be targeted (See `GEO` parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones). - [${labelPrefix}LOCATION]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}LOCATION_EXCLUDE`,
                label: `[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See `LOCATION` parameter in this targeting spec for rules, syntax, and other information. - [${labelPrefix}LOCATION_EXCLUDE]`,
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
                list: true,
                type: 'string',
                ...TargetingStrategy.fields(`${keyPrefix}TARGETING_STRATEGY`, isInput),
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
            'TARGETING_STRATEGY': utils.childMapping(bundle.inputData?.[`${keyPrefix}TARGETING_STRATEGY`], `${keyPrefix}TARGETING_STRATEGY`, TargetingStrategy),
        }
    },
}
