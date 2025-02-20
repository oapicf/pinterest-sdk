<?php
/**
 * AudienceCommon
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
 * Class representing the AudienceCommon model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class AudienceCommon 
{
        /**
     * Ad account ID.
     *
     * @var string|null
     * @SerializedName("ad_account_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $adAccountId = null;

    /**
     * Audience name.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * @var AudienceRule|null
     * @SerializedName("rule")
     * @Type("OpenAPI\Server\Model\AudienceRule")
    */
    #[Assert\Type("OpenAPI\Server\Model\AudienceRule")]
    protected ?AudienceRule $rule = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->adAccountId = array_key_exists('adAccountId', $data) ? $data['adAccountId'] : $this->adAccountId;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->rule = array_key_exists('rule', $data) ? $data['rule'] : $this->rule;
        }
    }

    /**
     * Gets adAccountId.
     *
     * @return string|null
     */
    public function getAdAccountId(): ?string
    {
        return $this->adAccountId;
    }

    /**
    * Sets adAccountId.
    *
    * @param string|null $adAccountId  Ad account ID.
    *
    * @return $this
    */
    public function setAdAccountId(?string $adAccountId = null): self
    {
        $this->adAccountId = $adAccountId;

        return $this;
    }




    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName(): ?string
    {
        return $this->name;
    }

    /**
    * Sets name.
    *
    * @param string|null $name  Audience name.
    *
    * @return $this
    */
    public function setName(?string $name = null): self
    {
        $this->name = $name;

        return $this;
    }




    /**
     * Gets rule.
     *
     * @return AudienceRule|null
     */
    public function getRule(): ?AudienceRule
    {
        return $this->rule;
    }

    /**
    * Sets rule.
    *
    * @param AudienceRule|null $rule
    *
    * @return $this
    */
    public function setRule(?AudienceRule $rule = null): self
    {
        $this->rule = $rule;

        return $this;
    }



}


