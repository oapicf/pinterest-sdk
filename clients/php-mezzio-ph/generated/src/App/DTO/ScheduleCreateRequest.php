<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ScheduleCreateRequest
{
    /**
     * @DTA\Data(field="entity_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[C]?\\d+$/"})
     * @var string|null
     */
    public $entity_id;

    /**
     * Entity type
     * @DTA\Data(field="entity_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $entity_type;

    /**
     * @DTA\Data(field="delta_value")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleCommonDeltaValue::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleCommonDeltaValue::class})
     * @var \App\DTO\ScheduleCommonDeltaValue|null
     */
    public $delta_value;

    /**
     * Schedule end time. Unix timestamp in seconds.
     * @DTA\Data(field="end_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_timestamp;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="schedule_action")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleAction::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleAction::class})
     * @var \App\DTO\ScheduleAction|null
     */
    public $schedule_action;

    /**
     * @DTA\Data(field="schedule_status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleStatus::class})
     * @var \App\DTO\ScheduleStatus|null
     */
    public $schedule_status;

    /**
     * @DTA\Data(field="schedule_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScheduleType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScheduleType::class})
     * @var \App\DTO\ScheduleType|null
     */
    public $schedule_type;

    /**
     * Schedule start time. Unix timestamp in seconds.
     * @DTA\Data(field="start_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_timestamp;

}
