<?php
/**
 * BusinessSharedAudience
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
 * Class representing the BusinessSharedAudience model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class BusinessSharedAudience 
{
        /**
     * Unique identifier of an audience
     *
     * @var string|null
     * @SerializedName("audience_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $audienceId = null;

    /**
     * @var OperationType|null
     * @SerializedName("operation_type")
    * @Accessor(getter="getSerializedOperationType", setter="setDeserializedOperationType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?OperationType $operationType = null;

    /**
     * List of business IDs to share with or revoke from.
     *
     * @var string[]|null
     * @SerializedName("recipient_business_ids")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $recipientBusinessIds = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->audienceId = array_key_exists('audienceId', $data) ? $data['audienceId'] : $this->audienceId;
            $this->operationType = array_key_exists('operationType', $data) ? $data['operationType'] : $this->operationType;
            $this->recipientBusinessIds = array_key_exists('recipientBusinessIds', $data) ? $data['recipientBusinessIds'] : $this->recipientBusinessIds;
        }
    }

    /**
     * Gets audienceId.
     *
     * @return string|null
     */
    public function getAudienceId(): ?string
    {
        return $this->audienceId;
    }

    /**
    * Sets audienceId.
    *
    * @param string|null $audienceId  Unique identifier of an audience
    *
    * @return $this
    */
    public function setAudienceId(?string $audienceId): self
    {
        $this->audienceId = $audienceId;

        return $this;
    }




    /**
     * Gets operationType.
     *
     * @return OperationType|null
     */
    public function getOperationType(): ?OperationType
    {
        return $this->operationType;
    }

    /**
    * Sets operationType.
    *
    * @param OperationType|null $operationType
    *
    * @return $this
    */
    public function setOperationType(?OperationType $operationType): self
    {
        $this->operationType = $operationType;

        return $this;
    }

    /**
    * Gets operationType for serialization.
    *
    * @return string|null
    */
    public function getSerializedOperationType(): string|null
    {
        return !is_null($this->operationType?->value) ? (string) $this->operationType->value : null;
    }

    /**
    * Sets operationType.
    *
    * @param string|OperationType|null $operationType
    *
    * @return $this
    */
    public function setDeserializedOperationType(string|OperationType|null $operationType): self
    {
        if (is_string($operationType)) {
            $operationType = OperationType::tryFrom($operationType);
        }

        $this->operationType = $operationType;

        return $this;
    }



    /**
     * Gets recipientBusinessIds.
     *
     * @return string[]|null
     */
    public function getRecipientBusinessIds(): ?array
    {
        return $this->recipientBusinessIds;
    }

    /**
    * Sets recipientBusinessIds.
    *
    * @param string[]|null $recipientBusinessIds  List of business IDs to share with or revoke from.
    *
    * @return $this
    */
    public function setRecipientBusinessIds(?array $recipientBusinessIds): self
    {
        $this->recipientBusinessIds = $recipientBusinessIds;

        return $this;
    }



}


