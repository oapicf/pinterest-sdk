<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BulkDownloadResponse
{
    /**
     * ID of the bulk request.
     * @DTA\Data(field="request_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $request_id = null;

}
