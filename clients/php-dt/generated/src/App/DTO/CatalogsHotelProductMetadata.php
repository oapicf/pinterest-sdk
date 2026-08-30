<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Hotel product metadata entity
 */
class CatalogsHotelProductMetadata
{
    /**
     * The user-created unique ID that represents the hotel item.
     * @DTA\Data(field="hotel_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $hotel_id = null;

}
