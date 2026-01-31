const utils = require('../utils/utils');
const AdGroupSummaryStatus = require('../models/AdGroupSummaryStatus');
const AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics = require('../models/AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics');
const AdsAnalyticsMetricsFilter = require('../models/AdsAnalyticsMetricsFilter');
const CampaignSummaryStatus = require('../models/CampaignSummaryStatus');
const ConversionAttributionWindowDays = require('../models/ConversionAttributionWindowDays');
const ConversionReportAttributionType = require('../models/ConversionReportAttributionType');
const ConversionReportTimeType = require('../models/ConversionReportTimeType');
const DataOutputFormat = require('../models/DataOutputFormat');
const Granularity = require('../models/Granularity');
const MetricsReportingLevel = require('../models/MetricsReportingLevel');
const ObjectiveType = require('../models/ObjectiveType');
const PinPromotionSummaryStatus = require('../models/PinPromotionSummaryStatus');
const ProductGroupSummaryStatus = require('../models/ProductGroupSummaryStatus');
const ReportingColumnAsync = require('../models/ReportingColumnAsync');
const ReportingTimeZone = require('../models/ReportingTimeZone');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}attribution_types`,
                list: true,
                type: 'string',
                ...ConversionReportAttributionType.fields(`${keyPrefix}attribution_types`, isInput),
            },
            {
                key: `${keyPrefix}click_window_days`,
                ...ConversionAttributionWindowDays.fields(`${keyPrefix}click_window_days`, isInput),
            },
            {
                key: `${keyPrefix}conversion_report_time`,
                ...ConversionReportTimeType.fields(`${keyPrefix}conversion_report_time`, isInput),
            },
            {
                key: `${keyPrefix}end_date`,
                label: `Metric report end date (UTC). Format: YYYY-MM-DD - [${labelPrefix}end_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}engagement_window_days`,
                ...ConversionAttributionWindowDays.fields(`${keyPrefix}engagement_window_days`, isInput),
            },
            {
                key: `${keyPrefix}granularity`,
                ...Granularity.fields(`${keyPrefix}granularity`, isInput),
            },
            {
                key: `${keyPrefix}start_date`,
                label: `Metric report start date (UTC). Format: YYYY-MM-DD - [${labelPrefix}start_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}view_window_days`,
                ...ConversionAttributionWindowDays.fields(`${keyPrefix}view_window_days`, isInput),
            },
            {
                key: `${keyPrefix}campaign_ids`,
                label: `List of campaign ids - [${labelPrefix}campaign_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_statuses`,
                list: true,
                type: 'string',
                ...CampaignSummaryStatus.fields(`${keyPrefix}campaign_statuses`, isInput),
            },
            {
                key: `${keyPrefix}campaign_objective_types`,
                list: true,
                type: 'string',
                ...ObjectiveType.fields(`${keyPrefix}campaign_objective_types`, isInput),
            },
            {
                key: `${keyPrefix}campaign_brand_label`,
                label: `Campaign brand label for filtering. - [${labelPrefix}campaign_brand_label]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_group_ids`,
                label: `List of ad group ids - [${labelPrefix}ad_group_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_group_statuses`,
                list: true,
                type: 'string',
                ...AdGroupSummaryStatus.fields(`${keyPrefix}ad_group_statuses`, isInput),
            },
            {
                key: `${keyPrefix}ad_ids`,
                label: `List of ad ids [This parameter is no supported for Product Item Level Reports] - [${labelPrefix}ad_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_statuses`,
                list: true,
                type: 'string',
                ...PinPromotionSummaryStatus.fields(`${keyPrefix}ad_statuses`, isInput),
            },
            {
                key: `${keyPrefix}product_group_ids`,
                label: `List of product group ids - [${labelPrefix}product_group_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_group_statuses`,
                list: true,
                type: 'string',
                ...ProductGroupSummaryStatus.fields(`${keyPrefix}product_group_statuses`, isInput),
            },
            {
                key: `${keyPrefix}product_item_ids`,
                label: `List of product item ids - [${labelPrefix}product_item_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}targeting_types`,
                label: `List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. - [${labelPrefix}targeting_types]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}metrics_filters`,
                label: `[${labelPrefix}metrics_filters]`,
                children: AdsAnalyticsMetricsFilter.fields(`${keyPrefix}metrics_filters${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}columns`,
                list: true,
                type: 'string',
                ...ReportingColumnAsync.fields(`${keyPrefix}columns`, isInput),
            },
            {
                key: `${keyPrefix}combine_targeting_types`,
                label: `Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users. - [${labelPrefix}combine_targeting_types]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}custom_conversion_event_metrics`,
                label: `[${labelPrefix}custom_conversion_event_metrics]`,
                children: AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics.fields(`${keyPrefix}custom_conversion_event_metrics${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}end_hour`,
                label: `Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports. - [${labelPrefix}end_hour]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}level`,
                ...MetricsReportingLevel.fields(`${keyPrefix}level`, isInput),
            },
            {
                key: `${keyPrefix}primary_sort`,
                label: `Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. - [${labelPrefix}primary_sort]`,
                type: 'string',
                choices: [
                    'BY_ID',
                    'BY_DATE',
                ],
            },
            {
                key: `${keyPrefix}report_format`,
                ...DataOutputFormat.fields(`${keyPrefix}report_format`, isInput),
            },
            {
                key: `${keyPrefix}reporting_timezone`,
                ...ReportingTimeZone.fields(`${keyPrefix}reporting_timezone`, isInput),
            },
            {
                key: `${keyPrefix}start_hour`,
                label: `Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. - [${labelPrefix}start_hour]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attribution_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}attribution_types`], `${keyPrefix}attribution_types`, ConversionReportAttributionType),
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'conversion_report_time': bundle.inputData?.[`${keyPrefix}conversion_report_time`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'engagement_window_days': bundle.inputData?.[`${keyPrefix}engagement_window_days`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
            'campaign_ids': bundle.inputData?.[`${keyPrefix}campaign_ids`],
            'campaign_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaign_statuses`], `${keyPrefix}campaign_statuses`, CampaignSummaryStatus),
            'campaign_objective_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaign_objective_types`], `${keyPrefix}campaign_objective_types`, ObjectiveType),
            'campaign_brand_label': bundle.inputData?.[`${keyPrefix}campaign_brand_label`],
            'ad_group_ids': bundle.inputData?.[`${keyPrefix}ad_group_ids`],
            'ad_group_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_group_statuses`], `${keyPrefix}ad_group_statuses`, AdGroupSummaryStatus),
            'ad_ids': bundle.inputData?.[`${keyPrefix}ad_ids`],
            'ad_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_statuses`], `${keyPrefix}ad_statuses`, PinPromotionSummaryStatus),
            'product_group_ids': bundle.inputData?.[`${keyPrefix}product_group_ids`],
            'product_group_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_group_statuses`], `${keyPrefix}product_group_statuses`, ProductGroupSummaryStatus),
            'product_item_ids': bundle.inputData?.[`${keyPrefix}product_item_ids`],
            'targeting_types': bundle.inputData?.[`${keyPrefix}targeting_types`],
            'metrics_filters': utils.childMapping(bundle.inputData?.[`${keyPrefix}metrics_filters`], `${keyPrefix}metrics_filters`, AdsAnalyticsMetricsFilter),
            'columns': utils.childMapping(bundle.inputData?.[`${keyPrefix}columns`], `${keyPrefix}columns`, ReportingColumnAsync),
            'combine_targeting_types': bundle.inputData?.[`${keyPrefix}combine_targeting_types`],
            'custom_conversion_event_metrics': utils.childMapping(bundle.inputData?.[`${keyPrefix}custom_conversion_event_metrics`], `${keyPrefix}custom_conversion_event_metrics`, AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics),
            'end_hour': bundle.inputData?.[`${keyPrefix}end_hour`],
            'level': bundle.inputData?.[`${keyPrefix}level`],
            'primary_sort': bundle.inputData?.[`${keyPrefix}primary_sort`],
            'report_format': bundle.inputData?.[`${keyPrefix}report_format`],
            'reporting_timezone': bundle.inputData?.[`${keyPrefix}reporting_timezone`],
            'start_hour': bundle.inputData?.[`${keyPrefix}start_hour`],
        }
    },
}
