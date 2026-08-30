<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TargetingTemplateAudienceSizingReachEstimate
{
    /**
     * @DTA\Data(field="estimate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $estimate;

    /**
     * @DTA\Data(field="lower_bound", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lower_bound;

    /**
     * @DTA\Data(field="upper_bound", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $upper_bound;

}
