<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * ID of the bulk request.
 */
class BulkUpsertStatusResponse
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BulkUpsertStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BulkUpsertStatus::class})
     * @var \App\DTO\BulkUpsertStatus|null
     */
    public $status;

    /**
     * @DTA\Data(field="result_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $result_url;

}
