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
                key: `${keyPrefix}id`,
                label: `Template ID - [${labelPrefix}id]`,
                type: 'string',
            },
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
                key: `${keyPrefix}user_id`,
                label: `ID of the user who created the template - [${labelPrefix}user_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Template Name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}report_start_relative_days_in_past`,
                label: `The number of days prior to the day the report will be delivered at which the report will start - [${labelPrefix}report_start_relative_days_in_past]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}report_end_relative_days_in_past`,
                label: `The number of days prior to the day the report will be delivered at which the report will end - [${labelPrefix}report_end_relative_days_in_past]`,
                type: 'number',
            },
            ...TemplateResponse_date_range.fields(`${keyPrefix}date_range`, isInput),
            {
                key: `${keyPrefix}report_level`,
                ...MetricsReportingLevel.fields(`${keyPrefix}report_level`, isInput),
            },
            {
                key: `${keyPrefix}report_format`,
                ...DataOutputFormat.fields(`${keyPrefix}report_format`, isInput),
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
                key: `${keyPrefix}granularity`,
                ...Granularity.fields(`${keyPrefix}granularity`, isInput),
            },
            {
                key: `${keyPrefix}view_window_days`,
                label: `The length of the sliding window over which view conversions will be attributed - [${labelPrefix}view_window_days]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}click_window_days`,
                label: `The length of the sliding window over which click conversions will be attributed - [${labelPrefix}click_window_days]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}engagement_window_days`,
                label: `The length of the sliding window over which engagement conversions will be attributed - [${labelPrefix}engagement_window_days]`,
                type: 'number',
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
                key: `${keyPrefix}filters_json`,
                label: `A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values - [${labelPrefix}filters_json]`,
                type: 'string',
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
                key: `${keyPrefix}is_deleted`,
                label: `A boolean that indicates if the template has been deleted - [${labelPrefix}is_deleted]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Time of last update in seconds since Unix epoch - [${labelPrefix}updated_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}custom_column_ids`,
                label: `A list of custom column IDs - [${labelPrefix}custom_column_ids]`,
                list: true,
                type: 'string',
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
                key: `${keyPrefix}ingestion_sources`,
                label: `The filter on the conversion ingestion source method for conversion metrics - [${labelPrefix}ingestion_sources]`,
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
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'ad_account_ids': bundle.inputData?.[`${keyPrefix}ad_account_ids`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'report_start_relative_days_in_past': bundle.inputData?.[`${keyPrefix}report_start_relative_days_in_past`],
            'report_end_relative_days_in_past': bundle.inputData?.[`${keyPrefix}report_end_relative_days_in_past`],
            'date_range': utils.removeIfEmpty(TemplateResponse_date_range.mapping(bundle, `${keyPrefix}date_range`)),
            'report_level': bundle.inputData?.[`${keyPrefix}report_level`],
            'report_format': bundle.inputData?.[`${keyPrefix}report_format`],
            'columns': bundle.inputData?.[`${keyPrefix}columns`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'engagement_window_days': bundle.inputData?.[`${keyPrefix}engagement_window_days`],
            'conversion_report_time_type': bundle.inputData?.[`${keyPrefix}conversion_report_time_type`],
            'filters_json': bundle.inputData?.[`${keyPrefix}filters_json`],
            'is_owned_by_user': bundle.inputData?.[`${keyPrefix}is_owned_by_user`],
            'is_scheduled': bundle.inputData?.[`${keyPrefix}is_scheduled`],
            'creation_source': bundle.inputData?.[`${keyPrefix}creation_source`],
            'is_deleted': bundle.inputData?.[`${keyPrefix}is_deleted`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'custom_column_ids': bundle.inputData?.[`${keyPrefix}custom_column_ids`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'ingestion_sources': bundle.inputData?.[`${keyPrefix}ingestion_sources`],
        }
    },
}
