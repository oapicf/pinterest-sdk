<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountCreateSubscriptionRequest
{
    /**
     * Standard HTTPS webhook URL.
     * @DTA\Data(field="webhook_url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $webhook_url;

    /**
     * Lead form ID.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $lead_form_id;

    /**
     * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_access_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_access_token;

    /**
     * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_refresh_token;

}
