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
     * @var \App\DTO\Collection163|null
     */
    public $ad_groups;

    /**
     * Duration type of the budget
     * @DTA\Data(field="budget_duration_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BudgetDurationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BudgetDurationType::class})
     * @var \App\DTO\BudgetDurationType|null
     */
    public $budget_duration_type;

    /**
     * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
     * @DTA\Data(field="daily_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $daily_spend_cap;

    /**
     * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
     * @DTA\Data(field="end_date", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $end_date;

    /**
     * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
     * @DTA\Data(field="lifetime_spend_cap", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $lifetime_spend_cap;

    /**
     * @DTA\Data(field="objective_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\DeliveryEstimateObjectiveType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\DeliveryEstimateObjectiveType::class})
     * @var \App\DTO\DeliveryEstimateObjectiveType|null
     */
    public $objective_type;

    /**
     * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
     * @DTA\Data(field="start_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d{4}-\\d{2}-\\d{2}$/"})
     * @var string|null
     */
    public $start_date;

}
