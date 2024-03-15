<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdAccountGetSubscriptionResponse
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
     * @DTA\Data(field="webhook_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $webhook_url = null;

    /**
     * Subscription ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $id = null;

    /**
     * User account used to subscribe lead data.
     * @DTA\Data(field="user_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $user_account_id = null;

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
     * Base64 encoded key for client to decrypt lead data.
     * @DTA\Data(field="cryptographic_key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cryptographic_key = null;

    /**
     * Lead data encryption algorithm.
     * @DTA\Data(field="cryptographic_algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cryptographic_algorithm = null;

    /**
     * Lead form creation time. Unix timestamp in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_time = null;

}
