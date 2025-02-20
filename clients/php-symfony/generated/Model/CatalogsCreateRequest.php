<?php
/**
 * CatalogsCreateRequest
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
 * Class representing the CatalogsCreateRequest model.
 *
 * Request object for creating a catalog.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsCreateRequest 
{
        /**
     * Type of the catalog entity.
     *
     * @var string|null
     * @SerializedName("catalog_type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["HOTEL"])]
    #[Assert\Type("string")]
    protected ?string $catalogType = null;

    /**
     * A human-friendly name associated to a given catalog.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->catalogType = array_key_exists('catalogType', $data) ? $data['catalogType'] : $this->catalogType;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
        }
    }

    /**
     * Gets catalogType.
     *
     * @return string|null
     */
    public function getCatalogType(): ?string
    {
        return $this->catalogType;
    }

    /**
    * Sets catalogType.
    *
    * @param string|null $catalogType  Type of the catalog entity.
    *
    * @return $this
    */
    public function setCatalogType(?string $catalogType): self
    {
        $this->catalogType = $catalogType;

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
    * @param string|null $name  A human-friendly name associated to a given catalog.
    *
    * @return $this
    */
    public function setName(?string $name): self
    {
        $this->name = $name;

        return $this;
    }



}


