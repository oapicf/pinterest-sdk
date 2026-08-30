<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Bid floor specification for a given campaign configuration.
 */
class BidFloorSpec
{
    /**
     * Ad group billable event type.
     * @DTA\Data(field="billable_event")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ActionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ActionType::class})
     * @var \App\DTO\ActionType|null
     */
    public $billable_event;

    /**
     * List of ISO 3166-1 alpha-2 country codes.
     * @DTA\Data(field="countries", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection114::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection114::class})
     * @var \App\DTO\Collection114|null
     */
    public $countries;

    /**
     * Creative type for the bid floor request.
     * @DTA\Data(field="creative_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreativeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreativeType::class})
     * @var \App\DTO\CreativeType|null
     */
    public $creative_type;

    /**
     * Currency for the bid floor value.
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Currency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Currency::class})
     * @var \App\DTO\Currency|null
     */
    public $currency;

    /**
     * Campaign objective type.
     * @DTA\Data(field="objective_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BidFloorObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BidFloorObjectiveType::class})
     * @var \App\DTO\BidFloorObjectiveType|null
     */
    public $objective_type;

    /**
     * Optimization goal metadata.
     * @DTA\Data(field="optimization_goal_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OptimizationGoalMetadata::class})
     * @var \App\DTO\OptimizationGoalMetadata|null
     */
    public $optimization_goal_metadata;

}
