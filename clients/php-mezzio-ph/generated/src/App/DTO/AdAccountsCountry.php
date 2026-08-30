<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountsCountry
{
    /**
     * @DTA\Data(field="code")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $code;

    /**
     * Country currency.
     * @DTA\Data(field="currency")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $currency;

    /**
     * Country index
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $index;

    /**
     * Country name
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

}
