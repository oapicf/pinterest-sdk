<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */
class CustomerListUpdateWithRequiredBody
{
    /**
     * Customer list update operation type (add or remove). Only valid in update request body.
     * @DTA\Data(field="operation_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListOperationType::class})
     * @var \App\DTO\UserListOperationType|null
     */
    public $operation_type;

    /**
     * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @DTA\Data(field="records", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $records;

    /**
     * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
     * @DTA\Data(field="records_v2", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection191::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection191::class})
     * @var \App\DTO\Collection191|null
     */
    public $records_v2;

}
