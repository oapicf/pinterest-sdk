<?php
/**
 * PinMediaWithImageAndVideo
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
 * Class representing the PinMediaWithImageAndVideo model.
 *
 * Pin with a mix of images and videos.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class PinMediaWithImageAndVideo extends PinMedia 
{
        /**
     * @var PinMediaMetadata[]|null
     * @SerializedName("items")
     * @Type("array<OpenAPI\Server\Model\PinMediaMetadata>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\PinMediaMetadata"),
    ])]
    protected ?array $items = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        parent::__construct($data);

        if (is_array($data)) {
            $this->items = array_key_exists('items', $data) ? $data['items'] : $this->items;
        }
    }

    /**
     * Gets items.
     *
     * @return PinMediaMetadata[]|null
     */
    public function getItems(): ?array
    {
        return $this->items;
    }

    /**
    * Sets items.
    *
    * @param PinMediaMetadata[]|null $items
    *
    * @return $this
    */
    public function setItems(?array $items = null): self
    {
        $this->items = $items;

        return $this;
    }



}


