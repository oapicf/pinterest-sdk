<?php
/**
 * CatalogsFeedValidationErrors
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
 * Class representing the CatalogsFeedValidationErrors model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CatalogsFeedValidationErrors 
{
        /**
     * Pinterest couldn&#39;t download your feed.
     *
     * @var int|null
     * @SerializedName("FETCH_ERROR")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $fETCHERROR = null;

    /**
     * Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days.
     *
     * @var int|null
     * @SerializedName("FETCH_INACTIVE_FEED_ERROR")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $fETCHINACTIVEFEEDERROR = null;

    /**
     * Your feed includes data with an unsupported encoding format.
     *
     * @var int|null
     * @SerializedName("ENCODING_ERROR")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $eNCODINGERROR = null;

    /**
     * Your feed includes data with formatting errors.
     *
     * @var int|null
     * @SerializedName("DELIMITER_ERROR")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $dELIMITERERROR = null;

    /**
     * Your feed is missing some required column headers.
     *
     * @var int|null
     * @SerializedName("REQUIRED_COLUMNS_MISSING")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $rEQUIREDCOLUMNSMISSING = null;

    /**
     * Some products are duplicated.
     *
     * @var int|null
     * @SerializedName("DUPLICATE_PRODUCTS")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $dUPLICATEPRODUCTS = null;

    /**
     * Some image links are formatted incorrectly.
     *
     * @var int|null
     * @SerializedName("IMAGE_LINK_INVALID")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $iMAGELINKINVALID = null;

    /**
     * Some items are missing an item id in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("ITEMID_MISSING")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $iTEMIDMISSING = null;

    /**
     * Some items are missing a title in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("TITLE_MISSING")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $tITLEMISSING = null;

    /**
     * Some items are missing a description in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("DESCRIPTION_MISSING")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $dESCRIPTIONMISSING = null;

    /**
     * Some items are missing a link URL in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("PRODUCT_LINK_MISSING")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $pRODUCTLINKMISSING = null;

    /**
     * Some items are missing an image link URL in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("IMAGE_LINK_MISSING")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $iMAGELINKMISSING = null;

    /**
     * Some items are missing an availability value in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("AVAILABILITY_INVALID")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $aVAILABILITYINVALID = null;

    /**
     * Some items have price formatting errors in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("PRODUCT_PRICE_INVALID")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $pRODUCTPRICEINVALID = null;

    /**
     * Some link values are formatted incorrectly.
     *
     * @var int|null
     * @SerializedName("LINK_FORMAT_INVALID")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $lINKFORMATINVALID = null;

    /**
     * Your feed contains formatting errors for some items.
     *
     * @var int|null
     * @SerializedName("PARSE_LINE_ERROR")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $pARSELINEERROR = null;

    /**
     * Some adwords links contain too many characters.
     *
     * @var int|null
     * @SerializedName("ADWORDS_FORMAT_INVALID")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $aDWORDSFORMATINVALID = null;

    /**
     * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
     *
     * @var int|null
     * @SerializedName("INTERNAL_SERVICE_ERROR")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $iNTERNALSERVICEERROR = null;

    /**
     * Your merchant domain needs to be claimed.
     *
     * @var int|null
     * @SerializedName("NO_VERIFIED_DOMAIN")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $nOVERIFIEDDOMAIN = null;

    /**
     * Some items have invalid adult values.
     *
     * @var int|null
     * @SerializedName("ADULT_INVALID")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $aDULTINVALID = null;

    /**
     * Some items have image_link URLs that contain too many characters, so those items will not be published.
     *
     * @var int|null
     * @SerializedName("IMAGE_LINK_LENGTH_TOO_LONG")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $iMAGELINKLENGTHTOOLONG = null;

    /**
     * Some of your product link values don&#39;t match the verified domain associated with this account.
     *
     * @var int|null
     * @SerializedName("INVALID_DOMAIN")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $iNVALIDDOMAIN = null;

    /**
     * Your feed contains too many items, some items will not be published.
     *
     * @var int|null
     * @SerializedName("FEED_LENGTH_TOO_LONG")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $fEEDLENGTHTOOLONG = null;

    /**
     * Some product links contain too many characters, those items will not be published.
     *
     * @var int|null
     * @SerializedName("LINK_LENGTH_TOO_LONG")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $lINKLENGTHTOOLONG = null;

    /**
     * Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.
     *
     * @var int|null
     * @SerializedName("MALFORMED_XML")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $mALFORMEDXML = null;

    /**
     * Some products are missing a price, those items will not be published.
     *
     * @var int|null
     * @SerializedName("PRICE_MISSING")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $pRICEMISSING = null;

    /**
     * Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.
     *
     * @var int|null
     * @SerializedName("FEED_TOO_SMALL")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $fEEDTOOSMALL = null;

    /**
     * Some items exceed the maximum number of items per item group, those items will not be published.
     *
     * @var int|null
     * @SerializedName("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $mAXITEMSPERITEMGROUPEXCEEDED = null;

    /**
     * Some items&#39; main images can&#39;t be found.
     *
     * @var int|null
     * @SerializedName("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $iTEMMAINIMAGEDOWNLOADFAILURE = null;

    /**
     * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     *
     * @var int|null
     * @SerializedName("PINJOIN_CONTENT_UNSAFE")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $pINJOINCONTENTUNSAFE = null;

    /**
     * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     *
     * @var int|null
     * @SerializedName("BLOCKLISTED_IMAGE_SIGNATURE")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $bLOCKLISTEDIMAGESIGNATURE = null;

    /**
     * Some items have list price formatting errors in their product metadata, those items will not be published.
     *
     * @var int|null
     * @SerializedName("LIST_PRICE_INVALID")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $lISTPRICEINVALID = null;

    /**
     * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
     *
     * @var int|null
     * @SerializedName("PRICE_CANNOT_BE_DETERMINED")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected ?int $pRICECANNOTBEDETERMINED = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->fETCHERROR = array_key_exists('fETCHERROR', $data) ? $data['fETCHERROR'] : $this->fETCHERROR;
            $this->fETCHINACTIVEFEEDERROR = array_key_exists('fETCHINACTIVEFEEDERROR', $data) ? $data['fETCHINACTIVEFEEDERROR'] : $this->fETCHINACTIVEFEEDERROR;
            $this->eNCODINGERROR = array_key_exists('eNCODINGERROR', $data) ? $data['eNCODINGERROR'] : $this->eNCODINGERROR;
            $this->dELIMITERERROR = array_key_exists('dELIMITERERROR', $data) ? $data['dELIMITERERROR'] : $this->dELIMITERERROR;
            $this->rEQUIREDCOLUMNSMISSING = array_key_exists('rEQUIREDCOLUMNSMISSING', $data) ? $data['rEQUIREDCOLUMNSMISSING'] : $this->rEQUIREDCOLUMNSMISSING;
            $this->dUPLICATEPRODUCTS = array_key_exists('dUPLICATEPRODUCTS', $data) ? $data['dUPLICATEPRODUCTS'] : $this->dUPLICATEPRODUCTS;
            $this->iMAGELINKINVALID = array_key_exists('iMAGELINKINVALID', $data) ? $data['iMAGELINKINVALID'] : $this->iMAGELINKINVALID;
            $this->iTEMIDMISSING = array_key_exists('iTEMIDMISSING', $data) ? $data['iTEMIDMISSING'] : $this->iTEMIDMISSING;
            $this->tITLEMISSING = array_key_exists('tITLEMISSING', $data) ? $data['tITLEMISSING'] : $this->tITLEMISSING;
            $this->dESCRIPTIONMISSING = array_key_exists('dESCRIPTIONMISSING', $data) ? $data['dESCRIPTIONMISSING'] : $this->dESCRIPTIONMISSING;
            $this->pRODUCTLINKMISSING = array_key_exists('pRODUCTLINKMISSING', $data) ? $data['pRODUCTLINKMISSING'] : $this->pRODUCTLINKMISSING;
            $this->iMAGELINKMISSING = array_key_exists('iMAGELINKMISSING', $data) ? $data['iMAGELINKMISSING'] : $this->iMAGELINKMISSING;
            $this->aVAILABILITYINVALID = array_key_exists('aVAILABILITYINVALID', $data) ? $data['aVAILABILITYINVALID'] : $this->aVAILABILITYINVALID;
            $this->pRODUCTPRICEINVALID = array_key_exists('pRODUCTPRICEINVALID', $data) ? $data['pRODUCTPRICEINVALID'] : $this->pRODUCTPRICEINVALID;
            $this->lINKFORMATINVALID = array_key_exists('lINKFORMATINVALID', $data) ? $data['lINKFORMATINVALID'] : $this->lINKFORMATINVALID;
            $this->pARSELINEERROR = array_key_exists('pARSELINEERROR', $data) ? $data['pARSELINEERROR'] : $this->pARSELINEERROR;
            $this->aDWORDSFORMATINVALID = array_key_exists('aDWORDSFORMATINVALID', $data) ? $data['aDWORDSFORMATINVALID'] : $this->aDWORDSFORMATINVALID;
            $this->iNTERNALSERVICEERROR = array_key_exists('iNTERNALSERVICEERROR', $data) ? $data['iNTERNALSERVICEERROR'] : $this->iNTERNALSERVICEERROR;
            $this->nOVERIFIEDDOMAIN = array_key_exists('nOVERIFIEDDOMAIN', $data) ? $data['nOVERIFIEDDOMAIN'] : $this->nOVERIFIEDDOMAIN;
            $this->aDULTINVALID = array_key_exists('aDULTINVALID', $data) ? $data['aDULTINVALID'] : $this->aDULTINVALID;
            $this->iMAGELINKLENGTHTOOLONG = array_key_exists('iMAGELINKLENGTHTOOLONG', $data) ? $data['iMAGELINKLENGTHTOOLONG'] : $this->iMAGELINKLENGTHTOOLONG;
            $this->iNVALIDDOMAIN = array_key_exists('iNVALIDDOMAIN', $data) ? $data['iNVALIDDOMAIN'] : $this->iNVALIDDOMAIN;
            $this->fEEDLENGTHTOOLONG = array_key_exists('fEEDLENGTHTOOLONG', $data) ? $data['fEEDLENGTHTOOLONG'] : $this->fEEDLENGTHTOOLONG;
            $this->lINKLENGTHTOOLONG = array_key_exists('lINKLENGTHTOOLONG', $data) ? $data['lINKLENGTHTOOLONG'] : $this->lINKLENGTHTOOLONG;
            $this->mALFORMEDXML = array_key_exists('mALFORMEDXML', $data) ? $data['mALFORMEDXML'] : $this->mALFORMEDXML;
            $this->pRICEMISSING = array_key_exists('pRICEMISSING', $data) ? $data['pRICEMISSING'] : $this->pRICEMISSING;
            $this->fEEDTOOSMALL = array_key_exists('fEEDTOOSMALL', $data) ? $data['fEEDTOOSMALL'] : $this->fEEDTOOSMALL;
            $this->mAXITEMSPERITEMGROUPEXCEEDED = array_key_exists('mAXITEMSPERITEMGROUPEXCEEDED', $data) ? $data['mAXITEMSPERITEMGROUPEXCEEDED'] : $this->mAXITEMSPERITEMGROUPEXCEEDED;
            $this->iTEMMAINIMAGEDOWNLOADFAILURE = array_key_exists('iTEMMAINIMAGEDOWNLOADFAILURE', $data) ? $data['iTEMMAINIMAGEDOWNLOADFAILURE'] : $this->iTEMMAINIMAGEDOWNLOADFAILURE;
            $this->pINJOINCONTENTUNSAFE = array_key_exists('pINJOINCONTENTUNSAFE', $data) ? $data['pINJOINCONTENTUNSAFE'] : $this->pINJOINCONTENTUNSAFE;
            $this->bLOCKLISTEDIMAGESIGNATURE = array_key_exists('bLOCKLISTEDIMAGESIGNATURE', $data) ? $data['bLOCKLISTEDIMAGESIGNATURE'] : $this->bLOCKLISTEDIMAGESIGNATURE;
            $this->lISTPRICEINVALID = array_key_exists('lISTPRICEINVALID', $data) ? $data['lISTPRICEINVALID'] : $this->lISTPRICEINVALID;
            $this->pRICECANNOTBEDETERMINED = array_key_exists('pRICECANNOTBEDETERMINED', $data) ? $data['pRICECANNOTBEDETERMINED'] : $this->pRICECANNOTBEDETERMINED;
        }
    }

    /**
     * Gets fETCHERROR.
     *
     * @return int|null
     */
    public function getFETCHERROR(): ?int
    {
        return $this->fETCHERROR;
    }



    /**
     * Sets fETCHERROR.
     *
     * @param int|null $fETCHERROR  Pinterest couldn't download your feed.
     *
     * @return $this
     */
    public function setFETCHERROR(?int $fETCHERROR = null): self
    {
        $this->fETCHERROR = $fETCHERROR;

        return $this;
    }

    /**
     * Gets fETCHINACTIVEFEEDERROR.
     *
     * @return int|null
     */
    public function getFETCHINACTIVEFEEDERROR(): ?int
    {
        return $this->fETCHINACTIVEFEEDERROR;
    }



    /**
     * Sets fETCHINACTIVEFEEDERROR.
     *
     * @param int|null $fETCHINACTIVEFEEDERROR  Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
     *
     * @return $this
     */
    public function setFETCHINACTIVEFEEDERROR(?int $fETCHINACTIVEFEEDERROR = null): self
    {
        $this->fETCHINACTIVEFEEDERROR = $fETCHINACTIVEFEEDERROR;

        return $this;
    }

    /**
     * Gets eNCODINGERROR.
     *
     * @return int|null
     */
    public function getENCODINGERROR(): ?int
    {
        return $this->eNCODINGERROR;
    }



    /**
     * Sets eNCODINGERROR.
     *
     * @param int|null $eNCODINGERROR  Your feed includes data with an unsupported encoding format.
     *
     * @return $this
     */
    public function setENCODINGERROR(?int $eNCODINGERROR = null): self
    {
        $this->eNCODINGERROR = $eNCODINGERROR;

        return $this;
    }

    /**
     * Gets dELIMITERERROR.
     *
     * @return int|null
     */
    public function getDELIMITERERROR(): ?int
    {
        return $this->dELIMITERERROR;
    }



    /**
     * Sets dELIMITERERROR.
     *
     * @param int|null $dELIMITERERROR  Your feed includes data with formatting errors.
     *
     * @return $this
     */
    public function setDELIMITERERROR(?int $dELIMITERERROR = null): self
    {
        $this->dELIMITERERROR = $dELIMITERERROR;

        return $this;
    }

    /**
     * Gets rEQUIREDCOLUMNSMISSING.
     *
     * @return int|null
     */
    public function getREQUIREDCOLUMNSMISSING(): ?int
    {
        return $this->rEQUIREDCOLUMNSMISSING;
    }



    /**
     * Sets rEQUIREDCOLUMNSMISSING.
     *
     * @param int|null $rEQUIREDCOLUMNSMISSING  Your feed is missing some required column headers.
     *
     * @return $this
     */
    public function setREQUIREDCOLUMNSMISSING(?int $rEQUIREDCOLUMNSMISSING = null): self
    {
        $this->rEQUIREDCOLUMNSMISSING = $rEQUIREDCOLUMNSMISSING;

        return $this;
    }

    /**
     * Gets dUPLICATEPRODUCTS.
     *
     * @return int|null
     */
    public function getDUPLICATEPRODUCTS(): ?int
    {
        return $this->dUPLICATEPRODUCTS;
    }



    /**
     * Sets dUPLICATEPRODUCTS.
     *
     * @param int|null $dUPLICATEPRODUCTS  Some products are duplicated.
     *
     * @return $this
     */
    public function setDUPLICATEPRODUCTS(?int $dUPLICATEPRODUCTS = null): self
    {
        $this->dUPLICATEPRODUCTS = $dUPLICATEPRODUCTS;

        return $this;
    }

    /**
     * Gets iMAGELINKINVALID.
     *
     * @return int|null
     */
    public function getIMAGELINKINVALID(): ?int
    {
        return $this->iMAGELINKINVALID;
    }



    /**
     * Sets iMAGELINKINVALID.
     *
     * @param int|null $iMAGELINKINVALID  Some image links are formatted incorrectly.
     *
     * @return $this
     */
    public function setIMAGELINKINVALID(?int $iMAGELINKINVALID = null): self
    {
        $this->iMAGELINKINVALID = $iMAGELINKINVALID;

        return $this;
    }

    /**
     * Gets iTEMIDMISSING.
     *
     * @return int|null
     */
    public function getITEMIDMISSING(): ?int
    {
        return $this->iTEMIDMISSING;
    }



    /**
     * Sets iTEMIDMISSING.
     *
     * @param int|null $iTEMIDMISSING  Some items are missing an item id in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setITEMIDMISSING(?int $iTEMIDMISSING = null): self
    {
        $this->iTEMIDMISSING = $iTEMIDMISSING;

        return $this;
    }

    /**
     * Gets tITLEMISSING.
     *
     * @return int|null
     */
    public function getTITLEMISSING(): ?int
    {
        return $this->tITLEMISSING;
    }



    /**
     * Sets tITLEMISSING.
     *
     * @param int|null $tITLEMISSING  Some items are missing a title in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setTITLEMISSING(?int $tITLEMISSING = null): self
    {
        $this->tITLEMISSING = $tITLEMISSING;

        return $this;
    }

    /**
     * Gets dESCRIPTIONMISSING.
     *
     * @return int|null
     */
    public function getDESCRIPTIONMISSING(): ?int
    {
        return $this->dESCRIPTIONMISSING;
    }



    /**
     * Sets dESCRIPTIONMISSING.
     *
     * @param int|null $dESCRIPTIONMISSING  Some items are missing a description in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setDESCRIPTIONMISSING(?int $dESCRIPTIONMISSING = null): self
    {
        $this->dESCRIPTIONMISSING = $dESCRIPTIONMISSING;

        return $this;
    }

    /**
     * Gets pRODUCTLINKMISSING.
     *
     * @return int|null
     */
    public function getPRODUCTLINKMISSING(): ?int
    {
        return $this->pRODUCTLINKMISSING;
    }



    /**
     * Sets pRODUCTLINKMISSING.
     *
     * @param int|null $pRODUCTLINKMISSING  Some items are missing a link URL in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setPRODUCTLINKMISSING(?int $pRODUCTLINKMISSING = null): self
    {
        $this->pRODUCTLINKMISSING = $pRODUCTLINKMISSING;

        return $this;
    }

    /**
     * Gets iMAGELINKMISSING.
     *
     * @return int|null
     */
    public function getIMAGELINKMISSING(): ?int
    {
        return $this->iMAGELINKMISSING;
    }



    /**
     * Sets iMAGELINKMISSING.
     *
     * @param int|null $iMAGELINKMISSING  Some items are missing an image link URL in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setIMAGELINKMISSING(?int $iMAGELINKMISSING = null): self
    {
        $this->iMAGELINKMISSING = $iMAGELINKMISSING;

        return $this;
    }

    /**
     * Gets aVAILABILITYINVALID.
     *
     * @return int|null
     */
    public function getAVAILABILITYINVALID(): ?int
    {
        return $this->aVAILABILITYINVALID;
    }



    /**
     * Sets aVAILABILITYINVALID.
     *
     * @param int|null $aVAILABILITYINVALID  Some items are missing an availability value in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setAVAILABILITYINVALID(?int $aVAILABILITYINVALID = null): self
    {
        $this->aVAILABILITYINVALID = $aVAILABILITYINVALID;

        return $this;
    }

    /**
     * Gets pRODUCTPRICEINVALID.
     *
     * @return int|null
     */
    public function getPRODUCTPRICEINVALID(): ?int
    {
        return $this->pRODUCTPRICEINVALID;
    }



    /**
     * Sets pRODUCTPRICEINVALID.
     *
     * @param int|null $pRODUCTPRICEINVALID  Some items have price formatting errors in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setPRODUCTPRICEINVALID(?int $pRODUCTPRICEINVALID = null): self
    {
        $this->pRODUCTPRICEINVALID = $pRODUCTPRICEINVALID;

        return $this;
    }

    /**
     * Gets lINKFORMATINVALID.
     *
     * @return int|null
     */
    public function getLINKFORMATINVALID(): ?int
    {
        return $this->lINKFORMATINVALID;
    }



    /**
     * Sets lINKFORMATINVALID.
     *
     * @param int|null $lINKFORMATINVALID  Some link values are formatted incorrectly.
     *
     * @return $this
     */
    public function setLINKFORMATINVALID(?int $lINKFORMATINVALID = null): self
    {
        $this->lINKFORMATINVALID = $lINKFORMATINVALID;

        return $this;
    }

    /**
     * Gets pARSELINEERROR.
     *
     * @return int|null
     */
    public function getPARSELINEERROR(): ?int
    {
        return $this->pARSELINEERROR;
    }



    /**
     * Sets pARSELINEERROR.
     *
     * @param int|null $pARSELINEERROR  Your feed contains formatting errors for some items.
     *
     * @return $this
     */
    public function setPARSELINEERROR(?int $pARSELINEERROR = null): self
    {
        $this->pARSELINEERROR = $pARSELINEERROR;

        return $this;
    }

    /**
     * Gets aDWORDSFORMATINVALID.
     *
     * @return int|null
     */
    public function getADWORDSFORMATINVALID(): ?int
    {
        return $this->aDWORDSFORMATINVALID;
    }



    /**
     * Sets aDWORDSFORMATINVALID.
     *
     * @param int|null $aDWORDSFORMATINVALID  Some adwords links contain too many characters.
     *
     * @return $this
     */
    public function setADWORDSFORMATINVALID(?int $aDWORDSFORMATINVALID = null): self
    {
        $this->aDWORDSFORMATINVALID = $aDWORDSFORMATINVALID;

        return $this;
    }

    /**
     * Gets iNTERNALSERVICEERROR.
     *
     * @return int|null
     */
    public function getINTERNALSERVICEERROR(): ?int
    {
        return $this->iNTERNALSERVICEERROR;
    }



    /**
     * Sets iNTERNALSERVICEERROR.
     *
     * @param int|null $iNTERNALSERVICEERROR  We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
     *
     * @return $this
     */
    public function setINTERNALSERVICEERROR(?int $iNTERNALSERVICEERROR = null): self
    {
        $this->iNTERNALSERVICEERROR = $iNTERNALSERVICEERROR;

        return $this;
    }

    /**
     * Gets nOVERIFIEDDOMAIN.
     *
     * @return int|null
     */
    public function getNOVERIFIEDDOMAIN(): ?int
    {
        return $this->nOVERIFIEDDOMAIN;
    }



    /**
     * Sets nOVERIFIEDDOMAIN.
     *
     * @param int|null $nOVERIFIEDDOMAIN  Your merchant domain needs to be claimed.
     *
     * @return $this
     */
    public function setNOVERIFIEDDOMAIN(?int $nOVERIFIEDDOMAIN = null): self
    {
        $this->nOVERIFIEDDOMAIN = $nOVERIFIEDDOMAIN;

        return $this;
    }

    /**
     * Gets aDULTINVALID.
     *
     * @return int|null
     */
    public function getADULTINVALID(): ?int
    {
        return $this->aDULTINVALID;
    }



    /**
     * Sets aDULTINVALID.
     *
     * @param int|null $aDULTINVALID  Some items have invalid adult values.
     *
     * @return $this
     */
    public function setADULTINVALID(?int $aDULTINVALID = null): self
    {
        $this->aDULTINVALID = $aDULTINVALID;

        return $this;
    }

    /**
     * Gets iMAGELINKLENGTHTOOLONG.
     *
     * @return int|null
     */
    public function getIMAGELINKLENGTHTOOLONG(): ?int
    {
        return $this->iMAGELINKLENGTHTOOLONG;
    }



    /**
     * Sets iMAGELINKLENGTHTOOLONG.
     *
     * @param int|null $iMAGELINKLENGTHTOOLONG  Some items have image_link URLs that contain too many characters, so those items will not be published.
     *
     * @return $this
     */
    public function setIMAGELINKLENGTHTOOLONG(?int $iMAGELINKLENGTHTOOLONG = null): self
    {
        $this->iMAGELINKLENGTHTOOLONG = $iMAGELINKLENGTHTOOLONG;

        return $this;
    }

    /**
     * Gets iNVALIDDOMAIN.
     *
     * @return int|null
     */
    public function getINVALIDDOMAIN(): ?int
    {
        return $this->iNVALIDDOMAIN;
    }



    /**
     * Sets iNVALIDDOMAIN.
     *
     * @param int|null $iNVALIDDOMAIN  Some of your product link values don't match the verified domain associated with this account.
     *
     * @return $this
     */
    public function setINVALIDDOMAIN(?int $iNVALIDDOMAIN = null): self
    {
        $this->iNVALIDDOMAIN = $iNVALIDDOMAIN;

        return $this;
    }

    /**
     * Gets fEEDLENGTHTOOLONG.
     *
     * @return int|null
     */
    public function getFEEDLENGTHTOOLONG(): ?int
    {
        return $this->fEEDLENGTHTOOLONG;
    }



    /**
     * Sets fEEDLENGTHTOOLONG.
     *
     * @param int|null $fEEDLENGTHTOOLONG  Your feed contains too many items, some items will not be published.
     *
     * @return $this
     */
    public function setFEEDLENGTHTOOLONG(?int $fEEDLENGTHTOOLONG = null): self
    {
        $this->fEEDLENGTHTOOLONG = $fEEDLENGTHTOOLONG;

        return $this;
    }

    /**
     * Gets lINKLENGTHTOOLONG.
     *
     * @return int|null
     */
    public function getLINKLENGTHTOOLONG(): ?int
    {
        return $this->lINKLENGTHTOOLONG;
    }



    /**
     * Sets lINKLENGTHTOOLONG.
     *
     * @param int|null $lINKLENGTHTOOLONG  Some product links contain too many characters, those items will not be published.
     *
     * @return $this
     */
    public function setLINKLENGTHTOOLONG(?int $lINKLENGTHTOOLONG = null): self
    {
        $this->lINKLENGTHTOOLONG = $lINKLENGTHTOOLONG;

        return $this;
    }

    /**
     * Gets mALFORMEDXML.
     *
     * @return int|null
     */
    public function getMALFORMEDXML(): ?int
    {
        return $this->mALFORMEDXML;
    }



    /**
     * Sets mALFORMEDXML.
     *
     * @param int|null $mALFORMEDXML  Your feed couldn't be validated because the xml file is formatted incorrectly.
     *
     * @return $this
     */
    public function setMALFORMEDXML(?int $mALFORMEDXML = null): self
    {
        $this->mALFORMEDXML = $mALFORMEDXML;

        return $this;
    }

    /**
     * Gets pRICEMISSING.
     *
     * @return int|null
     */
    public function getPRICEMISSING(): ?int
    {
        return $this->pRICEMISSING;
    }



    /**
     * Sets pRICEMISSING.
     *
     * @param int|null $pRICEMISSING  Some products are missing a price, those items will not be published.
     *
     * @return $this
     */
    public function setPRICEMISSING(?int $pRICEMISSING = null): self
    {
        $this->pRICEMISSING = $pRICEMISSING;

        return $this;
    }

    /**
     * Gets fEEDTOOSMALL.
     *
     * @return int|null
     */
    public function getFEEDTOOSMALL(): ?int
    {
        return $this->fEEDTOOSMALL;
    }



    /**
     * Sets fEEDTOOSMALL.
     *
     * @param int|null $fEEDTOOSMALL  Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
     *
     * @return $this
     */
    public function setFEEDTOOSMALL(?int $fEEDTOOSMALL = null): self
    {
        $this->fEEDTOOSMALL = $fEEDTOOSMALL;

        return $this;
    }

    /**
     * Gets mAXITEMSPERITEMGROUPEXCEEDED.
     *
     * @return int|null
     */
    public function getMAXITEMSPERITEMGROUPEXCEEDED(): ?int
    {
        return $this->mAXITEMSPERITEMGROUPEXCEEDED;
    }



    /**
     * Sets mAXITEMSPERITEMGROUPEXCEEDED.
     *
     * @param int|null $mAXITEMSPERITEMGROUPEXCEEDED  Some items exceed the maximum number of items per item group, those items will not be published.
     *
     * @return $this
     */
    public function setMAXITEMSPERITEMGROUPEXCEEDED(?int $mAXITEMSPERITEMGROUPEXCEEDED = null): self
    {
        $this->mAXITEMSPERITEMGROUPEXCEEDED = $mAXITEMSPERITEMGROUPEXCEEDED;

        return $this;
    }

    /**
     * Gets iTEMMAINIMAGEDOWNLOADFAILURE.
     *
     * @return int|null
     */
    public function getITEMMAINIMAGEDOWNLOADFAILURE(): ?int
    {
        return $this->iTEMMAINIMAGEDOWNLOADFAILURE;
    }



    /**
     * Sets iTEMMAINIMAGEDOWNLOADFAILURE.
     *
     * @param int|null $iTEMMAINIMAGEDOWNLOADFAILURE  Some items' main images can't be found.
     *
     * @return $this
     */
    public function setITEMMAINIMAGEDOWNLOADFAILURE(?int $iTEMMAINIMAGEDOWNLOADFAILURE = null): self
    {
        $this->iTEMMAINIMAGEDOWNLOADFAILURE = $iTEMMAINIMAGEDOWNLOADFAILURE;

        return $this;
    }

    /**
     * Gets pINJOINCONTENTUNSAFE.
     *
     * @return int|null
     */
    public function getPINJOINCONTENTUNSAFE(): ?int
    {
        return $this->pINJOINCONTENTUNSAFE;
    }



    /**
     * Sets pINJOINCONTENTUNSAFE.
     *
     * @param int|null $pINJOINCONTENTUNSAFE  Some items were not published because they don't meet Pinterest's Merchant Guidelines.
     *
     * @return $this
     */
    public function setPINJOINCONTENTUNSAFE(?int $pINJOINCONTENTUNSAFE = null): self
    {
        $this->pINJOINCONTENTUNSAFE = $pINJOINCONTENTUNSAFE;

        return $this;
    }

    /**
     * Gets bLOCKLISTEDIMAGESIGNATURE.
     *
     * @return int|null
     */
    public function getBLOCKLISTEDIMAGESIGNATURE(): ?int
    {
        return $this->bLOCKLISTEDIMAGESIGNATURE;
    }



    /**
     * Sets bLOCKLISTEDIMAGESIGNATURE.
     *
     * @param int|null $bLOCKLISTEDIMAGESIGNATURE  Some items were not published because they don't meet Pinterest's Merchant Guidelines.
     *
     * @return $this
     */
    public function setBLOCKLISTEDIMAGESIGNATURE(?int $bLOCKLISTEDIMAGESIGNATURE = null): self
    {
        $this->bLOCKLISTEDIMAGESIGNATURE = $bLOCKLISTEDIMAGESIGNATURE;

        return $this;
    }

    /**
     * Gets lISTPRICEINVALID.
     *
     * @return int|null
     */
    public function getLISTPRICEINVALID(): ?int
    {
        return $this->lISTPRICEINVALID;
    }



    /**
     * Sets lISTPRICEINVALID.
     *
     * @param int|null $lISTPRICEINVALID  Some items have list price formatting errors in their product metadata, those items will not be published.
     *
     * @return $this
     */
    public function setLISTPRICEINVALID(?int $lISTPRICEINVALID = null): self
    {
        $this->lISTPRICEINVALID = $lISTPRICEINVALID;

        return $this;
    }

    /**
     * Gets pRICECANNOTBEDETERMINED.
     *
     * @return int|null
     */
    public function getPRICECANNOTBEDETERMINED(): ?int
    {
        return $this->pRICECANNOTBEDETERMINED;
    }



    /**
     * Sets pRICECANNOTBEDETERMINED.
     *
     * @param int|null $pRICECANNOTBEDETERMINED  Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
     *
     * @return $this
     */
    public function setPRICECANNOTBEDETERMINED(?int $pRICECANNOTBEDETERMINED = null): self
    {
        $this->pRICECANNOTBEDETERMINED = $pRICECANNOTBEDETERMINED;

        return $this;
    }
}

