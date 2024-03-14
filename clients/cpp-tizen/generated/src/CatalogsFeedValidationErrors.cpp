#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedValidationErrors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedValidationErrors::CatalogsFeedValidationErrors()
{
	//__init();
}

CatalogsFeedValidationErrors::~CatalogsFeedValidationErrors()
{
	//__cleanup();
}

void
CatalogsFeedValidationErrors::__init()
{
	//fETCH_ERROR = int(0);
	//fETCH_INACTIVE_FEED_ERROR = int(0);
	//eNCODING_ERROR = int(0);
	//dELIMITER_ERROR = int(0);
	//rEQUIRED_COLUMNS_MISSING = int(0);
	//iMAGE_LINK_INVALID = int(0);
	//iTEMID_MISSING = int(0);
	//tITLE_MISSING = int(0);
	//dESCRIPTION_MISSING = int(0);
	//pRODUCT_LINK_MISSING = int(0);
	//iMAGE_LINK_MISSING = int(0);
	//aVAILABILITY_INVALID = int(0);
	//pRODUCT_PRICE_INVALID = int(0);
	//lINK_FORMAT_INVALID = int(0);
	//pARSE_LINE_ERROR = int(0);
	//aDWORDS_FORMAT_INVALID = int(0);
	//iNTERNAL_SERVICE_ERROR = int(0);
	//nO_VERIFIED_DOMAIN = int(0);
	//aDULT_INVALID = int(0);
	//iMAGE_LINK_LENGTH_TOO_LONG = int(0);
	//iNVALID_DOMAIN = int(0);
	//fEED_LENGTH_TOO_LONG = int(0);
	//lINK_LENGTH_TOO_LONG = int(0);
	//mALFORMED_XML = int(0);
	//pRICE_MISSING = int(0);
	//fEED_TOO_SMALL = int(0);
	//mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = int(0);
	//iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = int(0);
	//pINJOIN_CONTENT_UNSAFE = int(0);
	//bLOCKLISTED_IMAGE_SIGNATURE = int(0);
	//lIST_PRICE_INVALID = int(0);
	//pRICE_CANNOT_BE_DETERMINED = int(0);
}

void
CatalogsFeedValidationErrors::__cleanup()
{
	//if(fETCH_ERROR != NULL) {
	//
	//delete fETCH_ERROR;
	//fETCH_ERROR = NULL;
	//}
	//if(fETCH_INACTIVE_FEED_ERROR != NULL) {
	//
	//delete fETCH_INACTIVE_FEED_ERROR;
	//fETCH_INACTIVE_FEED_ERROR = NULL;
	//}
	//if(eNCODING_ERROR != NULL) {
	//
	//delete eNCODING_ERROR;
	//eNCODING_ERROR = NULL;
	//}
	//if(dELIMITER_ERROR != NULL) {
	//
	//delete dELIMITER_ERROR;
	//dELIMITER_ERROR = NULL;
	//}
	//if(rEQUIRED_COLUMNS_MISSING != NULL) {
	//
	//delete rEQUIRED_COLUMNS_MISSING;
	//rEQUIRED_COLUMNS_MISSING = NULL;
	//}
	//if(iMAGE_LINK_INVALID != NULL) {
	//
	//delete iMAGE_LINK_INVALID;
	//iMAGE_LINK_INVALID = NULL;
	//}
	//if(iTEMID_MISSING != NULL) {
	//
	//delete iTEMID_MISSING;
	//iTEMID_MISSING = NULL;
	//}
	//if(tITLE_MISSING != NULL) {
	//
	//delete tITLE_MISSING;
	//tITLE_MISSING = NULL;
	//}
	//if(dESCRIPTION_MISSING != NULL) {
	//
	//delete dESCRIPTION_MISSING;
	//dESCRIPTION_MISSING = NULL;
	//}
	//if(pRODUCT_LINK_MISSING != NULL) {
	//
	//delete pRODUCT_LINK_MISSING;
	//pRODUCT_LINK_MISSING = NULL;
	//}
	//if(iMAGE_LINK_MISSING != NULL) {
	//
	//delete iMAGE_LINK_MISSING;
	//iMAGE_LINK_MISSING = NULL;
	//}
	//if(aVAILABILITY_INVALID != NULL) {
	//
	//delete aVAILABILITY_INVALID;
	//aVAILABILITY_INVALID = NULL;
	//}
	//if(pRODUCT_PRICE_INVALID != NULL) {
	//
	//delete pRODUCT_PRICE_INVALID;
	//pRODUCT_PRICE_INVALID = NULL;
	//}
	//if(lINK_FORMAT_INVALID != NULL) {
	//
	//delete lINK_FORMAT_INVALID;
	//lINK_FORMAT_INVALID = NULL;
	//}
	//if(pARSE_LINE_ERROR != NULL) {
	//
	//delete pARSE_LINE_ERROR;
	//pARSE_LINE_ERROR = NULL;
	//}
	//if(aDWORDS_FORMAT_INVALID != NULL) {
	//
	//delete aDWORDS_FORMAT_INVALID;
	//aDWORDS_FORMAT_INVALID = NULL;
	//}
	//if(iNTERNAL_SERVICE_ERROR != NULL) {
	//
	//delete iNTERNAL_SERVICE_ERROR;
	//iNTERNAL_SERVICE_ERROR = NULL;
	//}
	//if(nO_VERIFIED_DOMAIN != NULL) {
	//
	//delete nO_VERIFIED_DOMAIN;
	//nO_VERIFIED_DOMAIN = NULL;
	//}
	//if(aDULT_INVALID != NULL) {
	//
	//delete aDULT_INVALID;
	//aDULT_INVALID = NULL;
	//}
	//if(iMAGE_LINK_LENGTH_TOO_LONG != NULL) {
	//
	//delete iMAGE_LINK_LENGTH_TOO_LONG;
	//iMAGE_LINK_LENGTH_TOO_LONG = NULL;
	//}
	//if(iNVALID_DOMAIN != NULL) {
	//
	//delete iNVALID_DOMAIN;
	//iNVALID_DOMAIN = NULL;
	//}
	//if(fEED_LENGTH_TOO_LONG != NULL) {
	//
	//delete fEED_LENGTH_TOO_LONG;
	//fEED_LENGTH_TOO_LONG = NULL;
	//}
	//if(lINK_LENGTH_TOO_LONG != NULL) {
	//
	//delete lINK_LENGTH_TOO_LONG;
	//lINK_LENGTH_TOO_LONG = NULL;
	//}
	//if(mALFORMED_XML != NULL) {
	//
	//delete mALFORMED_XML;
	//mALFORMED_XML = NULL;
	//}
	//if(pRICE_MISSING != NULL) {
	//
	//delete pRICE_MISSING;
	//pRICE_MISSING = NULL;
	//}
	//if(fEED_TOO_SMALL != NULL) {
	//
	//delete fEED_TOO_SMALL;
	//fEED_TOO_SMALL = NULL;
	//}
	//if(mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED != NULL) {
	//
	//delete mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
	//mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = NULL;
	//}
	//if(iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE != NULL) {
	//
	//delete iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
	//iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = NULL;
	//}
	//if(pINJOIN_CONTENT_UNSAFE != NULL) {
	//
	//delete pINJOIN_CONTENT_UNSAFE;
	//pINJOIN_CONTENT_UNSAFE = NULL;
	//}
	//if(bLOCKLISTED_IMAGE_SIGNATURE != NULL) {
	//
	//delete bLOCKLISTED_IMAGE_SIGNATURE;
	//bLOCKLISTED_IMAGE_SIGNATURE = NULL;
	//}
	//if(lIST_PRICE_INVALID != NULL) {
	//
	//delete lIST_PRICE_INVALID;
	//lIST_PRICE_INVALID = NULL;
	//}
	//if(pRICE_CANNOT_BE_DETERMINED != NULL) {
	//
	//delete pRICE_CANNOT_BE_DETERMINED;
	//pRICE_CANNOT_BE_DETERMINED = NULL;
	//}
	//
}

void
CatalogsFeedValidationErrors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fETCH_ERRORKey = "FETCH_ERROR";
	node = json_object_get_member(pJsonObject, fETCH_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fETCH_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *fETCH_INACTIVE_FEED_ERRORKey = "FETCH_INACTIVE_FEED_ERROR";
	node = json_object_get_member(pJsonObject, fETCH_INACTIVE_FEED_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fETCH_INACTIVE_FEED_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *eNCODING_ERRORKey = "ENCODING_ERROR";
	node = json_object_get_member(pJsonObject, eNCODING_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&eNCODING_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *dELIMITER_ERRORKey = "DELIMITER_ERROR";
	node = json_object_get_member(pJsonObject, dELIMITER_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&dELIMITER_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *rEQUIRED_COLUMNS_MISSINGKey = "REQUIRED_COLUMNS_MISSING";
	node = json_object_get_member(pJsonObject, rEQUIRED_COLUMNS_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rEQUIRED_COLUMNS_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_LINK_INVALIDKey = "IMAGE_LINK_INVALID";
	node = json_object_get_member(pJsonObject, iMAGE_LINK_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_LINK_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *iTEMID_MISSINGKey = "ITEMID_MISSING";
	node = json_object_get_member(pJsonObject, iTEMID_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iTEMID_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *tITLE_MISSINGKey = "TITLE_MISSING";
	node = json_object_get_member(pJsonObject, tITLE_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&tITLE_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *dESCRIPTION_MISSINGKey = "DESCRIPTION_MISSING";
	node = json_object_get_member(pJsonObject, dESCRIPTION_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&dESCRIPTION_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *pRODUCT_LINK_MISSINGKey = "PRODUCT_LINK_MISSING";
	node = json_object_get_member(pJsonObject, pRODUCT_LINK_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pRODUCT_LINK_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_LINK_MISSINGKey = "IMAGE_LINK_MISSING";
	node = json_object_get_member(pJsonObject, iMAGE_LINK_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_LINK_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *aVAILABILITY_INVALIDKey = "AVAILABILITY_INVALID";
	node = json_object_get_member(pJsonObject, aVAILABILITY_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aVAILABILITY_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *pRODUCT_PRICE_INVALIDKey = "PRODUCT_PRICE_INVALID";
	node = json_object_get_member(pJsonObject, pRODUCT_PRICE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pRODUCT_PRICE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *lINK_FORMAT_INVALIDKey = "LINK_FORMAT_INVALID";
	node = json_object_get_member(pJsonObject, lINK_FORMAT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lINK_FORMAT_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *pARSE_LINE_ERRORKey = "PARSE_LINE_ERROR";
	node = json_object_get_member(pJsonObject, pARSE_LINE_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pARSE_LINE_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDWORDS_FORMAT_INVALIDKey = "ADWORDS_FORMAT_INVALID";
	node = json_object_get_member(pJsonObject, aDWORDS_FORMAT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDWORDS_FORMAT_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *iNTERNAL_SERVICE_ERRORKey = "INTERNAL_SERVICE_ERROR";
	node = json_object_get_member(pJsonObject, iNTERNAL_SERVICE_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iNTERNAL_SERVICE_ERROR, node, "int", "");
		} else {
			
		}
	}
	const gchar *nO_VERIFIED_DOMAINKey = "NO_VERIFIED_DOMAIN";
	node = json_object_get_member(pJsonObject, nO_VERIFIED_DOMAINKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&nO_VERIFIED_DOMAIN, node, "int", "");
		} else {
			
		}
	}
	const gchar *aDULT_INVALIDKey = "ADULT_INVALID";
	node = json_object_get_member(pJsonObject, aDULT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aDULT_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *iMAGE_LINK_LENGTH_TOO_LONGKey = "IMAGE_LINK_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, iMAGE_LINK_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iMAGE_LINK_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *iNVALID_DOMAINKey = "INVALID_DOMAIN";
	node = json_object_get_member(pJsonObject, iNVALID_DOMAINKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iNVALID_DOMAIN, node, "int", "");
		} else {
			
		}
	}
	const gchar *fEED_LENGTH_TOO_LONGKey = "FEED_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, fEED_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fEED_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *lINK_LENGTH_TOO_LONGKey = "LINK_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, lINK_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lINK_LENGTH_TOO_LONG, node, "int", "");
		} else {
			
		}
	}
	const gchar *mALFORMED_XMLKey = "MALFORMED_XML";
	node = json_object_get_member(pJsonObject, mALFORMED_XMLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&mALFORMED_XML, node, "int", "");
		} else {
			
		}
	}
	const gchar *pRICE_MISSINGKey = "PRICE_MISSING";
	node = json_object_get_member(pJsonObject, pRICE_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pRICE_MISSING, node, "int", "");
		} else {
			
		}
	}
	const gchar *fEED_TOO_SMALLKey = "FEED_TOO_SMALL";
	node = json_object_get_member(pJsonObject, fEED_TOO_SMALLKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&fEED_TOO_SMALL, node, "int", "");
		} else {
			
		}
	}
	const gchar *mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";
	node = json_object_get_member(pJsonObject, mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, node, "int", "");
		} else {
			
		}
	}
	const gchar *iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";
	node = json_object_get_member(pJsonObject, iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE, node, "int", "");
		} else {
			
		}
	}
	const gchar *pINJOIN_CONTENT_UNSAFEKey = "PINJOIN_CONTENT_UNSAFE";
	node = json_object_get_member(pJsonObject, pINJOIN_CONTENT_UNSAFEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pINJOIN_CONTENT_UNSAFE, node, "int", "");
		} else {
			
		}
	}
	const gchar *bLOCKLISTED_IMAGE_SIGNATUREKey = "BLOCKLISTED_IMAGE_SIGNATURE";
	node = json_object_get_member(pJsonObject, bLOCKLISTED_IMAGE_SIGNATUREKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bLOCKLISTED_IMAGE_SIGNATURE, node, "int", "");
		} else {
			
		}
	}
	const gchar *lIST_PRICE_INVALIDKey = "LIST_PRICE_INVALID";
	node = json_object_get_member(pJsonObject, lIST_PRICE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lIST_PRICE_INVALID, node, "int", "");
		} else {
			
		}
	}
	const gchar *pRICE_CANNOT_BE_DETERMINEDKey = "PRICE_CANNOT_BE_DETERMINED";
	node = json_object_get_member(pJsonObject, pRICE_CANNOT_BE_DETERMINEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pRICE_CANNOT_BE_DETERMINED, node, "int", "");
		} else {
			
		}
	}
}

CatalogsFeedValidationErrors::CatalogsFeedValidationErrors(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedValidationErrors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getFETCHERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fETCH_ERRORKey = "FETCH_ERROR";
	json_object_set_member(pJsonObject, fETCH_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getFETCHINACTIVEFEEDERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fETCH_INACTIVE_FEED_ERRORKey = "FETCH_INACTIVE_FEED_ERROR";
	json_object_set_member(pJsonObject, fETCH_INACTIVE_FEED_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getENCODINGERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *eNCODING_ERRORKey = "ENCODING_ERROR";
	json_object_set_member(pJsonObject, eNCODING_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getDELIMITERERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dELIMITER_ERRORKey = "DELIMITER_ERROR";
	json_object_set_member(pJsonObject, dELIMITER_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getREQUIREDCOLUMNSMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rEQUIRED_COLUMNS_MISSINGKey = "REQUIRED_COLUMNS_MISSING";
	json_object_set_member(pJsonObject, rEQUIRED_COLUMNS_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGELINKINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_LINK_INVALIDKey = "IMAGE_LINK_INVALID";
	json_object_set_member(pJsonObject, iMAGE_LINK_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getITEMIDMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iTEMID_MISSINGKey = "ITEMID_MISSING";
	json_object_set_member(pJsonObject, iTEMID_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getTITLEMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *tITLE_MISSINGKey = "TITLE_MISSING";
	json_object_set_member(pJsonObject, tITLE_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getDESCRIPTIONMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dESCRIPTION_MISSINGKey = "DESCRIPTION_MISSING";
	json_object_set_member(pJsonObject, dESCRIPTION_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getPRODUCTLINKMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pRODUCT_LINK_MISSINGKey = "PRODUCT_LINK_MISSING";
	json_object_set_member(pJsonObject, pRODUCT_LINK_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGELINKMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_LINK_MISSINGKey = "IMAGE_LINK_MISSING";
	json_object_set_member(pJsonObject, iMAGE_LINK_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getAVAILABILITYINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aVAILABILITY_INVALIDKey = "AVAILABILITY_INVALID";
	json_object_set_member(pJsonObject, aVAILABILITY_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getPRODUCTPRICEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pRODUCT_PRICE_INVALIDKey = "PRODUCT_PRICE_INVALID";
	json_object_set_member(pJsonObject, pRODUCT_PRICE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getLINKFORMATINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lINK_FORMAT_INVALIDKey = "LINK_FORMAT_INVALID";
	json_object_set_member(pJsonObject, lINK_FORMAT_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getPARSELINEERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pARSE_LINE_ERRORKey = "PARSE_LINE_ERROR";
	json_object_set_member(pJsonObject, pARSE_LINE_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getADWORDSFORMATINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDWORDS_FORMAT_INVALIDKey = "ADWORDS_FORMAT_INVALID";
	json_object_set_member(pJsonObject, aDWORDS_FORMAT_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getINTERNALSERVICEERROR();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iNTERNAL_SERVICE_ERRORKey = "INTERNAL_SERVICE_ERROR";
	json_object_set_member(pJsonObject, iNTERNAL_SERVICE_ERRORKey, node);
	if (isprimitive("int")) {
		int obj = getNOVERIFIEDDOMAIN();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *nO_VERIFIED_DOMAINKey = "NO_VERIFIED_DOMAIN";
	json_object_set_member(pJsonObject, nO_VERIFIED_DOMAINKey, node);
	if (isprimitive("int")) {
		int obj = getADULTINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aDULT_INVALIDKey = "ADULT_INVALID";
	json_object_set_member(pJsonObject, aDULT_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getIMAGELINKLENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iMAGE_LINK_LENGTH_TOO_LONGKey = "IMAGE_LINK_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, iMAGE_LINK_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getINVALIDDOMAIN();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iNVALID_DOMAINKey = "INVALID_DOMAIN";
	json_object_set_member(pJsonObject, iNVALID_DOMAINKey, node);
	if (isprimitive("int")) {
		int obj = getFEEDLENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fEED_LENGTH_TOO_LONGKey = "FEED_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, fEED_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getLINKLENGTHTOOLONG();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lINK_LENGTH_TOO_LONGKey = "LINK_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, lINK_LENGTH_TOO_LONGKey, node);
	if (isprimitive("int")) {
		int obj = getMALFORMEDXML();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *mALFORMED_XMLKey = "MALFORMED_XML";
	json_object_set_member(pJsonObject, mALFORMED_XMLKey, node);
	if (isprimitive("int")) {
		int obj = getPRICEMISSING();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pRICE_MISSINGKey = "PRICE_MISSING";
	json_object_set_member(pJsonObject, pRICE_MISSINGKey, node);
	if (isprimitive("int")) {
		int obj = getFEEDTOOSMALL();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *fEED_TOO_SMALLKey = "FEED_TOO_SMALL";
	json_object_set_member(pJsonObject, fEED_TOO_SMALLKey, node);
	if (isprimitive("int")) {
		int obj = getMAXITEMSPERITEMGROUPEXCEEDED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";
	json_object_set_member(pJsonObject, mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey, node);
	if (isprimitive("int")) {
		int obj = getITEMMAINIMAGEDOWNLOADFAILURE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";
	json_object_set_member(pJsonObject, iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey, node);
	if (isprimitive("int")) {
		int obj = getPINJOINCONTENTUNSAFE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pINJOIN_CONTENT_UNSAFEKey = "PINJOIN_CONTENT_UNSAFE";
	json_object_set_member(pJsonObject, pINJOIN_CONTENT_UNSAFEKey, node);
	if (isprimitive("int")) {
		int obj = getBLOCKLISTEDIMAGESIGNATURE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bLOCKLISTED_IMAGE_SIGNATUREKey = "BLOCKLISTED_IMAGE_SIGNATURE";
	json_object_set_member(pJsonObject, bLOCKLISTED_IMAGE_SIGNATUREKey, node);
	if (isprimitive("int")) {
		int obj = getLISTPRICEINVALID();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lIST_PRICE_INVALIDKey = "LIST_PRICE_INVALID";
	json_object_set_member(pJsonObject, lIST_PRICE_INVALIDKey, node);
	if (isprimitive("int")) {
		int obj = getPRICECANNOTBEDETERMINED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pRICE_CANNOT_BE_DETERMINEDKey = "PRICE_CANNOT_BE_DETERMINED";
	json_object_set_member(pJsonObject, pRICE_CANNOT_BE_DETERMINEDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsFeedValidationErrors::getFETCHERROR()
{
	return fETCH_ERROR;
}

void
CatalogsFeedValidationErrors::setFETCHERROR(int  fETCH_ERROR)
{
	this->fETCH_ERROR = fETCH_ERROR;
}

int
CatalogsFeedValidationErrors::getFETCHINACTIVEFEEDERROR()
{
	return fETCH_INACTIVE_FEED_ERROR;
}

void
CatalogsFeedValidationErrors::setFETCHINACTIVEFEEDERROR(int  fETCH_INACTIVE_FEED_ERROR)
{
	this->fETCH_INACTIVE_FEED_ERROR = fETCH_INACTIVE_FEED_ERROR;
}

int
CatalogsFeedValidationErrors::getENCODINGERROR()
{
	return eNCODING_ERROR;
}

void
CatalogsFeedValidationErrors::setENCODINGERROR(int  eNCODING_ERROR)
{
	this->eNCODING_ERROR = eNCODING_ERROR;
}

int
CatalogsFeedValidationErrors::getDELIMITERERROR()
{
	return dELIMITER_ERROR;
}

void
CatalogsFeedValidationErrors::setDELIMITERERROR(int  dELIMITER_ERROR)
{
	this->dELIMITER_ERROR = dELIMITER_ERROR;
}

int
CatalogsFeedValidationErrors::getREQUIREDCOLUMNSMISSING()
{
	return rEQUIRED_COLUMNS_MISSING;
}

void
CatalogsFeedValidationErrors::setREQUIREDCOLUMNSMISSING(int  rEQUIRED_COLUMNS_MISSING)
{
	this->rEQUIRED_COLUMNS_MISSING = rEQUIRED_COLUMNS_MISSING;
}

int
CatalogsFeedValidationErrors::getIMAGELINKINVALID()
{
	return iMAGE_LINK_INVALID;
}

void
CatalogsFeedValidationErrors::setIMAGELINKINVALID(int  iMAGE_LINK_INVALID)
{
	this->iMAGE_LINK_INVALID = iMAGE_LINK_INVALID;
}

int
CatalogsFeedValidationErrors::getITEMIDMISSING()
{
	return iTEMID_MISSING;
}

void
CatalogsFeedValidationErrors::setITEMIDMISSING(int  iTEMID_MISSING)
{
	this->iTEMID_MISSING = iTEMID_MISSING;
}

int
CatalogsFeedValidationErrors::getTITLEMISSING()
{
	return tITLE_MISSING;
}

void
CatalogsFeedValidationErrors::setTITLEMISSING(int  tITLE_MISSING)
{
	this->tITLE_MISSING = tITLE_MISSING;
}

int
CatalogsFeedValidationErrors::getDESCRIPTIONMISSING()
{
	return dESCRIPTION_MISSING;
}

void
CatalogsFeedValidationErrors::setDESCRIPTIONMISSING(int  dESCRIPTION_MISSING)
{
	this->dESCRIPTION_MISSING = dESCRIPTION_MISSING;
}

int
CatalogsFeedValidationErrors::getPRODUCTLINKMISSING()
{
	return pRODUCT_LINK_MISSING;
}

void
CatalogsFeedValidationErrors::setPRODUCTLINKMISSING(int  pRODUCT_LINK_MISSING)
{
	this->pRODUCT_LINK_MISSING = pRODUCT_LINK_MISSING;
}

int
CatalogsFeedValidationErrors::getIMAGELINKMISSING()
{
	return iMAGE_LINK_MISSING;
}

void
CatalogsFeedValidationErrors::setIMAGELINKMISSING(int  iMAGE_LINK_MISSING)
{
	this->iMAGE_LINK_MISSING = iMAGE_LINK_MISSING;
}

int
CatalogsFeedValidationErrors::getAVAILABILITYINVALID()
{
	return aVAILABILITY_INVALID;
}

void
CatalogsFeedValidationErrors::setAVAILABILITYINVALID(int  aVAILABILITY_INVALID)
{
	this->aVAILABILITY_INVALID = aVAILABILITY_INVALID;
}

int
CatalogsFeedValidationErrors::getPRODUCTPRICEINVALID()
{
	return pRODUCT_PRICE_INVALID;
}

void
CatalogsFeedValidationErrors::setPRODUCTPRICEINVALID(int  pRODUCT_PRICE_INVALID)
{
	this->pRODUCT_PRICE_INVALID = pRODUCT_PRICE_INVALID;
}

int
CatalogsFeedValidationErrors::getLINKFORMATINVALID()
{
	return lINK_FORMAT_INVALID;
}

void
CatalogsFeedValidationErrors::setLINKFORMATINVALID(int  lINK_FORMAT_INVALID)
{
	this->lINK_FORMAT_INVALID = lINK_FORMAT_INVALID;
}

int
CatalogsFeedValidationErrors::getPARSELINEERROR()
{
	return pARSE_LINE_ERROR;
}

void
CatalogsFeedValidationErrors::setPARSELINEERROR(int  pARSE_LINE_ERROR)
{
	this->pARSE_LINE_ERROR = pARSE_LINE_ERROR;
}

int
CatalogsFeedValidationErrors::getADWORDSFORMATINVALID()
{
	return aDWORDS_FORMAT_INVALID;
}

void
CatalogsFeedValidationErrors::setADWORDSFORMATINVALID(int  aDWORDS_FORMAT_INVALID)
{
	this->aDWORDS_FORMAT_INVALID = aDWORDS_FORMAT_INVALID;
}

int
CatalogsFeedValidationErrors::getINTERNALSERVICEERROR()
{
	return iNTERNAL_SERVICE_ERROR;
}

void
CatalogsFeedValidationErrors::setINTERNALSERVICEERROR(int  iNTERNAL_SERVICE_ERROR)
{
	this->iNTERNAL_SERVICE_ERROR = iNTERNAL_SERVICE_ERROR;
}

int
CatalogsFeedValidationErrors::getNOVERIFIEDDOMAIN()
{
	return nO_VERIFIED_DOMAIN;
}

void
CatalogsFeedValidationErrors::setNOVERIFIEDDOMAIN(int  nO_VERIFIED_DOMAIN)
{
	this->nO_VERIFIED_DOMAIN = nO_VERIFIED_DOMAIN;
}

int
CatalogsFeedValidationErrors::getADULTINVALID()
{
	return aDULT_INVALID;
}

void
CatalogsFeedValidationErrors::setADULTINVALID(int  aDULT_INVALID)
{
	this->aDULT_INVALID = aDULT_INVALID;
}

int
CatalogsFeedValidationErrors::getIMAGELINKLENGTHTOOLONG()
{
	return iMAGE_LINK_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationErrors::setIMAGELINKLENGTHTOOLONG(int  iMAGE_LINK_LENGTH_TOO_LONG)
{
	this->iMAGE_LINK_LENGTH_TOO_LONG = iMAGE_LINK_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationErrors::getINVALIDDOMAIN()
{
	return iNVALID_DOMAIN;
}

void
CatalogsFeedValidationErrors::setINVALIDDOMAIN(int  iNVALID_DOMAIN)
{
	this->iNVALID_DOMAIN = iNVALID_DOMAIN;
}

int
CatalogsFeedValidationErrors::getFEEDLENGTHTOOLONG()
{
	return fEED_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationErrors::setFEEDLENGTHTOOLONG(int  fEED_LENGTH_TOO_LONG)
{
	this->fEED_LENGTH_TOO_LONG = fEED_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationErrors::getLINKLENGTHTOOLONG()
{
	return lINK_LENGTH_TOO_LONG;
}

void
CatalogsFeedValidationErrors::setLINKLENGTHTOOLONG(int  lINK_LENGTH_TOO_LONG)
{
	this->lINK_LENGTH_TOO_LONG = lINK_LENGTH_TOO_LONG;
}

int
CatalogsFeedValidationErrors::getMALFORMEDXML()
{
	return mALFORMED_XML;
}

void
CatalogsFeedValidationErrors::setMALFORMEDXML(int  mALFORMED_XML)
{
	this->mALFORMED_XML = mALFORMED_XML;
}

int
CatalogsFeedValidationErrors::getPRICEMISSING()
{
	return pRICE_MISSING;
}

void
CatalogsFeedValidationErrors::setPRICEMISSING(int  pRICE_MISSING)
{
	this->pRICE_MISSING = pRICE_MISSING;
}

int
CatalogsFeedValidationErrors::getFEEDTOOSMALL()
{
	return fEED_TOO_SMALL;
}

void
CatalogsFeedValidationErrors::setFEEDTOOSMALL(int  fEED_TOO_SMALL)
{
	this->fEED_TOO_SMALL = fEED_TOO_SMALL;
}

int
CatalogsFeedValidationErrors::getMAXITEMSPERITEMGROUPEXCEEDED()
{
	return mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

void
CatalogsFeedValidationErrors::setMAXITEMSPERITEMGROUPEXCEEDED(int  mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)
{
	this->mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

int
CatalogsFeedValidationErrors::getITEMMAINIMAGEDOWNLOADFAILURE()
{
	return iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

void
CatalogsFeedValidationErrors::setITEMMAINIMAGEDOWNLOADFAILURE(int  iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE)
{
	this->iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

int
CatalogsFeedValidationErrors::getPINJOINCONTENTUNSAFE()
{
	return pINJOIN_CONTENT_UNSAFE;
}

void
CatalogsFeedValidationErrors::setPINJOINCONTENTUNSAFE(int  pINJOIN_CONTENT_UNSAFE)
{
	this->pINJOIN_CONTENT_UNSAFE = pINJOIN_CONTENT_UNSAFE;
}

int
CatalogsFeedValidationErrors::getBLOCKLISTEDIMAGESIGNATURE()
{
	return bLOCKLISTED_IMAGE_SIGNATURE;
}

void
CatalogsFeedValidationErrors::setBLOCKLISTEDIMAGESIGNATURE(int  bLOCKLISTED_IMAGE_SIGNATURE)
{
	this->bLOCKLISTED_IMAGE_SIGNATURE = bLOCKLISTED_IMAGE_SIGNATURE;
}

int
CatalogsFeedValidationErrors::getLISTPRICEINVALID()
{
	return lIST_PRICE_INVALID;
}

void
CatalogsFeedValidationErrors::setLISTPRICEINVALID(int  lIST_PRICE_INVALID)
{
	this->lIST_PRICE_INVALID = lIST_PRICE_INVALID;
}

int
CatalogsFeedValidationErrors::getPRICECANNOTBEDETERMINED()
{
	return pRICE_CANNOT_BE_DETERMINED;
}

void
CatalogsFeedValidationErrors::setPRICECANNOTBEDETERMINED(int  pRICE_CANNOT_BE_DETERMINED)
{
	this->pRICE_CANNOT_BE_DETERMINED = pRICE_CANNOT_BE_DETERMINED;
}


