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
     * @DTA\Validator(name="Range", options={"min":2, "max":20})
     */
    public ?int $frequency = null;

    /**
     * @DTA\Data(field="timerange", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FrequencyGoalMetadataTimerange::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FrequencyGoalMetadataTimerange::class})
     */
    public ?\App\DTO\FrequencyGoalMetadataTimerange $timerange = null;

}
