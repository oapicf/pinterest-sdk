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
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Always \&quot;orderline\&quot;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * Ad account ID.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * Purchase order ID.
     * @DTA\Data(field="purchase_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $purchase_order_id;

    /**
     * Start time. Unix timestamp.
     * @DTA\Data(field="start_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $start_time;

    /**
     * End time. Unix timestamp.
     * @DTA\Data(field="end_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $end_time;

    /**
     * Order line budget in micro currency.
     * @DTA\Data(field="budget", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $budget;

    /**
     * Order line paid budget in micro currency.
     * @DTA\Data(field="paid_budget", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $paid_budget;

    /**
     * Order line status.
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLineStatus::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLineStatus::class})
     * @var \App\DTO\OrderLineStatus|null
     */
    public $status;

    /**
     * Order line name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Order line paid type.
     * @DTA\Data(field="paid_type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLinePaidType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLinePaidType::class})
     * @var \App\DTO\OrderLinePaidType|null
     */
    public $paid_type;

}
