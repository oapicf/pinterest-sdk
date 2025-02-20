<?php
/**
 * CreateAssetGroupBody
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
 * Class representing the CreateAssetGroupBody model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateAssetGroupBody 
{
        /**
     * Asset Group name
     *
     * @var string|null
     * @SerializedName("asset_group_name")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $assetGroupName = null;

    /**
     * Asset group description
     *
     * @var string|null
     * @SerializedName("asset_group_description")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $assetGroupDescription = null;

    /**
     * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
     *
     * @var AssetGroupType[]|null
     * @SerializedName("asset_group_types")
     * @Accessor(getter="getSerializedAssetGroupTypes", setter="setDeserializedAssetGroupTypes")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\AssetGroupType"),
    ])]
    protected ?array $assetGroupTypes = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->assetGroupName = array_key_exists('assetGroupName', $data) ? $data['assetGroupName'] : $this->assetGroupName;
            $this->assetGroupDescription = array_key_exists('assetGroupDescription', $data) ? $data['assetGroupDescription'] : $this->assetGroupDescription;
            $this->assetGroupTypes = array_key_exists('assetGroupTypes', $data) ? $data['assetGroupTypes'] : $this->assetGroupTypes;
        }
    }

    /**
     * Gets assetGroupName.
     *
     * @return string|null
     */
    public function getAssetGroupName(): ?string
    {
        return $this->assetGroupName;
    }

    /**
    * Sets assetGroupName.
    *
    * @param string|null $assetGroupName  Asset Group name
    *
    * @return $this
    */
    public function setAssetGroupName(?string $assetGroupName): self
    {
        $this->assetGroupName = $assetGroupName;

        return $this;
    }




    /**
     * Gets assetGroupDescription.
     *
     * @return string|null
     */
    public function getAssetGroupDescription(): ?string
    {
        return $this->assetGroupDescription;
    }

    /**
    * Sets assetGroupDescription.
    *
    * @param string|null $assetGroupDescription  Asset group description
    *
    * @return $this
    */
    public function setAssetGroupDescription(?string $assetGroupDescription): self
    {
        $this->assetGroupDescription = $assetGroupDescription;

        return $this;
    }




    /**
     * Gets assetGroupTypes.
     *
     * @return AssetGroupType[]|null
     */
    public function getAssetGroupTypes(): ?array
    {
        return $this->assetGroupTypes;
    }

    /**
    * Sets assetGroupTypes.
    *
    * @param AssetGroupType[]|null $assetGroupTypes  Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
    *
    * @return $this
    */
    public function setAssetGroupTypes(?array $assetGroupTypes): self
    {
        $this->assetGroupTypes = $assetGroupTypes;

        return $this;
    }


    /**
    * Gets assetGroupTypes for serialization.
    *
    * @return array
    */
    public function getSerializedAssetGroupTypes(): array
    {
        return array_map(
            static fn ($value) => $value?->value ? (string) $value->value : null,
            $this->assetGroupTypes ?? []
        );
    }

    /**
    * Sets assetGroupTypes.
    *
    * @param ?array $assetGroupTypes
    *
    * @return $this
    */
    public function setDeserializedAssetGroupTypes(?array $assetGroupTypes = []): self
    {
        $this->assetGroupTypes = array_map(
            static function ($value) {
                if (is_string($value)) {
                    $value = AssetGroupType::tryFrom($value);
                }

                return $value;
            },
            $assetGroupTypes ?? []
        );

        return $this;
    }

}


