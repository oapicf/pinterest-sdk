<?php
/**
 * AdGroupAudienceSizingRequestKeywordsInner
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
 * Class representing the AdGroupAudienceSizingRequestKeywordsInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class AdGroupAudienceSizingRequestKeywordsInner 
{
        /**
     * @var MatchTypeResponse|null
     * @SerializedName("match_type")
    * @Accessor(getter="getSerializedMatchType", setter="setDeserializedMatchType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?MatchTypeResponse $matchType = null;

    /**
     * Keyword value (120 chars max).
     *
     * @var string|null
     * @SerializedName("value")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $value = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->matchType = array_key_exists('matchType', $data) ? $data['matchType'] : $this->matchType;
            $this->value = array_key_exists('value', $data) ? $data['value'] : $this->value;
        }
    }

    /**
     * Gets matchType.
     *
     * @return MatchTypeResponse|null
     */
    public function getMatchType(): ?MatchTypeResponse
    {
        return $this->matchType;
    }

    /**
    * Sets matchType.
    *
    * @param MatchTypeResponse|null $matchType
    *
    * @return $this
    */
    public function setMatchType(?MatchTypeResponse $matchType): self
    {
        $this->matchType = $matchType;

        return $this;
    }

    /**
    * Gets matchType for serialization.
    *
    * @return string|null
    */
    public function getSerializedMatchType(): string|null
    {
        return !is_null($this->matchType?->value) ? (string) $this->matchType->value : null;
    }

    /**
    * Sets matchType.
    *
    * @param string|MatchTypeResponse|null $matchType
    *
    * @return $this
    */
    public function setDeserializedMatchType(string|MatchTypeResponse|null $matchType): self
    {
        if (is_string($matchType)) {
            $matchType = MatchTypeResponse::tryFrom($matchType);
        }

        $this->matchType = $matchType;

        return $this;
    }



    /**
     * Gets value.
     *
     * @return string|null
     */
    public function getValue(): ?string
    {
        return $this->value;
    }

    /**
    * Sets value.
    *
    * @param string|null $value  Keyword value (120 chars max).
    *
    * @return $this
    */
    public function setValue(?string $value): self
    {
        $this->value = $value;

        return $this;
    }



}


