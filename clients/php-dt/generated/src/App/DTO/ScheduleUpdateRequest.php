<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ScheduleUpdateRequest
{
    /**
     * @DTA\Data(field="entity_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^[C]?\d+$/"})
     */
    public ?string $entity_id = null;

    /**
     * Entity type
     * @DTA\Data(field="entity_type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $entity_type = null;

    /**
     * Schedule ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="delta_value", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleCommonDeltaValue::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleCommonDeltaValue::class})
     */
    public ?\App\DTO\ScheduleCommonDeltaValue $delta_value = null;

    /**
     * Schedule end time. Unix timestamp in seconds.
     * @DTA\Data(field="end_timestamp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $end_timestamp = null;

    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="schedule_action", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAction::class})
     */
    public ?\App\DTO\ScheduleAction $schedule_action = null;

    /**
     * @DTA\Data(field="schedule_status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleStatus::class})
     */
    public ?\App\DTO\ScheduleStatus $schedule_status = null;

    /**
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
