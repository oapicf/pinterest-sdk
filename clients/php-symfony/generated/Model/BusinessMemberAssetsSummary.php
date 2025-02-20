<?php
/**
 * BusinessMemberAssetsSummary
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
 * Class representing the BusinessMemberAssetsSummary model.
 *
 * Ad accounts and profiles the business member/partner has access to.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class BusinessMemberAssetsSummary 
{
        /**
     * List of ad account IDs and respective permission levels.
     *
     * @var BusinessMemberAssetsSummaryAdAccountsInner[]|null
     * @SerializedName("ad_accounts")
     * @Type("array<OpenAPI\Server\Model\BusinessMemberAssetsSummaryAdAccountsInner>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\BusinessMemberAssetsSummaryAdAccountsInner"),
    ])]
    protected ?array $adAccounts = null;

    /**
     * List of profile IDs and respective permission levels.
     *
     * @var BusinessMemberAssetsSummaryProfilesInner[]|null
     * @SerializedName("profiles")
     * @Type("array<OpenAPI\Server\Model\BusinessMemberAssetsSummaryProfilesInner>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\BusinessMemberAssetsSummaryProfilesInner"),
    ])]
    protected ?array $profiles = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->adAccounts = array_key_exists('adAccounts', $data) ? $data['adAccounts'] : $this->adAccounts;
            $this->profiles = array_key_exists('profiles', $data) ? $data['profiles'] : $this->profiles;
        }
    }

    /**
     * Gets adAccounts.
     *
     * @return BusinessMemberAssetsSummaryAdAccountsInner[]|null
     */
    public function getAdAccounts(): ?array
    {
        return $this->adAccounts;
    }

    /**
    * Sets adAccounts.
    *
    * @param BusinessMemberAssetsSummaryAdAccountsInner[]|null $adAccounts  List of ad account IDs and respective permission levels.
    *
    * @return $this
    */
    public function setAdAccounts(?array $adAccounts = null): self
    {
        $this->adAccounts = $adAccounts;

        return $this;
    }




    /**
     * Gets profiles.
     *
     * @return BusinessMemberAssetsSummaryProfilesInner[]|null
     */
    public function getProfiles(): ?array
    {
        return $this->profiles;
    }

    /**
    * Sets profiles.
    *
    * @param BusinessMemberAssetsSummaryProfilesInner[]|null $profiles  List of profile IDs and respective permission levels.
    *
    * @return $this
    */
    public function setProfiles(?array $profiles = null): self
    {
        $this->profiles = $profiles;

        return $this;
    }



}


