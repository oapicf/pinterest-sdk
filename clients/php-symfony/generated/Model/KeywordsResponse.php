<?php
/**
 * KeywordsResponse
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
 * Class representing the KeywordsResponse model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class KeywordsResponse 
{
        /**
     * @var KeywordError[]|null
     * @SerializedName("errors")
     * @Type("array<OpenAPI\Server\Model\KeywordError>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\KeywordError"),
    ])]
    protected ?array $errors = null;

    /**
     * @var Keyword[]|null
     * @SerializedName("keywords")
     * @Type("array<OpenAPI\Server\Model\Keyword>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\Keyword"),
    ])]
    protected ?array $keywords = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->errors = array_key_exists('errors', $data) ? $data['errors'] : $this->errors;
            $this->keywords = array_key_exists('keywords', $data) ? $data['keywords'] : $this->keywords;
        }
    }

    /**
     * Gets errors.
     *
     * @return KeywordError[]|null
     */
    public function getErrors(): ?array
    {
        return $this->errors;
    }

    /**
    * Sets errors.
    *
    * @param KeywordError[]|null $errors
    *
    * @return $this
    */
    public function setErrors(?array $errors = null): self
    {
        $this->errors = $errors;

        return $this;
    }




    /**
     * Gets keywords.
     *
     * @return Keyword[]|null
     */
    public function getKeywords(): ?array
    {
        return $this->keywords;
    }

    /**
    * Sets keywords.
    *
    * @param Keyword[]|null $keywords
    *
    * @return $this
    */
    public function setKeywords(?array $keywords = null): self
    {
        $this->keywords = $keywords;

        return $this;
    }



}


