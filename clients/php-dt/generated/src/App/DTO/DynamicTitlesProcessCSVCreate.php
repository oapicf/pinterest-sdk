<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class DynamicTitlesProcessCSVCreate
{
    /**
     * The request_id returned from the GET uploads endpoint.
     * @DTA\Data(field="request_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $request_id = null;

}
