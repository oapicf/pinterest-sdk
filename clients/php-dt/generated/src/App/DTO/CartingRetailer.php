<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CartingRetailer
{
    /**
     * Unique identifier for the retailer
     * @DTA\Data(field="retailer_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $retailer_id = null;

    /**
     * Name of the retailer
     * @DTA\Data(field="retailer_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $retailer_name = null;

}
