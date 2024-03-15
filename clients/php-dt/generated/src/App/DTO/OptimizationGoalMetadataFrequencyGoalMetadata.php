<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OptimizationGoalMetadataFrequencyGoalMetadata
{
    /**
     * @DTA\Data(field="frequency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $frequency = null;

    /**
     * User entity counts time range
     * @DTA\Data(field="timerange", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $timerange = null;

}
