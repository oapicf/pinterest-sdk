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
     * @DTA\Data(field="advertiser_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":128})
     */
    public ?string $advertiser_id = null;

    /**
     * Version number of the integration application.
     * @DTA\Data(field="app_version_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":20})
     */
    public ?string $app_version_number = null;

    /**
     * Timestamp in milliseconds of when the log was executed at the client.
     * @DTA\Data(field="client_timestamp")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $client_timestamp = null;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntegrationLogClientError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntegrationLogClientError::class})
     */
    public ?\App\DTO\IntegrationLogClientError $error = null;

    /**
     * Log event type
     * @DTA\Data(field="event_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntegrationLogEventType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntegrationLogEventType::class})
     */
    public ?\App\DTO\IntegrationLogEventType $event_type = null;

    /**
     * @DTA\Data(field="external_business_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":2048})
     */
    public ?string $external_business_id = null;

    /**
     * @DTA\Data(field="feed_profile_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":128})
     */
    public ?string $feed_profile_id = null;

    /**
     * Log level type
     * @DTA\Data(field="log_level")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntegrationLogLevel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntegrationLogLevel::class})
     */
    public ?\App\DTO\IntegrationLogLevel $log_level = null;

    /**
     * @DTA\Data(field="merchant_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":128})
     */
    public ?string $merchant_id = null;

    /**
     * Explanation of the event that occured.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":8192})
     */
    public ?string $message = null;

    /**
     * Version number of the platform the integration application is running on.
     * @DTA\Data(field="platform_version_number", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":20})
     */
    public ?string $platform_version_number = null;

    /**
     * @DTA\Data(field="request", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\IntegrationLogClientRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\IntegrationLogClientRequest::class})
     */
    public ?\App\DTO\IntegrationLogClientRequest $request = null;

    /**
     * @DTA\Data(field="tag_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":128})
     */
    public ?string $tag_id = null;

}
