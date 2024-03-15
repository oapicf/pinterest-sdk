<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateMMMReportRequest
{
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
     * @DTA\Validator(name="Match", options={"pattern":"/^(\d{4})-(\d{2})-(\d{2})$/"})
     */
    public ?string $start_date = null;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @DTA\Data(field="end_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^(\d{4})-(\d{2})-(\d{2})$/"})
     */
    public ?string $end_date = null;

    /**
     * DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.
     * @DTA\Data(field="granularity")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $granularity = null;

    /**
     * Level of the report
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $level = null;

    /**
     * List of targeting types
     * @DTA\Data(field="targeting_types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection121::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection121::class})
     */
    public ?\App\DTO\Collection121 $targeting_types = null;

    /**
     * Metric and entity columns
     * @DTA\Data(field="columns")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection122::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection122::class})
     */
    public ?\App\DTO\Collection122 $columns = null;

    /**
     * A List of countries for filtering
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $countries = null;

}
