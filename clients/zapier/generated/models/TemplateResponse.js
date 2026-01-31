const utils = require('../utils/utils');
const DataOutputFormat = require('../models/DataOutputFormat');
const Granularity = require('../models/Granularity');
const MetricsReportingLevel = require('../models/MetricsReportingLevel');
const TemplateResponse_date_range = require('../models/TemplateResponse_date_range');

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
                key: `${keyPrefix}click_window_days`,
                label: `The length of the sliding window over which click conversions will be attributed - [${labelPrefix}click_window_days]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}columns`,
                label: `A list of columns to be included in the report - [${labelPrefix}columns]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}conversion_report_time_type`,
                label: `Conversion report time type - [${labelPrefix}conversion_report_time_type]`,
                type: 'string',
                choices: [
                    'TIME_OF_AD_ACTION',
                    'TIME_OF_CONVERSION',
                ],
            },
            {
                key: `${keyPrefix}creation_source`,
                label: `The surface used to create this template - [${labelPrefix}creation_source]`,
                type: 'string',
                choices: [
                    'ADS_API',
                    'ADS_MANAGER_REPORTING_PAGE',
                    'ADS_MANAGER_REPORT_BUILDER',
                ],
            },
            {
                key: `${keyPrefix}custom_column_ids`,
                label: `A list of custom column IDs - [${labelPrefix}custom_column_ids]`,
                list: true,
                type: 'string',
            },
            ...TemplateResponse_date_range.fields(`${keyPrefix}date_range`, isInput),
            {
                key: `${keyPrefix}engagement_window_days`,
                label: `The length of the sliding window over which engagement conversions will be attributed - [${labelPrefix}engagement_window_days]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}filters_json`,
                label: `A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values - [${labelPrefix}filters_json]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}granularity`,
                ...Granularity.fields(`${keyPrefix}granularity`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `Template ID - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ingestion_sources`,
                label: `The filter on the conversion ingestion source method for conversion metrics - [${labelPrefix}ingestion_sources]`,
                list: true,
                type: 'string',
                choices: [
                ],
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
                key: `${keyPrefix}type`,
                label: `Reporting template type - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'UNSPECIFIED',
                    'BULK',
                    'OVERVIEW',
                    'TABLE',
                ],
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
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'columns': bundle.inputData?.[`${keyPrefix}columns`],
            'conversion_report_time_type': bundle.inputData?.[`${keyPrefix}conversion_report_time_type`],
            'creation_source': bundle.inputData?.[`${keyPrefix}creation_source`],
            'custom_column_ids': bundle.inputData?.[`${keyPrefix}custom_column_ids`],
            'date_range': utils.removeIfEmpty(TemplateResponse_date_range.mapping(bundle, `${keyPrefix}date_range`)),
            'engagement_window_days': bundle.inputData?.[`${keyPrefix}engagement_window_days`],
            'filters_json': bundle.inputData?.[`${keyPrefix}filters_json`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ingestion_sources': bundle.inputData?.[`${keyPrefix}ingestion_sources`],
            'is_deleted': bundle.inputData?.[`${keyPrefix}is_deleted`],
            'is_owned_by_user': bundle.inputData?.[`${keyPrefix}is_owned_by_user`],
            'is_scheduled': bundle.inputData?.[`${keyPrefix}is_scheduled`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'report_end_relative_days_in_past': bundle.inputData?.[`${keyPrefix}report_end_relative_days_in_past`],
            'report_format': bundle.inputData?.[`${keyPrefix}report_format`],
            'report_level': bundle.inputData?.[`${keyPrefix}report_level`],
            'report_start_relative_days_in_past': bundle.inputData?.[`${keyPrefix}report_start_relative_days_in_past`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
        }
    },
}
