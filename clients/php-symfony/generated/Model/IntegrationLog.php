<?php
/**
 * IntegrationLog
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the IntegrationLog model.
 *
 * Schema for log sent from an integration application.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class IntegrationLog 
{
        /**
     * Timestamp in milliseconds of when the log was executed at the client.
     *
     * @var int|null
     * @SerializedName("client_timestamp")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $clientTimestamp = null;

    /**
     * Log event type
     *
     * @var string|null
     * @SerializedName("event_type")
     * @Assert\NotNull()
     * @Assert\Choice({ "APP", "API" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $eventType = null;

    /**
     * Log level type
     *
     * @var string|null
     * @SerializedName("log_level")
     * @Assert\NotNull()
     * @Assert\Choice({ "INFO", "WARN", "ERROR" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $logLevel = null;

    /**
     * @var string|null
     * @SerializedName("external_business_id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 2048
     * )
     */
    protected ?string $externalBusinessId = null;

    /**
     * @var string|null
     * @SerializedName("advertiser_id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 128
     * )
     */
    protected ?string $advertiserId = null;

    /**
     * @var string|null
     * @SerializedName("merchant_id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 128
     * )
     */
    protected ?string $merchantId = null;

    /**
     * @var string|null
     * @SerializedName("tag_id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 128
     * )
     */
    protected ?string $tagId = null;

    /**
     * @var string|null
     * @SerializedName("feed_profile_id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 128
     * )
     */
    protected ?string $feedProfileId = null;

    /**
     * Explanation of the event that occured.
     *
     * @var string|null
     * @SerializedName("message")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 2048
     * )
     */
    protected ?string $message = null;

    /**
     * Version number of the integration application.
     *
     * @var string|null
     * @SerializedName("app_version_number")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 20
     * )
     */
    protected ?string $appVersionNumber = null;

    /**
     * Version number of the platform the integration application is running on.
     *
     * @var string|null
     * @SerializedName("platform_version_number")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 20
     * )
     */
    protected ?string $platformVersionNumber = null;

    /**
     * @var IntegrationLogClientError|null
     * @SerializedName("error")
     * @Assert\Type("OpenAPI\Server\Model\IntegrationLogClientError")
     * @Type("OpenAPI\Server\Model\IntegrationLogClientError")
     */
    protected ?IntegrationLogClientError $error = null;

    /**
     * @var IntegrationLogClientRequest|null
     * @SerializedName("request")
     * @Assert\Type("OpenAPI\Server\Model\IntegrationLogClientRequest")
     * @Type("OpenAPI\Server\Model\IntegrationLogClientRequest")
     */
    protected ?IntegrationLogClientRequest $request = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->clientTimestamp = array_key_exists('clientTimestamp', $data) ? $data['clientTimestamp'] : $this->clientTimestamp;
            $this->eventType = array_key_exists('eventType', $data) ? $data['eventType'] : $this->eventType;
            $this->logLevel = array_key_exists('logLevel', $data) ? $data['logLevel'] : $this->logLevel;
            $this->externalBusinessId = array_key_exists('externalBusinessId', $data) ? $data['externalBusinessId'] : $this->externalBusinessId;
            $this->advertiserId = array_key_exists('advertiserId', $data) ? $data['advertiserId'] : $this->advertiserId;
            $this->merchantId = array_key_exists('merchantId', $data) ? $data['merchantId'] : $this->merchantId;
            $this->tagId = array_key_exists('tagId', $data) ? $data['tagId'] : $this->tagId;
            $this->feedProfileId = array_key_exists('feedProfileId', $data) ? $data['feedProfileId'] : $this->feedProfileId;
            $this->message = array_key_exists('message', $data) ? $data['message'] : $this->message;
            $this->appVersionNumber = array_key_exists('appVersionNumber', $data) ? $data['appVersionNumber'] : $this->appVersionNumber;
            $this->platformVersionNumber = array_key_exists('platformVersionNumber', $data) ? $data['platformVersionNumber'] : $this->platformVersionNumber;
            $this->error = array_key_exists('error', $data) ? $data['error'] : $this->error;
            $this->request = array_key_exists('request', $data) ? $data['request'] : $this->request;
        }
    }

    /**
     * Gets clientTimestamp.
     *
     * @return int|null
     */
    public function getClientTimestamp(): ?int
    {
        return $this->clientTimestamp;
    }



    /**
     * Sets clientTimestamp.
     *
     * @param int|null $clientTimestamp  Timestamp in milliseconds of when the log was executed at the client.
     *
     * @return $this
     */
    public function setClientTimestamp(?int $clientTimestamp): self
    {
        $this->clientTimestamp = $clientTimestamp;

        return $this;
    }

    /**
     * Gets eventType.
     *
     * @return string|null
     */
    public function getEventType(): ?string
    {
        return $this->eventType;
    }



    /**
     * Sets eventType.
     *
     * @param string|null $eventType  Log event type
     *
     * @return $this
     */
    public function setEventType(?string $eventType): self
    {
        $this->eventType = $eventType;

        return $this;
    }

    /**
     * Gets logLevel.
     *
     * @return string|null
     */
    public function getLogLevel(): ?string
    {
        return $this->logLevel;
    }



    /**
     * Sets logLevel.
     *
     * @param string|null $logLevel  Log level type
     *
     * @return $this
     */
    public function setLogLevel(?string $logLevel): self
    {
        $this->logLevel = $logLevel;

        return $this;
    }

    /**
     * Gets externalBusinessId.
     *
     * @return string|null
     */
    public function getExternalBusinessId(): ?string
    {
        return $this->externalBusinessId;
    }



    /**
     * Sets externalBusinessId.
     *
     * @param string|null $externalBusinessId
     *
     * @return $this
     */
    public function setExternalBusinessId(?string $externalBusinessId = null): self
    {
        $this->externalBusinessId = $externalBusinessId;

        return $this;
    }

    /**
     * Gets advertiserId.
     *
     * @return string|null
     */
    public function getAdvertiserId(): ?string
    {
        return $this->advertiserId;
    }



    /**
     * Sets advertiserId.
     *
     * @param string|null $advertiserId
     *
     * @return $this
     */
    public function setAdvertiserId(?string $advertiserId = null): self
    {
        $this->advertiserId = $advertiserId;

        return $this;
    }

    /**
     * Gets merchantId.
     *
     * @return string|null
     */
    public function getMerchantId(): ?string
    {
        return $this->merchantId;
    }



    /**
     * Sets merchantId.
     *
     * @param string|null $merchantId
     *
     * @return $this
     */
    public function setMerchantId(?string $merchantId = null): self
    {
        $this->merchantId = $merchantId;

        return $this;
    }

    /**
     * Gets tagId.
     *
     * @return string|null
     */
    public function getTagId(): ?string
    {
        return $this->tagId;
    }



    /**
     * Sets tagId.
     *
     * @param string|null $tagId
     *
     * @return $this
     */
    public function setTagId(?string $tagId = null): self
    {
        $this->tagId = $tagId;

        return $this;
    }

    /**
     * Gets feedProfileId.
     *
     * @return string|null
     */
    public function getFeedProfileId(): ?string
    {
        return $this->feedProfileId;
    }



    /**
     * Sets feedProfileId.
     *
     * @param string|null $feedProfileId
     *
     * @return $this
     */
    public function setFeedProfileId(?string $feedProfileId = null): self
    {
        $this->feedProfileId = $feedProfileId;

        return $this;
    }

    /**
     * Gets message.
     *
     * @return string|null
     */
    public function getMessage(): ?string
    {
        return $this->message;
    }



    /**
     * Sets message.
     *
     * @param string|null $message  Explanation of the event that occured.
     *
     * @return $this
     */
    public function setMessage(?string $message = null): self
    {
        $this->message = $message;

        return $this;
    }

    /**
     * Gets appVersionNumber.
     *
     * @return string|null
     */
    public function getAppVersionNumber(): ?string
    {
        return $this->appVersionNumber;
    }



    /**
     * Sets appVersionNumber.
     *
     * @param string|null $appVersionNumber  Version number of the integration application.
     *
     * @return $this
     */
    public function setAppVersionNumber(?string $appVersionNumber = null): self
    {
        $this->appVersionNumber = $appVersionNumber;

        return $this;
    }

    /**
     * Gets platformVersionNumber.
     *
     * @return string|null
     */
    public function getPlatformVersionNumber(): ?string
    {
        return $this->platformVersionNumber;
    }



    /**
     * Sets platformVersionNumber.
     *
     * @param string|null $platformVersionNumber  Version number of the platform the integration application is running on.
     *
     * @return $this
     */
    public function setPlatformVersionNumber(?string $platformVersionNumber = null): self
    {
        $this->platformVersionNumber = $platformVersionNumber;

        return $this;
    }

    /**
     * Gets error.
     *
     * @return IntegrationLogClientError|null
     */
    public function getError(): ?IntegrationLogClientError
    {
        return $this->error;
    }



    /**
     * Sets error.
     *
     * @param IntegrationLogClientError|null $error
     *
     * @return $this
     */
    public function setError(?IntegrationLogClientError $error = null): self
    {
        $this->error = $error;

        return $this;
    }

    /**
     * Gets request.
     *
     * @return IntegrationLogClientRequest|null
     */
    public function getRequest(): ?IntegrationLogClientRequest
    {
        return $this->request;
    }



    /**
     * Sets request.
     *
     * @param IntegrationLogClientRequest|null $request
     *
     * @return $this
     */
    public function setRequest(?IntegrationLogClientRequest $request = null): self
    {
        $this->request = $request;

        return $this;
    }
}

