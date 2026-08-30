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
     */
    public ?int $budget_recommendation = null;

    /**
     * Recommended lifetime days for this experiment.
     * @DTA\Data(field="lifetime_days_recommendation", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lifetime_days_recommendation = null;

    /**
     * Point estimations for this experiment version.
     * @DTA\Data(field="point_estimations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $point_estimations = null;

    /**
     * Version identifier for the experiment.
     * @DTA\Data(field="version_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $version_id = null;

}
