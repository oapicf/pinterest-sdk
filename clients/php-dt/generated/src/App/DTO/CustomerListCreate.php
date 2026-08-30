<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class CustomerListCreate
{
    /**
     * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
     * @DTA\Data(field="is_nca", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_nca = null;

    /**
     * Type of customer list (e.g., EMAIL, IDFA, MAID).
     * @DTA\Data(field="list_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListType::class})
     */
    public ?\App\DTO\UserListType $list_type = null;

    /**
     * Customer list name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @DTA\Data(field="records", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $records = null;

    /**
     * Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.
     * @DTA\Data(field="records_v2", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection190::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection190::class})
     */
    public ?\App\DTO\Collection190 $records_v2 = null;

}
