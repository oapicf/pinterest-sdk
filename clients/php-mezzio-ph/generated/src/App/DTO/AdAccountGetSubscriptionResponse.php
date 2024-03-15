<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdAccountGetSubscriptionResponse
{
    /**
     * Lead form ID.
     * @DTA\Data(field="lead_form_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $lead_form_id;

    /**
     * Standard HTTPS webhook URL.
     * @DTA\Data(field="webhook_url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $webhook_url;

    /**
     * Subscription ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $id;

    /**
     * User account used to subscribe lead data.
     * @DTA\Data(field="user_account_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $user_account_id;

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
     * Base64 encoded key for client to decrypt lead data.
     * @DTA\Data(field="cryptographic_key", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cryptographic_key;

    /**
     * Lead data encryption algorithm.
     * @DTA\Data(field="cryptographic_algorithm", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cryptographic_algorithm;

    /**
     * Lead form creation time. Unix timestamp in milliseconds.
     * @DTA\Data(field="created_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_time;

}
