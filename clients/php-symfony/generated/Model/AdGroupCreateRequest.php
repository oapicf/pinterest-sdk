<?php
/**
 * AdGroupCreateRequest
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
 * Class representing the AdGroupCreateRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class AdGroupCreateRequest 
{
        /**
     * Ad group name.
     *
     * @var string|null
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $name = null;

    /**
     * Ad group/entity status.
     *
     * @var EntityStatus|null
     * @SerializedName("status")
        * @Accessor(getter="getSerializedStatus")
        * @Type("string")
     */
    protected ?EntityStatus $status = null;

    /**
     * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     *
     * @var int|null
     * @SerializedName("budget_in_micro_currency")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $budgetInMicroCurrency = null;

    /**
     * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     *
     * @var int|null
     * @SerializedName("bid_in_micro_currency")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $bidInMicroCurrency = null;

    /**
     * @var AdGroupCommonOptimizationGoalMetadata|null
     * @SerializedName("optimization_goal_metadata")
     * @Assert\Type("OpenAPI\Server\Model\AdGroupCommonOptimizationGoalMetadata")
     * @Type("OpenAPI\Server\Model\AdGroupCommonOptimizationGoalMetadata")
     */
    protected ?AdGroupCommonOptimizationGoalMetadata $optimizationGoalMetadata = null;

    /**
     * @var BudgetType|null
     * @SerializedName("budget_type")
        * @Accessor(getter="getSerializedBudgetType")
        * @Type("string")
     */
    protected ?BudgetType $budgetType = 'DAILY';

    /**
     * Ad group start time. Unix timestamp in seconds. Defaults to current time.
     *
     * @var int|null
     * @SerializedName("start_time")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $startTime = null;

    /**
     * Ad group end time. Unix timestamp in seconds.
     *
     * @var int|null
     * @SerializedName("end_time")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $endTime = null;

    /**
     * @var TargetingSpec|null
     * @SerializedName("targeting_spec")
     * @Assert\Type("OpenAPI\Server\Model\TargetingSpec")
     * @Type("OpenAPI\Server\Model\TargetingSpec")
     */
    protected ?TargetingSpec $targetingSpec = null;

    /**
     * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.
     *
     * @var int|null
     * @SerializedName("lifetime_frequency_cap")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $lifetimeFrequencyCap = null;

    /**
     * @var AdGroupCommonTrackingUrls|null
     * @SerializedName("tracking_urls")
     * @Assert\Type("OpenAPI\Server\Model\AdGroupCommonTrackingUrls")
     * @Type("OpenAPI\Server\Model\AdGroupCommonTrackingUrls")
     */
    protected ?AdGroupCommonTrackingUrls $trackingUrls = null;

    /**
     * Enable auto-targeting for ad group.Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
     *
     * @var bool|null
     * @SerializedName("auto_targeting_enabled")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    protected ?bool $autoTargetingEnabled = null;

    /**
     * &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.
     *
     * @var PlacementGroupType|null
     * @SerializedName("placement_group")
        * @Accessor(getter="getSerializedPlacementGroup")
        * @Type("string")
     */
    protected ?PlacementGroupType $placementGroup = null;

    /**
     * @var PacingDeliveryType|null
     * @SerializedName("pacing_delivery_type")
        * @Accessor(getter="getSerializedPacingDeliveryType")
        * @Type("string")
     */
    protected ?PacingDeliveryType $pacingDeliveryType = 'STANDARD';

    /**
     * Campaign ID of the ad group.
     *
     * @var string|null
     * @SerializedName("campaign_id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Regex("/^[C]?\\d+$/")
     */
    protected ?string $campaignId = null;

    /**
     * @var ActionType|null
     * @SerializedName("billable_event")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedBillableEvent")
        * @Type("string")
     */
    protected ?ActionType $billableEvent = null;

    /**
     * Bid strategy type
     *
     * @var string|null
     * @SerializedName("bid_strategy_type")
     * @Assert\Choice({ "AUTOMATIC_BID", "MAX_BID", "TARGET_AVG", "null" })
     * @Assert\Type("string")
     * @Type("string")
     */
    protected ?string $bidStrategyType = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->budgetInMicroCurrency = array_key_exists('budgetInMicroCurrency', $data) ? $data['budgetInMicroCurrency'] : $this->budgetInMicroCurrency;
            $this->bidInMicroCurrency = array_key_exists('bidInMicroCurrency', $data) ? $data['bidInMicroCurrency'] : $this->bidInMicroCurrency;
            $this->optimizationGoalMetadata = array_key_exists('optimizationGoalMetadata', $data) ? $data['optimizationGoalMetadata'] : $this->optimizationGoalMetadata;
            $this->budgetType = array_key_exists('budgetType', $data) ? $data['budgetType'] : $this->budgetType;
            $this->startTime = array_key_exists('startTime', $data) ? $data['startTime'] : $this->startTime;
            $this->endTime = array_key_exists('endTime', $data) ? $data['endTime'] : $this->endTime;
            $this->targetingSpec = array_key_exists('targetingSpec', $data) ? $data['targetingSpec'] : $this->targetingSpec;
            $this->lifetimeFrequencyCap = array_key_exists('lifetimeFrequencyCap', $data) ? $data['lifetimeFrequencyCap'] : $this->lifetimeFrequencyCap;
            $this->trackingUrls = array_key_exists('trackingUrls', $data) ? $data['trackingUrls'] : $this->trackingUrls;
            $this->autoTargetingEnabled = array_key_exists('autoTargetingEnabled', $data) ? $data['autoTargetingEnabled'] : $this->autoTargetingEnabled;
            $this->placementGroup = array_key_exists('placementGroup', $data) ? $data['placementGroup'] : $this->placementGroup;
            $this->pacingDeliveryType = array_key_exists('pacingDeliveryType', $data) ? $data['pacingDeliveryType'] : $this->pacingDeliveryType;
            $this->campaignId = array_key_exists('campaignId', $data) ? $data['campaignId'] : $this->campaignId;
            $this->billableEvent = array_key_exists('billableEvent', $data) ? $data['billableEvent'] : $this->billableEvent;
            $this->bidStrategyType = array_key_exists('bidStrategyType', $data) ? $data['bidStrategyType'] : $this->bidStrategyType;
        }
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
     * @param string|null $name  Ad group name.
     *
     * @return $this
     */
    public function setName(?string $name): self
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
     * @param EntityStatus|null $status  Ad group/entity status.
     *
     * @return $this
     */
    public function setStatus(?EntityStatus $status = null): self
    {
        $this->status = $status;

        return $this;
    }

    /**
     * Gets budgetInMicroCurrency.
     *
     * @return int|null
     */
    public function getBudgetInMicroCurrency(): ?int
    {
        return $this->budgetInMicroCurrency;
    }



    /**
     * Sets budgetInMicroCurrency.
     *
     * @param int|null $budgetInMicroCurrency  Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
     *
     * @return $this
     */
    public function setBudgetInMicroCurrency(?int $budgetInMicroCurrency = null): self
    {
        $this->budgetInMicroCurrency = $budgetInMicroCurrency;

        return $this;
    }

    /**
     * Gets bidInMicroCurrency.
     *
     * @return int|null
     */
    public function getBidInMicroCurrency(): ?int
    {
        return $this->bidInMicroCurrency;
    }



    /**
     * Sets bidInMicroCurrency.
     *
     * @param int|null $bidInMicroCurrency  Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
     *
     * @return $this
     */
    public function setBidInMicroCurrency(?int $bidInMicroCurrency = null): self
    {
        $this->bidInMicroCurrency = $bidInMicroCurrency;

        return $this;
    }

    /**
     * Gets optimizationGoalMetadata.
     *
     * @return AdGroupCommonOptimizationGoalMetadata|null
     */
    public function getOptimizationGoalMetadata(): ?AdGroupCommonOptimizationGoalMetadata
    {
        return $this->optimizationGoalMetadata;
    }



    /**
     * Sets optimizationGoalMetadata.
     *
     * @param AdGroupCommonOptimizationGoalMetadata|null $optimizationGoalMetadata
     *
     * @return $this
     */
    public function setOptimizationGoalMetadata(?AdGroupCommonOptimizationGoalMetadata $optimizationGoalMetadata = null): self
    {
        $this->optimizationGoalMetadata = $optimizationGoalMetadata;

        return $this;
    }

    /**
     * Gets budgetType.
     *
     * @return BudgetType|null
     */
    public function getBudgetType(): ?BudgetType
    {
        return $this->budgetType;
    }

    /**
    * Gets budgetType for serialization.
    *
    * @return string|null
    */
    public function getSerializedBudgetType(): string|null
    {
        return $this->budgetType?->value ? (string) $this->budgetType->value : null;
    }


    /**
     * Sets budgetType.
     *
     * @param BudgetType|null $budgetType
     *
     * @return $this
     */
    public function setBudgetType(?BudgetType $budgetType = null): self
    {
        $this->budgetType = $budgetType;

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
     * @param int|null $startTime  Ad group start time. Unix timestamp in seconds. Defaults to current time.
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
     * @param int|null $endTime  Ad group end time. Unix timestamp in seconds.
     *
     * @return $this
     */
    public function setEndTime(?int $endTime = null): self
    {
        $this->endTime = $endTime;

        return $this;
    }

    /**
     * Gets targetingSpec.
     *
     * @return TargetingSpec|null
     */
    public function getTargetingSpec(): ?TargetingSpec
    {
        return $this->targetingSpec;
    }



    /**
     * Sets targetingSpec.
     *
     * @param TargetingSpec|null $targetingSpec
     *
     * @return $this
     */
    public function setTargetingSpec(?TargetingSpec $targetingSpec = null): self
    {
        $this->targetingSpec = $targetingSpec;

        return $this;
    }

    /**
     * Gets lifetimeFrequencyCap.
     *
     * @return int|null
     */
    public function getLifetimeFrequencyCap(): ?int
    {
        return $this->lifetimeFrequencyCap;
    }



    /**
     * Sets lifetimeFrequencyCap.
     *
     * @param int|null $lifetimeFrequencyCap  Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
     *
     * @return $this
     */
    public function setLifetimeFrequencyCap(?int $lifetimeFrequencyCap = null): self
    {
        $this->lifetimeFrequencyCap = $lifetimeFrequencyCap;

        return $this;
    }

    /**
     * Gets trackingUrls.
     *
     * @return AdGroupCommonTrackingUrls|null
     */
    public function getTrackingUrls(): ?AdGroupCommonTrackingUrls
    {
        return $this->trackingUrls;
    }



    /**
     * Sets trackingUrls.
     *
     * @param AdGroupCommonTrackingUrls|null $trackingUrls
     *
     * @return $this
     */
    public function setTrackingUrls(?AdGroupCommonTrackingUrls $trackingUrls = null): self
    {
        $this->trackingUrls = $trackingUrls;

        return $this;
    }

    /**
     * Gets autoTargetingEnabled.
     *
     * @return bool|null
     */
    public function isAutoTargetingEnabled(): ?bool
    {
        return $this->autoTargetingEnabled;
    }



    /**
     * Sets autoTargetingEnabled.
     *
     * @param bool|null $autoTargetingEnabled  Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
     *
     * @return $this
     */
    public function setAutoTargetingEnabled(?bool $autoTargetingEnabled = null): self
    {
        $this->autoTargetingEnabled = $autoTargetingEnabled;

        return $this;
    }

    /**
     * Gets placementGroup.
     *
     * @return PlacementGroupType|null
     */
    public function getPlacementGroup(): ?PlacementGroupType
    {
        return $this->placementGroup;
    }

    /**
    * Gets placementGroup for serialization.
    *
    * @return string|null
    */
    public function getSerializedPlacementGroup(): string|null
    {
        return $this->placementGroup?->value ? (string) $this->placementGroup->value : null;
    }


    /**
     * Sets placementGroup.
     *
     * @param PlacementGroupType|null $placementGroup  <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
     *
     * @return $this
     */
    public function setPlacementGroup(?PlacementGroupType $placementGroup = null): self
    {
        $this->placementGroup = $placementGroup;

        return $this;
    }

    /**
     * Gets pacingDeliveryType.
     *
     * @return PacingDeliveryType|null
     */
    public function getPacingDeliveryType(): ?PacingDeliveryType
    {
        return $this->pacingDeliveryType;
    }

    /**
    * Gets pacingDeliveryType for serialization.
    *
    * @return string|null
    */
    public function getSerializedPacingDeliveryType(): string|null
    {
        return $this->pacingDeliveryType?->value ? (string) $this->pacingDeliveryType->value : null;
    }


    /**
     * Sets pacingDeliveryType.
     *
     * @param PacingDeliveryType|null $pacingDeliveryType
     *
     * @return $this
     */
    public function setPacingDeliveryType(?PacingDeliveryType $pacingDeliveryType = null): self
    {
        $this->pacingDeliveryType = $pacingDeliveryType;

        return $this;
    }

    /**
     * Gets campaignId.
     *
     * @return string|null
     */
    public function getCampaignId(): ?string
    {
        return $this->campaignId;
    }



    /**
     * Sets campaignId.
     *
     * @param string|null $campaignId  Campaign ID of the ad group.
     *
     * @return $this
     */
    public function setCampaignId(?string $campaignId): self
    {
        $this->campaignId = $campaignId;

        return $this;
    }

    /**
     * Gets billableEvent.
     *
     * @return ActionType|null
     */
    public function getBillableEvent(): ?ActionType
    {
        return $this->billableEvent;
    }

    /**
    * Gets billableEvent for serialization.
    *
    * @return string|null
    */
    public function getSerializedBillableEvent(): string|null
    {
        return $this->billableEvent?->value ? (string) $this->billableEvent->value : null;
    }


    /**
     * Sets billableEvent.
     *
     * @param ActionType|null $billableEvent
     *
     * @return $this
     */
    public function setBillableEvent(?ActionType $billableEvent): self
    {
        $this->billableEvent = $billableEvent;

        return $this;
    }

    /**
     * Gets bidStrategyType.
     *
     * @return string|null
     */
    public function getBidStrategyType(): ?string
    {
        return $this->bidStrategyType;
    }



    /**
     * Sets bidStrategyType.
     *
     * @param string|null $bidStrategyType  Bid strategy type
     *
     * @return $this
     */
    public function setBidStrategyType(?string $bidStrategyType = null): self
    {
        $this->bidStrategyType = $bidStrategyType;

        return $this;
    }
}

