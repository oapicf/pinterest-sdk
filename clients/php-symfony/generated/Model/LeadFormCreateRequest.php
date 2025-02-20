<?php
/**
 * LeadFormCreateRequest
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
 * Class representing the LeadFormCreateRequest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class LeadFormCreateRequest 
{
        /**
     * Internal name of the lead form.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
     *
     * @var string|null
     * @SerializedName("privacy_policy_link")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $privacyPolicyLink = null;

    /**
     * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO
     *
     * @var bool|null
     * @SerializedName("has_accepted_terms")
     * @Type("bool")
    */
    #[Assert\NotNull]
    #[Assert\Type("bool")]
    protected ?bool $hasAcceptedTerms = null;

    /**
     * A message for people who complete the form to let them know what happens next.
     *
     * @var string|null
     * @SerializedName("completion_message")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $completionMessage = null;

    /**
     * @var LeadFormStatus|null
     * @SerializedName("status")
    * @Accessor(getter="getSerializedStatus", setter="setDeserializedStatus")
    * @Type("string")
    */
    protected ?LeadFormStatus $status = null;

    /**
     * Additional disclosure language to be included in the lead form.
     *
     * @var string|null
     * @SerializedName("disclosure_language")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $disclosureLanguage = null;

    /**
     * List of questions to be displayed on the lead form.
     *
     * @var LeadFormQuestion[]|null
     * @SerializedName("questions")
     * @Type("array<OpenAPI\Server\Model\LeadFormQuestion>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\LeadFormQuestion"),
    ])]
    #[Assert\Count(max: 10)]
    #[Assert\Count(min: 0)]
    protected ?array $questions = null;

    /**
     * List of additional policy links to be displayed on the lead form.
     *
     * @var LeadFormCommonPolicyLinksInner[]|null
     * @SerializedName("policy_links")
     * @Type("array<OpenAPI\Server\Model\LeadFormCommonPolicyLinksInner>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\LeadFormCommonPolicyLinksInner"),
    ])]
    #[Assert\Count(max: 3)]
    #[Assert\Count(min: 0)]
    protected ?array $policyLinks = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->privacyPolicyLink = array_key_exists('privacyPolicyLink', $data) ? $data['privacyPolicyLink'] : $this->privacyPolicyLink;
            $this->hasAcceptedTerms = array_key_exists('hasAcceptedTerms', $data) ? $data['hasAcceptedTerms'] : $this->hasAcceptedTerms;
            $this->completionMessage = array_key_exists('completionMessage', $data) ? $data['completionMessage'] : $this->completionMessage;
            $this->status = array_key_exists('status', $data) ? $data['status'] : $this->status;
            $this->disclosureLanguage = array_key_exists('disclosureLanguage', $data) ? $data['disclosureLanguage'] : $this->disclosureLanguage;
            $this->questions = array_key_exists('questions', $data) ? $data['questions'] : $this->questions;
            $this->policyLinks = array_key_exists('policyLinks', $data) ? $data['policyLinks'] : $this->policyLinks;
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
    * @param string|null $name  Internal name of the lead form.
    *
    * @return $this
    */
    public function setName(?string $name): self
    {
        $this->name = $name;

        return $this;
    }




    /**
     * Gets privacyPolicyLink.
     *
     * @return string|null
     */
    public function getPrivacyPolicyLink(): ?string
    {
        return $this->privacyPolicyLink;
    }

    /**
    * Sets privacyPolicyLink.
    *
    * @param string|null $privacyPolicyLink  A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
    *
    * @return $this
    */
    public function setPrivacyPolicyLink(?string $privacyPolicyLink): self
    {
        $this->privacyPolicyLink = $privacyPolicyLink;

        return $this;
    }




    /**
     * Gets hasAcceptedTerms.
     *
     * @return bool|null
     */
    public function isHasAcceptedTerms(): ?bool
    {
        return $this->hasAcceptedTerms;
    }

    /**
    * Sets hasAcceptedTerms.
    *
    * @param bool|null $hasAcceptedTerms  Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
    *
    * @return $this
    */
    public function setHasAcceptedTerms(?bool $hasAcceptedTerms): self
    {
        $this->hasAcceptedTerms = $hasAcceptedTerms;

        return $this;
    }




    /**
     * Gets completionMessage.
     *
     * @return string|null
     */
    public function getCompletionMessage(): ?string
    {
        return $this->completionMessage;
    }

    /**
    * Sets completionMessage.
    *
    * @param string|null $completionMessage  A message for people who complete the form to let them know what happens next.
    *
    * @return $this
    */
    public function setCompletionMessage(?string $completionMessage): self
    {
        $this->completionMessage = $completionMessage;

        return $this;
    }




    /**
     * Gets status.
     *
     * @return LeadFormStatus|null
     */
    public function getStatus(): ?LeadFormStatus
    {
        return $this->status;
    }

    /**
    * Sets status.
    *
    * @param LeadFormStatus|null $status
    *
    * @return $this
    */
    public function setStatus(?LeadFormStatus $status = null): self
    {
        $this->status = $status;

        return $this;
    }

    /**
    * Gets status for serialization.
    *
    * @return string|null
    */
    public function getSerializedStatus(): string|null
    {
        return !is_null($this->status?->value) ? (string) $this->status->value : null;
    }

    /**
    * Sets status.
    *
    * @param string|LeadFormStatus|null $status
    *
    * @return $this
    */
    public function setDeserializedStatus(string|LeadFormStatus|null $status = null): self
    {
        if (is_string($status)) {
            $status = LeadFormStatus::tryFrom($status);
        }

        $this->status = $status;

        return $this;
    }



    /**
     * Gets disclosureLanguage.
     *
     * @return string|null
     */
    public function getDisclosureLanguage(): ?string
    {
        return $this->disclosureLanguage;
    }

    /**
    * Sets disclosureLanguage.
    *
    * @param string|null $disclosureLanguage  Additional disclosure language to be included in the lead form.
    *
    * @return $this
    */
    public function setDisclosureLanguage(?string $disclosureLanguage = null): self
    {
        $this->disclosureLanguage = $disclosureLanguage;

        return $this;
    }




    /**
     * Gets questions.
     *
     * @return LeadFormQuestion[]|null
     */
    public function getQuestions(): ?array
    {
        return $this->questions;
    }

    /**
    * Sets questions.
    *
    * @param LeadFormQuestion[]|null $questions  List of questions to be displayed on the lead form.
    *
    * @return $this
    */
    public function setQuestions(?array $questions): self
    {
        $this->questions = $questions;

        return $this;
    }




    /**
     * Gets policyLinks.
     *
     * @return LeadFormCommonPolicyLinksInner[]|null
     */
    public function getPolicyLinks(): ?array
    {
        return $this->policyLinks;
    }

    /**
    * Sets policyLinks.
    *
    * @param LeadFormCommonPolicyLinksInner[]|null $policyLinks  List of additional policy links to be displayed on the lead form.
    *
    * @return $this
    */
    public function setPolicyLinks(?array $policyLinks = null): self
    {
        $this->policyLinks = $policyLinks;

        return $this;
    }



}


