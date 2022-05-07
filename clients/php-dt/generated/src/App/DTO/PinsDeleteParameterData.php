<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for pins/delete
 */
class PinsDeleteParameterData
{
    /**
     * Unique identifier of a Pin.
     * @DTA\Data(subset="path", field="pin_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_id;

}
