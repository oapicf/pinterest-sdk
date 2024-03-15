<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A currency filter. This filter cannot be negated
 */
class CatalogsProductGroupCurrencyCriteria
{
    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     */
    public ?\App\DTO\NonNullableCatalogsCurrency $values = null;

    /**
     * @DTA\Data(field="negated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $negated = null;

}
