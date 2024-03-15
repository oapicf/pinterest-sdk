<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * ID of the bulk request.
 */
class BulkUpsertResponse
{
    /**
     * @DTA\Data(field="request_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $request_id = null;

}
