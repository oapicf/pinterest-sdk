<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object of catalogs items batch
 */
class CatalogsItemsBatchRequest
{
    /**
     * @DTA\Data(field="country", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $country;

    /**
     * @DTA\Data(field="language", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Language::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Language::class})
     * @var \App\DTO\Language|null
     */
    public $language;

    /**
     * @DTA\Data(field="operation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchOperation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchOperation::class})
     * @var \App\DTO\BatchOperation|null
     */
    public $operation;

    /**
     * Array with catalogs items
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection47::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection47::class})
     * @var \App\DTO\Collection47|null
     */
    public $items;

}
