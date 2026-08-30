<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
 */
class TargetingTemplateAudienceSizing
{
    /**
     * @DTA\Data(field="reach_estimate", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TargetingTemplateAudienceSizingReachEstimate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TargetingTemplateAudienceSizingReachEstimate::class})
     */
    public ?\App\DTO\TargetingTemplateAudienceSizingReachEstimate $reach_estimate = null;

}
