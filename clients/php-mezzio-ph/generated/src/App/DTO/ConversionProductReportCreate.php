<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class ConversionProductReportCreate
{
    /**
     * List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
     * @DTA\Data(field="ad_group_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection286::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection286::class})
     * @var \App\DTO\Collection286|null
     */
    public $ad_group_ids;

    /**
     * List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
     * @DTA\Data(field="campaign_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection287::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection287::class})
     * @var \App\DTO\Collection287|null
     */
    public $campaign_ids;

    /**
     * List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
     * @DTA\Data(field="campaign_objective_types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection288::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection288::class})
     * @var \App\DTO\Collection288|null
     */
    public $campaign_objective_types;

    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $click_window_days;

    /**
     * Metric and entity columns
     * @DTA\Data(field="columns")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection289::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection289::class})
     * @var \App\DTO\Collection289|null
     */
    public $columns;

    /**
     * Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
     * @DTA\Data(field="conversion_product_attribution_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionProductAttributionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionProductAttributionType::class})
     * @var \App\DTO\ConversionProductAttributionType|null
     */
    public $conversion_product_attribution_type;

    /**
     * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
     * @DTA\Data(field="conversion_product_breakdown", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionProductReportBreakdownType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionProductReportBreakdownType::class})
     * @var \App\DTO\ConversionProductReportBreakdownType|null
     */
    public $conversion_product_breakdown;

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @DTA\Data(field="conversion_report_time", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionReportTimeType::class})
     * @var \App\DTO\ConversionReportTimeType|null
     */
    public $conversion_report_time;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $end_date;

    /**
     * Report granularity for time-based metric aggregation
     * @DTA\Data(field="granularity")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionProductReportGranularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionProductReportGranularity::class})
     * @var \App\DTO\ConversionProductReportGranularity|null
     */
    public $granularity;

    /**
     * Level of the report
     * @DTA\Data(field="level")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionProductReportLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionProductReportLevel::class})
     * @var \App\DTO\ConversionProductReportLevel|null
     */
    public $level;

    /**
     * List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
     * @DTA\Data(field="product_sku_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection290::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection290::class})
     * @var \App\DTO\Collection290|null
     */
    public $product_sku_ids;

    /**
     * Name of the conversion product report
     * @DTA\Data(field="report_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $report_name;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $start_date;

    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConversionAttributionWindowDays::class})
     * @var \App\DTO\ConversionAttributionWindowDays|null
     */
    public $view_window_days;

}
