<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Schema for log sent from an integration application.
 */
class IntegrationLog
{
    /**
     * Timestamp in milliseconds of when the log was executed at the client.
     * @DTA\Data(field="client_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $client_timestamp;

    /**
     * Log event type
     * @DTA\Data(field="event_type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_type;

    /**
     * Log level type
     * @DTA\Data(field="log_level")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $log_level;

    /**
     * @DTA\Data(field="external_business_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2048})
     * @var string|null
     */
    public $external_business_id;

    /**
     * @DTA\Data(field="advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":128})
     * @var string|null
     */
    public $advertiser_id;

    /**
     * @DTA\Data(field="merchant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":128})
     * @var string|null
     */
    public $merchant_id;

    /**
     * @DTA\Data(field="tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":128})
     * @var string|null
     */
    public $tag_id;

    /**
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":128})
     * @var string|null
     */
    public $feed_profile_id;

    /**
     * Explanation of the event that occured.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2048})
     * @var string|null
     */
    public $message;

    /**
     * Version number of the integration application.
     * @DTA\Data(field="app_version_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":20})
     * @var string|null
     */
    public $app_version_number;

    /**
     * Version number of the platform the integration application is running on.
     * @DTA\Data(field="platform_version_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":20})
     * @var string|null
     */
    public $platform_version_number;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntegrationLogClientError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntegrationLogClientError::class})
     * @var \App\DTO\IntegrationLogClientError|null
     */
    public $error;

    /**
     * @DTA\Data(field="request", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntegrationLogClientRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntegrationLogClientRequest::class})
     * @var \App\DTO\IntegrationLogClientRequest|null
     */
    public $request;

}
