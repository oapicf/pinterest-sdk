const utils = require('../utils/utils');
const AdAdsAnalyticsAsyncTargetingTypes = require('../models/AdAdsAnalyticsAsyncTargetingTypes');
const AdGroupSummaryStatus = require('../models/AdGroupSummaryStatus');
const AdsAnalyticsMetricsFilter = require('../models/AdsAnalyticsMetricsFilter');
const CampaignObjectiveType = require('../models/CampaignObjectiveType');
const CampaignSummaryStatus = require('../models/CampaignSummaryStatus');
const ConversionAttributionWindowDays = require('../models/ConversionAttributionWindowDays');
const ConversionReportAttributionType = require('../models/ConversionReportAttributionType');
const ConversionReportTimeType = require('../models/ConversionReportTimeType');
const CustomConversionEventMetrics = require('../models/CustomConversionEventMetrics');
const DataOutputFormat = require('../models/DataOutputFormat');
const Granularity = require('../models/Granularity');
const MetricsReportingLevel = require('../models/MetricsReportingLevel');
const PinPromotionSummaryStatus = require('../models/PinPromotionSummaryStatus');
const PrimarySort = require('../models/PrimarySort');
const ProductGroupSummaryStatus = require('../models/ProductGroupSummaryStatus');
const ReportingColumnAsync = require('../models/ReportingColumnAsync');
const ReportingTimeZone = require('../models/ReportingTimeZone');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                label: `List of ad ids. This parameter is not supported for Product Item level reports. - [${labelPrefix}ad_ids]`,
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
                key: `${keyPrefix}attribution_types`,
                list: true,
                type: 'string',
                ...ConversionReportAttributionType.fields(`${keyPrefix}attribution_types`, isInput),
            },
            {
                key: `${keyPrefix}campaign_brand_label`,
                label: `Campaign brand label for filtering. - [${labelPrefix}campaign_brand_label]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_custom_label`,
                label: `Campaign custom label for filtering. - [${labelPrefix}campaign_custom_label]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_ids`,
                label: `List of campaign ids - [${labelPrefix}campaign_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}campaign_objective_types`,
                list: true,
                type: 'string',
                ...CampaignObjectiveType.fields(`${keyPrefix}campaign_objective_types`, isInput),
            },
            {
                key: `${keyPrefix}campaign_statuses`,
                list: true,
                type: 'string',
                ...CampaignSummaryStatus.fields(`${keyPrefix}campaign_statuses`, isInput),
            },
            {
                key: `${keyPrefix}click_window_days`,
                ...ConversionAttributionWindowDays.fields(`${keyPrefix}click_window_days`, isInput),
            },
            {
                key: `${keyPrefix}columns`,
                list: true,
                type: 'string',
                ...ReportingColumnAsync.fields(`${keyPrefix}columns`, isInput),
            },
            {
                key: `${keyPrefix}combine_targeting_types`,
                label: `Determines if the targeting types included in the request should be consolidated into a single breakdown. - [${labelPrefix}combine_targeting_types]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}conversion_report_time`,
                ...ConversionReportTimeType.fields(`${keyPrefix}conversion_report_time`, isInput),
            },
            {
                key: `${keyPrefix}custom_conversion_event_metrics`,
                label: `[${labelPrefix}custom_conversion_event_metrics]`,
                children: CustomConversionEventMetrics.fields(`${keyPrefix}custom_conversion_event_metrics${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}end_date`,
                label: `Metric report end date (UTC). Format: YYYY-MM-DD - [${labelPrefix}end_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}end_hour`,
                label: `Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. - [${labelPrefix}end_hour]`,
                type: 'integer',
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
                key: `${keyPrefix}level`,
                ...MetricsReportingLevel.fields(`${keyPrefix}level`, isInput),
            },
            {
                key: `${keyPrefix}metrics_filters`,
                label: `[${labelPrefix}metrics_filters]`,
                children: AdsAnalyticsMetricsFilter.fields(`${keyPrefix}metrics_filters${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}primary_sort`,
                ...PrimarySort.fields(`${keyPrefix}primary_sort`, isInput),
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
                key: `${keyPrefix}report_format`,
                ...DataOutputFormat.fields(`${keyPrefix}report_format`, isInput),
            },
            {
                key: `${keyPrefix}reporting_timezone`,
                ...ReportingTimeZone.fields(`${keyPrefix}reporting_timezone`, isInput),
            },
            {
                key: `${keyPrefix}start_date`,
                label: `Metric report start date (UTC). Format: YYYY-MM-DD - [${labelPrefix}start_date]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_hour`,
                label: `Which hour of the start date to begin the report. Only allowed for hourly reports. - [${labelPrefix}start_hour]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}targeting_types`,
                list: true,
                type: 'string',
                ...AdAdsAnalyticsAsyncTargetingTypes.fields(`${keyPrefix}targeting_types`, isInput),
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
            'ad_group_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_group_statuses`], `${keyPrefix}ad_group_statuses`, AdGroupSummaryStatus),
            'ad_ids': bundle.inputData?.[`${keyPrefix}ad_ids`],
            'ad_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}ad_statuses`], `${keyPrefix}ad_statuses`, PinPromotionSummaryStatus),
            'attribution_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}attribution_types`], `${keyPrefix}attribution_types`, ConversionReportAttributionType),
            'campaign_brand_label': bundle.inputData?.[`${keyPrefix}campaign_brand_label`],
            'campaign_custom_label': bundle.inputData?.[`${keyPrefix}campaign_custom_label`],
            'campaign_ids': bundle.inputData?.[`${keyPrefix}campaign_ids`],
            'campaign_objective_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaign_objective_types`], `${keyPrefix}campaign_objective_types`, CampaignObjectiveType),
            'campaign_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}campaign_statuses`], `${keyPrefix}campaign_statuses`, CampaignSummaryStatus),
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'columns': utils.childMapping(bundle.inputData?.[`${keyPrefix}columns`], `${keyPrefix}columns`, ReportingColumnAsync),
            'combine_targeting_types': bundle.inputData?.[`${keyPrefix}combine_targeting_types`],
            'conversion_report_time': bundle.inputData?.[`${keyPrefix}conversion_report_time`],
            'custom_conversion_event_metrics': utils.childMapping(bundle.inputData?.[`${keyPrefix}custom_conversion_event_metrics`], `${keyPrefix}custom_conversion_event_metrics`, CustomConversionEventMetrics),
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
            'end_hour': bundle.inputData?.[`${keyPrefix}end_hour`],
            'engagement_window_days': bundle.inputData?.[`${keyPrefix}engagement_window_days`],
            'granularity': bundle.inputData?.[`${keyPrefix}granularity`],
            'level': bundle.inputData?.[`${keyPrefix}level`],
            'metrics_filters': utils.childMapping(bundle.inputData?.[`${keyPrefix}metrics_filters`], `${keyPrefix}metrics_filters`, AdsAnalyticsMetricsFilter),
            'primary_sort': bundle.inputData?.[`${keyPrefix}primary_sort`],
            'product_group_ids': bundle.inputData?.[`${keyPrefix}product_group_ids`],
            'product_group_statuses': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_group_statuses`], `${keyPrefix}product_group_statuses`, ProductGroupSummaryStatus),
            'product_item_ids': bundle.inputData?.[`${keyPrefix}product_item_ids`],
            'report_format': bundle.inputData?.[`${keyPrefix}report_format`],
            'reporting_timezone': bundle.inputData?.[`${keyPrefix}reporting_timezone`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
            'start_hour': bundle.inputData?.[`${keyPrefix}start_hour`],
            'targeting_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}targeting_types`], `${keyPrefix}targeting_types`, AdAdsAnalyticsAsyncTargetingTypes),
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
        }
    },
}
