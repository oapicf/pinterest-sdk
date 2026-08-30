<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class MMMReportCreate
{
    /**
     * Advertiser IDs for multi-advertiser report
     * @DTA\Data(field="advertiser_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection241::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection241::class})
     * @var \App\DTO\Collection241|null
     */
    public $advertiser_ids;

    /**
     * Metric and entity columns
     * @DTA\Data(field="columns")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection242::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection242::class})
     * @var \App\DTO\Collection242|null
     */
    public $columns;

    /**
     * A List of countries for filtering
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection243::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection243::class})
     * @var \App\DTO\Collection243|null
     */
    public $countries;

    /**
     * List of custom column IDs
     * @DTA\Data(field="custom_column_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection244::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection244::class})
     * @var \App\DTO\Collection244|null
     */
    public $custom_column_ids;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $end_date;

    /**
     * DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
     * @DTA\Data(field="granularity")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MMMReportGranularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MMMReportGranularity::class})
     * @var \App\DTO\MMMReportGranularity|null
     */
    public $granularity;

    /**
     * Level of the report
     * @DTA\Data(field="level")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MMMReportLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MMMReportLevel::class})
     * @var \App\DTO\MMMReportLevel|null
     */
    public $level;

    /**
     * Name of the Marketing Mix Modeling (MMM) report
     * @DTA\Data(field="report_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $report_name;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $start_date;

    /**
     * List of targeting types
     * @DTA\Data(field="targeting_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection245::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection245::class})
     * @var \App\DTO\Collection245|null
     */
    public $targeting_types;

}
