<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomerListRequest
{
    /**
     * Customer list name.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
     * @DTA\Data(field="records")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $records = null;

    /**
     * @DTA\Data(field="list_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UserListType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UserListType::class})
     */
    public ?\App\DTO\UserListType $list_type = null;

    /**
     * Customer list errors.
     * @DTA\Data(field="exceptions", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $exceptions = null;

}
