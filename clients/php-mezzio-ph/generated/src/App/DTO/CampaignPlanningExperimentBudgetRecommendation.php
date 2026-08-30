<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Experimental budget recommendation for a single experiment version.
 */
class CampaignPlanningExperimentBudgetRecommendation
{
    /**
     * Recommended budget for this experiment version.
     * @DTA\Data(field="budget_recommendation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $budget_recommendation;

    /**
     * Recommended lifetime days for this experiment.
     * @DTA\Data(field="lifetime_days_recommendation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_days_recommendation;

    /**
     * Point estimations for this experiment version.
     * @DTA\Data(field="point_estimations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CampaignPlanningBudgetRecommendationPoint[]|null
     */
    public $point_estimations;

    /**
     * Version identifier for the experiment.
     * @DTA\Data(field="version_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $version_id;

}
