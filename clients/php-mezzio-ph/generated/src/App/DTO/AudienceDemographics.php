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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection94::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection94::class})
     * @var \App\DTO\Collection94|null
     */
    public $ages;

    /**
     * Country area distribution.
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection95::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection95::class})
     * @var \App\DTO\Collection95|null
     */
    public $countries;

    /**
     * Device usage distribution.
     * @DTA\Data(field="devices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection96::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection96::class})
     * @var \App\DTO\Collection96|null
     */
    public $devices;

    /**
     * Gender distribution.
     * @DTA\Data(field="genders", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection97::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection97::class})
     * @var \App\DTO\Collection97|null
     */
    public $genders;

    /**
     * Geographic metro area distribution.
     * @DTA\Data(field="metros", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection98::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection98::class})
     * @var \App\DTO\Collection98|null
     */
    public $metros;

}
