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
     */
    public ?\App\DTO\ScheduleDeltaValue $delta_value = null;

    /**
     * Schedule end time. Unix timestamp in seconds.
     * @DTA\Data(field="end_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $end_timestamp = null;

    /**
     * entity ID.
     * @DTA\Data(field="entity_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $entity_id = null;

    /**
     * Specify the entity_type to get summary information
     * @DTA\Data(field="entity_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdAccountEntityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdAccountEntityType::class})
     */
    public ?\App\DTO\AdAccountEntityType $entity_type = null;

    /**
     * Schedule name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * The schedule action.
     * @DTA\Data(field="schedule_action", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAction::class})
     */
    public ?\App\DTO\ScheduleAction $schedule_action = null;

    /**
     * Schedule status.
     * @DTA\Data(field="schedule_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleStatus::class})
     */
    public ?\App\DTO\ScheduleStatus $schedule_status = null;

    /**
     * The schedule type.
     * @DTA\Data(field="schedule_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleType::class})
     */
    public ?\App\DTO\ScheduleType $schedule_type = null;

    /**
     * Schedule start time. Unix timestamp in seconds.
     * @DTA\Data(field="start_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $start_timestamp = null;

}
