<?php
/**
 * DetailedError
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
 * Class representing the DetailedError model.
 *
 * Used for including extra details to a base error
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class DetailedError 
{
        /**
     * @var int|null
     * @SerializedName("code")
     * @Assert\NotNull()
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $code = null;

    /**
     * @var string|null
     * @SerializedName("message")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $message = null;

    /**
     * @var array|null
     * @SerializedName("details")
     * @Assert\NotNull()
     * @Assert\Type("array")
     * @Type("array")
     */
    protected ?array $details = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->code = array_key_exists('code', $data) ? $data['code'] : $this->code;
            $this->message = array_key_exists('message', $data) ? $data['message'] : $this->message;
            $this->details = array_key_exists('details', $data) ? $data['details'] : $this->details;
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
     * @param int|null $code
     *
     * @return $this
     */
    public function setCode(?int $code): self
    {
        $this->code = $code;

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
     * @param string|null $message
     *
     * @return $this
     */
    public function setMessage(?string $message): self
    {
        $this->message = $message;

        return $this;
    }

    /**
     * Gets details.
     *
     * @return array|null
     */
    public function getDetails(): ?array
    {
        return $this->details;
    }



    /**
     * Sets details.
     *
     * @param array|null $details
     *
     * @return $this
     */
    public function setDetails(?array $details): self
    {
        $this->details = $details;

        return $this;
    }
}

