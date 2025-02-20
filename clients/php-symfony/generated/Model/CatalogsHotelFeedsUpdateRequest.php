<?php
/**
 * CatalogsHotelFeedsUpdateRequest
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
 * The version of the OpenAPI document: 5.14.0
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
 * Class representing the CatalogsHotelFeedsUpdateRequest model.
 *
 * Request object for updating a feed.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsHotelFeedsUpdateRequest 
{
        /**
     * @var NullableCurrency|null
     * @SerializedName("default_currency")
    * @Accessor(getter="getSerializedDefaultCurrency", setter="setDeserializedDefaultCurrency")
    * @Type("string")
    */
    protected ?NullableCurrency $defaultCurrency = null;

    /**
     * A human-friendly name associated to a given feed.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * @var CatalogsFormat|null
     * @SerializedName("format")
    * @Accessor(getter="getSerializedFormat", setter="setDeserializedFormat")
    * @Type("string")
    */
    protected ?CatalogsFormat $format = null;

    /**
     * @var CatalogsFeedCredentials|null
     * @SerializedName("credentials")
     * @Type("OpenAPI\Server\Model\CatalogsFeedCredentials")
    */
    #[Assert\Type("OpenAPI\Server\Model\CatalogsFeedCredentials")]
    protected ?CatalogsFeedCredentials $credentials = null;

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     *
     * @var string|null
     * @SerializedName("location")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^(http|https|ftp|sftp):///")]
    protected ?string $location = null;

    /**
     * @var CatalogsFeedProcessingSchedule|null
     * @SerializedName("preferred_processing_schedule")
     * @Type("OpenAPI\Server\Model\CatalogsFeedProcessingSchedule")
    */
    #[Assert\Type("OpenAPI\Server\Model\CatalogsFeedProcessingSchedule")]
    protected ?CatalogsFeedProcessingSchedule $preferredProcessingSchedule = null;

    /**
     * @var CatalogsStatus|null
     * @SerializedName("status")
    * @Accessor(getter="getSerializedStatus", setter="setDeserializedStatus")
    * @Type("string")
    */
    protected ?CatalogsStatus $status = null;

    /**
     * @var CatalogsType|null
     * @SerializedName("catalog_type")
    * @Accessor(getter="getSerializedCatalogType", setter="setDeserializedCatalogType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?CatalogsType $catalogType = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->defaultCurrency = array_key_exists('defaultCurrency', $data) ? $data['defaultCurrency'] : $this->defaultCurrency;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->format = array_key_exists('format', $data) ? $data['format'] : $this->format;
            $this->credentials = array_key_exists('credentials', $data) ? $data['credentials'] : $this->credentials;
            $this->location = array_key_exists('location', $data) ? $data['location'] : $this->location;
            $this->preferredProcessingSchedule = array_key_exists('preferredProcessingSchedule', $data) ? $data['preferredProcessingSchedule'] : $this->preferredProcessingSchedule;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->catalogType = array_key_exists('catalogType', $data) ? $data['catalogType'] : $this->catalogType;
        }
    }

    /**
     * Gets defaultCurrency.
     *
     * @return NullableCurrency|null
     */
    public function getDefaultCurrency(): ?NullableCurrency
    {
        return $this->defaultCurrency;
    }

    /**
    * Sets defaultCurrency.
    *
    * @param NullableCurrency|null $defaultCurrency
    *
    * @return $this
    */
    public function setDefaultCurrency(?NullableCurrency $defaultCurrency = null): self
    {
        $this->defaultCurrency = $defaultCurrency;

        return $this;
    }

    /**
    * Gets defaultCurrency for serialization.
    *
    * @return string|null
    */
    public function getSerializedDefaultCurrency(): string|null
    {
        return !is_null($this->defaultCurrency?->value) ? (string) $this->defaultCurrency->value : null;
    }

    /**
    * Sets defaultCurrency.
    *
    * @param string|NullableCurrency|null $defaultCurrency
    *
    * @return $this
    */
    public function setDeserializedDefaultCurrency(string|NullableCurrency|null $defaultCurrency = null): self
    {
        if (is_string($defaultCurrency)) {
            $defaultCurrency = NullableCurrency::tryFrom($defaultCurrency);
        }

        $this->defaultCurrency = $defaultCurrency;

        return $this;
    }



    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName(): ?string
    {
        return $this->name;
    }

    /**
    * Sets name.
    *
    * @param string|null $name  A human-friendly name associated to a given feed.
    *
    * @return $this
    */
    public function setName(?string $name = null): self
    {
        $this->name = $name;

        return $this;
    }




    /**
     * Gets format.
     *
     * @return CatalogsFormat|null
     */
    public function getFormat(): ?CatalogsFormat
    {
        return $this->format;
    }

    /**
    * Sets format.
    *
    * @param CatalogsFormat|null $format
    *
    * @return $this
    */
    public function setFormat(?CatalogsFormat $format = null): self
    {
        $this->format = $format;

        return $this;
    }

    /**
    * Gets format for serialization.
    *
    * @return string|null
    */
    public function getSerializedFormat(): string|null
    {
        return !is_null($this->format?->value) ? (string) $this->format->value : null;
    }

    /**
    * Sets format.
    *
    * @param string|CatalogsFormat|null $format
    *
    * @return $this
    */
    public function setDeserializedFormat(string|CatalogsFormat|null $format = null): self
    {
        if (is_string($format)) {
            $format = CatalogsFormat::tryFrom($format);
        }

        $this->format = $format;

        return $this;
    }



    /**
     * Gets credentials.
     *
     * @return CatalogsFeedCredentials|null
     */
    public function getCredentials(): ?CatalogsFeedCredentials
    {
        return $this->credentials;
    }

    /**
    * Sets credentials.
    *
    * @param CatalogsFeedCredentials|null $credentials
    *
    * @return $this
    */
    public function setCredentials(?CatalogsFeedCredentials $credentials = null): self
    {
        $this->credentials = $credentials;

        return $this;
    }




    /**
     * Gets location.
     *
     * @return string|null
     */
    public function getLocation(): ?string
    {
        return $this->location;
    }

    /**
    * Sets location.
    *
    * @param string|null $location  The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    *
    * @return $this
    */
    public function setLocation(?string $location = null): self
    {
        $this->location = $location;

        return $this;
    }




    /**
     * Gets preferredProcessingSchedule.
     *
     * @return CatalogsFeedProcessingSchedule|null
     */
    public function getPreferredProcessingSchedule(): ?CatalogsFeedProcessingSchedule
    {
        return $this->preferredProcessingSchedule;
    }

    /**
    * Sets preferredProcessingSchedule.
    *
    * @param CatalogsFeedProcessingSchedule|null $preferredProcessingSchedule
    *
    * @return $this
    */
    public function setPreferredProcessingSchedule(?CatalogsFeedProcessingSchedule $preferredProcessingSchedule = null): self
    {
        $this->preferredProcessingSchedule = $preferredProcessingSchedule;

        return $this;
    }




    /**
     * Gets status.
     *
     * @return CatalogsStatus|null
     */
    public function getStatus(): ?CatalogsStatus
    {
        return $this->status;
    }

    /**
    * Sets status.
    *
    * @param CatalogsStatus|null $status
    *
    * @return $this
    */
    public function setStatus(?CatalogsStatus $status = null): self
    {
        $this->status = $status;

        return $this;
    }

    /**
    * Gets status for serialization.
    *
    * @return string|null
    */
    public function getSerializedStatus(): string|null
    {
        return !is_null($this->status?->value) ? (string) $this->status->value : null;
    }

    /**
    * Sets status.
    *
    * @param string|CatalogsStatus|null $status
    *
    * @return $this
    */
    public function setDeserializedStatus(string|CatalogsStatus|null $status = null): self
    {
        if (is_string($status)) {
            $status = CatalogsStatus::tryFrom($status);
        }

        $this->status = $status;

        return $this;
    }



    /**
     * Gets catalogType.
     *
     * @return CatalogsType|null
     */
    public function getCatalogType(): ?CatalogsType
    {
        return $this->catalogType;
    }

    /**
    * Sets catalogType.
    *
    * @param CatalogsType|null $catalogType
    *
    * @return $this
    */
    public function setCatalogType(?CatalogsType $catalogType): self
    {
        $this->catalogType = $catalogType;

        return $this;
    }

    /**
    * Gets catalogType for serialization.
    *
    * @return string|null
    */
    public function getSerializedCatalogType(): string|null
    {
        return !is_null($this->catalogType?->value) ? (string) $this->catalogType->value : null;
    }

    /**
    * Sets catalogType.
    *
    * @param string|CatalogsType|null $catalogType
    *
    * @return $this
    */
    public function setDeserializedCatalogType(string|CatalogsType|null $catalogType): self
    {
        if (is_string($catalogType)) {
            $catalogType = CatalogsType::tryFrom($catalogType);
        }

        $this->catalogType = $catalogType;

        return $this;
    }


}


