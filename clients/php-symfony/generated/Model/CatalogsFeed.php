<?php
/**
 * CatalogsFeed
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
 * Class representing the CatalogsFeed model.
 *
 * Catalogs Feed object
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsFeed 
{
        /**
     * @var \DateTime|null
     * @SerializedName("created_at")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    protected ?\DateTime $createdAt = null;

    /**
     * @var string|null
     * @SerializedName("id")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $id = null;

    /**
     * @var \DateTime|null
     * @SerializedName("updated_at")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     */
    protected ?\DateTime $updatedAt = null;

    /**
     * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $name = null;

    /**
     * @var CatalogsFormat|null
     * @SerializedName("format")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedFormat")
        * @Type("string")
     */
    protected ?CatalogsFormat $format = null;

    /**
     * @var CatalogsType|null
     * @SerializedName("catalog_type")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedCatalogType")
        * @Type("string")
     */
    protected ?CatalogsType $catalogType = null;

    /**
     * @var CatalogsFeedCredentials|null
     * @SerializedName("credentials")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\CatalogsFeedCredentials")
     * @Type("OpenAPI\Server\Model\CatalogsFeedCredentials")
     */
    protected ?CatalogsFeedCredentials $credentials = null;

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     *
     * @var string|null
     * @SerializedName("location")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $location = null;

    /**
     * @var CatalogsFeedProcessingSchedule|null
     * @SerializedName("preferred_processing_schedule")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("OpenAPI\Server\Model\CatalogsFeedProcessingSchedule")
     * @Type("OpenAPI\Server\Model\CatalogsFeedProcessingSchedule")
     */
    protected ?CatalogsFeedProcessingSchedule $preferredProcessingSchedule = null;

    /**
     * @var CatalogsStatus|null
     * @SerializedName("status")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    protected ?CatalogsStatus $status = null;

    /**
     * @var NullableCurrency|null
     * @SerializedName("default_currency")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedDefaultCurrency")
        * @Type("string")
     */
    protected ?NullableCurrency $defaultCurrency = null;

    /**
     * The locale used within a feed for product descriptions.
     *
     * @var string|null
     * @SerializedName("default_locale")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $defaultLocale = null;

    /**
     * @var Country|null
     * @SerializedName("default_country")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedDefaultCountry")
        * @Type("string")
     */
    protected ?Country $defaultCountry = null;

    /**
     * @var ProductAvailabilityType|null
     * @SerializedName("default_availability")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedDefaultAvailability")
        * @Type("string")
     */
    protected ?ProductAvailabilityType $defaultAvailability = null;

    /**
     * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
     *
     * @var string|null
     * @SerializedName("catalog_id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Regex("/^\\d+$/")
     */
    protected ?string $catalogId = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->createdAt = array_key_exists('createdAt', $data) ? $data['createdAt'] : $this->createdAt;
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->updatedAt = array_key_exists('updatedAt', $data) ? $data['updatedAt'] : $this->updatedAt;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->format = array_key_exists('format', $data) ? $data['format'] : $this->format;
            $this->catalogType = array_key_exists('catalogType', $data) ? $data['catalogType'] : $this->catalogType;
            $this->credentials = array_key_exists('credentials', $data) ? $data['credentials'] : $this->credentials;
            $this->location = array_key_exists('location', $data) ? $data['location'] : $this->location;
            $this->preferredProcessingSchedule = array_key_exists('preferredProcessingSchedule', $data) ? $data['preferredProcessingSchedule'] : $this->preferredProcessingSchedule;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->defaultCurrency = array_key_exists('defaultCurrency', $data) ? $data['defaultCurrency'] : $this->defaultCurrency;
            $this->defaultLocale = array_key_exists('defaultLocale', $data) ? $data['defaultLocale'] : $this->defaultLocale;
            $this->defaultCountry = array_key_exists('defaultCountry', $data) ? $data['defaultCountry'] : $this->defaultCountry;
            $this->defaultAvailability = array_key_exists('defaultAvailability', $data) ? $data['defaultAvailability'] : $this->defaultAvailability;
            $this->catalogId = array_key_exists('catalogId', $data) ? $data['catalogId'] : $this->catalogId;
        }
    }

    /**
     * Gets createdAt.
     *
     * @return \DateTime|null
     */
    public function getCreatedAt(): ?\DateTime
    {
        return $this->createdAt;
    }



    /**
     * Sets createdAt.
     *
     * @param \DateTime|null $createdAt
     *
     * @return $this
     */
    public function setCreatedAt(?\DateTime $createdAt = null): self
    {
        $this->createdAt = $createdAt;

        return $this;
    }

    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId(): ?string
    {
        return $this->id;
    }



    /**
     * Sets id.
     *
     * @param string|null $id
     *
     * @return $this
     */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets updatedAt.
     *
     * @return \DateTime|null
     */
    public function getUpdatedAt(): ?\DateTime
    {
        return $this->updatedAt;
    }



    /**
     * Sets updatedAt.
     *
     * @param \DateTime|null $updatedAt
     *
     * @return $this
     */
    public function setUpdatedAt(?\DateTime $updatedAt = null): self
    {
        $this->updatedAt = $updatedAt;

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
     * @param string|null $name  A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
     *
     * @return $this
     */
    public function setName(?string $name): self
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
    * Gets format for serialization.
    *
    * @return string|null
    */
    public function getSerializedFormat(): string|null
    {
        return $this->format?->value ? (string) $this->format->value : null;
    }


    /**
     * Sets format.
     *
     * @param CatalogsFormat|null $format
     *
     * @return $this
     */
    public function setFormat(?CatalogsFormat $format): self
    {
        $this->format = $format;

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
    * Gets catalogType for serialization.
    *
    * @return string|null
    */
    public function getSerializedCatalogType(): string|null
    {
        return $this->catalogType?->value ? (string) $this->catalogType->value : null;
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
    public function setCredentials(?CatalogsFeedCredentials $credentials): self
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
    public function setLocation(?string $location): self
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
    public function setPreferredProcessingSchedule(?CatalogsFeedProcessingSchedule $preferredProcessingSchedule): self
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
    * Gets status for serialization.
    *
    * @return string|null
    */
    public function getSerializedStatus(): string|null
    {
        return $this->status?->value ? (string) $this->status->value : null;
    }


    /**
     * Sets status.
     *
     * @param CatalogsStatus|null $status
     *
     * @return $this
     */
    public function setStatus(?CatalogsStatus $status): self
    {
        $this->status = $status;

        return $this;
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
    * Gets defaultCurrency for serialization.
    *
    * @return string|null
    */
    public function getSerializedDefaultCurrency(): string|null
    {
        return $this->defaultCurrency?->value ? (string) $this->defaultCurrency->value : null;
    }


    /**
     * Sets defaultCurrency.
     *
     * @param NullableCurrency|null $defaultCurrency
     *
     * @return $this
     */
    public function setDefaultCurrency(?NullableCurrency $defaultCurrency): self
    {
        $this->defaultCurrency = $defaultCurrency;

        return $this;
    }

    /**
     * Gets defaultLocale.
     *
     * @return string|null
     */
    public function getDefaultLocale(): ?string
    {
        return $this->defaultLocale;
    }



    /**
     * Sets defaultLocale.
     *
     * @param string|null $defaultLocale  The locale used within a feed for product descriptions.
     *
     * @return $this
     */
    public function setDefaultLocale(?string $defaultLocale): self
    {
        $this->defaultLocale = $defaultLocale;

        return $this;
    }

    /**
     * Gets defaultCountry.
     *
     * @return Country|null
     */
    public function getDefaultCountry(): ?Country
    {
        return $this->defaultCountry;
    }

    /**
    * Gets defaultCountry for serialization.
    *
    * @return string|null
    */
    public function getSerializedDefaultCountry(): string|null
    {
        return $this->defaultCountry?->value ? (string) $this->defaultCountry->value : null;
    }


    /**
     * Sets defaultCountry.
     *
     * @param Country|null $defaultCountry
     *
     * @return $this
     */
    public function setDefaultCountry(?Country $defaultCountry): self
    {
        $this->defaultCountry = $defaultCountry;

        return $this;
    }

    /**
     * Gets defaultAvailability.
     *
     * @return ProductAvailabilityType|null
     */
    public function getDefaultAvailability(): ?ProductAvailabilityType
    {
        return $this->defaultAvailability;
    }

    /**
    * Gets defaultAvailability for serialization.
    *
    * @return string|null
    */
    public function getSerializedDefaultAvailability(): string|null
    {
        return $this->defaultAvailability?->value ? (string) $this->defaultAvailability->value : null;
    }


    /**
     * Sets defaultAvailability.
     *
     * @param ProductAvailabilityType|null $defaultAvailability
     *
     * @return $this
     */
    public function setDefaultAvailability(?ProductAvailabilityType $defaultAvailability): self
    {
        $this->defaultAvailability = $defaultAvailability;

        return $this;
    }

    /**
     * Gets catalogId.
     *
     * @return string|null
     */
    public function getCatalogId(): ?string
    {
        return $this->catalogId;
    }



    /**
     * Sets catalogId.
     *
     * @param string|null $catalogId  Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
     *
     * @return $this
     */
    public function setCatalogId(?string $catalogId): self
    {
        $this->catalogId = $catalogId;

        return $this;
    }
}

