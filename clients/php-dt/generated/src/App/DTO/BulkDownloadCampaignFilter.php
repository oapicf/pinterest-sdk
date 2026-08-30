<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BulkDownloadCampaignFilter
{
    /**
     * @DTA\Data(field="campaign_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection119::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection119::class})
     */
    public ?\App\DTO\Collection119 $campaign_status = null;

    /**
     * Unix UTC timestamp.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $end_time = null;

    /**
     * Campaign name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection120::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection120::class})
     */
    public ?\App\DTO\Collection120 $objective_type = null;

    /**
     * Unix UTC timestamp.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $start_time = null;

}
