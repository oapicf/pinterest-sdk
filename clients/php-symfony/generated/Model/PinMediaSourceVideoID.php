<?php
/**
 * PinMediaSourceVideoID
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
 * Class representing the PinMediaSourceVideoID model.
 *
 * Video ID-based media source
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class PinMediaSourceVideoID 
{
        /**
     * @var string|null
     * @SerializedName("source_type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["video_id"])]
    #[Assert\Type("string")]
    protected ?string $sourceType = null;

    /**
     * Cover image url.
     *
     * @var string|null
     * @SerializedName("cover_image_url")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $coverImageUrl = null;

    /**
     * Content type for cover image Base64.
     *
     * @var string|null
     * @SerializedName("cover_image_content_type")
     * @Type("string")
    */
    #[Assert\Choice(["image/jpeg", "image/png"])]
    #[Assert\Type("string")]
    protected ?string $coverImageContentType = null;

    /**
     * Cover image Base64.
     *
     * @var string|null
     * @SerializedName("cover_image_data")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $coverImageData = null;

    /**
     * @var string|null
     * @SerializedName("media_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $mediaId = null;

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     *
     * @var bool|null
     * @SerializedName("is_standard")
     * @Type("bool")
    */
    #[Assert\Type("bool")]
    protected ?bool $isStandard = true;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->sourceType = array_key_exists('sourceType', $data) ? $data['sourceType'] : $this->sourceType;
            $this->coverImageUrl = array_key_exists('coverImageUrl', $data) ? $data['coverImageUrl'] : $this->coverImageUrl;
            $this->coverImageContentType = array_key_exists('coverImageContentType', $data) ? $data['coverImageContentType'] : $this->coverImageContentType;
            $this->coverImageData = array_key_exists('coverImageData', $data) ? $data['coverImageData'] : $this->coverImageData;
            $this->mediaId = array_key_exists('mediaId', $data) ? $data['mediaId'] : $this->mediaId;
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
     * Gets coverImageUrl.
     *
     * @return string|null
     */
    public function getCoverImageUrl(): ?string
    {
        return $this->coverImageUrl;
    }

    /**
    * Sets coverImageUrl.
    *
    * @param string|null $coverImageUrl  Cover image url.
    *
    * @return $this
    */
    public function setCoverImageUrl(?string $coverImageUrl = null): self
    {
        $this->coverImageUrl = $coverImageUrl;

        return $this;
    }




    /**
     * Gets coverImageContentType.
     *
     * @return string|null
     */
    public function getCoverImageContentType(): ?string
    {
        return $this->coverImageContentType;
    }

    /**
    * Sets coverImageContentType.
    *
    * @param string|null $coverImageContentType  Content type for cover image Base64.
    *
    * @return $this
    */
    public function setCoverImageContentType(?string $coverImageContentType = null): self
    {
        $this->coverImageContentType = $coverImageContentType;

        return $this;
    }




    /**
     * Gets coverImageData.
     *
     * @return string|null
     */
    public function getCoverImageData(): ?string
    {
        return $this->coverImageData;
    }

    /**
    * Sets coverImageData.
    *
    * @param string|null $coverImageData  Cover image Base64.
    *
    * @return $this
    */
    public function setCoverImageData(?string $coverImageData = null): self
    {
        $this->coverImageData = $coverImageData;

        return $this;
    }




    /**
     * Gets mediaId.
     *
     * @return string|null
     */
    public function getMediaId(): ?string
    {
        return $this->mediaId;
    }

    /**
    * Sets mediaId.
    *
    * @param string|null $mediaId
    *
    * @return $this
    */
    public function setMediaId(?string $mediaId): self
    {
        $this->mediaId = $mediaId;

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


