const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');
const ConversionReportTimeType = require('../models/ConversionReportTimeType');
const CreationSource = require('../models/CreationSource');
const DataOutputFormat = require('../models/DataOutputFormat');
const Granularity = require('../models/Granularity');
const IngestionSource = require('../models/IngestionSource');
const MetricsReportingLevel = require('../models/MetricsReportingLevel');
const ReportingColumn = require('../models/ReportingColumn');
const ReportingTimeZone = require('../models/ReportingTimeZone');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `ID of the Ad Account that owns the template - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_ids`,
                label: `IDs of the Ad Accounts that have access to this template - [${labelPrefix}ad_account_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ade_columns`,
                label: `A list of ADE columns - [${labelPrefix}ade_columns]`,
                list: true,
                type: 'string',
            },
            ....fields(`${keyPrefix}attribution_type`, isInput),
            {
                key: `${keyPrefix}click_window_days`,
                label: `The length of the sliding window over which click conversions will be attributed - [${labelPrefix}click_window_days]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}columns`,
                list: true,
                type: 'string',
                ...ReportingColumn.fields(`${keyPrefix}columns`, isInput),
            },
            {
                key: `${keyPrefix}conversion_report_time_type`,
                ...ConversionReportTimeType.fields(`${keyPrefix}conversion_report_time_type`, isInput),
            },
            {
                key: `${keyPrefix}creation_source`,
                ...CreationSource.fields(`${keyPrefix}creation_source`, isInput),
            },
            {
                key: `${keyPrefix}custom_column_ids`,
                label: `A list of custom column IDs - [${labelPrefix}custom_column_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}display_metadata`,
                label: `Additional metadata about this reporting template - [${labelPrefix}display_metadata]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}engagement_window_days`,
                label: `The length of the sliding window over which engagement conversions will be attributed - [${labelPrefix}engagement_window_days]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}filters_json`,
                label: `A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values - [${labelPrefix}filters_json]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}granularity`,
                ...Granularity.fields(`${keyPrefix}granularity`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `Template ID - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ingestion_sources`,
                list: true,
                type: 'string',
                ...IngestionSource.fields(`${keyPrefix}ingestion_sources`, isInput),
            },
            {
                key: `${keyPrefix}is_default`,
                label: `A boolean representing if this is the default view that loads for this template type - [${labelPrefix}is_default]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_deleted`,
                label: `A boolean that indicates if the template has been deleted - [${labelPrefix}is_deleted]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_owned_by_user`,
                label: `A boolean value that indicates if the user owns the template - [${labelPrefix}is_owned_by_user]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_scheduled`,
                label: `A boolean value that indicates if this template has been used to create a scheduled report - [${labelPrefix}is_scheduled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}name`,
                label: `Template Name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}report_end_relative_days_in_past`,
                label: `The number of days prior to the day the report will be delivered at which the report will end - [${labelPrefix}report_end_relative_days_in_past]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}report_format`,
                ...DataOutputFormat.fields(`${keyPrefix}report_format`, isInput),
            },
            {
                key: `${keyPrefix}report_level`,
                ...MetricsReportingLevel.fields(`${keyPrefix}report_level`, isInput),
            },
            {
                key: `${keyPrefix}report_start_relative_days_in_past`,
                label: `The number of days prior to the day the report will be delivered at which the report will start - [${labelPrefix}report_start_relative_days_in_past]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}reporting_time_zone`,
                ...ReportingTimeZone.fields(`${keyPrefix}reporting_time_zone`, isInput),
            },
            ....fields(`${keyPrefix}sort_by`, isInput),
            {
                key: `${keyPrefix}type`,
                label: `Type of the template - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Time of last update in seconds since Unix epoch - [${labelPrefix}updated_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}user_id`,
                label: `ID of the user who created the template - [${labelPrefix}user_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}view_window_days`,
                label: `The length of the sliding window over which view conversions will be attributed - [${labelPrefix}view_window_days]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'ad_account_ids': bundle.inputData?.[`${keyPrefix}ad_account_ids`],
            'ade_columns': bundle.inputData?.[`${keyPrefix}ade_columns`],
            'attribution_type': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}attribution_type`)),
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'columns': utils.childMapping(bundle.inputData?.[`${keyPrefix}columns`], `${keyPrefix}columns`, ReportingColumn),
            'conversion_report_time_type': bundle.inputData?.[`${keyPrefix}conversion_report_time_type`],
            'creation_source': bundle.inputData?.[`${keyPrefix}creation_source`],
            'custom_column_ids': bundle.inputData?.[`${keyPrefix}custom_column_ids`],
            'display_metadata': bundle.inputData?.[`${keyPrefix}display_metadata`],
            'engagement_window_days': bundle.inputData?.[`${keyPrefix}engagement_window_days`],
            'filters_json': bundle.inputData?.[`${keyPrefix}filters_json`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ingestion_sources': utils.childMapping(bundle.inputData?.[`${keyPrefix}ingestion_sources`], `${keyPrefix}ingestion_sources`, IngestionSource),
            'is_default': bundle.inputData?.[`${keyPrefix}is_default`],
            'is_deleted': bundle.inputData?.[`${keyPrefix}is_deleted`],
            'is_owned_by_user': bundle.inputData?.[`${keyPrefix}is_owned_by_user`],
            'is_scheduled': bundle.inputData?.[`${keyPrefix}is_scheduled`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'report_end_relative_days_in_past': bundle.inputData?.[`${keyPrefix}report_end_relative_days_in_past`],
            'report_format': bundle.inputData?.[`${keyPrefix}report_format`],
            'report_level': bundle.inputData?.[`${keyPrefix}report_level`],
            'report_start_relative_days_in_past': bundle.inputData?.[`${keyPrefix}report_start_relative_days_in_past`],
            'reporting_time_zone': bundle.inputData?.[`${keyPrefix}reporting_time_zone`],
            'sort_by': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}sort_by`)),
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
        }
    },
}
