<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LeadSubscriptionPostParams
{
    /**
     * The Ad Account ID that this lead form belongs to.
     * @DTA\Data(field="ad_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $ad_account_id;

    /**
     * API version.
     * @DTA\Data(field="api_version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $api_version;

    /**
     * Subscription creation time. Unix timestamp in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

    /**
     * Lead data encryption algorithm.
     * @DTA\Data(field="cryptographic_algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cryptographic_algorithm;

    /**
     * Base64 encoded key for client to decrypt lead data.
     * @DTA\Data(field="cryptographic_key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cryptographic_key;

    /**
     * Subscription ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * Lead form ID.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $lead_form_id;

    /**
     * User account used to subscribe lead data.
     * @DTA\Data(field="user_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $user_account_id;

    /**
     * Standard HTTPS webhook URL.
     * @DTA\Data(field="webhook_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $webhook_url;

    /**
     * Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_access_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_access_token;

    /**
     * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
     * @DTA\Data(field="partner_metadata", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PartnerMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PartnerMetadata::class})
     * @var \App\DTO\PartnerMetadata|null
     */
    public $partner_metadata;

    /**
     * Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
     * @DTA\Data(field="partner_refresh_token", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $partner_refresh_token;

}
