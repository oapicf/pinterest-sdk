<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountCreateRequest
{
    /**
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * Ad Account name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":256})
     */
    public ?string $name = null;

    /**
     * Advertiser&#39;s owning user ID.
     * @DTA\Data(field="owner_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $owner_user_id = null;

}
