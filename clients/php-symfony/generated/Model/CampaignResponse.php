<?php
/**
 * CampaignResponse
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
 * Class representing the CampaignResponse model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CampaignResponse 
{
        /**
     * Campaign ID.
     *
     * @var string|null
     * @SerializedName("id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Regex("/^\\d+$/")
     */
    protected ?string $id = null;

    /**
     * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
     *
     * @var string|null
     * @SerializedName("ad_account_id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Regex("/^\\d+$/")
     */
    protected ?string $adAccountId = null;

    /**
     * Campaign name.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $name = null;

    /**
     * @var EntityStatus|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    protected ?EntityStatus $status = null;

    /**
     * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
     *
     * @var int|null
     * @SerializedName("lifetime_spend_cap")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $lifetimeSpendCap = null;

    /**
     * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
     *
     * @var int|null
     * @SerializedName("daily_spend_cap")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $dailySpendCap = null;

    /**
     * Order line ID that appears on the invoice.
     *
     * @var string|null
     * @SerializedName("order_line_id")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Regex("/^\\d+$/")
     */
    protected ?string $orderLineId = null;

    /**
     * @var AdCommonTrackingUrls|null
     * @SerializedName("tracking_urls")
     * @Assert\Type("OpenAPI\Server\Model\AdCommonTrackingUrls")
     * @Type("OpenAPI\Server\Model\AdCommonTrackingUrls")
     */
    protected ?AdCommonTrackingUrls $trackingUrls = null;

    /**
     * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     *
     * @var int|null
     * @SerializedName("start_time")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $startTime = null;

    /**
     * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     *
     * @var int|null
     * @SerializedName("end_time")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $endTime = null;

    /**
     * @var CampaignSummaryStatus|null
     * @SerializedName("summary_status")
        * @Accessor(getter="getSerializedSummaryStatus")
        * @Type("string")
     */
    protected ?CampaignSummaryStatus $summaryStatus = null;

    /**
     * @var ObjectiveType|null
     * @SerializedName("objective_type")
        * @Accessor(getter="getSerializedObjectiveType")
        * @Type("string")
     */
    protected ?ObjectiveType $objectiveType = null;

    /**
     * Campaign creation time. Unix timestamp in seconds.
     *
     * @var int|null
     * @SerializedName("created_time")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $createdTime = null;

    /**
     * UTC timestamp. Last update time.
     *
     * @var int|null
     * @SerializedName("updated_time")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $updatedTime = null;

    /**
     * Always \&quot;campaign\&quot;.
     *
     * @var string|null
     * @SerializedName("type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $type = null;

    /**
     * Determines if a campaign has flexible daily budgets setup.
     *
     * @var bool|null
     * @SerializedName("is_flexible_daily_budgets")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $isFlexibleDailyBudgets = null;

    /**
     * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
     *
     * @var bool|null
     * @SerializedName("is_campaign_budget_optimization")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $isCampaignBudgetOptimization = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->adAccountId = array_key_exists('adAccountId', $data) ? $data['adAccountId'] : $this->adAccountId;
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->lifetimeSpendCap = array_key_exists('lifetimeSpendCap', $data) ? $data['lifetimeSpendCap'] : $this->lifetimeSpendCap;
            $this->dailySpendCap = array_key_exists('dailySpendCap', $data) ? $data['dailySpendCap'] : $this->dailySpendCap;
            $this->orderLineId = array_key_exists('orderLineId', $data) ? $data['orderLineId'] : $this->orderLineId;
            $this->trackingUrls = array_key_exists('trackingUrls', $data) ? $data['trackingUrls'] : $this->trackingUrls;
            $this->startTime = array_key_exists('startTime', $data) ? $data['startTime'] : $this->startTime;
            $this->endTime = array_key_exists('endTime', $data) ? $data['endTime'] : $this->endTime;
            $this->summaryStatus = array_key_exists('summaryStatus', $data) ? $data['summaryStatus'] : $this->summaryStatus;
            $this->objectiveType = array_key_exists('objectiveType', $data) ? $data['objectiveType'] : $this->objectiveType;
            $this->createdTime = array_key_exists('createdTime', $data) ? $data['createdTime'] : $this->createdTime;
            $this->updatedTime = array_key_exists('updatedTime', $data) ? $data['updatedTime'] : $this->updatedTime;
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->isFlexibleDailyBudgets = array_key_exists('isFlexibleDailyBudgets', $data) ? $data['isFlexibleDailyBudgets'] : $this->isFlexibleDailyBudgets;
            $this->isCampaignBudgetOptimization = array_key_exists('isCampaignBudgetOptimization', $data) ? $data['isCampaignBudgetOptimization'] : $this->isCampaignBudgetOptimization;
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
     * @param string|null $id  Campaign ID.
     *
     * @return $this
     */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

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
     * @param string|null $adAccountId  Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
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
     * @param string|null $name  Campaign name.
     *
     * @return $this
     */
    public function setName(?string $name = null): self
    {
        $this->name = $name;

        return $this;
    }

    /**
     * Gets status.
     *
     * @return EntityStatus|null
     */
    public function getStatus(): ?EntityStatus
    {
        return $this->status;
    }

    /**
    * Gets status for serialization.
    *
    * @return string|null
    */
    public function getSerializedStatus(): string|null
    {
        return $this->status?->value ? (string) $this->status->value : null;
    }


    /**
     * Sets status.
     *
     * @param EntityStatus|null $status
     *
     * @return $this
     */
    public function setStatus(?EntityStatus $status = null): self
    {
        $this->status = $status;

        return $this;
    }

    /**
     * Gets lifetimeSpendCap.
     *
     * @return int|null
     */
    public function getLifetimeSpendCap(): ?int
    {
        return $this->lifetimeSpendCap;
    }



    /**
     * Sets lifetimeSpendCap.
     *
     * @param int|null $lifetimeSpendCap  Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
     *
     * @return $this
     */
    public function setLifetimeSpendCap(?int $lifetimeSpendCap = null): self
    {
        $this->lifetimeSpendCap = $lifetimeSpendCap;

        return $this;
    }

    /**
     * Gets dailySpendCap.
     *
     * @return int|null
     */
    public function getDailySpendCap(): ?int
    {
        return $this->dailySpendCap;
    }



    /**
     * Sets dailySpendCap.
     *
     * @param int|null $dailySpendCap  Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
     *
     * @return $this
     */
    public function setDailySpendCap(?int $dailySpendCap = null): self
    {
        $this->dailySpendCap = $dailySpendCap;

        return $this;
    }

    /**
     * Gets orderLineId.
     *
     * @return string|null
     */
    public function getOrderLineId(): ?string
    {
        return $this->orderLineId;
    }



    /**
     * Sets orderLineId.
     *
     * @param string|null $orderLineId  Order line ID that appears on the invoice.
     *
     * @return $this
     */
    public function setOrderLineId(?string $orderLineId = null): self
    {
        $this->orderLineId = $orderLineId;

        return $this;
    }

    /**
     * Gets trackingUrls.
     *
     * @return AdCommonTrackingUrls|null
     */
    public function getTrackingUrls(): ?AdCommonTrackingUrls
    {
        return $this->trackingUrls;
    }



    /**
     * Sets trackingUrls.
     *
     * @param AdCommonTrackingUrls|null $trackingUrls
     *
     * @return $this
     */
    public function setTrackingUrls(?AdCommonTrackingUrls $trackingUrls = null): self
    {
        $this->trackingUrls = $trackingUrls;

        return $this;
    }

    /**
     * Gets startTime.
     *
     * @return int|null
     */
    public function getStartTime(): ?int
    {
        return $this->startTime;
    }



    /**
     * Sets startTime.
     *
     * @param int|null $startTime  Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     *
     * @return $this
     */
    public function setStartTime(?int $startTime = null): self
    {
        $this->startTime = $startTime;

        return $this;
    }

    /**
     * Gets endTime.
     *
     * @return int|null
     */
    public function getEndTime(): ?int
    {
        return $this->endTime;
    }



    /**
     * Sets endTime.
     *
     * @param int|null $endTime  Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     *
     * @return $this
     */
    public function setEndTime(?int $endTime = null): self
    {
        $this->endTime = $endTime;

        return $this;
    }

    /**
     * Gets summaryStatus.
     *
     * @return CampaignSummaryStatus|null
     */
    public function getSummaryStatus(): ?CampaignSummaryStatus
    {
        return $this->summaryStatus;
    }

    /**
    * Gets summaryStatus for serialization.
    *
    * @return string|null
    */
    public function getSerializedSummaryStatus(): string|null
    {
        return $this->summaryStatus?->value ? (string) $this->summaryStatus->value : null;
    }


    /**
     * Sets summaryStatus.
     *
     * @param CampaignSummaryStatus|null $summaryStatus
     *
     * @return $this
     */
    public function setSummaryStatus(?CampaignSummaryStatus $summaryStatus = null): self
    {
        $this->summaryStatus = $summaryStatus;

        return $this;
    }

    /**
     * Gets objectiveType.
     *
     * @return ObjectiveType|null
     */
    public function getObjectiveType(): ?ObjectiveType
    {
        return $this->objectiveType;
    }

    /**
    * Gets objectiveType for serialization.
    *
    * @return string|null
    */
    public function getSerializedObjectiveType(): string|null
    {
        return $this->objectiveType?->value ? (string) $this->objectiveType->value : null;
    }


    /**
     * Sets objectiveType.
     *
     * @param ObjectiveType|null $objectiveType
     *
     * @return $this
     */
    public function setObjectiveType(?ObjectiveType $objectiveType = null): self
    {
        $this->objectiveType = $objectiveType;

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
     * @param int|null $createdTime  Campaign creation time. Unix timestamp in seconds.
     *
     * @return $this
     */
    public function setCreatedTime(?int $createdTime = null): self
    {
        $this->createdTime = $createdTime;

        return $this;
    }

    /**
     * Gets updatedTime.
     *
     * @return int|null
     */
    public function getUpdatedTime(): ?int
    {
        return $this->updatedTime;
    }



    /**
     * Sets updatedTime.
     *
     * @param int|null $updatedTime  UTC timestamp. Last update time.
     *
     * @return $this
     */
    public function setUpdatedTime(?int $updatedTime = null): self
    {
        $this->updatedTime = $updatedTime;

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
     * @param string|null $type  Always \"campaign\".
     *
     * @return $this
     */
    public function setType(?string $type = null): self
    {
        $this->type = $type;

        return $this;
    }

    /**
     * Gets isFlexibleDailyBudgets.
     *
     * @return bool|null
     */
    public function isIsFlexibleDailyBudgets(): ?bool
    {
        return $this->isFlexibleDailyBudgets;
    }



    /**
     * Sets isFlexibleDailyBudgets.
     *
     * @param bool|null $isFlexibleDailyBudgets  Determines if a campaign has flexible daily budgets setup.
     *
     * @return $this
     */
    public function setIsFlexibleDailyBudgets(?bool $isFlexibleDailyBudgets = null): self
    {
        $this->isFlexibleDailyBudgets = $isFlexibleDailyBudgets;

        return $this;
    }

    /**
     * Gets isCampaignBudgetOptimization.
     *
     * @return bool|null
     */
    public function isIsCampaignBudgetOptimization(): ?bool
    {
        return $this->isCampaignBudgetOptimization;
    }



    /**
     * Sets isCampaignBudgetOptimization.
     *
     * @param bool|null $isCampaignBudgetOptimization  Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
     *
     * @return $this
     */
    public function setIsCampaignBudgetOptimization(?bool $isCampaignBudgetOptimization = null): self
    {
        $this->isCampaignBudgetOptimization = $isCampaignBudgetOptimization;

        return $this;
    }
}

