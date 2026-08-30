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
     */
    public ?int $budget_recommendation = null;

    /**
     * List of experimental budget recommendations.
     * @DTA\Data(field="experiment_campaign_budget_recommendation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $experiment_campaign_budget_recommendation = null;

    /**
     * Recommended number of days for the campaign lifetime.
     * @DTA\Data(field="lifetime_days_recommendation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lifetime_days_recommendation = null;

    /**
     * List of point estimations for different budget scenarios.
     * @DTA\Data(field="point_estimations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $point_estimations = null;

}
