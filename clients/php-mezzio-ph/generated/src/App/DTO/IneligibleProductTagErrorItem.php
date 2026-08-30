<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Error item for a product tag that failed eligibility check.
 */
class IneligibleProductTagErrorItem
{
    /**
     * Reason why the pin is ineligible for tagging.
     * @DTA\Data(field="error_message")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IneligibleProductTagReason::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IneligibleProductTagReason::class})
     * @var \App\DTO\IneligibleProductTagReason|null
     */
    public $error_message;

    /**
     * Pin ID that failed eligibility check.
     * @DTA\Data(field="pin_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $pin_id;

}
