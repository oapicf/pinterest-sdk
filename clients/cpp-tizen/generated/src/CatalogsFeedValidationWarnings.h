/*
 * CatalogsFeedValidationWarnings.h
 *
 * 
 */

#ifndef _CatalogsFeedValidationWarnings_H_
#define _CatalogsFeedValidationWarnings_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedValidationWarnings : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedValidationWarnings();
	CatalogsFeedValidationWarnings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedValidationWarnings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Some items have ad links that are formatted incorrectly.
	 */
	int getADLINKFORMATWARNING();

	/*! \brief Set Some items have ad links that are formatted incorrectly.
	 */
	void setADLINKFORMATWARNING(int  aD_LINK_FORMAT_WARNING);
	/*! \brief Get Some items have ad link URLs that are duplicates of the link URLs for those items.
	 */
	int getADLINKSAMEASLINK();

	/*! \brief Set Some items have ad link URLs that are duplicates of the link URLs for those items.
	 */
	void setADLINKSAMEASLINK(int  aD_LINK_SAME_AS_LINK);
	/*! \brief Get The title for some items were truncated because they contain too many characters.
	 */
	int getTITLELENGTHTOOLONG();

	/*! \brief Set The title for some items were truncated because they contain too many characters.
	 */
	void setTITLELENGTHTOOLONG(int  tITLE_LENGTH_TOO_LONG);
	/*! \brief Get The description for some items were truncated because they contain too many characters.
	 */
	int getDESCRIPTIONLENGTHTOOLONG();

	/*! \brief Set The description for some items were truncated because they contain too many characters.
	 */
	void setDESCRIPTIONLENGTHTOOLONG(int  dESCRIPTION_LENGTH_TOO_LONG);
	/*! \brief Get Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getGENDERINVALID();

	/*! \brief Set Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setGENDERINVALID(int  gENDER_INVALID);
	/*! \brief Get Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getAGEGROUPINVALID();

	/*! \brief Set Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setAGEGROUPINVALID(int  aGE_GROUP_INVALID);
	/*! \brief Get Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getSIZETYPEINVALID();

	/*! \brief Set Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setSIZETYPEINVALID(int  sIZE_TYPE_INVALID);
	/*! \brief Get Some items have size system values which are not one of the supported size systems.
	 */
	int getSIZESYSTEMINVALID();

	/*! \brief Set Some items have size system values which are not one of the supported size systems.
	 */
	void setSIZESYSTEMINVALID(int  sIZE_SYSTEM_INVALID);
	/*! \brief Get Some items have an invalid product link which contains invalid UTM tracking paramaters.
	 */
	int getLINKFORMATWARNING();

	/*! \brief Set Some items have an invalid product link which contains invalid UTM tracking paramaters.
	 */
	void setLINKFORMATWARNING(int  lINK_FORMAT_WARNING);
	/*! \brief Get Some items have sale price values that are higher than the original price of the item.
	 */
	int getSALESPRICEINVALID();

	/*! \brief Set Some items have sale price values that are higher than the original price of the item.
	 */
	void setSALESPRICEINVALID(int  sALES_PRICE_INVALID);
	/*! \brief Get Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getPRODUCTCATEGORYDEPTHWARNING();

	/*! \brief Set Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setPRODUCTCATEGORYDEPTHWARNING(int  pRODUCT_CATEGORY_DEPTH_WARNING);
	/*! \brief Get Some items have adwords_redirect links that are formatted incorrectly.
	 */
	int getADWORDSFORMATWARNING();

	/*! \brief Set Some items have adwords_redirect links that are formatted incorrectly.
	 */
	void setADWORDSFORMATWARNING(int  aDWORDS_FORMAT_WARNING);
	/*! \brief Get Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
	 */
	int getADWORDSSAMEASLINK();

	/*! \brief Set Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
	 */
	void setADWORDSSAMEASLINK(int  aDWORDS_SAME_AS_LINK);
	/*! \brief Get Your feed contains duplicate headers.
	 */
	int getDUPLICATEHEADERS();

	/*! \brief Set Your feed contains duplicate headers.
	 */
	void setDUPLICATEHEADERS(int  dUPLICATE_HEADERS);
	/*! \brief Get Ingestion completed early because there are no changes to your feed since the last successful update.
	 */
	int getFETCHSAMESIGNATURE();

	/*! \brief Set Ingestion completed early because there are no changes to your feed since the last successful update.
	 */
	void setFETCHSAMESIGNATURE(int  fETCH_SAME_SIGNATURE);
	/*! \brief Get Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
	 */
	int getADDITIONALIMAGELINKLENGTHTOOLONG();

	/*! \brief Set Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
	 */
	void setADDITIONALIMAGELINKLENGTHTOOLONG(int  aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG);
	/*! \brief Get Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
	 */
	int getADDITIONALIMAGELINKWARNING();

	/*! \brief Set Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
	 */
	void setADDITIONALIMAGELINKWARNING(int  aDDITIONAL_IMAGE_LINK_WARNING);
	/*! \brief Get Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
	 */
	int getIMAGELINKWARNING();

	/*! \brief Set Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
	 */
	void setIMAGELINKWARNING(int  iMAGE_LINK_WARNING);
	/*! \brief Get Some items have shipping values that are formatted incorrectly.
	 */
	int getSHIPPINGINVALID();

	/*! \brief Set Some items have shipping values that are formatted incorrectly.
	 */
	void setSHIPPINGINVALID(int  sHIPPING_INVALID);
	/*! \brief Get Some items have tax values that are formatted incorrectly.
	 */
	int getTAXINVALID();

	/*! \brief Set Some items have tax values that are formatted incorrectly.
	 */
	void setTAXINVALID(int  tAX_INVALID);
	/*! \brief Get Some items have invalid shipping_weight values.
	 */
	int getSHIPPINGWEIGHTINVALID();

	/*! \brief Set Some items have invalid shipping_weight values.
	 */
	void setSHIPPINGWEIGHTINVALID(int  sHIPPING_WEIGHT_INVALID);
	/*! \brief Get Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
	 */
	int getEXPIRATIONDATEINVALID();

	/*! \brief Set Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
	 */
	void setEXPIRATIONDATEINVALID(int  eXPIRATION_DATE_INVALID);
	/*! \brief Get Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
	 */
	int getAVAILABILITYDATEINVALID();

	/*! \brief Set Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
	 */
	void setAVAILABILITYDATEINVALID(int  aVAILABILITY_DATE_INVALID);
	/*! \brief Get Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
	 */
	int getSALEDATEINVALID();

	/*! \brief Set Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
	 */
	void setSALEDATEINVALID(int  sALE_DATE_INVALID);
	/*! \brief Get Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
	 */
	int getWEIGHTUNITINVALID();

	/*! \brief Set Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
	 */
	void setWEIGHTUNITINVALID(int  wEIGHT_UNIT_INVALID);
	/*! \brief Get Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
	 */
	int getISBUNDLEINVALID();

	/*! \brief Set Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
	 */
	void setISBUNDLEINVALID(int  iS_BUNDLE_INVALID);
	/*! \brief Get Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
	 */
	int getUPDATEDTIMEINVALID();

	/*! \brief Set Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
	 */
	void setUPDATEDTIMEINVALID(int  uPDATED_TIME_INVALID);
	/*! \brief Get Some items have custom_label values that are too long, those items will be published without that custom label.
	 */
	int getCUSTOMLABELLENGTHTOOLONG();

	/*! \brief Set Some items have custom_label values that are too long, those items will be published without that custom label.
	 */
	void setCUSTOMLABELLENGTHTOOLONG(int  cUSTOM_LABEL_LENGTH_TOO_LONG);
	/*! \brief Get Some items have product_type values that are too long, those items will be published without that product type.
	 */
	int getPRODUCTTYPELENGTHTOOLONG();

	/*! \brief Set Some items have product_type values that are too long, those items will be published without that product type.
	 */
	void setPRODUCTTYPELENGTHTOOLONG(int  pRODUCT_TYPE_LENGTH_TOO_LONG);
	/*! \brief Get Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
	 */
	int getTOOMANYADDITIONALIMAGELINKS();

	/*! \brief Set Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
	 */
	void setTOOMANYADDITIONALIMAGELINKS(int  tOO_MANY_ADDITIONAL_IMAGE_LINKS);
	/*! \brief Get Some items have invalid multipack values.
	 */
	int getMULTIPACKINVALID();

	/*! \brief Set Some items have invalid multipack values.
	 */
	void setMULTIPACKINVALID(int  mULTIPACK_INVALID);
	/*! \brief Get The product count has increased or decreased significantly compared to the last successful ingestion.
	 */
	int getINDEXEDPRODUCTCOUNTLARGEDELTA();

	/*! \brief Set The product count has increased or decreased significantly compared to the last successful ingestion.
	 */
	void setINDEXEDPRODUCTCOUNTLARGEDELTA(int  iNDEXED_PRODUCT_COUNT_LARGE_DELTA);
	/*! \brief Get Some items include additional_image_links that can't be found.
	 */
	int getITEMADDITIONALIMAGEDOWNLOADFAILURE();

	/*! \brief Set Some items include additional_image_links that can't be found.
	 */
	void setITEMADDITIONALIMAGEDOWNLOADFAILURE(int  iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE);
	/*! \brief Get Some items are missing a google_product_category.
	 */
	int getOPTIONALPRODUCTCATEGORYMISSING();

	/*! \brief Set Some items are missing a google_product_category.
	 */
	void setOPTIONALPRODUCTCATEGORYMISSING(int  oPTIONAL_PRODUCT_CATEGORY_MISSING);
	/*! \brief Get Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
	 */
	int getOPTIONALPRODUCTCATEGORYINVALID();

	/*! \brief Set Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
	 */
	void setOPTIONALPRODUCTCATEGORYINVALID(int  oPTIONAL_PRODUCT_CATEGORY_INVALID);
	/*! \brief Get Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getOPTIONALCONDITIONMISSING();

	/*! \brief Set Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setOPTIONALCONDITIONMISSING(int  oPTIONAL_CONDITION_MISSING);
	/*! \brief Get Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	int getOPTIONALCONDITIONINVALID();

	/*! \brief Set Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
	 */
	void setOPTIONALCONDITIONINVALID(int  oPTIONAL_CONDITION_INVALID);
	/*! \brief Get Some items include invalid ios_deep_link values.
	 */
	int getIOSDEEPLINKINVALID();

	/*! \brief Set Some items include invalid ios_deep_link values.
	 */
	void setIOSDEEPLINKINVALID(int  iOS_DEEP_LINK_INVALID);
	/*! \brief Get Some items include invalid android_deep_link.
	 */
	int getANDROIDDEEPLINKINVALID();

	/*! \brief Set Some items include invalid android_deep_link.
	 */
	void setANDROIDDEEPLINKINVALID(int  aNDROID_DEEP_LINK_INVALID);
	/*! \brief Get Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
	 */
	int getUTMSOURCEAUTOCORRECTED();

	/*! \brief Set Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
	 */
	void setUTMSOURCEAUTOCORRECTED(int  uTM_SOURCE_AUTO_CORRECTED);
	/*! \brief Get Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
	 */
	int getCOUNTRYDOESNOTMAPTOCURRENCY();

	/*! \brief Set Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
	 */
	void setCOUNTRYDOESNOTMAPTOCURRENCY(int  cOUNTRY_DOES_NOT_MAP_TO_CURRENCY);
	/*! \brief Get Some items include min_ad_price values that are formatted incorrectly.
	 */
	int getMINADPRICEINVALID();

	/*! \brief Set Some items include min_ad_price values that are formatted incorrectly.
	 */
	void setMINADPRICEINVALID(int  mIN_AD_PRICE_INVALID);
	/*! \brief Get Some items include incorrectly formatted GTINs.
	 */
	int getGTININVALID();

	/*! \brief Set Some items include incorrectly formatted GTINs.
	 */
	void setGTININVALID(int  gTIN_INVALID);
	/*! \brief Get Some items include inconsistent currencies in price fields.
	 */
	int getINCONSISTENTCURRENCYVALUES();

	/*! \brief Set Some items include inconsistent currencies in price fields.
	 */
	void setINCONSISTENTCURRENCYVALUES(int  iNCONSISTENT_CURRENCY_VALUES);
	/*! \brief Get Some items include sales price that is much lower than the list price.
	 */
	int getSALESPRICETOOLOW();

	/*! \brief Set Some items include sales price that is much lower than the list price.
	 */
	void setSALESPRICETOOLOW(int  sALES_PRICE_TOO_LOW);
	/*! \brief Get Some items include incorrectly formatted shipping_width.
	 */
	int getSHIPPINGWIDTHINVALID();

	/*! \brief Set Some items include incorrectly formatted shipping_width.
	 */
	void setSHIPPINGWIDTHINVALID(int  sHIPPING_WIDTH_INVALID);
	/*! \brief Get Some items include incorrectly formatted shipping_height.
	 */
	int getSHIPPINGHEIGHTINVALID();

	/*! \brief Set Some items include incorrectly formatted shipping_height.
	 */
	void setSHIPPINGHEIGHTINVALID(int  sHIPPING_HEIGHT_INVALID);
	/*! \brief Get Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
	 */
	int getSALESPRICETOOHIGH();

	/*! \brief Set Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
	 */
	void setSALESPRICETOOHIGH(int  sALES_PRICE_TOO_HIGH);
	/*! \brief Get Some items include incorrectly formatted MPNs.
	 */
	int getMPNINVALID();

	/*! \brief Set Some items include incorrectly formatted MPNs.
	 */
	void setMPNINVALID(int  mPN_INVALID);

private:
	int aD_LINK_FORMAT_WARNING;
	int aD_LINK_SAME_AS_LINK;
	int tITLE_LENGTH_TOO_LONG;
	int dESCRIPTION_LENGTH_TOO_LONG;
	int gENDER_INVALID;
	int aGE_GROUP_INVALID;
	int sIZE_TYPE_INVALID;
	int sIZE_SYSTEM_INVALID;
	int lINK_FORMAT_WARNING;
	int sALES_PRICE_INVALID;
	int pRODUCT_CATEGORY_DEPTH_WARNING;
	int aDWORDS_FORMAT_WARNING;
	int aDWORDS_SAME_AS_LINK;
	int dUPLICATE_HEADERS;
	int fETCH_SAME_SIGNATURE;
	int aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
	int aDDITIONAL_IMAGE_LINK_WARNING;
	int iMAGE_LINK_WARNING;
	int sHIPPING_INVALID;
	int tAX_INVALID;
	int sHIPPING_WEIGHT_INVALID;
	int eXPIRATION_DATE_INVALID;
	int aVAILABILITY_DATE_INVALID;
	int sALE_DATE_INVALID;
	int wEIGHT_UNIT_INVALID;
	int iS_BUNDLE_INVALID;
	int uPDATED_TIME_INVALID;
	int cUSTOM_LABEL_LENGTH_TOO_LONG;
	int pRODUCT_TYPE_LENGTH_TOO_LONG;
	int tOO_MANY_ADDITIONAL_IMAGE_LINKS;
	int mULTIPACK_INVALID;
	int iNDEXED_PRODUCT_COUNT_LARGE_DELTA;
	int iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
	int oPTIONAL_PRODUCT_CATEGORY_MISSING;
	int oPTIONAL_PRODUCT_CATEGORY_INVALID;
	int oPTIONAL_CONDITION_MISSING;
	int oPTIONAL_CONDITION_INVALID;
	int iOS_DEEP_LINK_INVALID;
	int aNDROID_DEEP_LINK_INVALID;
	int uTM_SOURCE_AUTO_CORRECTED;
	int cOUNTRY_DOES_NOT_MAP_TO_CURRENCY;
	int mIN_AD_PRICE_INVALID;
	int gTIN_INVALID;
	int iNCONSISTENT_CURRENCY_VALUES;
	int sALES_PRICE_TOO_LOW;
	int sHIPPING_WIDTH_INVALID;
	int sHIPPING_HEIGHT_INVALID;
	int sALES_PRICE_TOO_HIGH;
	int mPN_INVALID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedValidationWarnings_H_ */
