<?php
/**
 * CatalogsProductGroupMultipleStringListCriteria
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
 * Class representing the CatalogsProductGroupMultipleStringListCriteria model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsProductGroupMultipleStringListCriteria 
{
        /**
     * @var string[]|null
     * @SerializedName("values")
     * @Assert\NotNull()
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected ?array $values = null;

    /**
     * @var bool|null
     * @SerializedName("negated")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $negated = false;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->values = array_key_exists('values', $data) ? $data['values'] : $this->values;
            $this->negated = array_key_exists('negated', $data) ? $data['negated'] : $this->negated;
        }
    }

    /**
     * Gets values.
     *
     * @return string[]|null
     */
    public function getValues(): ?array
    {
        return $this->values;
    }



    /**
     * Sets values.
     *
     * @param string[]|null $values
     *
     * @return $this
     */
    public function setValues(?array $values): self
    {
        $this->values = $values;

        return $this;
    }

    /**
     * Gets negated.
     *
     * @return bool|null
     */
    public function isNegated(): ?bool
    {
        return $this->negated;
    }



    /**
     * Sets negated.
     *
     * @param bool|null $negated
     *
     * @return $this
     */
    public function setNegated(?bool $negated = null): self
    {
        $this->negated = $negated;

        return $this;
    }
}

