<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BidFloorSpec
{
    /**
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     * @var \App\DTO\Collection62|null
     */
    public $countries;

    /**
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     * @var \App\DTO\Currency|null
     */
    public $currency;

    /**
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ObjectiveType::class})
     * @var \App\DTO\ObjectiveType|null
     */
    public $objective_type;

    /**
     * @DTA\Data(field="billable_event")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     * @var \App\DTO\ActionType|null
     */
    public $billable_event;

    /**
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @var \App\DTO\OptimizationGoalMetadata|null
     */
    public $optimization_goal_metadata;

    /**
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     * @var \App\DTO\CreativeType|null
     */
    public $creative_type;

}
