<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomerListUploadCreateRequest
{
    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListOperationType::class})
     */
    public ?\App\DTO\UserListOperationType $operation = null;

    /**
     * Number of parts to upload the file in.
     * @DTA\Data(field="total_parts")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":10})
     */
    public ?int $total_parts = null;

}
