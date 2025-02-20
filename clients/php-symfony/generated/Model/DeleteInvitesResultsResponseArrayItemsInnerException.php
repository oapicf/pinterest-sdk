<?php
/**
 * DeleteInvitesResultsResponseArrayItemsInnerException
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
 * Class representing the DeleteInvitesResultsResponseArrayItemsInnerException model.
 *
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class DeleteInvitesResultsResponseArrayItemsInnerException 
{
        /**
     * Unique identifier of an invite.
     *
     * @var string|null
     * @SerializedName("invite_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $inviteId = null;

    /**
     * Error message associated with the error in performing the action on the invite/request.
     *
     * @var string|null
     * @SerializedName("message")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $message = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->inviteId = array_key_exists('inviteId', $data) ? $data['inviteId'] : $this->inviteId;
            $this->message = array_key_exists('message', $data) ? $data['message'] : $this->message;
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
    public function setInviteId(?string $inviteId = null): self
    {
        $this->inviteId = $inviteId;

        return $this;
    }




    /**
     * Gets message.
     *
     * @return string|null
     */
    public function getMessage(): ?string
    {
        return $this->message;
    }

    /**
    * Sets message.
    *
    * @param string|null $message  Error message associated with the error in performing the action on the invite/request.
    *
    * @return $this
    */
    public function setMessage(?string $message = null): self
    {
        $this->message = $message;

        return $this;
    }



}


