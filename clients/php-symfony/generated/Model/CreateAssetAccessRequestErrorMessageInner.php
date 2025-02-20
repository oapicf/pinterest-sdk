<?php
/**
 * CreateAssetAccessRequestErrorMessageInner
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
 * Class representing the CreateAssetAccessRequestErrorMessageInner model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CreateAssetAccessRequestErrorMessageInner 
{
        /**
     * Error code associated with the error in requesting asset access.
     *
     * @var int|null
     * @SerializedName("code")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $code = null;

    /**
     * @var string[]|null
     * @SerializedName("messages")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $messages = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->code = array_key_exists('code', $data) ? $data['code'] : $this->code;
            $this->messages = array_key_exists('messages', $data) ? $data['messages'] : $this->messages;
        }
    }

    /**
     * Gets code.
     *
     * @return int|null
     */
    public function getCode(): ?int
    {
        return $this->code;
    }

    /**
    * Sets code.
    *
    * @param int|null $code  Error code associated with the error in requesting asset access.
    *
    * @return $this
    */
    public function setCode(?int $code = null): self
    {
        $this->code = $code;

        return $this;
    }




    /**
     * Gets messages.
     *
     * @return string[]|null
     */
    public function getMessages(): ?array
    {
        return $this->messages;
    }

    /**
    * Sets messages.
    *
    * @param string[]|null $messages
    *
    * @return $this
    */
    public function setMessages(?array $messages = null): self
    {
        $this->messages = $messages;

        return $this;
    }



}


