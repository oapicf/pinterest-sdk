<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsProductGroupCurrencyCriteria
{
    /**
     * @DTA\Data(field="values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @var \App\DTO\NonNullableCatalogsCurrency|null
     */
    public $values;

    /**
     * @DTA\Data(field="negated")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $negated;

}
