<?php
/**
 * CreateAssetInvitesRequest
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
 * Class representing the CreateAssetInvitesRequest model.
 *
 * Request body for updating asset roles for existing invites.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateAssetInvitesRequest 
{
        /**
     * @var CreateAssetInvitesRequestItem[]|null
     * @SerializedName("invites")
     * @Type("array<OpenAPI\Server\Model\CreateAssetInvitesRequestItem>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\CreateAssetInvitesRequestItem"),
    ])]
    #[Assert\Count(max: 50)]
    #[Assert\Count(min: 1)]
    protected ?array $invites = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->invites = array_key_exists('invites', $data) ? $data['invites'] : $this->invites;
        }
    }

    /**
     * Gets invites.
     *
     * @return CreateAssetInvitesRequestItem[]|null
     */
    public function getInvites(): ?array
    {
        return $this->invites;
    }

    /**
    * Sets invites.
    *
    * @param CreateAssetInvitesRequestItem[]|null $invites
    *
    * @return $this
    */
    public function setInvites(?array $invites): self
    {
        $this->invites = $invites;

        return $this;
    }



}


