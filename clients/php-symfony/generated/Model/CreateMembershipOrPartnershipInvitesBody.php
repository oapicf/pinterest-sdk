<?php
/**
 * CreateMembershipOrPartnershipInvitesBody
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
 * Class representing the CreateMembershipOrPartnershipInvitesBody model.
 *
 * Body to be used on path to send Members or Partners Invite or Request
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateMembershipOrPartnershipInvitesBody 
{
        /**
     * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
     *
     * @var string|null
     * @SerializedName("business_role")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["EMPLOYEE", "BIZ_ADMIN", "PARTNER"])]
    #[Assert\Type("string")]
    protected ?string $businessRole = null;

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
     * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
     *
     * @var string[]|null
     * @SerializedName("members")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    #[Assert\Count(max: 50)]
    #[Assert\Count(min: 1)]
    protected ?array $members = null;

    /**
     * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
     *
     * @var string[]|null
     * @SerializedName("partners")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    #[Assert\Count(max: 50)]
    #[Assert\Count(min: 1)]
    protected ?array $partners = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->businessRole = array_key_exists('businessRole', $data) ? $data['businessRole'] : $this->businessRole;
            $this->inviteType = array_key_exists('inviteType', $data) ? $data['inviteType'] : $this->inviteType;
            $this->members = array_key_exists('members', $data) ? $data['members'] : $this->members;
            $this->partners = array_key_exists('partners', $data) ? $data['partners'] : $this->partners;
        }
    }

    /**
     * Gets businessRole.
     *
     * @return string|null
     */
    public function getBusinessRole(): ?string
    {
        return $this->businessRole;
    }

    /**
    * Sets businessRole.
    *
    * @param string|null $businessRole  The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
    *
    * @return $this
    */
    public function setBusinessRole(?string $businessRole): self
    {
        $this->businessRole = $businessRole;

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
     * Gets members.
     *
     * @return string[]|null
     */
    public function getMembers(): ?array
    {
        return $this->members;
    }

    /**
    * Sets members.
    *
    * @param string[]|null $members  A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
    *
    * @return $this
    */
    public function setMembers(?array $members = null): self
    {
        $this->members = $members;

        return $this;
    }




    /**
     * Gets partners.
     *
     * @return string[]|null
     */
    public function getPartners(): ?array
    {
        return $this->partners;
    }

    /**
    * Sets partners.
    *
    * @param string[]|null $partners  A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
    *
    * @return $this
    */
    public function setPartners(?array $partners = null): self
    {
        $this->partners = $partners;

        return $this;
    }



}


