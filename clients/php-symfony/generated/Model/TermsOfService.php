<?php
/**
 * TermsOfService
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
 * Class representing the TermsOfService model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class TermsOfService 
{
        /**
     * The ID of the terms of service
     *
     * @var string|null
     * @SerializedName("id")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $id = null;

    /**
     * The terms of service content
     *
     * @var string|null
     * @SerializedName("html")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $html = null;

    /**
     * Whether the ad account has accepted terms of service.
     *
     * @var bool|null
     * @SerializedName("has_accepted")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $hasAccepted = null;

    /**
     * The ID of the ad account.
     *
     * @var string|null
     * @SerializedName("ad_account_id")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $adAccountId = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->html = array_key_exists('html', $data) ? $data['html'] : $this->html;
            $this->hasAccepted = array_key_exists('hasAccepted', $data) ? $data['hasAccepted'] : $this->hasAccepted;
            $this->adAccountId = array_key_exists('adAccountId', $data) ? $data['adAccountId'] : $this->adAccountId;
        }
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
     * @param string|null $id  The ID of the terms of service
     *
     * @return $this
     */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Gets html.
     *
     * @return string|null
     */
    public function getHtml(): ?string
    {
        return $this->html;
    }



    /**
     * Sets html.
     *
     * @param string|null $html  The terms of service content
     *
     * @return $this
     */
    public function setHtml(?string $html = null): self
    {
        $this->html = $html;

        return $this;
    }

    /**
     * Gets hasAccepted.
     *
     * @return bool|null
     */
    public function isHasAccepted(): ?bool
    {
        return $this->hasAccepted;
    }



    /**
     * Sets hasAccepted.
     *
     * @param bool|null $hasAccepted  Whether the ad account has accepted terms of service.
     *
     * @return $this
     */
    public function setHasAccepted(?bool $hasAccepted = null): self
    {
        $this->hasAccepted = $hasAccepted;

        return $this;
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
     * @param string|null $adAccountId  The ID of the ad account.
     *
     * @return $this
     */
    public function setAdAccountId(?string $adAccountId = null): self
    {
        $this->adAccountId = $adAccountId;

        return $this;
    }
}

