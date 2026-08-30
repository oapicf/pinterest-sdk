<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EntityHistory
{
    /**
     * A Unix timestamp representing the time of the change in seconds
     * @DTA\Data(field="change_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $change_timestamp = null;

    /**
     * Properties associated with a particular change to an entity&#39;s data
     * @DTA\Data(field="data_changes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $data_changes = null;

    /**
     * The id of the entity that was changed
     * @DTA\Data(field="entity_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $entity_id = null;

    /**
     * The name of the entity that was changed
     * @DTA\Data(field="entity_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entity_name = null;

    /**
     * The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
     * @DTA\Data(field="ldap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ldap = null;

    /**
     * The type of operation that caused the change
     * @DTA\Data(field="operation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChangeHistoryOperationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChangeHistoryOperationType::class})
     */
    public ?\App\DTO\ChangeHistoryOperationType $operation = null;

    /**
     * The id of the user who initiated the change
     * @DTA\Data(field="user_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $user_id = null;

}
