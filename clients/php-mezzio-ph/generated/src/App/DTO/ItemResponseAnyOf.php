<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemResponseAnyOf
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsType::class})
     * @var \App\DTO\CatalogsType|null
     */
    public $catalog_type;

    /**
     * The catalog retail item id in the merchant namespace
     * @DTA\Data(field="item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * The pins mapped to the item
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\Pin[]|null
     */
    public $pins;

    /**
     * @DTA\Data(field="attributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelAttributes::class})
     * @var \App\DTO\CatalogsHotelAttributes|null
     */
    public $attributes;

    /**
     * The catalog hotel id in the merchant namespace
     * @DTA\Data(field="hotel_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $hotel_id;

}
