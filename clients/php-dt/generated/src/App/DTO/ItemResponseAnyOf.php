<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemResponseAnyOf
{
    /**
     * @DTA\Data(field="catalog_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsType::class})
     */
    public ?\App\DTO\CatalogsType $catalog_type = null;

    /**
     * The catalog retail item id in the merchant namespace
     * @DTA\Data(field="item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * The pins mapped to the item
     * @DTA\Data(field="pins", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $pins = null;

    /**
     * @DTA\Data(field="attributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsHotelAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsHotelAttributes::class})
     */
    public ?\App\DTO\CatalogsHotelAttributes $attributes = null;

    /**
     * The catalog hotel id in the merchant namespace
     * @DTA\Data(field="hotel_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $hotel_id = null;

}
