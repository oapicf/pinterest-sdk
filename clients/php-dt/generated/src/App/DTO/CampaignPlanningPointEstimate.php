<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */
class CampaignPlanningPointEstimate
{
    /**
     * The budget value of the point.
     * @DTA\Data(field="budget")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $budget = null;

    /**
     * Y value as a decimal.
     * @DTA\Data(field="double_y")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $double_y = null;

    /**
     * The maximum Y value of the point.
     * @DTA\Data(field="max_y")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_y = null;

    /**
     * The minimum Y value of the point.
     * @DTA\Data(field="min_y")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_y = null;

    /**
     * The expected Y value of the point.
     * @DTA\Data(field="y")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $y = null;

}
