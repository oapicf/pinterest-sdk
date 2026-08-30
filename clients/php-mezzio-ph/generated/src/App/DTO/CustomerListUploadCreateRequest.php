<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CustomerListUploadCreateRequest
{
    /**
     * @DTA\Data(field="operation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListOperationType::class})
     * @var \App\DTO\UserListOperationType|null
     */
    public $operation;

    /**
     * Number of parts to upload the file in.
     * @DTA\Data(field="total_parts")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":10, "inclusive":true})
     * @var int|null
     */
    public $total_parts;

}
