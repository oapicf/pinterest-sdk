<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CampaignPlanningCurveEstimate
{
    /**
     * Estimation type for campaign planning estimated curve
     * @DTA\Data(field="estimation_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningEstimationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningEstimationType::class})
     */
    public ?\App\DTO\CampaignPlanningEstimationType $estimation_type = null;

    /**
     * The estimation points that make up the estimated curve.
     * @DTA\Data(field="points", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection165::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection165::class})
     */
    public ?\App\DTO\Collection165 $points = null;

}
