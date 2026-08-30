<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A point estimation containing the estimate data and estimation type for a budget recommendation.
 */
class CampaignPlanningBudgetRecommendationPoint
{
    /**
     * Estimation type for this point.
     * @DTA\Data(field="estimation_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningEstimationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningEstimationType::class})
     */
    public ?\App\DTO\CampaignPlanningEstimationType $estimation_type = null;

    /**
     * Point estimate data.
     * @DTA\Data(field="point_estimate", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CampaignPlanningPointEstimate::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CampaignPlanningPointEstimate::class})
     */
    public ?\App\DTO\CampaignPlanningPointEstimate $point_estimate = null;

}
