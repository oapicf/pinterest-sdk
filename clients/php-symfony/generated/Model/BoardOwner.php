<?php
/**
 * BoardOwner
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
 * Class representing the BoardOwner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class BoardOwner 
{
        /**
     * @var string|null
     * @SerializedName("username")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $username = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->username = array_key_exists('username', $data) ? $data['username'] : $this->username;
        }
    }

    /**
     * Gets username.
     *
     * @return string|null
     */
    public function getUsername(): ?string
    {
        return $this->username;
    }

    /**
    * Sets username.
    *
    * @param string|null $username
    *
    * @return $this
    */
    public function setUsername(?string $username = null): self
    {
        $this->username = $username;

        return $this;
    }



}


