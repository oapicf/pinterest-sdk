<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Frequency target can only be between 2 and 20
 */
class FrequencyGoalMetadata
{
    /**
     * @DTA\Data(field="frequency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":2, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":20, "inclusive":true})
     * @var int|null
     */
    public $frequency;

    /**
     * @DTA\Data(field="timerange", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FrequencyGoalMetadataTimerange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FrequencyGoalMetadataTimerange::class})
     * @var \App\DTO\FrequencyGoalMetadataTimerange|null
     */
    public $timerange;

}
