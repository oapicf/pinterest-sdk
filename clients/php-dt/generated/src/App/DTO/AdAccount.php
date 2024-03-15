<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccount
{
    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="owner", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdAccountOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdAccountOwner::class})
     */
    public ?\App\DTO\AdAccountOwner $owner = null;

    /**
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency = null;

    /**
     * @DTA\Data(field="permissions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     */
    public ?\App\DTO\Collection $permissions = null;

    /**
     * Creation time. Unix timestamp in seconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Last update time. Unix timestamp in seconds.
     * @DTA\Data(field="updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $updated_time = null;

}
