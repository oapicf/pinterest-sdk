<?php
/**
 * AdAccountGetSubscriptionResponse
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
 * Class representing the AdAccountGetSubscriptionResponse model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class AdAccountGetSubscriptionResponse 
{
        /**
     * Lead form ID.
     *
     * @var string|null
     * @SerializedName("lead_form_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $leadFormId = null;

    /**
     * Standard HTTPS webhook URL.
     *
     * @var string|null
     * @SerializedName("webhook_url")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $webhookUrl = null;

    /**
     * Subscription ID.
     *
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $id = null;

    /**
     * User account used to subscribe lead data.
     *
     * @var string|null
     * @SerializedName("user_account_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $userAccountId = null;

    /**
     * The Ad Account ID that this lead form belongs to.
     *
     * @var string|null
     * @SerializedName("ad_account_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $adAccountId = null;

    /**
     * API version.
     *
     * @var string|null
     * @SerializedName("api_version")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $apiVersion = null;

    /**
     * Base64 encoded key for client to decrypt lead data.
     *
     * @var string|null
     * @SerializedName("cryptographic_key")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $cryptographicKey = null;

    /**
     * Lead data encryption algorithm.
     *
     * @var string|null
     * @SerializedName("cryptographic_algorithm")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $cryptographicAlgorithm = null;

    /**
     * Lead form creation time. Unix timestamp in milliseconds.
     *
     * @var int|null
     * @SerializedName("created_time")
     * @Type("int")
    */
    #[Assert\Type("int")]
    protected ?int $createdTime = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->leadFormId = array_key_exists('leadFormId', $data) ? $data['leadFormId'] : $this->leadFormId;
            $this->webhookUrl = array_key_exists('webhookUrl', $data) ? $data['webhookUrl'] : $this->webhookUrl;
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->userAccountId = array_key_exists('userAccountId', $data) ? $data['userAccountId'] : $this->userAccountId;
            $this->adAccountId = array_key_exists('adAccountId', $data) ? $data['adAccountId'] : $this->adAccountId;
            $this->apiVersion = array_key_exists('apiVersion', $data) ? $data['apiVersion'] : $this->apiVersion;
            $this->cryptographicKey = array_key_exists('cryptographicKey', $data) ? $data['cryptographicKey'] : $this->cryptographicKey;
            $this->cryptographicAlgorithm = array_key_exists('cryptographicAlgorithm', $data) ? $data['cryptographicAlgorithm'] : $this->cryptographicAlgorithm;
            $this->createdTime = array_key_exists('createdTime', $data) ? $data['createdTime'] : $this->createdTime;
        }
    }

    /**
     * Gets leadFormId.
     *
     * @return string|null
     */
    public function getLeadFormId(): ?string
    {
        return $this->leadFormId;
    }

    /**
    * Sets leadFormId.
    *
    * @param string|null $leadFormId  Lead form ID.
    *
    * @return $this
    */
    public function setLeadFormId(?string $leadFormId = null): self
    {
        $this->leadFormId = $leadFormId;

        return $this;
    }




    /**
     * Gets webhookUrl.
     *
     * @return string|null
     */
    public function getWebhookUrl(): ?string
    {
        return $this->webhookUrl;
    }

    /**
    * Sets webhookUrl.
    *
    * @param string|null $webhookUrl  Standard HTTPS webhook URL.
    *
    * @return $this
    */
    public function setWebhookUrl(?string $webhookUrl = null): self
    {
        $this->webhookUrl = $webhookUrl;

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
    * @param string|null $id  Subscription ID.
    *
    * @return $this
    */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets userAccountId.
     *
     * @return string|null
     */
    public function getUserAccountId(): ?string
    {
        return $this->userAccountId;
    }

    /**
    * Sets userAccountId.
    *
    * @param string|null $userAccountId  User account used to subscribe lead data.
    *
    * @return $this
    */
    public function setUserAccountId(?string $userAccountId = null): self
    {
        $this->userAccountId = $userAccountId;

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
    * @param string|null $adAccountId  The Ad Account ID that this lead form belongs to.
    *
    * @return $this
    */
    public function setAdAccountId(?string $adAccountId = null): self
    {
        $this->adAccountId = $adAccountId;

        return $this;
    }




    /**
     * Gets apiVersion.
     *
     * @return string|null
     */
    public function getApiVersion(): ?string
    {
        return $this->apiVersion;
    }

    /**
    * Sets apiVersion.
    *
    * @param string|null $apiVersion  API version.
    *
    * @return $this
    */
    public function setApiVersion(?string $apiVersion = null): self
    {
        $this->apiVersion = $apiVersion;

        return $this;
    }




    /**
     * Gets cryptographicKey.
     *
     * @return string|null
     */
    public function getCryptographicKey(): ?string
    {
        return $this->cryptographicKey;
    }

    /**
    * Sets cryptographicKey.
    *
    * @param string|null $cryptographicKey  Base64 encoded key for client to decrypt lead data.
    *
    * @return $this
    */
    public function setCryptographicKey(?string $cryptographicKey = null): self
    {
        $this->cryptographicKey = $cryptographicKey;

        return $this;
    }




    /**
     * Gets cryptographicAlgorithm.
     *
     * @return string|null
     */
    public function getCryptographicAlgorithm(): ?string
    {
        return $this->cryptographicAlgorithm;
    }

    /**
    * Sets cryptographicAlgorithm.
    *
    * @param string|null $cryptographicAlgorithm  Lead data encryption algorithm.
    *
    * @return $this
    */
    public function setCryptographicAlgorithm(?string $cryptographicAlgorithm = null): self
    {
        $this->cryptographicAlgorithm = $cryptographicAlgorithm;

        return $this;
    }




    /**
     * Gets createdTime.
     *
     * @return int|null
     */
    public function getCreatedTime(): ?int
    {
        return $this->createdTime;
    }

    /**
    * Sets createdTime.
    *
    * @param int|null $createdTime  Lead form creation time. Unix timestamp in milliseconds.
    *
    * @return $this
    */
    public function setCreatedTime(?int $createdTime = null): self
    {
        $this->createdTime = $createdTime;

        return $this;
    }



}


