<?php
/**
 * CatalogsRetailItemResponse
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
 * Class representing the CatalogsRetailItemResponse model.
 *
 * Object describing a retail item record
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsRetailItemResponse 
{
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
     * The catalog retail item id in the merchant namespace
     *
     * @var string|null
     * @SerializedName("item_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $itemId = null;

    /**
     * The pins mapped to the item
     *
     * @var Pin[]|null
     * @SerializedName("pins")
     * @Type("array<OpenAPI\Server\Model\Pin>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\Pin"),
    ])]
    #[Assert\Count(max: 11)]
    protected ?array $pins = null;

    /**
     * @var ItemAttributes|null
     * @SerializedName("attributes")
     * @Type("OpenAPI\Server\Model\ItemAttributes")
    */
    #[Assert\Type("OpenAPI\Server\Model\ItemAttributes")]
    protected ?ItemAttributes $attributes = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->catalogType = array_key_exists('catalogType', $data) ? $data['catalogType'] : $this->catalogType;
            $this->itemId = array_key_exists('itemId', $data) ? $data['itemId'] : $this->itemId;
            $this->pins = array_key_exists('pins', $data) ? $data['pins'] : $this->pins;
            $this->attributes = array_key_exists('attributes', $data) ? $data['attributes'] : $this->attributes;
        }
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
    * @param string|null $itemId  The catalog retail item id in the merchant namespace
    *
    * @return $this
    */
    public function setItemId(?string $itemId = null): self
    {
        $this->itemId = $itemId;

        return $this;
    }




    /**
     * Gets pins.
     *
     * @return Pin[]|null
     */
    public function getPins(): ?array
    {
        return $this->pins;
    }

    /**
    * Sets pins.
    *
    * @param Pin[]|null $pins  The pins mapped to the item
    *
    * @return $this
    */
    public function setPins(?array $pins = null): self
    {
        $this->pins = $pins;

        return $this;
    }




    /**
     * Gets attributes.
     *
     * @return ItemAttributes|null
     */
    public function getAttributes(): ?ItemAttributes
    {
        return $this->attributes;
    }

    /**
    * Sets attributes.
    *
    * @param ItemAttributes|null $attributes
    *
    * @return $this
    */
    public function setAttributes(?ItemAttributes $attributes = null): self
    {
        $this->attributes = $attributes;

        return $this;
    }



}


