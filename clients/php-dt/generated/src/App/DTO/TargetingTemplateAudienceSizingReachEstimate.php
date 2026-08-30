<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class TargetingTemplateAudienceSizingReachEstimate
{
    /**
     * @DTA\Data(field="estimate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $estimate = null;

    /**
     * @DTA\Data(field="lower_bound", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lower_bound = null;

    /**
     * @DTA\Data(field="upper_bound", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $upper_bound = null;

}
