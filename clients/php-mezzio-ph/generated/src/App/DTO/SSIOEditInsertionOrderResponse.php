<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SSIOEditInsertionOrderResponse
{
    /**
     * Salesforce order id
     * @DTA\Data(field="pin_order_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $pin_order_id;

}
