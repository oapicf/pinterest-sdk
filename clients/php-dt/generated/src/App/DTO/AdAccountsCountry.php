<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountsCountry
{
    /**
     * @DTA\Data(field="code")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $code = null;

    /**
     * Country currency.
     * @DTA\Data(field="currency")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $currency = null;

    /**
     * Country index
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $index = null;

    /**
     * Country name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
