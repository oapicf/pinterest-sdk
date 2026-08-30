<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadSubscriptionPostParamsCreate
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

    /**
     * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_access_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_access_token = null;

    /**
     * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
     * @DTA\Data(field="partner_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PartnerMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PartnerMetadata::class})
     */
    public ?\App\DTO\PartnerMetadata $partner_metadata = null;

    /**
     * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $partner_refresh_token = null;

}
