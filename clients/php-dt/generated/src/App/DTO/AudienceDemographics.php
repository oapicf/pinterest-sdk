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
     */
    public ?\App\DTO\Collection94 $ages = null;

    /**
     * Country area distribution.
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection95::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection95::class})
     */
    public ?\App\DTO\Collection95 $countries = null;

    /**
     * Device usage distribution.
     * @DTA\Data(field="devices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection96::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection96::class})
     */
    public ?\App\DTO\Collection96 $devices = null;

    /**
     * Gender distribution.
     * @DTA\Data(field="genders", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection97::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection97::class})
     */
    public ?\App\DTO\Collection97 $genders = null;

    /**
     * Geographic metro area distribution.
     * @DTA\Data(field="metros", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection98::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection98::class})
     */
    public ?\App\DTO\Collection98 $metros = null;

}
