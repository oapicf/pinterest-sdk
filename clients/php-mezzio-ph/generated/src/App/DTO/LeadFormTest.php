<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 */
class LeadFormTest
{
    /**
     * Subscription ID.
     * @DTA\Data(field="subscription_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $subscription_id;

}
