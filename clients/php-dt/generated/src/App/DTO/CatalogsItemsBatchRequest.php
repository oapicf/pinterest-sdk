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
     * @DTA\Data(field="country")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Country::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Country::class})
     */
    public ?\App\DTO\Country $country = null;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Language::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Language::class})
     */
    public ?\App\DTO\Language $language = null;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchOperation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchOperation::class})
     */
    public ?\App\DTO\BatchOperation $operation = null;

    /**
     * Array with catalogs items
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $items = null;

}
