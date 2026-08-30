<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A confidence level alert for the delivery estimates provided in the response.
 */
class CampaignPlanningConfidenceLevelAlert
{
    /**
     * Human-readable context for debugging. Not intended for display to end users.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * Reason for the confidence level alert.
     * @DTA\Data(field="reason", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertReason::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertReason::class})
     */
    public ?\App\DTO\CampaignPlanningConfidenceLevelAlertReason $reason = null;

    /**
     * Severity of the confidence level alert.
     * @DTA\Data(field="severity", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertSeverity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertSeverity::class})
     */
    public ?\App\DTO\CampaignPlanningConfidenceLevelAlertSeverity $severity = null;

}
