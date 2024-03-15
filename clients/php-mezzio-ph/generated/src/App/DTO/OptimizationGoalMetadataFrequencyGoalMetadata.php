<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class OptimizationGoalMetadataFrequencyGoalMetadata
{
    /**
     * @DTA\Data(field="frequency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $frequency;

    /**
     * User entity counts time range
     * @DTA\Data(field="timerange", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $timerange;

}
