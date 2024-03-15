<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Order Line
 */
class OrderLines
{
    /**
     * Order line ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Always \&quot;orderline\&quot;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ad_account_id = null;

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
     * End time. Unix timestamp.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $end_time = null;

    /**
     * Order line budget in micro currency.
     * @DTA\Data(field="budget", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $budget = null;

    /**
     * Order line paid budget in micro currency.
     * @DTA\Data(field="paid_budget", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $paid_budget = null;

    /**
     * Order line status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLineStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLineStatus::class})
     */
    public ?\App\DTO\OrderLineStatus $status = null;

    /**
     * Order line name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Order line paid type.
     * @DTA\Data(field="paid_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLinePaidType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLinePaidType::class})
     */
    public ?\App\DTO\OrderLinePaidType $paid_type = null;

}
