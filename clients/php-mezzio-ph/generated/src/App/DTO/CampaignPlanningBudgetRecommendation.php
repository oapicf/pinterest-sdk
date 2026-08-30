<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Budget recommendation response containing recommended budget, estimated days, and point estimations.
 */
class CampaignPlanningBudgetRecommendation
{
    /**
     * The recommended budget amount.
     * @DTA\Data(field="budget_recommendation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $budget_recommendation;

    /**
     * List of experimental budget recommendations.
     * @DTA\Data(field="experiment_campaign_budget_recommendation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignPlanningExperimentBudgetRecommendation[]|null
     */
    public $experiment_campaign_budget_recommendation;

    /**
     * Recommended number of days for the campaign lifetime.
     * @DTA\Data(field="lifetime_days_recommendation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_days_recommendation;

    /**
     * List of point estimations for different budget scenarios.
     * @DTA\Data(field="point_estimations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignPlanningBudgetRecommendationPoint[]|null
     */
    public $point_estimations;

}
