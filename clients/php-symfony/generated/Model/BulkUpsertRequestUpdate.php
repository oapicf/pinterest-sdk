<?php
/**
 * BulkUpsertRequestUpdate
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
 * Class representing the BulkUpsertRequestUpdate model.
 *
 * Request for creation of entities in bulk.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class BulkUpsertRequestUpdate 
{
        /**
     * @var CampaignUpdateRequest[]|null
     * @SerializedName("campaigns")
     * @Type("array<OpenAPI\Server\Model\CampaignUpdateRequest>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\CampaignUpdateRequest"),
    ])]
    protected ?array $campaigns = null;

    /**
     * @var AdGroupUpdateRequest[]|null
     * @SerializedName("ad_groups")
     * @Type("array<OpenAPI\Server\Model\AdGroupUpdateRequest>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\AdGroupUpdateRequest"),
    ])]
    protected ?array $adGroups = null;

    /**
     * @var AdUpdateRequest[]|null
     * @SerializedName("ads")
     * @Type("array<OpenAPI\Server\Model\AdUpdateRequest>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\AdUpdateRequest"),
    ])]
    protected ?array $ads = null;

    /**
     * @var ProductGroupPromotionUpdateRequest[]|null
     * @SerializedName("product_groups")
     * @Type("array<OpenAPI\Server\Model\ProductGroupPromotionUpdateRequest>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\ProductGroupPromotionUpdateRequest"),
    ])]
    protected ?array $productGroups = null;

    /**
     * @var KeywordUpdate[]|null
     * @SerializedName("keywords")
     * @Type("array<OpenAPI\Server\Model\KeywordUpdate>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\KeywordUpdate"),
    ])]
    protected ?array $keywords = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->campaigns = array_key_exists('campaigns', $data) ? $data['campaigns'] : $this->campaigns;
            $this->adGroups = array_key_exists('adGroups', $data) ? $data['adGroups'] : $this->adGroups;
            $this->ads = array_key_exists('ads', $data) ? $data['ads'] : $this->ads;
            $this->productGroups = array_key_exists('productGroups', $data) ? $data['productGroups'] : $this->productGroups;
            $this->keywords = array_key_exists('keywords', $data) ? $data['keywords'] : $this->keywords;
        }
    }

    /**
     * Gets campaigns.
     *
     * @return CampaignUpdateRequest[]|null
     */
    public function getCampaigns(): ?array
    {
        return $this->campaigns;
    }

    /**
    * Sets campaigns.
    *
    * @param CampaignUpdateRequest[]|null $campaigns
    *
    * @return $this
    */
    public function setCampaigns(?array $campaigns = null): self
    {
        $this->campaigns = $campaigns;

        return $this;
    }




    /**
     * Gets adGroups.
     *
     * @return AdGroupUpdateRequest[]|null
     */
    public function getAdGroups(): ?array
    {
        return $this->adGroups;
    }

    /**
    * Sets adGroups.
    *
    * @param AdGroupUpdateRequest[]|null $adGroups
    *
    * @return $this
    */
    public function setAdGroups(?array $adGroups = null): self
    {
        $this->adGroups = $adGroups;

        return $this;
    }




    /**
     * Gets ads.
     *
     * @return AdUpdateRequest[]|null
     */
    public function getAds(): ?array
    {
        return $this->ads;
    }

    /**
    * Sets ads.
    *
    * @param AdUpdateRequest[]|null $ads
    *
    * @return $this
    */
    public function setAds(?array $ads = null): self
    {
        $this->ads = $ads;

        return $this;
    }




    /**
     * Gets productGroups.
     *
     * @return ProductGroupPromotionUpdateRequest[]|null
     */
    public function getProductGroups(): ?array
    {
        return $this->productGroups;
    }

    /**
    * Sets productGroups.
    *
    * @param ProductGroupPromotionUpdateRequest[]|null $productGroups
    *
    * @return $this
    */
    public function setProductGroups(?array $productGroups = null): self
    {
        $this->productGroups = $productGroups;

        return $this;
    }




    /**
     * Gets keywords.
     *
     * @return KeywordUpdate[]|null
     */
    public function getKeywords(): ?array
    {
        return $this->keywords;
    }

    /**
    * Sets keywords.
    *
    * @param KeywordUpdate[]|null $keywords
    *
    * @return $this
    */
    public function setKeywords(?array $keywords = null): self
    {
        $this->keywords = $keywords;

        return $this;
    }



}


