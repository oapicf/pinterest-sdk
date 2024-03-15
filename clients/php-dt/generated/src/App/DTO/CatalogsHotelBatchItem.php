<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Hotel batch item
 */
class CatalogsHotelBatchItem
{
    /**
     * The catalog hotel id in the merchant namespace
     * @DTA\Data(field="hotel_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $hotel_id = null;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $operation = null;

    /**
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsUpdatableHotelAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsUpdatableHotelAttributes::class})
     */
    public ?\App\DTO\CatalogsUpdatableHotelAttributes $attributes = null;

}
