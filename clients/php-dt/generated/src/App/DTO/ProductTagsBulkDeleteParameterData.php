<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for productTagsBulkDelete
 */
class ProductTagsBulkDeleteParameterData
{
    /**
     * Unique identifier of the hero pin that will receive product tags.
     * @DTA\Data(subset="path", field="pin_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $pin_id = null;

}
