<?php
/**
 * CatalogsProductGroupFilters
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
 * Class representing the CatalogsProductGroupFilters model.
 *
 * Object holding a group of filters for a catalog product group
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsProductGroupFilters 
{
        /**
     * @var CatalogsProductGroupFilterKeys[]|null
     * @SerializedName("any_of")
     * @Type("array<OpenAPI\Server\Model\CatalogsProductGroupFilterKeys>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupFilterKeys"),
    ])]
    protected ?array $anyOf = null;

    /**
     * @var CatalogsProductGroupFilterKeys[]|null
     * @SerializedName("all_of")
     * @Type("array<OpenAPI\Server\Model\CatalogsProductGroupFilterKeys>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupFilterKeys"),
    ])]
    protected ?array $allOf = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->anyOf = array_key_exists('anyOf', $data) ? $data['anyOf'] : $this->anyOf;
            $this->allOf = array_key_exists('allOf', $data) ? $data['allOf'] : $this->allOf;
        }
    }

    /**
     * Gets anyOf.
     *
     * @return CatalogsProductGroupFilterKeys[]|null
     */
    public function getAnyOf(): ?array
    {
        return $this->anyOf;
    }

    /**
    * Sets anyOf.
    *
    * @param CatalogsProductGroupFilterKeys[]|null $anyOf
    *
    * @return $this
    */
    public function setAnyOf(?array $anyOf): self
    {
        $this->anyOf = $anyOf;

        return $this;
    }




    /**
     * Gets allOf.
     *
     * @return CatalogsProductGroupFilterKeys[]|null
     */
    public function getAllOf(): ?array
    {
        return $this->allOf;
    }

    /**
    * Sets allOf.
    *
    * @param CatalogsProductGroupFilterKeys[]|null $allOf
    *
    * @return $this
    */
    public function setAllOf(?array $allOf): self
    {
        $this->allOf = $allOf;

        return $this;
    }



}


