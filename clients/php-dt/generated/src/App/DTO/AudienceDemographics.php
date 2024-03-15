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
     */
    public ?\App\DTO\Collection50 $ages = null;

    /**
     * Gender distribution.
     * @DTA\Data(field="genders", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection51::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection51::class})
     */
    public ?\App\DTO\Collection51 $genders = null;

    /**
     * Device usage distribution.
     * @DTA\Data(field="devices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection52::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection52::class})
     */
    public ?\App\DTO\Collection52 $devices = null;

    /**
     * Geographic metro area distribution.
     * @DTA\Data(field="metros", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection53::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection53::class})
     */
    public ?\App\DTO\Collection53 $metros = null;

    /**
     * Country area distribution.
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection54::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection54::class})
     */
    public ?\App\DTO\Collection54 $countries = null;

}
