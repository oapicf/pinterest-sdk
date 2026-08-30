<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class ScheduleCreate
{
    /**
     * @DTA\Data(field="delta_value", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleDeltaValue::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleDeltaValue::class})
     * @var \App\DTO\ScheduleDeltaValue|null
     */
    public $delta_value;

    /**
     * Schedule end time. Unix timestamp in seconds.
     * @DTA\Data(field="end_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_timestamp;

    /**
     * entity ID.
     * @DTA\Data(field="entity_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $entity_id;

    /**
     * Specify the entity_type to get summary information
     * @DTA\Data(field="entity_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdAccountEntityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdAccountEntityType::class})
     * @var \App\DTO\AdAccountEntityType|null
     */
    public $entity_type;

    /**
     * Schedule name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The schedule action.
     * @DTA\Data(field="schedule_action", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAction::class})
     * @var \App\DTO\ScheduleAction|null
     */
    public $schedule_action;

    /**
     * Schedule status.
     * @DTA\Data(field="schedule_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleStatus::class})
     * @var \App\DTO\ScheduleStatus|null
     */
    public $schedule_status;

    /**
     * The schedule type.
     * @DTA\Data(field="schedule_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleType::class})
     * @var \App\DTO\ScheduleType|null
     */
    public $schedule_type;

    /**
     * Schedule start time. Unix timestamp in seconds.
     * @DTA\Data(field="start_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_timestamp;

}
