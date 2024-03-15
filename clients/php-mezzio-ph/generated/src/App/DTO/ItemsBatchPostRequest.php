<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemsBatchPostRequest
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsType::class})
     * @var \App\DTO\CatalogsType|null
     */
    public $catalog_type;

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
     * Array with catalogs items
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ItemDeleteBatchRecord[]|null
     */
    public $items;

    /**
     * Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $catalog_id;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BatchOperation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BatchOperation::class})
     * @var \App\DTO\BatchOperation|null
     */
    public $operation;

}
