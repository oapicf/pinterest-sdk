<?php
/**
 * ItemUpsertBatchRecord
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
 * Class representing the ItemUpsertBatchRecord model.
 *
 * Object describing an item batch record to upsert items
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ItemUpsertBatchRecord 
{
        /**
     * The catalog item id in the merchant namespace
     *
     * @var string|null
     * @SerializedName("item_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $itemId = null;

    /**
     * @var ItemAttributesRequest|null
     * @SerializedName("attributes")
     * @Type("OpenAPI\Server\Model\ItemAttributesRequest")
    */
    #[Assert\Type("OpenAPI\Server\Model\ItemAttributesRequest")]
    protected ?ItemAttributesRequest $attributes = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->itemId = array_key_exists('itemId', $data) ? $data['itemId'] : $this->itemId;
            $this->attributes = array_key_exists('attributes', $data) ? $data['attributes'] : $this->attributes;
        }
    }

    /**
     * Gets itemId.
     *
     * @return string|null
     */
    public function getItemId(): ?string
    {
        return $this->itemId;
    }

    /**
    * Sets itemId.
    *
    * @param string|null $itemId  The catalog item id in the merchant namespace
    *
    * @return $this
    */
    public function setItemId(?string $itemId = null): self
    {
        $this->itemId = $itemId;

        return $this;
    }




    /**
     * Gets attributes.
     *
     * @return ItemAttributesRequest|null
     */
    public function getAttributes(): ?ItemAttributesRequest
    {
        return $this->attributes;
    }

    /**
    * Sets attributes.
    *
    * @param ItemAttributesRequest|null $attributes
    *
    * @return $this
    */
    public function setAttributes(?ItemAttributesRequest $attributes = null): self
    {
        $this->attributes = $attributes;

        return $this;
    }



}


