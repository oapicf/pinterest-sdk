<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Product tag request item containing the pin_id of the product to tag.
 */
class ProductTagItem
{
    /**
     * Pin ID of the product pin to tag onto the hero pin.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $pin_id = null;

}
