<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountCreateSubscriptionRequest
{
    /**
     * Standard HTTPS webhook URL.
     * @DTA\Data(field="webhook_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $webhook_url = null;

    /**
     * Lead form ID.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $lead_form_id = null;

    /**
     * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_access_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_access_token = null;

    /**
     * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_refresh_token = null;

}
