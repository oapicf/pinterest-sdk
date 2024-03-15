<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomerListUpdateRequest
{
    /**
     * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @DTA\Data(field="records")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $records = null;

    /**
     * @DTA\Data(field="operation_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListOperationType::class})
     */
    public ?\App\DTO\UserListOperationType $operation_type = null;

    /**
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Exception::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Exception::class})
     */
    public ?\App\DTO\Exception $exceptions = null;

}
