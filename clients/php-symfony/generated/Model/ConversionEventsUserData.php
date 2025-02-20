<?php
/**
 * ConversionEventsUserData
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
 * Class representing the ConversionEventsUserData model.
 *
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ConversionEventsUserData 
{
        /**
     * Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("ph")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $ph = null;

    /**
     * Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("ge")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $ge = null;

    /**
     * Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("db")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $db = null;

    /**
     * Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("ln")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $ln = null;

    /**
     * Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("fn")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $fn = null;

    /**
     * Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("ct")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $ct = null;

    /**
     * Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("st")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $st = null;

    /**
     * Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("zp")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $zp = null;

    /**
     * Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("country")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $country = null;

    /**
     * Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("external_id")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $externalId = null;

    /**
     * The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
     *
     * @var string|null
     * @SerializedName("click_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $clickId = null;

    /**
     * A unique identifier of visitors&#39; information defined by third party partners. e.g RampID
     *
     * @var string|null
     * @SerializedName("partner_id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $partnerId = null;

    /**
     * Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("em")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $em = null;

    /**
     * Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
     *
     * @var string[]|null
     * @SerializedName("hashed_maids")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $hashedMaids = null;

    /**
     * The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     *
     * @var string|null
     * @SerializedName("client_ip_address")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $clientIpAddress = null;

    /**
     * The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
     *
     * @var string|null
     * @SerializedName("client_user_agent")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $clientUserAgent = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->ph = array_key_exists('ph', $data) ? $data['ph'] : $this->ph;
            $this->ge = array_key_exists('ge', $data) ? $data['ge'] : $this->ge;
            $this->db = array_key_exists('db', $data) ? $data['db'] : $this->db;
            $this->ln = array_key_exists('ln', $data) ? $data['ln'] : $this->ln;
            $this->fn = array_key_exists('fn', $data) ? $data['fn'] : $this->fn;
            $this->ct = array_key_exists('ct', $data) ? $data['ct'] : $this->ct;
            $this->st = array_key_exists('st', $data) ? $data['st'] : $this->st;
            $this->zp = array_key_exists('zp', $data) ? $data['zp'] : $this->zp;
            $this->country = array_key_exists('country', $data) ? $data['country'] : $this->country;
            $this->externalId = array_key_exists('externalId', $data) ? $data['externalId'] : $this->externalId;
            $this->clickId = array_key_exists('clickId', $data) ? $data['clickId'] : $this->clickId;
            $this->partnerId = array_key_exists('partnerId', $data) ? $data['partnerId'] : $this->partnerId;
            $this->em = array_key_exists('em', $data) ? $data['em'] : $this->em;
            $this->hashedMaids = array_key_exists('hashedMaids', $data) ? $data['hashedMaids'] : $this->hashedMaids;
            $this->clientIpAddress = array_key_exists('clientIpAddress', $data) ? $data['clientIpAddress'] : $this->clientIpAddress;
            $this->clientUserAgent = array_key_exists('clientUserAgent', $data) ? $data['clientUserAgent'] : $this->clientUserAgent;
        }
    }

    /**
     * Gets ph.
     *
     * @return string[]|null
     */
    public function getPh(): ?array
    {
        return $this->ph;
    }

    /**
    * Sets ph.
    *
    * @param string[]|null $ph  Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setPh(?array $ph = null): self
    {
        $this->ph = $ph;

        return $this;
    }




    /**
     * Gets ge.
     *
     * @return string[]|null
     */
    public function getGe(): ?array
    {
        return $this->ge;
    }

    /**
    * Sets ge.
    *
    * @param string[]|null $ge  Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setGe(?array $ge = null): self
    {
        $this->ge = $ge;

        return $this;
    }




    /**
     * Gets db.
     *
     * @return string[]|null
     */
    public function getDb(): ?array
    {
        return $this->db;
    }

    /**
    * Sets db.
    *
    * @param string[]|null $db  Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setDb(?array $db = null): self
    {
        $this->db = $db;

        return $this;
    }




    /**
     * Gets ln.
     *
     * @return string[]|null
     */
    public function getLn(): ?array
    {
        return $this->ln;
    }

    /**
    * Sets ln.
    *
    * @param string[]|null $ln  Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setLn(?array $ln = null): self
    {
        $this->ln = $ln;

        return $this;
    }




    /**
     * Gets fn.
     *
     * @return string[]|null
     */
    public function getFn(): ?array
    {
        return $this->fn;
    }

    /**
    * Sets fn.
    *
    * @param string[]|null $fn  Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setFn(?array $fn = null): self
    {
        $this->fn = $fn;

        return $this;
    }




    /**
     * Gets ct.
     *
     * @return string[]|null
     */
    public function getCt(): ?array
    {
        return $this->ct;
    }

    /**
    * Sets ct.
    *
    * @param string[]|null $ct  Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setCt(?array $ct = null): self
    {
        $this->ct = $ct;

        return $this;
    }




    /**
     * Gets st.
     *
     * @return string[]|null
     */
    public function getSt(): ?array
    {
        return $this->st;
    }

    /**
    * Sets st.
    *
    * @param string[]|null $st  Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setSt(?array $st = null): self
    {
        $this->st = $st;

        return $this;
    }




    /**
     * Gets zp.
     *
     * @return string[]|null
     */
    public function getZp(): ?array
    {
        return $this->zp;
    }

    /**
    * Sets zp.
    *
    * @param string[]|null $zp  Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setZp(?array $zp = null): self
    {
        $this->zp = $zp;

        return $this;
    }




    /**
     * Gets country.
     *
     * @return string[]|null
     */
    public function getCountry(): ?array
    {
        return $this->country;
    }

    /**
    * Sets country.
    *
    * @param string[]|null $country  Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setCountry(?array $country = null): self
    {
        $this->country = $country;

        return $this;
    }




    /**
     * Gets externalId.
     *
     * @return string[]|null
     */
    public function getExternalId(): ?array
    {
        return $this->externalId;
    }

    /**
    * Sets externalId.
    *
    * @param string[]|null $externalId  Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setExternalId(?array $externalId = null): self
    {
        $this->externalId = $externalId;

        return $this;
    }




    /**
     * Gets clickId.
     *
     * @return string|null
     */
    public function getClickId(): ?string
    {
        return $this->clickId;
    }

    /**
    * Sets clickId.
    *
    * @param string|null $clickId  The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
    *
    * @return $this
    */
    public function setClickId(?string $clickId = null): self
    {
        $this->clickId = $clickId;

        return $this;
    }




    /**
     * Gets partnerId.
     *
     * @return string|null
     */
    public function getPartnerId(): ?string
    {
        return $this->partnerId;
    }

    /**
    * Sets partnerId.
    *
    * @param string|null $partnerId  A unique identifier of visitors' information defined by third party partners. e.g RampID
    *
    * @return $this
    */
    public function setPartnerId(?string $partnerId = null): self
    {
        $this->partnerId = $partnerId;

        return $this;
    }




    /**
     * Gets em.
     *
     * @return string[]|null
     */
    public function getEm(): ?array
    {
        return $this->em;
    }

    /**
    * Sets em.
    *
    * @param string[]|null $em  Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setEm(?array $em): self
    {
        $this->em = $em;

        return $this;
    }




    /**
     * Gets hashedMaids.
     *
     * @return string[]|null
     */
    public function getHashedMaids(): ?array
    {
        return $this->hashedMaids;
    }

    /**
    * Sets hashedMaids.
    *
    * @param string[]|null $hashedMaids  Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
    *
    * @return $this
    */
    public function setHashedMaids(?array $hashedMaids): self
    {
        $this->hashedMaids = $hashedMaids;

        return $this;
    }




    /**
     * Gets clientIpAddress.
     *
     * @return string|null
     */
    public function getClientIpAddress(): ?string
    {
        return $this->clientIpAddress;
    }

    /**
    * Sets clientIpAddress.
    *
    * @param string|null $clientIpAddress  The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    *
    * @return $this
    */
    public function setClientIpAddress(?string $clientIpAddress): self
    {
        $this->clientIpAddress = $clientIpAddress;

        return $this;
    }




    /**
     * Gets clientUserAgent.
     *
     * @return string|null
     */
    public function getClientUserAgent(): ?string
    {
        return $this->clientUserAgent;
    }

    /**
    * Sets clientUserAgent.
    *
    * @param string|null $clientUserAgent  The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
    *
    * @return $this
    */
    public function setClientUserAgent(?string $clientUserAgent): self
    {
        $this->clientUserAgent = $clientUserAgent;

        return $this;
    }



}


