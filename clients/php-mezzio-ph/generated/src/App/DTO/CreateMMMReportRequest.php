<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateMMMReportRequest
{
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
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})$/"})
     * @var string|null
     */
    public $start_date;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^(\\d{4})-(\\d{2})-(\\d{2})$/"})
     * @var string|null
     */
    public $end_date;

    /**
     * DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.
     * @DTA\Data(field="granularity")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $granularity;

    /**
     * Level of the report
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $level;

    /**
     * List of targeting types
     * @DTA\Data(field="targeting_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection121::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection121::class})
     * @var \App\DTO\Collection121|null
     */
    public $targeting_types;

    /**
     * Metric and entity columns
     * @DTA\Data(field="columns")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection122::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection122::class})
     * @var \App\DTO\Collection122|null
     */
    public $columns;

    /**
     * A List of countries for filtering
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\TargetingAdvertiserCountry[]|null
     */
    public $countries;

}
