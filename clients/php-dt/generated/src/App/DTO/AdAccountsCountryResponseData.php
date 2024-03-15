<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountsCountryResponseData
{
    /**
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCountry::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCountry::class})
     */
    public ?\App\DTO\AdCountry $code = null;

    /**
     * Country currency.
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $currency = null;

    /**
     * Country index
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $index = null;

    /**
     * Country name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
