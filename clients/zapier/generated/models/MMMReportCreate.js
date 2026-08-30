const utils = require('../utils/utils');
const MMMReportGranularity = require('../models/MMMReportGranularity');
const MMMReportLevel = require('../models/MMMReportLevel');
const MMMReportingColumn = require('../models/MMMReportingColumn');
const MMMReportingTargetingType = require('../models/MMMReportingTargetingType');
const TargetingAdvertiserCountry = require('../models/TargetingAdvertiserCountry');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}advertiser_ids`,
                label: `Advertiser IDs for multi-advertiser report - [${labelPrefix}advertiser_ids]`,
                list: true,
                type: 'string',
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
            {
                key: `${keyPrefix}custom_column_ids`,
                label: `List of custom column IDs - [${labelPrefix}custom_column_ids]`,
                list: true,
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
                ...MMMReportGranularity.fields(`${keyPrefix}granularity`, isInput),
            },
            {
                key: `${keyPrefix}level`,
                ...MMMReportLevel.fields(`${keyPrefix}level`, isInput),
            },
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
                key: `${keyPrefix}targeting_types`,
                list: true,
                type: 'string',
                ...MMMReportingTargetingType.fields(`${keyPrefix}targeting_types`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'advertiser_ids': bundle.inputData?.[`${keyPrefix}advertiser_ids`],
            'columns': utils.childMapping(bundle.inputData?.[`${keyPrefix}columns`], `${keyPrefix}columns`, MMMReportingColumn),
            'countries': utils.childMapping(bundle.inputData?.[`${keyPrefix}countries`], `${keyPrefix}countries`, TargetingAdvertiserCountry),
            'custom_column_ids': bundle.inputData?.[`${keyPrefix}custom_column_ids`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'level': bundle.inputData?.[`${keyPrefix}level`],
            'report_name': bundle.inputData?.[`${keyPrefix}report_name`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
            'targeting_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}targeting_types`], `${keyPrefix}targeting_types`, MMMReportingTargetingType),
        }
    },
}
