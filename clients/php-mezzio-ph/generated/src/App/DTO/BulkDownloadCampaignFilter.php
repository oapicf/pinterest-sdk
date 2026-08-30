<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BulkDownloadCampaignFilter
{
    /**
     * @DTA\Data(field="campaign_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection119::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection119::class})
     * @var \App\DTO\Collection119|null
     */
    public $campaign_status;

    /**
     * Unix UTC timestamp.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $end_time;

    /**
     * Campaign name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection120::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection120::class})
     * @var \App\DTO\Collection120|null
     */
    public $objective_type;

    /**
     * Unix UTC timestamp.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $start_time;

}
