<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdPreviewCreateFromPin
{
    /**
     * Pin ID.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_id;

}
