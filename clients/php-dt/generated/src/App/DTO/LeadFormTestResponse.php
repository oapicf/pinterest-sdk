<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Response for lead data test API.
 */
class LeadFormTestResponse
{
    /**
     * Subscription ID.
     * @DTA\Data(field="subscription_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $subscription_id = null;

}
