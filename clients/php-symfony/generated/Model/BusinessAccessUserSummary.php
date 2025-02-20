<?php
/**
 * BusinessAccessUserSummary
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
 * Class representing the BusinessAccessUserSummary model.
 *
 * Metadata of the member/partner that has access to the asset.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class BusinessAccessUserSummary 
{
        /**
     * Email of the business member/partner.
     *
     * @var string|null
     * @SerializedName("email")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $email = null;

    /**
     * Unique identifier of the business member/partner.
     *
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Length(max: 20)]
    #[Assert\Length(min: 1)]
    protected ?string $id = null;

    /**
     * Username of the business member/partner.
     *
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
            $this->email = array_key_exists('email', $data) ? $data['email'] : $this->email;
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->username = array_key_exists('username', $data) ? $data['username'] : $this->username;
        }
    }

    /**
     * Gets email.
     *
     * @return string|null
     */
    public function getEmail(): ?string
    {
        return $this->email;
    }

    /**
    * Sets email.
    *
    * @param string|null $email  Email of the business member/partner.
    *
    * @return $this
    */
    public function setEmail(?string $email = null): self
    {
        $this->email = $email;

        return $this;
    }




    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId(): ?string
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param string|null $id  Unique identifier of the business member/partner.
    *
    * @return $this
    */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

        return $this;
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
    * @param string|null $username  Username of the business member/partner.
    *
    * @return $this
    */
    public function setUsername(?string $username = null): self
    {
        $this->username = $username;

        return $this;
    }



}


