<?php
/**
 * CatalogsDeleteHotelItem
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
 * Class representing the CatalogsDeleteHotelItem model.
 *
 * A hotel item to be deleted
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsDeleteHotelItem 
{
        /**
     * The catalog hotel id in the merchant namespace
     *
     * @var string|null
     * @SerializedName("hotel_id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $hotelId = null;

    /**
     * @var string|null
     * @SerializedName("operation")
     * @Assert\NotNull()
     * @Assert\Choice({ "DELETE" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $operation = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->hotelId = array_key_exists('hotelId', $data) ? $data['hotelId'] : $this->hotelId;
            $this->operation = array_key_exists('operation', $data) ? $data['operation'] : $this->operation;
        }
    }

    /**
     * Gets hotelId.
     *
     * @return string|null
     */
    public function getHotelId(): ?string
    {
        return $this->hotelId;
    }



    /**
     * Sets hotelId.
     *
     * @param string|null $hotelId  The catalog hotel id in the merchant namespace
     *
     * @return $this
     */
    public function setHotelId(?string $hotelId): self
    {
        $this->hotelId = $hotelId;

        return $this;
    }

    /**
     * Gets operation.
     *
     * @return string|null
     */
    public function getOperation(): ?string
    {
        return $this->operation;
    }



    /**
     * Sets operation.
     *
     * @param string|null $operation
     *
     * @return $this
     */
    public function setOperation(?string $operation): self
    {
        $this->operation = $operation;

        return $this;
    }
}

