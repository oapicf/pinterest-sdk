#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedValidationWarnings.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedValidationWarnings::CatalogsFeedValidationWarnings()
{
	//__init();
}

CatalogsFeedValidationWarnings::~CatalogsFeedValidationWarnings()
{
	//__cleanup();
}

void
CatalogsFeedValidationWarnings::__init()
{
	//tITLE_LENGTH_TOO_LONG = int(0);
	//dESCRIPTION_LENGTH_TOO_LONG = int(0);
	//gENDER_INVALID = int(0);
	//aGE_GROUP_INVALID = int(0);
	//sIZE_TYPE_INVALID = int(0);
	//sIZE_SYSTEM_INVALID = int(0);
	//lINK_FORMAT_WARNING = int(0);
	//dUPLICATE_PRODUCTS = int(0);
	//sALES_PRICE_INVALID = int(0);
	//pRODUCT_CATEGORY_DEPTH_WARNING = int(0);
	//aDWORDS_SAME_AS_LINK = int(0);
	//dUPLICATE_HEADERS = int(0);
	//fETCH_SAME_SIGNATURE = int(0);
	//aDWORDS_FORMAT_WARNING = int(0);
	//aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = int(0);
	//aDDITIONAL_IMAGE_LINK_WARNING = int(0);
	//iMAGE_LINK_WARNING = int(0);
	//sHIPPING_INVALID = int(0);
	//tAX_INVALID = int(0);
	//sHIPPING_WEIGHT_INVALID = int(0);
	//eXPIRATION_DATE_INVALID = int(0);
	//aVAILABILITY_DATE_INVALID = int(0);
	//sALE_DATE_INVALID = int(0);
	//wEIGHT_UNIT_INVALID = int(0);
	//iS_BUNDLE_INVALID = int(0);
	//uPDATED_TIME_INVALID = int(0);
	//cUSTOM_LABEL_LENGTH_TOO_LONG = int(0);
	//pRODUCT_TYPE_LENGTH_TOO_LONG = int(0);
	//tOO_MANY_ADDITIONAL_IMAGE_LINKS = int(0);
	//mULTIPACK_INVALID = int(0);
	//iNDEXED_PRODUCT_COUNT_LARGE_DELTA = int(0);
	//iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = int(0);
	//oPTIONAL_PRODUCT_CATEGORY_MISSING = int(0);
	//oPTIONAL_PRODUCT_CATEGORY_INVALID = int(0);
	//oPTIONAL_CONDITION_MISSING = int(0);
	//oPTIONAL_CONDITION_INVALID = int(0);
	//iOS_DEEP_LINK_INVALID = int(0);
	//aNDROID_DEEP_LINK_INVALID = int(0);
	//aVAILABILITY_NORMALIZED = int(0);
	//cONDITION_NORMALIZED = int(0);
	//gENDER_NORMALIZED = int(0);
	//sIZE_TYPE_NORMALIZED = int(0);
	//aGE_GROUP_NORMALIZED = int(0);
	//uTM_SOURCE_AUTO_CORRECTED = int(0);
	//cOUNTRY_DOES_NOT_MAP_TO_CURRENCY = int(0);
	//mIN_AD_PRICE_INVALID = int(0);
	//gTIN_INVALID = int(0);
	//iNCONSISTENT_CURRENCY_VALUES = int(0);
	//sALES_PRICE_TOO_LOW = int(0);
	//sHIPPING_WIDTH_INVALID = int(0);
	//sHIPPING_HEIGHT_INVALID = int(0);
	//sALES_PRICE_TOO_HIGH = int(0);
	//mPN_INVALID = int(0);
}

void
CatalogsFeedValidationWarnings::__cleanup()
{
	//if(tITLE_LENGTH_TOO_LONG != NULL) {
	//
	//delete tITLE_LENGTH_TOO_LONG;
	//tITLE_LENGTH_TOO_LONG = NULL;
	//}
	//if(dESCRIPTION_LENGTH_TOO_LONG != NULL) {
	//
	//delete dESCRIPTION_LENGTH_TOO_LONG;
	//dESCRIPTION_LENGTH_TOO_LONG = NULL;
	//}
	//if(gENDER_INVALID != NULL) {
	//
	//delete gENDER_INVALID;
	//gENDER_INVALID = NULL;
	//}
	//if(aGE_GROUP_INVALID != NULL) {
	//
	//delete aGE_GROUP_INVALID;
	//aGE_GROUP_INVALID = NULL;
	//}
	//if(sIZE_TYPE_INVALID != NULL) {
	//
	//delete sIZE_TYPE_INVALID;
	//sIZE_TYPE_INVALID = NULL;
	//}
	//if(sIZE_SYSTEM_INVALID != NULL) {
	//
	//delete sIZE_SYSTEM_INVALID;
	//sIZE_SYSTEM_INVALID = NULL;
	//}
	//if(lINK_FORMAT_WARNING != NULL) {
	//
	//delete lINK_FORMAT_WARNING;
	//lINK_FORMAT_WARNING = NULL;
	//}
	//if(dUPLICATE_PRODUCTS != NULL) {
	//
	//delete dUPLICATE_PRODUCTS;
	//dUPLICATE_PRODUCTS = NULL;
	//}
	//if(sALES_PRICE_INVALID != NULL) {
	//
	//delete sALES_PRICE_INVALID;
	//sALES_PRICE_INVALID = NULL;
	//}
	//if(pRODUCT_CATEGORY_DEPTH_WARNING != NULL) {
	//
	//delete pRODUCT_CATEGORY_DEPTH_WARNING;
	//pRODUCT_CATEGORY_DEPTH_WARNING = NULL;
	//}
	//if(aDWORDS_SAME_AS_LINK != NULL) {
	//
	//delete aDWORDS_SAME_AS_LINK;
	//aDWORDS_SAME_AS_LINK = NULL;
	//}
	//if(dUPLICATE_HEADERS != NULL) {
	//
	//delete dUPLICATE_HEADERS;
	//dUPLICATE_HEADERS = NULL;
	//}
	//if(fETCH_SAME_SIGNATURE != NULL) {
	//
	//delete fETCH_SAME_SIGNATURE;
	//fETCH_SAME_SIGNATURE = NULL;
	//}
	//if(aDWORDS_FORMAT_WARNING != NULL) {
	//
	//delete aDWORDS_FORMAT_WARNING;
	//aDWORDS_FORMAT_WARNING = NULL;
	//}
	//if(aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG != NULL) {
	//
	//delete aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
	//aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = NULL;
	//}
	//if(aDDITIONAL_IMAGE_LINK_WARNING != NULL) {
	//
	//delete aDDITIONAL_IMAGE_LINK_WARNING;
	//aDDITIONAL_IMAGE_LINK_WARNING = NULL;
	//}
	//if(iMAGE_LINK_WARNING != NULL) {
	//
	//delete iMAGE_LINK_WARNING;
	//iMAGE_LINK_WARNING = NULL;
	//}
	//if(sHIPPING_INVALID != NULL) {
	//
	//delete sHIPPING_INVALID;
	//sHIPPING_INVALID = NULL;
	//}
	//if(tAX_INVALID != NULL) {
	//
	//delete tAX_INVALID;
	//tAX_INVALID = NULL;
	//}
	//if(sHIPPING_WEIGHT_INVALID != NULL) {
	//
	//delete sHIPPING_WEIGHT_INVALID;
	//sHIPPING_WEIGHT_INVALID = NULL;
	//}
	//if(eXPIRATION_DATE_INVALID != NULL) {
	//
	//delete eXPIRATION_DATE_INVALID;
	//eXPIRATION_DATE_INVALID = NULL;
	//}
	//if(aVAILABILITY_DATE_INVALID != NULL) {
	//
	//delete aVAILABILITY_DATE_INVALID;
	//aVAILABILITY_DATE_INVALID = NULL;
	//}
	//if(sALE_DATE_INVALID != NULL) {
	//
	//delete sALE_DATE_INVALID;
	//sALE_DATE_INVALID = NULL;
	//}
	//if(wEIGHT_UNIT_INVALID != NULL) {
	//
	//delete wEIGHT_UNIT_INVALID;
	//wEIGHT_UNIT_INVALID = NULL;
	//}
	//if(iS_BUNDLE_INVALID != NULL) {
	//
	//delete iS_BUNDLE_INVALID;
	//iS_BUNDLE_INVALID = NULL;
	//}
	//if(uPDATED_TIME_INVALID != NULL) {
	//
	//delete uPDATED_TIME_INVALID;
	//uPDATED_TIME_INVALID = NULL;
	//}
	//if(cUSTOM_LABEL_LENGTH_TOO_LONG != NULL) {
	//
	//delete cUSTOM_LABEL_LENGTH_TOO_LONG;
	//cUSTOM_LABEL_LENGTH_TOO_LONG = NULL;
	//}
	//if(pRODUCT_TYPE_LENGTH_TOO_LONG != NULL) {
	//
	//delete pRODUCT_TYPE_LENGTH_TOO_LONG;
	//pRODUCT_TYPE_LENGTH_TOO_LONG = NULL;
	//}
	//if(tOO_MANY_ADDITIONAL_IMAGE_LINKS != NULL) {
	//
	//delete tOO_MANY_ADDITIONAL_IMAGE_LINKS;
	//tOO_MANY_ADDITIONAL_IMAGE_LINKS = NULL;
	//}
	//if(mULTIPACK_INVALID != NULL) {
	//
	//delete mULTIPACK_INVALID;
	//mULTIPACK_INVALID = NULL;
	//}
	//if(iNDEXED_PRODUCT_COUNT_LARGE_DELTA != NULL) {
	//
	//delete iNDEXED_PRODUCT_COUNT_LARGE_DELTA;
	//iNDEXED_PRODUCT_COUNT_LARGE_DELTA = NULL;
	//}
	//if(iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE != NULL) {
	//
	//delete iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
	//iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = NULL;
	//}
	//if(oPTIONAL_PRODUCT_CATEGORY_MISSING != NULL) {
	//
	//delete oPTIONAL_PRODUCT_CATEGORY_MISSING;
	//oPTIONAL_PRODUCT_CATEGORY_MISSING = NULL;
	//}
	//if(oPTIONAL_PRODUCT_CATEGORY_INVALID != NULL) {
	//
	//delete oPTIONAL_PRODUCT_CATEGORY_INVALID;
	//oPTIONAL_PRODUCT_CATEGORY_INVALID = NULL;
	//}
	//if(oPTIONAL_CONDITION_MISSING != NULL) {
	//
	//delete oPTIONAL_CONDITION_MISSING;
	//oPTIONAL_CONDITION_MISSING = NULL;
	//}
	//if(oPTIONAL_CONDITION_INVALID != NULL) {
	//
	//delete oPTIONAL_CONDITION_INVALID;
	//oPTIONAL_CONDITION_INVALID = NULL;
	//}
	//if(iOS_DEEP_LINK_INVALID != NULL) {
	//
	//delete iOS_DEEP_LINK_INVALID;
	//iOS_DEEP_LINK_INVALID = NULL;
	//}
	//if(aNDROID_DEEP_LINK_INVALID != NULL) {
	//
	//delete aNDROID_DEEP_LINK_INVALID;
	//aNDROID_DEEP_LINK_INVALID = NULL;
	//}
	//if(aVAILABILITY_NORMALIZED != NULL) {
	//
	//delete aVAILABILITY_NORMALIZED;
	//aVAILABILITY_NORMALIZED = NULL;
	//}
	//if(cONDITION_NORMALIZED != NULL) {
	//
	//delete cONDITION_NORMALIZED;
	//cONDITION_NORMALIZED = NULL;
	//}
	//if(gENDER_NORMALIZED != NULL) {
	//
	//delete gENDER_NORMALIZED;
	//gENDER_NORMALIZED = NULL;
	//}
	//if(sIZE_TYPE_NORMALIZED != NULL) {
	//
	//delete sIZE_TYPE_NORMALIZED;
	//sIZE_TYPE_NORMALIZED = NULL;
	//}
	//if(aGE_GROUP_NORMALIZED != NULL) {
	//
	//delete aGE_GROUP_NORMALIZED;
	//aGE_GROUP_NORMALIZED = NULL;
	//}
	//if(uTM_SOURCE_AUTO_CORRECTED != NULL) {
	//
	//delete uTM_SOURCE_AUTO_CORRECTED;
	//uTM_SOURCE_AUTO_CORRECTED = NULL;
	//}
	//if(cOUNTRY_DOES_NOT_MAP_TO_CURRENCY != NULL) {
	//
	//delete cOUNTRY_DOES_NOT_MAP_TO_CURRENCY;
	//cOUNTRY_DOES_NOT_MAP_TO_CURRENCY = NULL;
	//}
	//if(mIN_AD_PRICE_INVALID != NULL) {
	//
	//delete mIN_AD_PRICE_INVALID;
	//mIN_AD_PRICE_INVALID = NULL;
	//}
	//if(gTIN_INVALID != NULL) {
	//
	//delete gTIN_INVALID;
	//gTIN_INVALID = NULL;
	//}
	//if(iNCONSISTENT_CURRENCY_VALUES != NULL) {
	//
	//delete iNCONSISTENT_CURRENCY_VALUES;
	//iNCONSISTENT_CURRENCY_VALUES = NULL;
	//}
	//if(sALES_PRICE_TOO_LOW != NULL) {
	//
	//delete sALES_PRICE_TOO_LOW;
	//sALES_PRICE_TOO_LOW = NULL;
	//}
	//if(sHIPPING_WIDTH_INVALID != NULL) {
	//
	//delete sHIPPING_WIDTH_INVALID;
	//sHIPPING_WIDTH_INVALID = NULL;
	//}
	//if(sHIPPING_HEIGHT_INVALID != NULL) {
	//
	//delete sHIPPING_HEIGHT_INVALID;
	//sHIPPING_HEIGHT_INVALID = NULL;
	//}
	//if(sALES_PRICE_TOO_HIGH != NULL) {
	//
	//delete sALES_PRICE_TOO_HIGH;
	//sALES_PRICE_TOO_HIGH = NULL;
	//}
	//if(mPN_INVALID != NULL) {
	//
	//delete mPN_INVALID;
	//mPN_INVALID = NULL;
	//}
	//
}

void
CatalogsFeedValidationWarnings::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *tITLE_LENGTH_TOO_LONGKey = "TITLE_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, tITLE_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&tITLE_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *dESCRIPTION_LENGTH_TOO_LONGKey = "DESCRIPTION_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, dESCRIPTION_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&dESCRIPTION_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *gENDER_INVALIDKey = "GENDER_INVALID";
	node = json_object_get_member(pJsonObject, gENDER_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gENDER_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *aGE_GROUP_INVALIDKey = "AGE_GROUP_INVALID";
	node = json_object_get_member(pJsonObject, aGE_GROUP_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aGE_GROUP_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *sIZE_TYPE_INVALIDKey = "SIZE_TYPE_INVALID";
	node = json_object_get_member(pJsonObject, sIZE_TYPE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sIZE_TYPE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *sIZE_SYSTEM_INVALIDKey = "SIZE_SYSTEM_INVALID";
	node = json_object_get_member(pJsonObject, sIZE_SYSTEM_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sIZE_SYSTEM_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *lINK_FORMAT_WARNINGKey = "LINK_FORMAT_WARNING";
	node = json_object_get_member(pJsonObject, lINK_FORMAT_WARNINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lINK_FORMAT_WARNING, node, "int", "");
		} else {
			
		}
	}
	const gchar *dUPLICATE_PRODUCTSKey = "DUPLICATE_PRODUCTS";
	node = json_object_get_member(pJsonObject, dUPLICATE_PRODUCTSKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&dUPLICATE_PRODUCTS, node, "int", "");
		} else {
			
		}
	}
	const gchar *sALES_PRICE_INVALIDKey = "SALES_PRICE_INVALID";
	node = json_object_get_member(pJsonObject, sALES_PRICE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sALES_PRICE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *pRODUCT_CATEGORY_DEPTH_WARNINGKey = "PRODUCT_CATEGORY_DEPTH_WARNING";
	node = json_object_get_member(pJsonObject, pRODUCT_CATEGORY_DEPTH_WARNINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pRODUCT_CATEGORY_DEPTH_WARNING, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDWORDS_SAME_AS_LINKKey = "ADWORDS_SAME_AS_LINK";
	node = json_object_get_member(pJsonObject, aDWORDS_SAME_AS_LINKKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDWORDS_SAME_AS_LINK, node, "int", "");
		} else {
			
		}
	}
	const gchar *dUPLICATE_HEADERSKey = "DUPLICATE_HEADERS";
	node = json_object_get_member(pJsonObject, dUPLICATE_HEADERSKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&dUPLICATE_HEADERS, node, "int", "");
		} else {
			
		}
	}
	const gchar *fETCH_SAME_SIGNATUREKey = "FETCH_SAME_SIGNATURE";
	node = json_object_get_member(pJsonObject, fETCH_SAME_SIGNATUREKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fETCH_SAME_SIGNATURE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDWORDS_FORMAT_WARNINGKey = "ADWORDS_FORMAT_WARNING";
	node = json_object_get_member(pJsonObject, aDWORDS_FORMAT_WARNINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDWORDS_FORMAT_WARNING, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONGKey = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDDITIONAL_IMAGE_LINK_WARNINGKey = "ADDITIONAL_IMAGE_LINK_WARNING";
	node = json_object_get_member(pJsonObject, aDDITIONAL_IMAGE_LINK_WARNINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDDITIONAL_IMAGE_LINK_WARNING, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_LINK_WARNINGKey = "IMAGE_LINK_WARNING";
	node = json_object_get_member(pJsonObject, iMAGE_LINK_WARNINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_LINK_WARNING, node, "int", "");
		} else {
			
		}
	}
	const gchar *sHIPPING_INVALIDKey = "SHIPPING_INVALID";
	node = json_object_get_member(pJsonObject, sHIPPING_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sHIPPING_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *tAX_INVALIDKey = "TAX_INVALID";
	node = json_object_get_member(pJsonObject, tAX_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&tAX_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *sHIPPING_WEIGHT_INVALIDKey = "SHIPPING_WEIGHT_INVALID";
	node = json_object_get_member(pJsonObject, sHIPPING_WEIGHT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sHIPPING_WEIGHT_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *eXPIRATION_DATE_INVALIDKey = "EXPIRATION_DATE_INVALID";
	node = json_object_get_member(pJsonObject, eXPIRATION_DATE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&eXPIRATION_DATE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *aVAILABILITY_DATE_INVALIDKey = "AVAILABILITY_DATE_INVALID";
	node = json_object_get_member(pJsonObject, aVAILABILITY_DATE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aVAILABILITY_DATE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *sALE_DATE_INVALIDKey = "SALE_DATE_INVALID";
	node = json_object_get_member(pJsonObject, sALE_DATE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sALE_DATE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *wEIGHT_UNIT_INVALIDKey = "WEIGHT_UNIT_INVALID";
	node = json_object_get_member(pJsonObject, wEIGHT_UNIT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&wEIGHT_UNIT_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *iS_BUNDLE_INVALIDKey = "IS_BUNDLE_INVALID";
	node = json_object_get_member(pJsonObject, iS_BUNDLE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iS_BUNDLE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *uPDATED_TIME_INVALIDKey = "UPDATED_TIME_INVALID";
	node = json_object_get_member(pJsonObject, uPDATED_TIME_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&uPDATED_TIME_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *cUSTOM_LABEL_LENGTH_TOO_LONGKey = "CUSTOM_LABEL_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cUSTOM_LABEL_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *pRODUCT_TYPE_LENGTH_TOO_LONGKey = "PRODUCT_TYPE_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, pRODUCT_TYPE_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pRODUCT_TYPE_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *tOO_MANY_ADDITIONAL_IMAGE_LINKSKey = "TOO_MANY_ADDITIONAL_IMAGE_LINKS";
	node = json_object_get_member(pJsonObject, tOO_MANY_ADDITIONAL_IMAGE_LINKSKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&tOO_MANY_ADDITIONAL_IMAGE_LINKS, node, "int", "");
		} else {
			
		}
	}
	const gchar *mULTIPACK_INVALIDKey = "MULTIPACK_INVALID";
	node = json_object_get_member(pJsonObject, mULTIPACK_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&mULTIPACK_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *iNDEXED_PRODUCT_COUNT_LARGE_DELTAKey = "INDEXED_PRODUCT_COUNT_LARGE_DELTA";
	node = json_object_get_member(pJsonObject, iNDEXED_PRODUCT_COUNT_LARGE_DELTAKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iNDEXED_PRODUCT_COUNT_LARGE_DELTA, node, "int", "");
		} else {
			
		}
	}
	const gchar *iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE";
	node = json_object_get_member(pJsonObject, iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILUREKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, node, "int", "");
		} else {
			
		}
	}
	const gchar *oPTIONAL_PRODUCT_CATEGORY_MISSINGKey = "OPTIONAL_PRODUCT_CATEGORY_MISSING";
	node = json_object_get_member(pJsonObject, oPTIONAL_PRODUCT_CATEGORY_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&oPTIONAL_PRODUCT_CATEGORY_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *oPTIONAL_PRODUCT_CATEGORY_INVALIDKey = "OPTIONAL_PRODUCT_CATEGORY_INVALID";
	node = json_object_get_member(pJsonObject, oPTIONAL_PRODUCT_CATEGORY_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&oPTIONAL_PRODUCT_CATEGORY_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *oPTIONAL_CONDITION_MISSINGKey = "OPTIONAL_CONDITION_MISSING";
	node = json_object_get_member(pJsonObject, oPTIONAL_CONDITION_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&oPTIONAL_CONDITION_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *oPTIONAL_CONDITION_INVALIDKey = "OPTIONAL_CONDITION_INVALID";
	node = json_object_get_member(pJsonObject, oPTIONAL_CONDITION_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&oPTIONAL_CONDITION_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *iOS_DEEP_LINK_INVALIDKey = "IOS_DEEP_LINK_INVALID";
	node = json_object_get_member(pJsonObject, iOS_DEEP_LINK_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iOS_DEEP_LINK_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *aNDROID_DEEP_LINK_INVALIDKey = "ANDROID_DEEP_LINK_INVALID";
	node = json_object_get_member(pJsonObject, aNDROID_DEEP_LINK_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aNDROID_DEEP_LINK_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *aVAILABILITY_NORMALIZEDKey = "AVAILABILITY_NORMALIZED";
	node = json_object_get_member(pJsonObject, aVAILABILITY_NORMALIZEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aVAILABILITY_NORMALIZED, node, "int", "");
		} else {
			
		}
	}
	const gchar *cONDITION_NORMALIZEDKey = "CONDITION_NORMALIZED";
	node = json_object_get_member(pJsonObject, cONDITION_NORMALIZEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cONDITION_NORMALIZED, node, "int", "");
		} else {
			
		}
	}
	const gchar *gENDER_NORMALIZEDKey = "GENDER_NORMALIZED";
	node = json_object_get_member(pJsonObject, gENDER_NORMALIZEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gENDER_NORMALIZED, node, "int", "");
		} else {
			
		}
	}
	const gchar *sIZE_TYPE_NORMALIZEDKey = "SIZE_TYPE_NORMALIZED";
	node = json_object_get_member(pJsonObject, sIZE_TYPE_NORMALIZEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sIZE_TYPE_NORMALIZED, node, "int", "");
		} else {
			
		}
	}
	const gchar *aGE_GROUP_NORMALIZEDKey = "AGE_GROUP_NORMALIZED";
	node = json_object_get_member(pJsonObject, aGE_GROUP_NORMALIZEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aGE_GROUP_NORMALIZED, node, "int", "");
		} else {
			
		}
	}
	const gchar *uTM_SOURCE_AUTO_CORRECTEDKey = "UTM_SOURCE_AUTO_CORRECTED";
	node = json_object_get_member(pJsonObject, uTM_SOURCE_AUTO_CORRECTEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&uTM_SOURCE_AUTO_CORRECTED, node, "int", "");
		} else {
			
		}
	}
	const gchar *cOUNTRY_DOES_NOT_MAP_TO_CURRENCYKey = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY";
	node = json_object_get_member(pJsonObject, cOUNTRY_DOES_NOT_MAP_TO_CURRENCYKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cOUNTRY_DOES_NOT_MAP_TO_CURRENCY, node, "int", "");
		} else {
			
		}
	}
	const gchar *mIN_AD_PRICE_INVALIDKey = "MIN_AD_PRICE_INVALID";
	node = json_object_get_member(pJsonObject, mIN_AD_PRICE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&mIN_AD_PRICE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *gTIN_INVALIDKey = "GTIN_INVALID";
	node = json_object_get_member(pJsonObject, gTIN_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gTIN_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *iNCONSISTENT_CURRENCY_VALUESKey = "INCONSISTENT_CURRENCY_VALUES";
	node = json_object_get_member(pJsonObject, iNCONSISTENT_CURRENCY_VALUESKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iNCONSISTENT_CURRENCY_VALUES, node, "int", "");
		} else {
			
		}
	}
	const gchar *sALES_PRICE_TOO_LOWKey = "SALES_PRICE_TOO_LOW";
	node = json_object_get_member(pJsonObject, sALES_PRICE_TOO_LOWKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sALES_PRICE_TOO_LOW, node, "int", "");
		} else {
			
		}
	}
	const gchar *sHIPPING_WIDTH_INVALIDKey = "SHIPPING_WIDTH_INVALID";
	node = json_object_get_member(pJsonObject, sHIPPING_WIDTH_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sHIPPING_WIDTH_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *sHIPPING_HEIGHT_INVALIDKey = "SHIPPING_HEIGHT_INVALID";
	node = json_object_get_member(pJsonObject, sHIPPING_HEIGHT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sHIPPING_HEIGHT_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *sALES_PRICE_TOO_HIGHKey = "SALES_PRICE_TOO_HIGH";
	node = json_object_get_member(pJsonObject, sALES_PRICE_TOO_HIGHKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&sALES_PRICE_TOO_HIGH, node, "int", "");
		} else {
			
		}
	}
	const gchar *mPN_INVALIDKey = "MPN_INVALID";
	node = json_object_get_member(pJsonObject, mPN_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&mPN_INVALID, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedValidationWarnings::CatalogsFeedValidationWarnings(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedValidationWarnings::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getTITLELENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *tITLE_LENGTH_TOO_LONGKey = "TITLE_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, tITLE_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getDESCRIPTIONLENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dESCRIPTION_LENGTH_TOO_LONGKey = "DESCRIPTION_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, dESCRIPTION_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getGENDERINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gENDER_INVALIDKey = "GENDER_INVALID";
	json_object_set_member(pJsonObject, gENDER_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getAGEGROUPINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aGE_GROUP_INVALIDKey = "AGE_GROUP_INVALID";
	json_object_set_member(pJsonObject, aGE_GROUP_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getSIZETYPEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sIZE_TYPE_INVALIDKey = "SIZE_TYPE_INVALID";
	json_object_set_member(pJsonObject, sIZE_TYPE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getSIZESYSTEMINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sIZE_SYSTEM_INVALIDKey = "SIZE_SYSTEM_INVALID";
	json_object_set_member(pJsonObject, sIZE_SYSTEM_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getLINKFORMATWARNING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lINK_FORMAT_WARNINGKey = "LINK_FORMAT_WARNING";
	json_object_set_member(pJsonObject, lINK_FORMAT_WARNINGKey, node);
	if (isprimitive("int")) {
		int obj = getDUPLICATEPRODUCTS();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dUPLICATE_PRODUCTSKey = "DUPLICATE_PRODUCTS";
	json_object_set_member(pJsonObject, dUPLICATE_PRODUCTSKey, node);
	if (isprimitive("int")) {
		int obj = getSALESPRICEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sALES_PRICE_INVALIDKey = "SALES_PRICE_INVALID";
	json_object_set_member(pJsonObject, sALES_PRICE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getPRODUCTCATEGORYDEPTHWARNING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pRODUCT_CATEGORY_DEPTH_WARNINGKey = "PRODUCT_CATEGORY_DEPTH_WARNING";
	json_object_set_member(pJsonObject, pRODUCT_CATEGORY_DEPTH_WARNINGKey, node);
	if (isprimitive("int")) {
		int obj = getADWORDSSAMEASLINK();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDWORDS_SAME_AS_LINKKey = "ADWORDS_SAME_AS_LINK";
	json_object_set_member(pJsonObject, aDWORDS_SAME_AS_LINKKey, node);
	if (isprimitive("int")) {
		int obj = getDUPLICATEHEADERS();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dUPLICATE_HEADERSKey = "DUPLICATE_HEADERS";
	json_object_set_member(pJsonObject, dUPLICATE_HEADERSKey, node);
	if (isprimitive("int")) {
		int obj = getFETCHSAMESIGNATURE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fETCH_SAME_SIGNATUREKey = "FETCH_SAME_SIGNATURE";
	json_object_set_member(pJsonObject, fETCH_SAME_SIGNATUREKey, node);
	if (isprimitive("int")) {
		int obj = getADWORDSFORMATWARNING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDWORDS_FORMAT_WARNINGKey = "ADWORDS_FORMAT_WARNING";
	json_object_set_member(pJsonObject, aDWORDS_FORMAT_WARNINGKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGELINKLENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONGKey = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getADDITIONALIMAGELINKWARNING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDDITIONAL_IMAGE_LINK_WARNINGKey = "ADDITIONAL_IMAGE_LINK_WARNING";
	json_object_set_member(pJsonObject, aDDITIONAL_IMAGE_LINK_WARNINGKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGELINKWARNING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_LINK_WARNINGKey = "IMAGE_LINK_WARNING";
	json_object_set_member(pJsonObject, iMAGE_LINK_WARNINGKey, node);
	if (isprimitive("int")) {
		int obj = getSHIPPINGINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sHIPPING_INVALIDKey = "SHIPPING_INVALID";
	json_object_set_member(pJsonObject, sHIPPING_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getTAXINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *tAX_INVALIDKey = "TAX_INVALID";
	json_object_set_member(pJsonObject, tAX_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getSHIPPINGWEIGHTINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sHIPPING_WEIGHT_INVALIDKey = "SHIPPING_WEIGHT_INVALID";
	json_object_set_member(pJsonObject, sHIPPING_WEIGHT_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getEXPIRATIONDATEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *eXPIRATION_DATE_INVALIDKey = "EXPIRATION_DATE_INVALID";
	json_object_set_member(pJsonObject, eXPIRATION_DATE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getAVAILABILITYDATEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aVAILABILITY_DATE_INVALIDKey = "AVAILABILITY_DATE_INVALID";
	json_object_set_member(pJsonObject, aVAILABILITY_DATE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getSALEDATEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sALE_DATE_INVALIDKey = "SALE_DATE_INVALID";
	json_object_set_member(pJsonObject, sALE_DATE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getWEIGHTUNITINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *wEIGHT_UNIT_INVALIDKey = "WEIGHT_UNIT_INVALID";
	json_object_set_member(pJsonObject, wEIGHT_UNIT_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getISBUNDLEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iS_BUNDLE_INVALIDKey = "IS_BUNDLE_INVALID";
	json_object_set_member(pJsonObject, iS_BUNDLE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getUPDATEDTIMEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *uPDATED_TIME_INVALIDKey = "UPDATED_TIME_INVALID";
	json_object_set_member(pJsonObject, uPDATED_TIME_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getCUSTOMLABELLENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cUSTOM_LABEL_LENGTH_TOO_LONGKey = "CUSTOM_LABEL_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getPRODUCTTYPELENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pRODUCT_TYPE_LENGTH_TOO_LONGKey = "PRODUCT_TYPE_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, pRODUCT_TYPE_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getTOOMANYADDITIONALIMAGELINKS();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *tOO_MANY_ADDITIONAL_IMAGE_LINKSKey = "TOO_MANY_ADDITIONAL_IMAGE_LINKS";
	json_object_set_member(pJsonObject, tOO_MANY_ADDITIONAL_IMAGE_LINKSKey, node);
	if (isprimitive("int")) {
		int obj = getMULTIPACKINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *mULTIPACK_INVALIDKey = "MULTIPACK_INVALID";
	json_object_set_member(pJsonObject, mULTIPACK_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getINDEXEDPRODUCTCOUNTLARGEDELTA();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iNDEXED_PRODUCT_COUNT_LARGE_DELTAKey = "INDEXED_PRODUCT_COUNT_LARGE_DELTA";
	json_object_set_member(pJsonObject, iNDEXED_PRODUCT_COUNT_LARGE_DELTAKey, node);
	if (isprimitive("int")) {
		int obj = getITEMADDITIONALIMAGEDOWNLOADFAILURE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE";
	json_object_set_member(pJsonObject, iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILUREKey, node);
	if (isprimitive("int")) {
		int obj = getOPTIONALPRODUCTCATEGORYMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *oPTIONAL_PRODUCT_CATEGORY_MISSINGKey = "OPTIONAL_PRODUCT_CATEGORY_MISSING";
	json_object_set_member(pJsonObject, oPTIONAL_PRODUCT_CATEGORY_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getOPTIONALPRODUCTCATEGORYINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *oPTIONAL_PRODUCT_CATEGORY_INVALIDKey = "OPTIONAL_PRODUCT_CATEGORY_INVALID";
	json_object_set_member(pJsonObject, oPTIONAL_PRODUCT_CATEGORY_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getOPTIONALCONDITIONMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *oPTIONAL_CONDITION_MISSINGKey = "OPTIONAL_CONDITION_MISSING";
	json_object_set_member(pJsonObject, oPTIONAL_CONDITION_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getOPTIONALCONDITIONINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *oPTIONAL_CONDITION_INVALIDKey = "OPTIONAL_CONDITION_INVALID";
	json_object_set_member(pJsonObject, oPTIONAL_CONDITION_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getIOSDEEPLINKINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iOS_DEEP_LINK_INVALIDKey = "IOS_DEEP_LINK_INVALID";
	json_object_set_member(pJsonObject, iOS_DEEP_LINK_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getANDROIDDEEPLINKINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aNDROID_DEEP_LINK_INVALIDKey = "ANDROID_DEEP_LINK_INVALID";
	json_object_set_member(pJsonObject, aNDROID_DEEP_LINK_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getAVAILABILITYNORMALIZED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aVAILABILITY_NORMALIZEDKey = "AVAILABILITY_NORMALIZED";
	json_object_set_member(pJsonObject, aVAILABILITY_NORMALIZEDKey, node);
	if (isprimitive("int")) {
		int obj = getCONDITIONNORMALIZED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cONDITION_NORMALIZEDKey = "CONDITION_NORMALIZED";
	json_object_set_member(pJsonObject, cONDITION_NORMALIZEDKey, node);
	if (isprimitive("int")) {
		int obj = getGENDERNORMALIZED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gENDER_NORMALIZEDKey = "GENDER_NORMALIZED";
	json_object_set_member(pJsonObject, gENDER_NORMALIZEDKey, node);
	if (isprimitive("int")) {
		int obj = getSIZETYPENORMALIZED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sIZE_TYPE_NORMALIZEDKey = "SIZE_TYPE_NORMALIZED";
	json_object_set_member(pJsonObject, sIZE_TYPE_NORMALIZEDKey, node);
	if (isprimitive("int")) {
		int obj = getAGEGROUPNORMALIZED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aGE_GROUP_NORMALIZEDKey = "AGE_GROUP_NORMALIZED";
	json_object_set_member(pJsonObject, aGE_GROUP_NORMALIZEDKey, node);
	if (isprimitive("int")) {
		int obj = getUTMSOURCEAUTOCORRECTED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *uTM_SOURCE_AUTO_CORRECTEDKey = "UTM_SOURCE_AUTO_CORRECTED";
	json_object_set_member(pJsonObject, uTM_SOURCE_AUTO_CORRECTEDKey, node);
	if (isprimitive("int")) {
		int obj = getCOUNTRYDOESNOTMAPTOCURRENCY();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cOUNTRY_DOES_NOT_MAP_TO_CURRENCYKey = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY";
	json_object_set_member(pJsonObject, cOUNTRY_DOES_NOT_MAP_TO_CURRENCYKey, node);
	if (isprimitive("int")) {
		int obj = getMINADPRICEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *mIN_AD_PRICE_INVALIDKey = "MIN_AD_PRICE_INVALID";
	json_object_set_member(pJsonObject, mIN_AD_PRICE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getGTININVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gTIN_INVALIDKey = "GTIN_INVALID";
	json_object_set_member(pJsonObject, gTIN_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getINCONSISTENTCURRENCYVALUES();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iNCONSISTENT_CURRENCY_VALUESKey = "INCONSISTENT_CURRENCY_VALUES";
	json_object_set_member(pJsonObject, iNCONSISTENT_CURRENCY_VALUESKey, node);
	if (isprimitive("int")) {
		int obj = getSALESPRICETOOLOW();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sALES_PRICE_TOO_LOWKey = "SALES_PRICE_TOO_LOW";
	json_object_set_member(pJsonObject, sALES_PRICE_TOO_LOWKey, node);
	if (isprimitive("int")) {
		int obj = getSHIPPINGWIDTHINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sHIPPING_WIDTH_INVALIDKey = "SHIPPING_WIDTH_INVALID";
	json_object_set_member(pJsonObject, sHIPPING_WIDTH_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getSHIPPINGHEIGHTINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sHIPPING_HEIGHT_INVALIDKey = "SHIPPING_HEIGHT_INVALID";
	json_object_set_member(pJsonObject, sHIPPING_HEIGHT_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getSALESPRICETOOHIGH();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *sALES_PRICE_TOO_HIGHKey = "SALES_PRICE_TOO_HIGH";
	json_object_set_member(pJsonObject, sALES_PRICE_TOO_HIGHKey, node);
	if (isprimitive("int")) {
		int obj = getMPNINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *mPN_INVALIDKey = "MPN_INVALID";
	json_object_set_member(pJsonObject, mPN_INVALIDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedValidationWarnings::getTITLELENGTHTOOLONG()
{
	return tITLE_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationWarnings::setTITLELENGTHTOOLONG(int  tITLE_LENGTH_TOO_LONG)
{
	this->tITLE_LENGTH_TOO_LONG = tITLE_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationWarnings::getDESCRIPTIONLENGTHTOOLONG()
{
	return dESCRIPTION_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationWarnings::setDESCRIPTIONLENGTHTOOLONG(int  dESCRIPTION_LENGTH_TOO_LONG)
{
	this->dESCRIPTION_LENGTH_TOO_LONG = dESCRIPTION_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationWarnings::getGENDERINVALID()
{
	return gENDER_INVALID;
}

void
CatalogsFeedValidationWarnings::setGENDERINVALID(int  gENDER_INVALID)
{
	this->gENDER_INVALID = gENDER_INVALID;
}

int
CatalogsFeedValidationWarnings::getAGEGROUPINVALID()
{
	return aGE_GROUP_INVALID;
}

void
CatalogsFeedValidationWarnings::setAGEGROUPINVALID(int  aGE_GROUP_INVALID)
{
	this->aGE_GROUP_INVALID = aGE_GROUP_INVALID;
}

int
CatalogsFeedValidationWarnings::getSIZETYPEINVALID()
{
	return sIZE_TYPE_INVALID;
}

void
CatalogsFeedValidationWarnings::setSIZETYPEINVALID(int  sIZE_TYPE_INVALID)
{
	this->sIZE_TYPE_INVALID = sIZE_TYPE_INVALID;
}

int
CatalogsFeedValidationWarnings::getSIZESYSTEMINVALID()
{
	return sIZE_SYSTEM_INVALID;
}

void
CatalogsFeedValidationWarnings::setSIZESYSTEMINVALID(int  sIZE_SYSTEM_INVALID)
{
	this->sIZE_SYSTEM_INVALID = sIZE_SYSTEM_INVALID;
}

int
CatalogsFeedValidationWarnings::getLINKFORMATWARNING()
{
	return lINK_FORMAT_WARNING;
}

void
CatalogsFeedValidationWarnings::setLINKFORMATWARNING(int  lINK_FORMAT_WARNING)
{
	this->lINK_FORMAT_WARNING = lINK_FORMAT_WARNING;
}

int
CatalogsFeedValidationWarnings::getDUPLICATEPRODUCTS()
{
	return dUPLICATE_PRODUCTS;
}

void
CatalogsFeedValidationWarnings::setDUPLICATEPRODUCTS(int  dUPLICATE_PRODUCTS)
{
	this->dUPLICATE_PRODUCTS = dUPLICATE_PRODUCTS;
}

int
CatalogsFeedValidationWarnings::getSALESPRICEINVALID()
{
	return sALES_PRICE_INVALID;
}

void
CatalogsFeedValidationWarnings::setSALESPRICEINVALID(int  sALES_PRICE_INVALID)
{
	this->sALES_PRICE_INVALID = sALES_PRICE_INVALID;
}

int
CatalogsFeedValidationWarnings::getPRODUCTCATEGORYDEPTHWARNING()
{
	return pRODUCT_CATEGORY_DEPTH_WARNING;
}

void
CatalogsFeedValidationWarnings::setPRODUCTCATEGORYDEPTHWARNING(int  pRODUCT_CATEGORY_DEPTH_WARNING)
{
	this->pRODUCT_CATEGORY_DEPTH_WARNING = pRODUCT_CATEGORY_DEPTH_WARNING;
}

int
CatalogsFeedValidationWarnings::getADWORDSSAMEASLINK()
{
	return aDWORDS_SAME_AS_LINK;
}

void
CatalogsFeedValidationWarnings::setADWORDSSAMEASLINK(int  aDWORDS_SAME_AS_LINK)
{
	this->aDWORDS_SAME_AS_LINK = aDWORDS_SAME_AS_LINK;
}

int
CatalogsFeedValidationWarnings::getDUPLICATEHEADERS()
{
	return dUPLICATE_HEADERS;
}

void
CatalogsFeedValidationWarnings::setDUPLICATEHEADERS(int  dUPLICATE_HEADERS)
{
	this->dUPLICATE_HEADERS = dUPLICATE_HEADERS;
}

int
CatalogsFeedValidationWarnings::getFETCHSAMESIGNATURE()
{
	return fETCH_SAME_SIGNATURE;
}

void
CatalogsFeedValidationWarnings::setFETCHSAMESIGNATURE(int  fETCH_SAME_SIGNATURE)
{
	this->fETCH_SAME_SIGNATURE = fETCH_SAME_SIGNATURE;
}

int
CatalogsFeedValidationWarnings::getADWORDSFORMATWARNING()
{
	return aDWORDS_FORMAT_WARNING;
}

void
CatalogsFeedValidationWarnings::setADWORDSFORMATWARNING(int  aDWORDS_FORMAT_WARNING)
{
	this->aDWORDS_FORMAT_WARNING = aDWORDS_FORMAT_WARNING;
}

int
CatalogsFeedValidationWarnings::getADDITIONALIMAGELINKLENGTHTOOLONG()
{
	return aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationWarnings::setADDITIONALIMAGELINKLENGTHTOOLONG(int  aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG)
{
	this->aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG = aDDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationWarnings::getADDITIONALIMAGELINKWARNING()
{
	return aDDITIONAL_IMAGE_LINK_WARNING;
}

void
CatalogsFeedValidationWarnings::setADDITIONALIMAGELINKWARNING(int  aDDITIONAL_IMAGE_LINK_WARNING)
{
	this->aDDITIONAL_IMAGE_LINK_WARNING = aDDITIONAL_IMAGE_LINK_WARNING;
}

int
CatalogsFeedValidationWarnings::getIMAGELINKWARNING()
{
	return iMAGE_LINK_WARNING;
}

void
CatalogsFeedValidationWarnings::setIMAGELINKWARNING(int  iMAGE_LINK_WARNING)
{
	this->iMAGE_LINK_WARNING = iMAGE_LINK_WARNING;
}

int
CatalogsFeedValidationWarnings::getSHIPPINGINVALID()
{
	return sHIPPING_INVALID;
}

void
CatalogsFeedValidationWarnings::setSHIPPINGINVALID(int  sHIPPING_INVALID)
{
	this->sHIPPING_INVALID = sHIPPING_INVALID;
}

int
CatalogsFeedValidationWarnings::getTAXINVALID()
{
	return tAX_INVALID;
}

void
CatalogsFeedValidationWarnings::setTAXINVALID(int  tAX_INVALID)
{
	this->tAX_INVALID = tAX_INVALID;
}

int
CatalogsFeedValidationWarnings::getSHIPPINGWEIGHTINVALID()
{
	return sHIPPING_WEIGHT_INVALID;
}

void
CatalogsFeedValidationWarnings::setSHIPPINGWEIGHTINVALID(int  sHIPPING_WEIGHT_INVALID)
{
	this->sHIPPING_WEIGHT_INVALID = sHIPPING_WEIGHT_INVALID;
}

int
CatalogsFeedValidationWarnings::getEXPIRATIONDATEINVALID()
{
	return eXPIRATION_DATE_INVALID;
}

void
CatalogsFeedValidationWarnings::setEXPIRATIONDATEINVALID(int  eXPIRATION_DATE_INVALID)
{
	this->eXPIRATION_DATE_INVALID = eXPIRATION_DATE_INVALID;
}

int
CatalogsFeedValidationWarnings::getAVAILABILITYDATEINVALID()
{
	return aVAILABILITY_DATE_INVALID;
}

void
CatalogsFeedValidationWarnings::setAVAILABILITYDATEINVALID(int  aVAILABILITY_DATE_INVALID)
{
	this->aVAILABILITY_DATE_INVALID = aVAILABILITY_DATE_INVALID;
}

int
CatalogsFeedValidationWarnings::getSALEDATEINVALID()
{
	return sALE_DATE_INVALID;
}

void
CatalogsFeedValidationWarnings::setSALEDATEINVALID(int  sALE_DATE_INVALID)
{
	this->sALE_DATE_INVALID = sALE_DATE_INVALID;
}

int
CatalogsFeedValidationWarnings::getWEIGHTUNITINVALID()
{
	return wEIGHT_UNIT_INVALID;
}

void
CatalogsFeedValidationWarnings::setWEIGHTUNITINVALID(int  wEIGHT_UNIT_INVALID)
{
	this->wEIGHT_UNIT_INVALID = wEIGHT_UNIT_INVALID;
}

int
CatalogsFeedValidationWarnings::getISBUNDLEINVALID()
{
	return iS_BUNDLE_INVALID;
}

void
CatalogsFeedValidationWarnings::setISBUNDLEINVALID(int  iS_BUNDLE_INVALID)
{
	this->iS_BUNDLE_INVALID = iS_BUNDLE_INVALID;
}

int
CatalogsFeedValidationWarnings::getUPDATEDTIMEINVALID()
{
	return uPDATED_TIME_INVALID;
}

void
CatalogsFeedValidationWarnings::setUPDATEDTIMEINVALID(int  uPDATED_TIME_INVALID)
{
	this->uPDATED_TIME_INVALID = uPDATED_TIME_INVALID;
}

int
CatalogsFeedValidationWarnings::getCUSTOMLABELLENGTHTOOLONG()
{
	return cUSTOM_LABEL_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationWarnings::setCUSTOMLABELLENGTHTOOLONG(int  cUSTOM_LABEL_LENGTH_TOO_LONG)
{
	this->cUSTOM_LABEL_LENGTH_TOO_LONG = cUSTOM_LABEL_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationWarnings::getPRODUCTTYPELENGTHTOOLONG()
{
	return pRODUCT_TYPE_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationWarnings::setPRODUCTTYPELENGTHTOOLONG(int  pRODUCT_TYPE_LENGTH_TOO_LONG)
{
	this->pRODUCT_TYPE_LENGTH_TOO_LONG = pRODUCT_TYPE_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationWarnings::getTOOMANYADDITIONALIMAGELINKS()
{
	return tOO_MANY_ADDITIONAL_IMAGE_LINKS;
}

void
CatalogsFeedValidationWarnings::setTOOMANYADDITIONALIMAGELINKS(int  tOO_MANY_ADDITIONAL_IMAGE_LINKS)
{
	this->tOO_MANY_ADDITIONAL_IMAGE_LINKS = tOO_MANY_ADDITIONAL_IMAGE_LINKS;
}

int
CatalogsFeedValidationWarnings::getMULTIPACKINVALID()
{
	return mULTIPACK_INVALID;
}

void
CatalogsFeedValidationWarnings::setMULTIPACKINVALID(int  mULTIPACK_INVALID)
{
	this->mULTIPACK_INVALID = mULTIPACK_INVALID;
}

int
CatalogsFeedValidationWarnings::getINDEXEDPRODUCTCOUNTLARGEDELTA()
{
	return iNDEXED_PRODUCT_COUNT_LARGE_DELTA;
}

void
CatalogsFeedValidationWarnings::setINDEXEDPRODUCTCOUNTLARGEDELTA(int  iNDEXED_PRODUCT_COUNT_LARGE_DELTA)
{
	this->iNDEXED_PRODUCT_COUNT_LARGE_DELTA = iNDEXED_PRODUCT_COUNT_LARGE_DELTA;
}

int
CatalogsFeedValidationWarnings::getITEMADDITIONALIMAGEDOWNLOADFAILURE()
{
	return iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
}

void
CatalogsFeedValidationWarnings::setITEMADDITIONALIMAGEDOWNLOADFAILURE(int  iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE)
{
	this->iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE = iTEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE;
}

int
CatalogsFeedValidationWarnings::getOPTIONALPRODUCTCATEGORYMISSING()
{
	return oPTIONAL_PRODUCT_CATEGORY_MISSING;
}

void
CatalogsFeedValidationWarnings::setOPTIONALPRODUCTCATEGORYMISSING(int  oPTIONAL_PRODUCT_CATEGORY_MISSING)
{
	this->oPTIONAL_PRODUCT_CATEGORY_MISSING = oPTIONAL_PRODUCT_CATEGORY_MISSING;
}

int
CatalogsFeedValidationWarnings::getOPTIONALPRODUCTCATEGORYINVALID()
{
	return oPTIONAL_PRODUCT_CATEGORY_INVALID;
}

void
CatalogsFeedValidationWarnings::setOPTIONALPRODUCTCATEGORYINVALID(int  oPTIONAL_PRODUCT_CATEGORY_INVALID)
{
	this->oPTIONAL_PRODUCT_CATEGORY_INVALID = oPTIONAL_PRODUCT_CATEGORY_INVALID;
}

int
CatalogsFeedValidationWarnings::getOPTIONALCONDITIONMISSING()
{
	return oPTIONAL_CONDITION_MISSING;
}

void
CatalogsFeedValidationWarnings::setOPTIONALCONDITIONMISSING(int  oPTIONAL_CONDITION_MISSING)
{
	this->oPTIONAL_CONDITION_MISSING = oPTIONAL_CONDITION_MISSING;
}

int
CatalogsFeedValidationWarnings::getOPTIONALCONDITIONINVALID()
{
	return oPTIONAL_CONDITION_INVALID;
}

void
CatalogsFeedValidationWarnings::setOPTIONALCONDITIONINVALID(int  oPTIONAL_CONDITION_INVALID)
{
	this->oPTIONAL_CONDITION_INVALID = oPTIONAL_CONDITION_INVALID;
}

int
CatalogsFeedValidationWarnings::getIOSDEEPLINKINVALID()
{
	return iOS_DEEP_LINK_INVALID;
}

void
CatalogsFeedValidationWarnings::setIOSDEEPLINKINVALID(int  iOS_DEEP_LINK_INVALID)
{
	this->iOS_DEEP_LINK_INVALID = iOS_DEEP_LINK_INVALID;
}

int
CatalogsFeedValidationWarnings::getANDROIDDEEPLINKINVALID()
{
	return aNDROID_DEEP_LINK_INVALID;
}

void
CatalogsFeedValidationWarnings::setANDROIDDEEPLINKINVALID(int  aNDROID_DEEP_LINK_INVALID)
{
	this->aNDROID_DEEP_LINK_INVALID = aNDROID_DEEP_LINK_INVALID;
}

int
CatalogsFeedValidationWarnings::getAVAILABILITYNORMALIZED()
{
	return aVAILABILITY_NORMALIZED;
}

void
CatalogsFeedValidationWarnings::setAVAILABILITYNORMALIZED(int  aVAILABILITY_NORMALIZED)
{
	this->aVAILABILITY_NORMALIZED = aVAILABILITY_NORMALIZED;
}

int
CatalogsFeedValidationWarnings::getCONDITIONNORMALIZED()
{
	return cONDITION_NORMALIZED;
}

void
CatalogsFeedValidationWarnings::setCONDITIONNORMALIZED(int  cONDITION_NORMALIZED)
{
	this->cONDITION_NORMALIZED = cONDITION_NORMALIZED;
}

int
CatalogsFeedValidationWarnings::getGENDERNORMALIZED()
{
	return gENDER_NORMALIZED;
}

void
CatalogsFeedValidationWarnings::setGENDERNORMALIZED(int  gENDER_NORMALIZED)
{
	this->gENDER_NORMALIZED = gENDER_NORMALIZED;
}

int
CatalogsFeedValidationWarnings::getSIZETYPENORMALIZED()
{
	return sIZE_TYPE_NORMALIZED;
}

void
CatalogsFeedValidationWarnings::setSIZETYPENORMALIZED(int  sIZE_TYPE_NORMALIZED)
{
	this->sIZE_TYPE_NORMALIZED = sIZE_TYPE_NORMALIZED;
}

int
CatalogsFeedValidationWarnings::getAGEGROUPNORMALIZED()
{
	return aGE_GROUP_NORMALIZED;
}

void
CatalogsFeedValidationWarnings::setAGEGROUPNORMALIZED(int  aGE_GROUP_NORMALIZED)
{
	this->aGE_GROUP_NORMALIZED = aGE_GROUP_NORMALIZED;
}

int
CatalogsFeedValidationWarnings::getUTMSOURCEAUTOCORRECTED()
{
	return uTM_SOURCE_AUTO_CORRECTED;
}

void
CatalogsFeedValidationWarnings::setUTMSOURCEAUTOCORRECTED(int  uTM_SOURCE_AUTO_CORRECTED)
{
	this->uTM_SOURCE_AUTO_CORRECTED = uTM_SOURCE_AUTO_CORRECTED;
}

int
CatalogsFeedValidationWarnings::getCOUNTRYDOESNOTMAPTOCURRENCY()
{
	return cOUNTRY_DOES_NOT_MAP_TO_CURRENCY;
}

void
CatalogsFeedValidationWarnings::setCOUNTRYDOESNOTMAPTOCURRENCY(int  cOUNTRY_DOES_NOT_MAP_TO_CURRENCY)
{
	this->cOUNTRY_DOES_NOT_MAP_TO_CURRENCY = cOUNTRY_DOES_NOT_MAP_TO_CURRENCY;
}

int
CatalogsFeedValidationWarnings::getMINADPRICEINVALID()
{
	return mIN_AD_PRICE_INVALID;
}

void
CatalogsFeedValidationWarnings::setMINADPRICEINVALID(int  mIN_AD_PRICE_INVALID)
{
	this->mIN_AD_PRICE_INVALID = mIN_AD_PRICE_INVALID;
}

int
CatalogsFeedValidationWarnings::getGTININVALID()
{
	return gTIN_INVALID;
}

void
CatalogsFeedValidationWarnings::setGTININVALID(int  gTIN_INVALID)
{
	this->gTIN_INVALID = gTIN_INVALID;
}

int
CatalogsFeedValidationWarnings::getINCONSISTENTCURRENCYVALUES()
{
	return iNCONSISTENT_CURRENCY_VALUES;
}

void
CatalogsFeedValidationWarnings::setINCONSISTENTCURRENCYVALUES(int  iNCONSISTENT_CURRENCY_VALUES)
{
	this->iNCONSISTENT_CURRENCY_VALUES = iNCONSISTENT_CURRENCY_VALUES;
}

int
CatalogsFeedValidationWarnings::getSALESPRICETOOLOW()
{
	return sALES_PRICE_TOO_LOW;
}

void
CatalogsFeedValidationWarnings::setSALESPRICETOOLOW(int  sALES_PRICE_TOO_LOW)
{
	this->sALES_PRICE_TOO_LOW = sALES_PRICE_TOO_LOW;
}

int
CatalogsFeedValidationWarnings::getSHIPPINGWIDTHINVALID()
{
	return sHIPPING_WIDTH_INVALID;
}

void
CatalogsFeedValidationWarnings::setSHIPPINGWIDTHINVALID(int  sHIPPING_WIDTH_INVALID)
{
	this->sHIPPING_WIDTH_INVALID = sHIPPING_WIDTH_INVALID;
}

int
CatalogsFeedValidationWarnings::getSHIPPINGHEIGHTINVALID()
{
	return sHIPPING_HEIGHT_INVALID;
}

void
CatalogsFeedValidationWarnings::setSHIPPINGHEIGHTINVALID(int  sHIPPING_HEIGHT_INVALID)
{
	this->sHIPPING_HEIGHT_INVALID = sHIPPING_HEIGHT_INVALID;
}

int
CatalogsFeedValidationWarnings::getSALESPRICETOOHIGH()
{
	return sALES_PRICE_TOO_HIGH;
}

void
CatalogsFeedValidationWarnings::setSALESPRICETOOHIGH(int  sALES_PRICE_TOO_HIGH)
{
	this->sALES_PRICE_TOO_HIGH = sALES_PRICE_TOO_HIGH;
}

int
CatalogsFeedValidationWarnings::getMPNINVALID()
{
	return mPN_INVALID;
}

void
CatalogsFeedValidationWarnings::setMPNINVALID(int  mPN_INVALID)
{
	this->mPN_INVALID = mPN_INVALID;
}


