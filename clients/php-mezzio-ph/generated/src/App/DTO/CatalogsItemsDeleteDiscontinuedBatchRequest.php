<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object to discontinue catalogs items
 */
class CatalogsItemsDeleteDiscontinuedBatchRequest
{
    /**
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     * @var \App\DTO\Country|null
     */
    public $country;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Language::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Language::class})
     * @var \App\DTO\Language|null
     */
    public $language;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchOperation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchOperation::class})
     * @var \App\DTO\BatchOperation|null
     */
    public $operation;

    /**
     * Array with catalogs items
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ItemDeleteDiscontinuedBatchRecord[]|null
     */
    public $items;

}
