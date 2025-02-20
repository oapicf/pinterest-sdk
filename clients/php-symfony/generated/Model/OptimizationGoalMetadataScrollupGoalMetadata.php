<?php
/**
 * OptimizationGoalMetadataScrollupGoalMetadata
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
 * Class representing the OptimizationGoalMetadataScrollupGoalMetadata model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OptimizationGoalMetadataScrollupGoalMetadata 
{
        /**
     * @var string|null
     * @SerializedName("scrollup_goal_value_in_micro_currency")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^[0-9]+$/")]
    protected ?string $scrollupGoalValueInMicroCurrency = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->scrollupGoalValueInMicroCurrency = array_key_exists('scrollupGoalValueInMicroCurrency', $data) ? $data['scrollupGoalValueInMicroCurrency'] : $this->scrollupGoalValueInMicroCurrency;
        }
    }

    /**
     * Gets scrollupGoalValueInMicroCurrency.
     *
     * @return string|null
     */
    public function getScrollupGoalValueInMicroCurrency(): ?string
    {
        return $this->scrollupGoalValueInMicroCurrency;
    }

    /**
    * Sets scrollupGoalValueInMicroCurrency.
    *
    * @param string|null $scrollupGoalValueInMicroCurrency
    *
    * @return $this
    */
    public function setScrollupGoalValueInMicroCurrency(?string $scrollupGoalValueInMicroCurrency = null): self
    {
        $this->scrollupGoalValueInMicroCurrency = $scrollupGoalValueInMicroCurrency;

        return $this;
    }



}


