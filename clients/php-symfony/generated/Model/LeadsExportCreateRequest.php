<?php
/**
 * LeadsExportCreateRequest
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
 * Class representing the LeadsExportCreateRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class LeadsExportCreateRequest 
{
        /**
     * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
     *
     * @var string|null
     * @SerializedName("start_date")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Regex("/^(\\d{4})-(\\d{2})-(\\d{2})$/")]
    protected ?string $startDate = null;

    /**
     * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
     *
     * @var string|null
     * @SerializedName("end_date")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Regex("/^(\\d{4})-(\\d{2})-(\\d{2})$/")]
    protected ?string $endDate = null;

    /**
     * ID for the ad collecting leads
     *
     * @var string|null
     * @SerializedName("ad_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $adId = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->startDate = array_key_exists('startDate', $data) ? $data['startDate'] : $this->startDate;
            $this->endDate = array_key_exists('endDate', $data) ? $data['endDate'] : $this->endDate;
            $this->adId = array_key_exists('adId', $data) ? $data['adId'] : $this->adId;
        }
    }

    /**
     * Gets startDate.
     *
     * @return string|null
     */
    public function getStartDate(): ?string
    {
        return $this->startDate;
    }

    /**
    * Sets startDate.
    *
    * @param string|null $startDate  Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
    *
    * @return $this
    */
    public function setStartDate(?string $startDate): self
    {
        $this->startDate = $startDate;

        return $this;
    }




    /**
     * Gets endDate.
     *
     * @return string|null
     */
    public function getEndDate(): ?string
    {
        return $this->endDate;
    }

    /**
    * Sets endDate.
    *
    * @param string|null $endDate  Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
    *
    * @return $this
    */
    public function setEndDate(?string $endDate): self
    {
        $this->endDate = $endDate;

        return $this;
    }




    /**
     * Gets adId.
     *
     * @return string|null
     */
    public function getAdId(): ?string
    {
        return $this->adId;
    }

    /**
    * Sets adId.
    *
    * @param string|null $adId  ID for the ad collecting leads
    *
    * @return $this
    */
    public function setAdId(?string $adId): self
    {
        $this->adId = $adId;

        return $this;
    }



}


