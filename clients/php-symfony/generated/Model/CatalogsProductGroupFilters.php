<?php
/**
 * CatalogsProductGroupFilters
 *
 * PHP version 7.1.3
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
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
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
     * @var OpenAPI\Server\Model\CatalogsProductGroupFilterKeys[]|null
     * @SerializedName("any_of")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupFilterKeys")
     * })
     * @Type("array<OpenAPI\Server\Model\CatalogsProductGroupFilterKeys>")
     */
    protected $anyOf;

    /**
     * @var OpenAPI\Server\Model\CatalogsProductGroupFilterKeys[]|null
     * @SerializedName("all_of")
     * @Assert\All({
     *   @Assert\Type("OpenAPI\Server\Model\CatalogsProductGroupFilterKeys")
     * })
     * @Type("array<OpenAPI\Server\Model\CatalogsProductGroupFilterKeys>")
     */
    protected $allOf;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->anyOf = isset($data['anyOf']) ? $data['anyOf'] : null;
        $this->allOf = isset($data['allOf']) ? $data['allOf'] : null;
    }

    /**
     * Gets anyOf.
     *
     * @return OpenAPI\Server\Model\CatalogsProductGroupFilterKeys[]|null
     */
    public function getAnyOf(): ?array
    {
        return $this->anyOf;
    }

    /**
     * Sets anyOf.
     *
     * @param OpenAPI\Server\Model\CatalogsProductGroupFilterKeys[]|null $anyOf
     *
     * @return $this
     */
    public function setAnyOf(array $anyOf = null)
    {
        $this->anyOf = $anyOf;

        return $this;
    }

    /**
     * Gets allOf.
     *
     * @return OpenAPI\Server\Model\CatalogsProductGroupFilterKeys[]|null
     */
    public function getAllOf(): ?array
    {
        return $this->allOf;
    }

    /**
     * Sets allOf.
     *
     * @param OpenAPI\Server\Model\CatalogsProductGroupFilterKeys[]|null $allOf
     *
     * @return $this
     */
    public function setAllOf(array $allOf = null)
    {
        $this->allOf = $allOf;

        return $this;
    }
}

