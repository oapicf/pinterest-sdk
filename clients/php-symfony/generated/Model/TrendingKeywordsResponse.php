<?php
/**
 * TrendingKeywordsResponse
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
 * Class representing the TrendingKeywordsResponse model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class TrendingKeywordsResponse 
{
        /**
     * The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend.
     *
     * @var TrendingKeywordsResponseTrendsInner[]|null
     * @SerializedName("trends")
     * @Type("array<OpenAPI\Server\Model\TrendingKeywordsResponseTrendsInner>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\TrendingKeywordsResponseTrendsInner"),
    ])]
    protected ?array $trends = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->trends = array_key_exists('trends', $data) ? $data['trends'] : $this->trends;
        }
    }

    /**
     * Gets trends.
     *
     * @return TrendingKeywordsResponseTrendsInner[]|null
     */
    public function getTrends(): ?array
    {
        return $this->trends;
    }

    /**
    * Sets trends.
    *
    * @param TrendingKeywordsResponseTrendsInner[]|null $trends  The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
    *
    * @return $this
    */
    public function setTrends(?array $trends = null): self
    {
        $this->trends = $trends;

        return $this;
    }



}


