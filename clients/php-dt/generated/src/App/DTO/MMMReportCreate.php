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
     */
    public ?\App\DTO\Collection241 $advertiser_ids = null;

    /**
     * Metric and entity columns
     * @DTA\Data(field="columns")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection242::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection242::class})
     */
    public ?\App\DTO\Collection242 $columns = null;

    /**
     * A List of countries for filtering
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection243::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection243::class})
     */
    public ?\App\DTO\Collection243 $countries = null;

    /**
     * List of custom column IDs
     * @DTA\Data(field="custom_column_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection244::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection244::class})
     */
    public ?\App\DTO\Collection244 $custom_column_ids = null;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d{4}-\d{2}-\d{2}$/"})
     */
    public ?string $end_date = null;

    /**
     * DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
     * @DTA\Data(field="granularity")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MMMReportGranularity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MMMReportGranularity::class})
     */
    public ?\App\DTO\MMMReportGranularity $granularity = null;

    /**
     * Level of the report
     * @DTA\Data(field="level")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MMMReportLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MMMReportLevel::class})
     */
    public ?\App\DTO\MMMReportLevel $level = null;

    /**
     * Name of the Marketing Mix Modeling (MMM) report
     * @DTA\Data(field="report_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $report_name = null;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d{4}-\d{2}-\d{2}$/"})
     */
    public ?string $start_date = null;

    /**
     * List of targeting types
     * @DTA\Data(field="targeting_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection245::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection245::class})
     */
    public ?\App\DTO\Collection245 $targeting_types = null;

}
