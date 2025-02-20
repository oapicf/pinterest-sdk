<?php
/**
 * Keyword
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
 * Class representing the Keyword model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class Keyword 
{
        /**
     * &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     *
     * @var int|null
     * @SerializedName("bid")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $bid = null;

    /**
     * @var MatchTypeResponse|null
     * @SerializedName("match_type")
    * @Accessor(getter="getSerializedMatchType", setter="setDeserializedMatchType")
    * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    protected ?MatchTypeResponse $matchType = null;

    /**
     * Keyword value (120 chars max).
     *
     * @var string|null
     * @SerializedName("value")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $value = null;

    /**
     * @var bool|null
     * @SerializedName("archived")
     * @Type("bool")
    */
    #[Assert\Type("bool")]
    protected ?bool $archived = null;

    /**
     * Keyword ID .
     *
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $id = null;

    /**
     * Keyword parent entity ID (advertiser, campaign, ad group).
     *
     * @var string|null
     * @SerializedName("parent_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $parentId = null;

    /**
     * Parent entity type
     *
     * @var string|null
     * @SerializedName("parent_type")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $parentType = null;

    /**
     * Always keyword
     *
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->bid = array_key_exists('bid', $data) ? $data['bid'] : $this->bid;
            $this->matchType = array_key_exists('matchType', $data) ? $data['matchType'] : $this->matchType;
            $this->value = array_key_exists('value', $data) ? $data['value'] : $this->value;
            $this->archived = array_key_exists('archived', $data) ? $data['archived'] : $this->archived;
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->parentId = array_key_exists('parentId', $data) ? $data['parentId'] : $this->parentId;
            $this->parentType = array_key_exists('parentType', $data) ? $data['parentType'] : $this->parentType;
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
        }
    }

    /**
     * Gets bid.
     *
     * @return int|null
     */
    public function getBid(): ?int
    {
        return $this->bid;
    }

    /**
    * Sets bid.
    *
    * @param int|null $bid  </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
    *
    * @return $this
    */
    public function setBid(?int $bid = null): self
    {
        $this->bid = $bid;

        return $this;
    }




    /**
     * Gets matchType.
     *
     * @return MatchTypeResponse|null
     */
    public function getMatchType(): ?MatchTypeResponse
    {
        return $this->matchType;
    }

    /**
    * Sets matchType.
    *
    * @param MatchTypeResponse|null $matchType
    *
    * @return $this
    */
    public function setMatchType(?MatchTypeResponse $matchType): self
    {
        $this->matchType = $matchType;

        return $this;
    }

    /**
    * Gets matchType for serialization.
    *
    * @return string|null
    */
    public function getSerializedMatchType(): string|null
    {
        return !is_null($this->matchType?->value) ? (string) $this->matchType->value : null;
    }

    /**
    * Sets matchType.
    *
    * @param string|MatchTypeResponse|null $matchType
    *
    * @return $this
    */
    public function setDeserializedMatchType(string|MatchTypeResponse|null $matchType): self
    {
        if (is_string($matchType)) {
            $matchType = MatchTypeResponse::tryFrom($matchType);
        }

        $this->matchType = $matchType;

        return $this;
    }



    /**
     * Gets value.
     *
     * @return string|null
     */
    public function getValue(): ?string
    {
        return $this->value;
    }

    /**
    * Sets value.
    *
    * @param string|null $value  Keyword value (120 chars max).
    *
    * @return $this
    */
    public function setValue(?string $value): self
    {
        $this->value = $value;

        return $this;
    }




    /**
     * Gets archived.
     *
     * @return bool|null
     */
    public function isArchived(): ?bool
    {
        return $this->archived;
    }

    /**
    * Sets archived.
    *
    * @param bool|null $archived
    *
    * @return $this
    */
    public function setArchived(?bool $archived = null): self
    {
        $this->archived = $archived;

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
    * @param string|null $id  Keyword ID .
    *
    * @return $this
    */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets parentId.
     *
     * @return string|null
     */
    public function getParentId(): ?string
    {
        return $this->parentId;
    }

    /**
    * Sets parentId.
    *
    * @param string|null $parentId  Keyword parent entity ID (advertiser, campaign, ad group).
    *
    * @return $this
    */
    public function setParentId(?string $parentId = null): self
    {
        $this->parentId = $parentId;

        return $this;
    }




    /**
     * Gets parentType.
     *
     * @return string|null
     */
    public function getParentType(): ?string
    {
        return $this->parentType;
    }

    /**
    * Sets parentType.
    *
    * @param string|null $parentType  Parent entity type
    *
    * @return $this
    */
    public function setParentType(?string $parentType = null): self
    {
        $this->parentType = $parentType;

        return $this;
    }




    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType(): ?string
    {
        return $this->type;
    }

    /**
    * Sets type.
    *
    * @param string|null $type  Always keyword
    *
    * @return $this
    */
    public function setType(?string $type = null): self
    {
        $this->type = $type;

        return $this;
    }



}


