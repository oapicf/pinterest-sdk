<?php
/**
 * LeadFormTestRequest
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
 * Class representing the LeadFormTestRequest model.
 *
 * Request to create test data for lead data test API.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class LeadFormTestRequest 
{
        /**
     * Test lead answers. Should follow the creation order.
     *
     * @var string[]|null
     * @SerializedName("answers")
     * @Assert\NotNull()
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     */
    protected ?array $answers = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->answers = array_key_exists('answers', $data) ? $data['answers'] : $this->answers;
        }
    }

    /**
     * Gets answers.
     *
     * @return string[]|null
     */
    public function getAnswers(): ?array
    {
        return $this->answers;
    }



    /**
     * Sets answers.
     *
     * @param string[]|null $answers  Test lead answers. Should follow the creation order.
     *
     * @return $this
     */
    public function setAnswers(?array $answers): self
    {
        $this->answers = $answers;

        return $this;
    }
}

