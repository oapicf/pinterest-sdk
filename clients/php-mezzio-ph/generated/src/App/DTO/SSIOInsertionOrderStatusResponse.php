<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SSIOInsertionOrderStatusResponse
{
    /**
     * Salesforce order id
     * @DTA\Data(field="pin_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_order_id;

    /**
     * Salesforce insertion order status
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * Salesforce insertion order creation time
     * @DTA\Data(field="creation_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $creation_time;

}
