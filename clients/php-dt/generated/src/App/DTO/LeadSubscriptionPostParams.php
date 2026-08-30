<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LeadSubscriptionPostParams
{
    /**
     * The Ad Account ID that this lead form belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $ad_account_id = null;

    /**
     * API version.
     * @DTA\Data(field="api_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $api_version = null;

    /**
     * Subscription creation time. Unix timestamp in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

    /**
     * Lead data encryption algorithm.
     * @DTA\Data(field="cryptographic_algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cryptographic_algorithm = null;

    /**
     * Base64 encoded key for client to decrypt lead data.
     * @DTA\Data(field="cryptographic_key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cryptographic_key = null;

    /**
     * Subscription ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * Lead form ID.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $lead_form_id = null;

    /**
     * User account used to subscribe lead data.
     * @DTA\Data(field="user_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $user_account_id = null;

    /**
     * Standard HTTPS webhook URL.
     * @DTA\Data(field="webhook_url", nullable=true)
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
