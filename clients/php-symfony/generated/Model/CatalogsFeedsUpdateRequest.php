<?php
/**
 * CatalogsFeedsUpdateRequest
 *
 * PHP version 7.1.3
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
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
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
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the CatalogsFeedsUpdateRequest model.
 *
 * Request object for updating a feed.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class CatalogsFeedsUpdateRequest 
{
        /**
     * @var OpenAPI\Server\Model\ProductAvailabilityType|null
     * @SerializedName("default_availability")
     * @Assert\Type("OpenAPI\Server\Model\ProductAvailabilityType")
     * @Type("OpenAPI\Server\Model\ProductAvailabilityType")
     */
    protected $defaultAvailability;

    /**
     * @var OpenAPI\Server\Model\NullableCurrency|null
     * @SerializedName("default_currency")
     * @Assert\Type("OpenAPI\Server\Model\NullableCurrency")
     * @Type("OpenAPI\Server\Model\NullableCurrency")
     */
    protected $defaultCurrency;

    /**
     * A human-friendly name associated to a given feed.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $name;

    /**
     * @var OpenAPI\Server\Model\CatalogsFormat|null
     * @SerializedName("format")
     * @Assert\Type("OpenAPI\Server\Model\CatalogsFormat")
     * @Type("OpenAPI\Server\Model\CatalogsFormat")
     */
    protected $format;

    /**
     * @var OpenAPI\Server\Model\CatalogsFeedCredentials|null
     * @SerializedName("credentials")
     * @Assert\Type("OpenAPI\Server\Model\CatalogsFeedCredentials")
     * @Type("OpenAPI\Server\Model\CatalogsFeedCredentials")
     */
    protected $credentials;

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     *
     * @var string|null
     * @SerializedName("location")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $location;

    /**
     * @var OpenAPI\Server\Model\CatalogsFeedProcessingSchedule|null
     * @SerializedName("preferred_processing_schedule")
     * @Assert\Type("OpenAPI\Server\Model\CatalogsFeedProcessingSchedule")
     * @Type("OpenAPI\Server\Model\CatalogsFeedProcessingSchedule")
     */
    protected $preferredProcessingSchedule;

    /**
     * @var OpenAPI\Server\Model\CatalogsStatus|null
     * @SerializedName("status")
     * @Assert\Type("OpenAPI\Server\Model\CatalogsStatus")
     * @Type("OpenAPI\Server\Model\CatalogsStatus")
     */
    protected $status;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->defaultAvailability = isset($data['defaultAvailability']) ? $data['defaultAvailability'] : null;
        $this->defaultCurrency = isset($data['defaultCurrency']) ? $data['defaultCurrency'] : null;
        $this->name = isset($data['name']) ? $data['name'] : null;
        $this->format = isset($data['format']) ? $data['format'] : null;
        $this->credentials = isset($data['credentials']) ? $data['credentials'] : null;
        $this->location = isset($data['location']) ? $data['location'] : null;
        $this->preferredProcessingSchedule = isset($data['preferredProcessingSchedule']) ? $data['preferredProcessingSchedule'] : null;
        $this->status = isset($data['status']) ? $data['status'] : null;
    }

    /**
     * Gets defaultAvailability.
     *
     * @return OpenAPI\Server\Model\ProductAvailabilityType|null
     */
    public function getDefaultAvailability(): ?ProductAvailabilityType
    {
        return $this->defaultAvailability;
    }

    /**
     * Sets defaultAvailability.
     *
     * @param OpenAPI\Server\Model\ProductAvailabilityType|null $defaultAvailability
     *
     * @return $this
     */
    public function setDefaultAvailability(ProductAvailabilityType $defaultAvailability = null)
    {
        $this->defaultAvailability = $defaultAvailability;

        return $this;
    }

    /**
     * Gets defaultCurrency.
     *
     * @return OpenAPI\Server\Model\NullableCurrency|null
     */
    public function getDefaultCurrency(): ?NullableCurrency
    {
        return $this->defaultCurrency;
    }

    /**
     * Sets defaultCurrency.
     *
     * @param OpenAPI\Server\Model\NullableCurrency|null $defaultCurrency
     *
     * @return $this
     */
    public function setDefaultCurrency(NullableCurrency $defaultCurrency = null)
    {
        $this->defaultCurrency = $defaultCurrency;

        return $this;
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName()
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
    public function setName($name = null)
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets format.
     *
     * @return OpenAPI\Server\Model\CatalogsFormat|null
     */
    public function getFormat(): ?CatalogsFormat
    {
        return $this->format;
    }

    /**
     * Sets format.
     *
     * @param OpenAPI\Server\Model\CatalogsFormat|null $format
     *
     * @return $this
     */
    public function setFormat(CatalogsFormat $format = null)
    {
        $this->format = $format;

        return $this;
    }

    /**
     * Gets credentials.
     *
     * @return OpenAPI\Server\Model\CatalogsFeedCredentials|null
     */
    public function getCredentials(): ?CatalogsFeedCredentials
    {
        return $this->credentials;
    }

    /**
     * Sets credentials.
     *
     * @param OpenAPI\Server\Model\CatalogsFeedCredentials|null $credentials
     *
     * @return $this
     */
    public function setCredentials(CatalogsFeedCredentials $credentials = null)
    {
        $this->credentials = $credentials;

        return $this;
    }

    /**
     * Gets location.
     *
     * @return string|null
     */
    public function getLocation()
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
    public function setLocation($location = null)
    {
        $this->location = $location;

        return $this;
    }

    /**
     * Gets preferredProcessingSchedule.
     *
     * @return OpenAPI\Server\Model\CatalogsFeedProcessingSchedule|null
     */
    public function getPreferredProcessingSchedule(): ?CatalogsFeedProcessingSchedule
    {
        return $this->preferredProcessingSchedule;
    }

    /**
     * Sets preferredProcessingSchedule.
     *
     * @param OpenAPI\Server\Model\CatalogsFeedProcessingSchedule|null $preferredProcessingSchedule
     *
     * @return $this
     */
    public function setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule $preferredProcessingSchedule = null)
    {
        $this->preferredProcessingSchedule = $preferredProcessingSchedule;

        return $this;
    }

    /**
     * Gets status.
     *
     * @return OpenAPI\Server\Model\CatalogsStatus|null
     */
    public function getStatus(): ?CatalogsStatus
    {
        return $this->status;
    }

    /**
     * Sets status.
     *
     * @param OpenAPI\Server\Model\CatalogsStatus|null $status
     *
     * @return $this
     */
    public function setStatus(CatalogsStatus $status = null)
    {
        $this->status = $status;

        return $this;
    }
}

