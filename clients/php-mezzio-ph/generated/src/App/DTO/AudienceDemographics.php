<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Audience demographics
 */
class AudienceDemographics
{
    /**
     * Ages distribution.
     * @DTA\Data(field="ages", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection50::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection50::class})
     * @var \App\DTO\Collection50|null
     */
    public $ages;

    /**
     * Gender distribution.
     * @DTA\Data(field="genders", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection51::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection51::class})
     * @var \App\DTO\Collection51|null
     */
    public $genders;

    /**
     * Device usage distribution.
     * @DTA\Data(field="devices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection52::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection52::class})
     * @var \App\DTO\Collection52|null
     */
    public $devices;

    /**
     * Geographic metro area distribution.
     * @DTA\Data(field="metros", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection53::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection53::class})
     * @var \App\DTO\Collection53|null
     */
    public $metros;

    /**
     * Country area distribution.
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection54::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection54::class})
     * @var \App\DTO\Collection54|null
     */
    public $countries;

}
