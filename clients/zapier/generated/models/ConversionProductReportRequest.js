const utils = require('../utils/utils');
const ConversionAttributionWindowDays = require('../models/ConversionAttributionWindowDays');
const ConversionProductReportingColumn = require('../models/ConversionProductReportingColumn');
const ConversionReportTimeType = require('../models/ConversionReportTimeType');
const ObjectiveType = require('../models/ObjectiveType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_group_ids`,
                label: `List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP. - [${labelPrefix}ad_group_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_ids`,
                label: `List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN. - [${labelPrefix}campaign_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_objective_types`,
                list: true,
                type: 'string',
                ...ObjectiveType.fields(`${keyPrefix}campaign_objective_types`, isInput),
            },
            {
                key: `${keyPrefix}click_window_days`,
                ...ConversionAttributionWindowDays.fields(`${keyPrefix}click_window_days`, isInput),
            },
            {
                key: `${keyPrefix}columns`,
                list: true,
                type: 'string',
                ...ConversionProductReportingColumn.fields(`${keyPrefix}columns`, isInput),
            },
            {
                key: `${keyPrefix}conversion_product_attribution_type`,
                label: `[${labelPrefix}conversion_product_attribution_type]`,
                type: 'string',
                choices: [
                    'DEFAULT',
                    'BRAND_ATTRIBUTION',
                ],
            },
            {
                key: `${keyPrefix}conversion_product_breakdown`,
                label: `[${labelPrefix}conversion_product_breakdown]`,
                type: 'string',
                choices: [
                    'PRODUCT_BRAND',
                    'PRODUCT_CATEGORY',
                    'PRODUCT_BRAND_AND_CATEGORY',
                    'PRODUCT_SKU',
                    'PRODUCT_SKU_GROUP',
                ],
            },
            {
                key: `${keyPrefix}conversion_report_time`,
                ...ConversionReportTimeType.fields(`${keyPrefix}conversion_report_time`, isInput),
            },
            {
                key: `${keyPrefix}end_date`,
                label: `Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports. - [${labelPrefix}end_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}granularity`,
                label: `TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly. - [${labelPrefix}granularity]`,
                required: true,
                type: 'string',
                choices: [
                    'WEEK',
                    'MONTH',
                    'TOTAL',
                ],
            },
            {
                key: `${keyPrefix}level`,
                label: `Level of the report - [${labelPrefix}level]`,
                required: true,
                type: 'string',
                choices: [
                    'ADVERTISER',
                    'CAMPAIGN',
                    'AD_GROUP',
                ],
            },
            {
                key: `${keyPrefix}product_sku_ids`,
                label: `List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. - [${labelPrefix}product_sku_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}report_name`,
                label: `Name of the conversion product report. - [${labelPrefix}report_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_date`,
                label: `Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required. - [${labelPrefix}start_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}view_window_days`,
                ...ConversionAttributionWindowDays.fields(`${keyPrefix}view_window_days`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_group_ids': bundle.inputData?.[`${keyPrefix}ad_group_ids`],
            'campaign_ids': bundle.inputData?.[`${keyPrefix}campaign_ids`],
            'campaign_objective_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaign_objective_types`], `${keyPrefix}campaign_objective_types`, ObjectiveType),
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'columns': utils.childMapping(bundle.inputData?.[`${keyPrefix}columns`], `${keyPrefix}columns`, ConversionProductReportingColumn),
            'conversion_product_attribution_type': bundle.inputData?.[`${keyPrefix}conversion_product_attribution_type`],
            'conversion_product_breakdown': bundle.inputData?.[`${keyPrefix}conversion_product_breakdown`],
            'conversion_report_time': bundle.inputData?.[`${keyPrefix}conversion_report_time`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'level': bundle.inputData?.[`${keyPrefix}level`],
            'product_sku_ids': bundle.inputData?.[`${keyPrefix}product_sku_ids`],
            'report_name': bundle.inputData?.[`${keyPrefix}report_name`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
        }
    },
}
