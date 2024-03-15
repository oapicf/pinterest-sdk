<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A hotel item to be deleted
 */
class CatalogsDeleteHotelItem
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

}
