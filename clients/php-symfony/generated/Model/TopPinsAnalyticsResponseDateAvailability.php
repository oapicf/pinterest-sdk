<?php
/**
 * TopPinsAnalyticsResponseDateAvailability
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
 * Class representing the TopPinsAnalyticsResponseDateAvailability model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class TopPinsAnalyticsResponseDateAvailability 
{
        /**
     * @var float|null
     * @SerializedName("latest_available_timestamp")
     * @Assert\Type("float")
     * @Type("float")
     */
    protected ?float $latestAvailableTimestamp = null;

    /**
     * @var bool|null
     * @SerializedName("is_realtime")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $isRealtime = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->latestAvailableTimestamp = array_key_exists('latestAvailableTimestamp', $data) ? $data['latestAvailableTimestamp'] : $this->latestAvailableTimestamp;
            $this->isRealtime = array_key_exists('isRealtime', $data) ? $data['isRealtime'] : $this->isRealtime;
        }
    }

    /**
     * Gets latestAvailableTimestamp.
     *
     * @return float|null
     */
    public function getLatestAvailableTimestamp(): ?float
    {
        return $this->latestAvailableTimestamp;
    }



    /**
     * Sets latestAvailableTimestamp.
     *
     * @param float|null $latestAvailableTimestamp
     *
     * @return $this
     */
    public function setLatestAvailableTimestamp(?float $latestAvailableTimestamp = null): self
    {
        $this->latestAvailableTimestamp = $latestAvailableTimestamp;

        return $this;
    }

    /**
     * Gets isRealtime.
     *
     * @return bool|null
     */
    public function isIsRealtime(): ?bool
    {
        return $this->isRealtime;
    }



    /**
     * Sets isRealtime.
     *
     * @param bool|null $isRealtime
     *
     * @return $this
     */
    public function setIsRealtime(?bool $isRealtime = null): self
    {
        $this->isRealtime = $isRealtime;

        return $this;
    }
}

