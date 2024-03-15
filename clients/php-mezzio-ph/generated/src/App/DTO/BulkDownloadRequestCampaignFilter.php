<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BulkDownloadRequestCampaignFilter
{
    /**
     * Unix UTC timestamp.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $start_time;

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
     * @DTA\Data(field="campaign_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection67::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection67::class})
     * @var \App\DTO\Collection67|null
     */
    public $campaign_status;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection68::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection68::class})
     * @var \App\DTO\Collection68|null
     */
    public $objective_type;

}
