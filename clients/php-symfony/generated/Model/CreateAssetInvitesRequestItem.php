<?php
/**
 * CreateAssetInvitesRequestItem
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
 * Class representing the CreateAssetInvitesRequestItem model.
 *
 * Object declaring an asset role update to an invite.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateAssetInvitesRequestItem 
{
        /**
     * Unique identifier of an invite.
     *
     * @var string|null
     * @SerializedName("invite_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $inviteId = null;

    /**
     * @var InviteType|null
     * @SerializedName("invite_type")
    * @Accessor(getter="getSerializedInviteType", setter="setDeserializedInviteType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?InviteType $inviteType = null;

    /**
     * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
     *
     * @var Permissions[]|null
     * @SerializedName("asset_id_to_permissions")
     * @Type("array<string, OpenAPI\Server\Model\Permissions>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\Permissions"),
    ])]
    #[Assert\Count(min: 1)]
    protected ?array $assetIdToPermissions = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->inviteId = array_key_exists('inviteId', $data) ? $data['inviteId'] : $this->inviteId;
            $this->inviteType = array_key_exists('inviteType', $data) ? $data['inviteType'] : $this->inviteType;
            $this->assetIdToPermissions = array_key_exists('assetIdToPermissions', $data) ? $data['assetIdToPermissions'] : $this->assetIdToPermissions;
        }
    }

    /**
     * Gets inviteId.
     *
     * @return string|null
     */
    public function getInviteId(): ?string
    {
        return $this->inviteId;
    }

    /**
    * Sets inviteId.
    *
    * @param string|null $inviteId  Unique identifier of an invite.
    *
    * @return $this
    */
    public function setInviteId(?string $inviteId): self
    {
        $this->inviteId = $inviteId;

        return $this;
    }




    /**
     * Gets inviteType.
     *
     * @return InviteType|null
     */
    public function getInviteType(): ?InviteType
    {
        return $this->inviteType;
    }

    /**
    * Sets inviteType.
    *
    * @param InviteType|null $inviteType
    *
    * @return $this
    */
    public function setInviteType(?InviteType $inviteType): self
    {
        $this->inviteType = $inviteType;

        return $this;
    }

    /**
    * Gets inviteType for serialization.
    *
    * @return string|null
    */
    public function getSerializedInviteType(): string|null
    {
        return !is_null($this->inviteType?->value) ? (string) $this->inviteType->value : null;
    }

    /**
    * Sets inviteType.
    *
    * @param string|InviteType|null $inviteType
    *
    * @return $this
    */
    public function setDeserializedInviteType(string|InviteType|null $inviteType): self
    {
        if (is_string($inviteType)) {
            $inviteType = InviteType::tryFrom($inviteType);
        }

        $this->inviteType = $inviteType;

        return $this;
    }



    /**
     * Gets assetIdToPermissions.
     *
     * @return Permissions[]|null
     */
    public function getAssetIdToPermissions(): ?array
    {
        return $this->assetIdToPermissions;
    }

    /**
    * Sets assetIdToPermissions.
    *
    * @param Permissions[]|null $assetIdToPermissions  An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
    *
    * @return $this
    */
    public function setAssetIdToPermissions(?array $assetIdToPermissions): self
    {
        $this->assetIdToPermissions = $assetIdToPermissions;

        return $this;
    }



}


