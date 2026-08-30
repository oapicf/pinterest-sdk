<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadSubscriptionCreate
{
    /**
     * Lead form ID.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $lead_form_id = null;

    /**
     * Standard HTTPS webhook URL.
     * @DTA\Data(field="webhook_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $webhook_url = null;

}
