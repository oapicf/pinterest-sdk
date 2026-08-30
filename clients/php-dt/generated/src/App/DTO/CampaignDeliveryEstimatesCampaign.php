<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Campaign configuration for delivery estimates.
 */
class CampaignDeliveryEstimatesCampaign
{
    /**
     * @DTA\Data(field="ad_groups")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection163::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection163::class})
     */
    public ?\App\DTO\Collection163 $ad_groups = null;

    /**
     * Duration type of the budget
     * @DTA\Data(field="budget_duration_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BudgetDurationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BudgetDurationType::class})
     */
    public ?\App\DTO\BudgetDurationType $budget_duration_type = null;

    /**
     * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
     * @DTA\Data(field="daily_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $daily_spend_cap = null;

    /**
     * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d{4}-\d{2}-\d{2}$/"})
     */
    public ?string $end_date = null;

    /**
     * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
     * @DTA\Data(field="lifetime_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $lifetime_spend_cap = null;

    /**
     * @DTA\Data(field="objective_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DeliveryEstimateObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DeliveryEstimateObjectiveType::class})
     */
    public ?\App\DTO\DeliveryEstimateObjectiveType $objective_type = null;

    /**
     * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d{4}-\d{2}-\d{2}$/"})
     */
    public ?string $start_date = null;

}
