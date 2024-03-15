<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Template fields
 */
class TemplateResponse
{
    /**
     * Template ID
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * ID of the Ad Account that owns the template
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ad_account_id = null;

    /**
     * IDs of the Ad Accounts that have access to this template
     * @DTA\Data(field="ad_account_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $ad_account_ids = null;

    /**
     * ID of the user who created the template
     * @DTA\Data(field="user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user_id = null;

    /**
     * Template Name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The number of days prior to the day the report will be delivered at which the report will start
     * @DTA\Data(field="report_start_relative_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $report_start_relative_days_in_past = null;

    /**
     * The number of days prior to the day the report will be delivered at which the report will end
     * @DTA\Data(field="report_end_relative_days_in_past", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $report_end_relative_days_in_past = null;

    /**
     * @DTA\Data(field="date_range", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TemplateResponseDateRange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TemplateResponseDateRange::class})
     */
    public ?\App\DTO\TemplateResponseDateRange $date_range = null;

    /**
     * @DTA\Data(field="report_level", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MetricsReportingLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MetricsReportingLevel::class})
     */
    public ?\App\DTO\MetricsReportingLevel $report_level = null;

    /**
     * @DTA\Data(field="report_format", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DataOutputFormat::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DataOutputFormat::class})
     */
    public ?\App\DTO\DataOutputFormat $report_format = null;

    /**
     * A list of columns to be included in the report
     * @DTA\Data(field="columns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $columns = null;

    /**
     * @DTA\Data(field="granularity", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Granularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Granularity::class})
     */
    public ?\App\DTO\Granularity $granularity = null;

    /**
     * The length of the sliding window over which view conversions will be attributed
     * @DTA\Data(field="view_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $view_window_days = null;

    /**
     * The length of the sliding window over which click conversions will be attributed
     * @DTA\Data(field="click_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $click_window_days = null;

    /**
     * The length of the sliding window over which engagement conversions will be attributed
     * @DTA\Data(field="engagement_window_days", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $engagement_window_days = null;

    /**
     * Conversion report time type
     * @DTA\Data(field="conversion_report_time_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $conversion_report_time_type = null;

    /**
     * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values
     * @DTA\Data(field="filters_json", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $filters_json = null;

    /**
     * A boolean value that indicates if the user owns the template
     * @DTA\Data(field="is_owned_by_user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_owned_by_user = null;

    /**
     * A boolean value that indicates if this template has been used to create a scheduled report
     * @DTA\Data(field="is_scheduled", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_scheduled = null;

    /**
     * The surface used to create this template
     * @DTA\Data(field="creation_source", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $creation_source = null;

    /**
     * A boolean that indicates if the template has been deleted
     * @DTA\Data(field="is_deleted", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_deleted = null;

    /**
     * Time of last update in seconds since Unix epoch
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $updated_time = null;

    /**
     * A list of custom column IDs
     * @DTA\Data(field="custom_column_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $custom_column_ids = null;

    /**
     * Reporting template type
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The filter on the conversion ingestion source method for conversion metrics
     * @DTA\Data(field="ingestion_sources", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $ingestion_sources = null;

}
