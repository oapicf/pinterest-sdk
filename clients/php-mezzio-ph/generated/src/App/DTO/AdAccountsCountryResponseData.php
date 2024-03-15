<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountsCountryResponseData
{
    /**
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdCountry::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdCountry::class})
     * @var \App\DTO\AdCountry|null
     */
    public $code;

    /**
     * Country currency.
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $currency;

    /**
     * Country index
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $index;

    /**
     * Country name
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

}
