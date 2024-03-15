<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BidFloorSpec
{
    /**
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     */
    public ?\App\DTO\Collection62 $countries = null;

    /**
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     */
    public ?\App\DTO\Currency $currency = null;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ObjectiveType::class})
     */
    public ?\App\DTO\ObjectiveType $objective_type = null;

    /**
     * @DTA\Data(field="billable_event")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     */
    public ?\App\DTO\ActionType $billable_event = null;

    /**
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     */
    public ?\App\DTO\OptimizationGoalMetadata $optimization_goal_metadata = null;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     */
    public ?\App\DTO\CreativeType $creative_type = null;

}
