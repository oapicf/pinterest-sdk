<?php
/**
 * PinMediaSourceImageURL
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
 * Class representing the PinMediaSourceImageURL model.
 *
 * Image URL-based media source
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class PinMediaSourceImageURL 
{
        /**
     * @var string|null
     * @SerializedName("source_type")
     * @Assert\NotNull()
     * @Assert\Choice({ "image_url" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $sourceType = null;

    /**
     * @var string|null
     * @SerializedName("url")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $url = null;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     *
     * @var bool|null
     * @SerializedName("is_standard")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $isStandard = true;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->sourceType = array_key_exists('sourceType', $data) ? $data['sourceType'] : $this->sourceType;
            $this->url = array_key_exists('url', $data) ? $data['url'] : $this->url;
            $this->isStandard = array_key_exists('isStandard', $data) ? $data['isStandard'] : $this->isStandard;
        }
    }

    /**
     * Gets sourceType.
     *
     * @return string|null
     */
    public function getSourceType(): ?string
    {
        return $this->sourceType;
    }



    /**
     * Sets sourceType.
     *
     * @param string|null $sourceType
     *
     * @return $this
     */
    public function setSourceType(?string $sourceType): self
    {
        $this->sourceType = $sourceType;

        return $this;
    }

    /**
     * Gets url.
     *
     * @return string|null
     */
    public function getUrl(): ?string
    {
        return $this->url;
    }



    /**
     * Sets url.
     *
     * @param string|null $url
     *
     * @return $this
     */
    public function setUrl(?string $url): self
    {
        $this->url = $url;

        return $this;
    }

    /**
     * Gets isStandard.
     *
     * @return bool|null
     */
    public function isIsStandard(): ?bool
    {
        return $this->isStandard;
    }



    /**
     * Sets isStandard.
     *
     * @param bool|null $isStandard  Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     *
     * @return $this
     */
    public function setIsStandard(?bool $isStandard = null): self
    {
        $this->isStandard = $isStandard;

        return $this;
    }
}

