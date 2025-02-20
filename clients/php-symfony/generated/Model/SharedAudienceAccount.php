<?php
/**
 * SharedAudienceAccount
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
 * Class representing the SharedAudienceAccount model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class SharedAudienceAccount 
{
        /**
     * Account ID (ad account or business ID).
     *
     * @var string|null
     * @SerializedName("account_id")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Regex("/^\\d+$/")]
    protected ?string $accountId = null;

    /**
     * Account name.
     *
     * @var string|null
     * @SerializedName("account_name")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $accountName = null;

    /**
     * account type
     *
     * @var string|null
     * @SerializedName("account_type")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Choice(["AD_ACCOUNT", "BUSINESS_ACCOUNT"])]
    #[Assert\Type("string")]
    protected ?string $accountType = null;

    /**
     * Epoch timestamp in seconds for the shared audience event
     *
     * @var int|null
     * @SerializedName("shared_on_timestamp")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $sharedOnTimestamp = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->accountId = array_key_exists('accountId', $data) ? $data['accountId'] : $this->accountId;
            $this->accountName = array_key_exists('accountName', $data) ? $data['accountName'] : $this->accountName;
            $this->accountType = array_key_exists('accountType', $data) ? $data['accountType'] : $this->accountType;
            $this->sharedOnTimestamp = array_key_exists('sharedOnTimestamp', $data) ? $data['sharedOnTimestamp'] : $this->sharedOnTimestamp;
        }
    }

    /**
     * Gets accountId.
     *
     * @return string|null
     */
    public function getAccountId(): ?string
    {
        return $this->accountId;
    }

    /**
    * Sets accountId.
    *
    * @param string|null $accountId  Account ID (ad account or business ID).
    *
    * @return $this
    */
    public function setAccountId(?string $accountId): self
    {
        $this->accountId = $accountId;

        return $this;
    }




    /**
     * Gets accountName.
     *
     * @return string|null
     */
    public function getAccountName(): ?string
    {
        return $this->accountName;
    }

    /**
    * Sets accountName.
    *
    * @param string|null $accountName  Account name.
    *
    * @return $this
    */
    public function setAccountName(?string $accountName): self
    {
        $this->accountName = $accountName;

        return $this;
    }




    /**
     * Gets accountType.
     *
     * @return string|null
     */
    public function getAccountType(): ?string
    {
        return $this->accountType;
    }

    /**
    * Sets accountType.
    *
    * @param string|null $accountType  account type
    *
    * @return $this
    */
    public function setAccountType(?string $accountType): self
    {
        $this->accountType = $accountType;

        return $this;
    }




    /**
     * Gets sharedOnTimestamp.
     *
     * @return int|null
     */
    public function getSharedOnTimestamp(): ?int
    {
        return $this->sharedOnTimestamp;
    }

    /**
    * Sets sharedOnTimestamp.
    *
    * @param int|null $sharedOnTimestamp  Epoch timestamp in seconds for the shared audience event
    *
    * @return $this
    */
    public function setSharedOnTimestamp(?int $sharedOnTimestamp): self
    {
        $this->sharedOnTimestamp = $sharedOnTimestamp;

        return $this;
    }



}


