<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupPricingCurrencyCriteria
{
    /**
     * @DTA\Data(field="operator")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $operator;

    /**
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var float|null
     */
    public $value;

    /**
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @var \App\DTO\NonNullableCatalogsCurrency|null
     */
    public $currency;

    /**
     * @DTA\Data(field="negated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $negated;

}
