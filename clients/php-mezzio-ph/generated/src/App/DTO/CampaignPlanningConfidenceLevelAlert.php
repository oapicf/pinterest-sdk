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
     * @var string|null
     */
    public $description;

    /**
     * Reason for the confidence level alert.
     * @DTA\Data(field="reason", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertReason::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertReason::class})
     * @var \App\DTO\CampaignPlanningConfidenceLevelAlertReason|null
     */
    public $reason;

    /**
     * Severity of the confidence level alert.
     * @DTA\Data(field="severity", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertSeverity::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningConfidenceLevelAlertSeverity::class})
     * @var \App\DTO\CampaignPlanningConfidenceLevelAlertSeverity|null
     */
    public $severity;

}
