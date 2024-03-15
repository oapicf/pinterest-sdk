<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class SSIOInsertionOrderStatus
{
    /**
     * Salesforce order id
     * @DTA\Data(field="pin_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pin_order_id = null;

    /**
     * Salesforce insertion order status
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * Salesforce insertion order creation time
     * @DTA\Data(field="creation_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $creation_time = null;

}
