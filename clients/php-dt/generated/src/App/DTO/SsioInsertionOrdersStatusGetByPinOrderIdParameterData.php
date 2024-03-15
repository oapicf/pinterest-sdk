<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for ssio_insertion_orders_status/get_by_pin_order_id
 */
class SsioInsertionOrdersStatusGetByPinOrderIdParameterData
{
    /**
     * The pin order id associated with the ssio insertion order
     * @DTA\Data(subset="path", field="pin_order_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $pin_order_id = null;

    /**
     * Unique identifier of an ad account.
     * @DTA\Data(subset="path", field="ad_account_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="Length", options={"max":18})
     * @DTA\Validator(subset="path", name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

}
