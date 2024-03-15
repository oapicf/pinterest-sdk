const utils = require('../utils/utils');
const MMMReportingColumn = require('../models/MMMReportingColumn');
const MMMReportingTargetingType = require('../models/MMMReportingTargetingType');
const TargetingAdvertiserCountry = require('../models/TargetingAdvertiserCountry');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}report_name`,
                label: `Name of the Marketing Mix Modeling (MMM) report - [${labelPrefix}report_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_date`,
                label: `Metric report start date (UTC). Format: YYYY-MM-DD - [${labelPrefix}start_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}end_date`,
                label: `Metric report end date (UTC). Format: YYYY-MM-DD - [${labelPrefix}end_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}granularity`,
                label: `DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. - [${labelPrefix}granularity]`,
                required: true,
                type: 'string',
                choices: [
                    'DAY',
                    'WEEK',
                ],
            },
            {
                key: `${keyPrefix}level`,
                label: `Level of the report - [${labelPrefix}level]`,
                required: true,
                type: 'string',
                choices: [
                    'CAMPAIGN_TARGETING',
                    'AD_GROUP_TARGETING',
                ],
            },
            {
                key: `${keyPrefix}targeting_types`,
                list: true,
                type: 'string',
                ...MMMReportingTargetingType.fields(`${keyPrefix}targeting_types`, isInput),
            },
            {
                key: `${keyPrefix}columns`,
                list: true,
                type: 'string',
                ...MMMReportingColumn.fields(`${keyPrefix}columns`, isInput),
            },
            {
                key: `${keyPrefix}countries`,
                list: true,
                type: 'string',
                ...TargetingAdvertiserCountry.fields(`${keyPrefix}countries`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'report_name': bundle.inputData?.[`${keyPrefix}report_name`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'level': bundle.inputData?.[`${keyPrefix}level`],
            'targeting_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}targeting_types`], `${keyPrefix}targeting_types`, MMMReportingTargetingType),
            'columns': utils.childMapping(bundle.inputData?.[`${keyPrefix}columns`], `${keyPrefix}columns`, MMMReportingColumn),
            'countries': utils.childMapping(bundle.inputData?.[`${keyPrefix}countries`], `${keyPrefix}countries`, TargetingAdvertiserCountry),
        }
    },
}
