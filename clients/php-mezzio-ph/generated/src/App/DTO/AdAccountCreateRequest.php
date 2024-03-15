<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountCreateRequest
{
    /**
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $country;

    /**
     * Ad Account name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":256})
     * @var string|null
     */
    public $name;

    /**
     * Advertiser&#39;s owning user ID.
     * @DTA\Data(field="owner_user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $owner_user_id;

}
