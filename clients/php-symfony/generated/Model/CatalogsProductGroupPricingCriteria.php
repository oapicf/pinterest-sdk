<?php
/**
 * CatalogsProductGroupPricingCriteria
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
 * Class representing the CatalogsProductGroupPricingCriteria model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsProductGroupPricingCriteria 
{
        /**
     * @var bool|null
     * @SerializedName("inclusion")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $inclusion = true;

    /**
     * @var float|null
     * @SerializedName("values")
     * @Assert\NotNull()
     * @Assert\Type("float")
     * @Type("float")
     * @Assert\GreaterThanOrEqual(0)
     */
    protected ?float $values = null;

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
            $this->inclusion = array_key_exists('inclusion', $data) ? $data['inclusion'] : $this->inclusion;
            $this->values = array_key_exists('values', $data) ? $data['values'] : $this->values;
            $this->negated = array_key_exists('negated', $data) ? $data['negated'] : $this->negated;
        }
    }

    /**
     * Gets inclusion.
     *
     * @return bool|null
     */
    public function isInclusion(): ?bool
    {
        return $this->inclusion;
    }



    /**
     * Sets inclusion.
     *
     * @param bool|null $inclusion
     *
     * @return $this
     */
    public function setInclusion(?bool $inclusion = null): self
    {
        $this->inclusion = $inclusion;

        return $this;
    }

    /**
     * Gets values.
     *
     * @return float|null
     */
    public function getValues(): ?float
    {
        return $this->values;
    }



    /**
     * Sets values.
     *
     * @param float|null $values
     *
     * @return $this
     */
    public function setValues(?float $values): self
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

