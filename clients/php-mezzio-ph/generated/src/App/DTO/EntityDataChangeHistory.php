<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EntityDataChangeHistory
{
    /**
     * A string identifier representing the changed field on the entity
     * @DTA\Data(field="changed_field_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $changed_field_id;

    /**
     * The human readable name of the changed field on the entity
     * @DTA\Data(field="changed_field_name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $changed_field_name;

    /**
     * Specifies the type of the field&#39;s data values
     * @DTA\Data(field="data_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChangeHistoryDataType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChangeHistoryDataType::class})
     * @var \App\DTO\ChangeHistoryDataType|null
     */
    public $data_type;

    /**
     * A string representation of the value of the changed field, after the change
     * @DTA\Data(field="new_data_value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $new_data_value;

    /**
     * A string representation of the value of the changed field, before the change
     * @DTA\Data(field="old_data_value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $old_data_value;

}
