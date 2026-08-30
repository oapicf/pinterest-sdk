<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class OrderLine
{
    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ad_account_id = null;

    /**
     * Order line budget in micro currency.
     * @DTA\Data(field="budget", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $budget = null;

    /**
     * Associated List of campaign IDs.
     * @DTA\Data(field="campaign_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection247::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection247::class})
     */
    public ?\App\DTO\Collection247 $campaign_ids = null;

    /**
     * End time. Unix timestamp.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $end_time = null;

    /**
     * Order line ID.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Order line name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Order line paid budget in micro currency.
     * @DTA\Data(field="paid_budget", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $paid_budget = null;

    /**
     * Order line paid type.
     * @DTA\Data(field="paid_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLinePaidType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLinePaidType::class})
     */
    public ?\App\DTO\OrderLinePaidType $paid_type = null;

    /**
     * Purchase order ID.
     * @DTA\Data(field="purchase_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $purchase_order_id = null;

    /**
     * Start time. Unix timestamp.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $start_time = null;

    /**
     * Order line status.
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLineStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLineStatus::class})
     */
    public ?\App\DTO\OrderLineStatus $status = null;

    /**
     * Always \&quot;orderline\&quot;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

}
