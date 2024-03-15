<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsProductGroupPricingCurrencyCriteria
{
    /**
     * @DTA\Data(field="operator")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $operator = null;

    /**
     * @DTA\Data(field="value")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?float $value = null;

    /**
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     */
    public ?\App\DTO\NonNullableCatalogsCurrency $currency = null;

    /**
     * @DTA\Data(field="negated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $negated = null;

}
