<?php
/**
 * BidFloor
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
 * Class representing the BidFloor model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class BidFloor 
{
        /**
     * A list of bid floors in micro currency. For example, [100000, 200000]
     *
     * @var int[]|null
     * @SerializedName("bid_floors")
     * @Assert\All({
     *   @Assert\Type("int")
     * })
     * @Type("array<int>")
     */
    protected ?array $bidFloors = null;

    /**
     * Always the string &#39;bidfloor&#39;
     *
     * @var string|null
     * @SerializedName("type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $type = 'bidfloor';

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->bidFloors = array_key_exists('bidFloors', $data) ? $data['bidFloors'] : $this->bidFloors;
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
        }
    }

    /**
     * Gets bidFloors.
     *
     * @return int[]|null
     */
    public function getBidFloors(): ?array
    {
        return $this->bidFloors;
    }



    /**
     * Sets bidFloors.
     *
     * @param int[]|null $bidFloors  A list of bid floors in micro currency. For example, [100000, 200000]
     *
     * @return $this
     */
    public function setBidFloors(?array $bidFloors = null): self
    {
        $this->bidFloors = $bidFloors;

        return $this;
    }

    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType(): ?string
    {
        return $this->type;
    }



    /**
     * Sets type.
     *
     * @param string|null $type  Always the string 'bidfloor'
     *
     * @return $this
     */
    public function setType(?string $type = null): self
    {
        $this->type = $type;

        return $this;
    }
}

