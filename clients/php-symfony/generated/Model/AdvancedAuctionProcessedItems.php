<?php
/**
 * AdvancedAuctionProcessedItems
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
 * Class representing the AdvancedAuctionProcessedItems model.
 *
 * Response object containing the results of an operation on an item bid option
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class AdvancedAuctionProcessedItems 
{
        /**
     * Catalog id pertaining to all items
     *
     * @var string|null
     * @SerializedName("catalog_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $catalogId = null;

    /**
     * Array of advanced auction processed items
     *
     * @var AdvancedAuctionProcessedItem[]|null
     * @SerializedName("items")
     * @Type("array<OpenAPI\Server\Model\AdvancedAuctionProcessedItem>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\AdvancedAuctionProcessedItem"),
    ])]
    protected ?array $items = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->catalogId = array_key_exists('catalogId', $data) ? $data['catalogId'] : $this->catalogId;
            $this->items = array_key_exists('items', $data) ? $data['items'] : $this->items;
        }
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
    * @param string|null $catalogId  Catalog id pertaining to all items
    *
    * @return $this
    */
    public function setCatalogId(?string $catalogId = null): self
    {
        $this->catalogId = $catalogId;

        return $this;
    }




    /**
     * Gets items.
     *
     * @return AdvancedAuctionProcessedItem[]|null
     */
    public function getItems(): ?array
    {
        return $this->items;
    }

    /**
    * Sets items.
    *
    * @param AdvancedAuctionProcessedItem[]|null $items  Array of advanced auction processed items
    *
    * @return $this
    */
    public function setItems(?array $items = null): self
    {
        $this->items = $items;

        return $this;
    }



}


