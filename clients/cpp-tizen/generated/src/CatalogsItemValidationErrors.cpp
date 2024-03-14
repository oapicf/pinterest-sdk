#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemValidationErrors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemValidationErrors::CatalogsItemValidationErrors()
{
	//__init();
}

CatalogsItemValidationErrors::~CatalogsItemValidationErrors()
{
	//__cleanup();
}

void
CatalogsItemValidationErrors::__init()
{
	//aDULT_INVALID = new CatalogsItemValidationDetails();
	//aDWORDS_FORMAT_INVALID = new CatalogsItemValidationDetails();
	//aVAILABILITY_INVALID = new CatalogsItemValidationDetails();
	//bLOCKLISTED_IMAGE_SIGNATURE = new CatalogsItemValidationDetails();
	//dESCRIPTION_MISSING = new CatalogsItemValidationDetails();
	//iMAGE_LINK_INVALID = new CatalogsItemValidationDetails();
	//iMAGE_LINK_LENGTH_TOO_LONG = new CatalogsItemValidationDetails();
	//iMAGE_LINK_MISSING = new CatalogsItemValidationDetails();
	//iNVALID_DOMAIN = new CatalogsItemValidationDetails();
	//iTEMID_MISSING = new CatalogsItemValidationDetails();
	//iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = new CatalogsItemValidationDetails();
	//lINK_FORMAT_INVALID = new CatalogsItemValidationDetails();
	//lINK_LENGTH_TOO_LONG = new CatalogsItemValidationDetails();
	//lIST_PRICE_INVALID = new CatalogsItemValidationDetails();
	//mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = new CatalogsItemValidationDetails();
	//pARSE_LINE_ERROR = new CatalogsItemValidationDetails();
	//pINJOIN_CONTENT_UNSAFE = new CatalogsItemValidationDetails();
	//pRICE_CANNOT_BE_DETERMINED = new CatalogsItemValidationDetails();
	//pRICE_MISSING = new CatalogsItemValidationDetails();
	//pRODUCT_LINK_MISSING = new CatalogsItemValidationDetails();
	//pRODUCT_PRICE_INVALID = new CatalogsItemValidationDetails();
	//tITLE_MISSING = new CatalogsItemValidationDetails();
}

void
CatalogsItemValidationErrors::__cleanup()
{
	//if(aDULT_INVALID != NULL) {
	//
	//delete aDULT_INVALID;
	//aDULT_INVALID = NULL;
	//}
	//if(aDWORDS_FORMAT_INVALID != NULL) {
	//
	//delete aDWORDS_FORMAT_INVALID;
	//aDWORDS_FORMAT_INVALID = NULL;
	//}
	//if(aVAILABILITY_INVALID != NULL) {
	//
	//delete aVAILABILITY_INVALID;
	//aVAILABILITY_INVALID = NULL;
	//}
	//if(bLOCKLISTED_IMAGE_SIGNATURE != NULL) {
	//
	//delete bLOCKLISTED_IMAGE_SIGNATURE;
	//bLOCKLISTED_IMAGE_SIGNATURE = NULL;
	//}
	//if(dESCRIPTION_MISSING != NULL) {
	//
	//delete dESCRIPTION_MISSING;
	//dESCRIPTION_MISSING = NULL;
	//}
	//if(iMAGE_LINK_INVALID != NULL) {
	//
	//delete iMAGE_LINK_INVALID;
	//iMAGE_LINK_INVALID = NULL;
	//}
	//if(iMAGE_LINK_LENGTH_TOO_LONG != NULL) {
	//
	//delete iMAGE_LINK_LENGTH_TOO_LONG;
	//iMAGE_LINK_LENGTH_TOO_LONG = NULL;
	//}
	//if(iMAGE_LINK_MISSING != NULL) {
	//
	//delete iMAGE_LINK_MISSING;
	//iMAGE_LINK_MISSING = NULL;
	//}
	//if(iNVALID_DOMAIN != NULL) {
	//
	//delete iNVALID_DOMAIN;
	//iNVALID_DOMAIN = NULL;
	//}
	//if(iTEMID_MISSING != NULL) {
	//
	//delete iTEMID_MISSING;
	//iTEMID_MISSING = NULL;
	//}
	//if(iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE != NULL) {
	//
	//delete iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
	//iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = NULL;
	//}
	//if(lINK_FORMAT_INVALID != NULL) {
	//
	//delete lINK_FORMAT_INVALID;
	//lINK_FORMAT_INVALID = NULL;
	//}
	//if(lINK_LENGTH_TOO_LONG != NULL) {
	//
	//delete lINK_LENGTH_TOO_LONG;
	//lINK_LENGTH_TOO_LONG = NULL;
	//}
	//if(lIST_PRICE_INVALID != NULL) {
	//
	//delete lIST_PRICE_INVALID;
	//lIST_PRICE_INVALID = NULL;
	//}
	//if(mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED != NULL) {
	//
	//delete mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
	//mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = NULL;
	//}
	//if(pARSE_LINE_ERROR != NULL) {
	//
	//delete pARSE_LINE_ERROR;
	//pARSE_LINE_ERROR = NULL;
	//}
	//if(pINJOIN_CONTENT_UNSAFE != NULL) {
	//
	//delete pINJOIN_CONTENT_UNSAFE;
	//pINJOIN_CONTENT_UNSAFE = NULL;
	//}
	//if(pRICE_CANNOT_BE_DETERMINED != NULL) {
	//
	//delete pRICE_CANNOT_BE_DETERMINED;
	//pRICE_CANNOT_BE_DETERMINED = NULL;
	//}
	//if(pRICE_MISSING != NULL) {
	//
	//delete pRICE_MISSING;
	//pRICE_MISSING = NULL;
	//}
	//if(pRODUCT_LINK_MISSING != NULL) {
	//
	//delete pRODUCT_LINK_MISSING;
	//pRODUCT_LINK_MISSING = NULL;
	//}
	//if(pRODUCT_PRICE_INVALID != NULL) {
	//
	//delete pRODUCT_PRICE_INVALID;
	//pRODUCT_PRICE_INVALID = NULL;
	//}
	//if(tITLE_MISSING != NULL) {
	//
	//delete tITLE_MISSING;
	//tITLE_MISSING = NULL;
	//}
	//
}

void
CatalogsItemValidationErrors::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aDULT_INVALIDKey = "ADULT_INVALID";
	node = json_object_get_member(pJsonObject, aDULT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&aDULT_INVALID, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&aDULT_INVALID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *aDWORDS_FORMAT_INVALIDKey = "ADWORDS_FORMAT_INVALID";
	node = json_object_get_member(pJsonObject, aDWORDS_FORMAT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&aDWORDS_FORMAT_INVALID, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&aDWORDS_FORMAT_INVALID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *aVAILABILITY_INVALIDKey = "AVAILABILITY_INVALID";
	node = json_object_get_member(pJsonObject, aVAILABILITY_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&aVAILABILITY_INVALID, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&aVAILABILITY_INVALID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bLOCKLISTED_IMAGE_SIGNATUREKey = "BLOCKLISTED_IMAGE_SIGNATURE";
	node = json_object_get_member(pJsonObject, bLOCKLISTED_IMAGE_SIGNATUREKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&bLOCKLISTED_IMAGE_SIGNATURE, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&bLOCKLISTED_IMAGE_SIGNATURE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dESCRIPTION_MISSINGKey = "DESCRIPTION_MISSING";
	node = json_object_get_member(pJsonObject, dESCRIPTION_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&dESCRIPTION_MISSING, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&dESCRIPTION_MISSING);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *iMAGE_LINK_INVALIDKey = "IMAGE_LINK_INVALID";
	node = json_object_get_member(pJsonObject, iMAGE_LINK_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&iMAGE_LINK_INVALID, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&iMAGE_LINK_INVALID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *iMAGE_LINK_LENGTH_TOO_LONGKey = "IMAGE_LINK_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, iMAGE_LINK_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&iMAGE_LINK_LENGTH_TOO_LONG, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&iMAGE_LINK_LENGTH_TOO_LONG);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *iMAGE_LINK_MISSINGKey = "IMAGE_LINK_MISSING";
	node = json_object_get_member(pJsonObject, iMAGE_LINK_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&iMAGE_LINK_MISSING, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&iMAGE_LINK_MISSING);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *iNVALID_DOMAINKey = "INVALID_DOMAIN";
	node = json_object_get_member(pJsonObject, iNVALID_DOMAINKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&iNVALID_DOMAIN, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&iNVALID_DOMAIN);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *iTEMID_MISSINGKey = "ITEMID_MISSING";
	node = json_object_get_member(pJsonObject, iTEMID_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&iTEMID_MISSING, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&iTEMID_MISSING);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";
	node = json_object_get_member(pJsonObject, iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lINK_FORMAT_INVALIDKey = "LINK_FORMAT_INVALID";
	node = json_object_get_member(pJsonObject, lINK_FORMAT_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&lINK_FORMAT_INVALID, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&lINK_FORMAT_INVALID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lINK_LENGTH_TOO_LONGKey = "LINK_LENGTH_TOO_LONG";
	node = json_object_get_member(pJsonObject, lINK_LENGTH_TOO_LONGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&lINK_LENGTH_TOO_LONG, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&lINK_LENGTH_TOO_LONG);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lIST_PRICE_INVALIDKey = "LIST_PRICE_INVALID";
	node = json_object_get_member(pJsonObject, lIST_PRICE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&lIST_PRICE_INVALID, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&lIST_PRICE_INVALID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";
	node = json_object_get_member(pJsonObject, mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pARSE_LINE_ERRORKey = "PARSE_LINE_ERROR";
	node = json_object_get_member(pJsonObject, pARSE_LINE_ERRORKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&pARSE_LINE_ERROR, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&pARSE_LINE_ERROR);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pINJOIN_CONTENT_UNSAFEKey = "PINJOIN_CONTENT_UNSAFE";
	node = json_object_get_member(pJsonObject, pINJOIN_CONTENT_UNSAFEKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&pINJOIN_CONTENT_UNSAFE, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&pINJOIN_CONTENT_UNSAFE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pRICE_CANNOT_BE_DETERMINEDKey = "PRICE_CANNOT_BE_DETERMINED";
	node = json_object_get_member(pJsonObject, pRICE_CANNOT_BE_DETERMINEDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&pRICE_CANNOT_BE_DETERMINED, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&pRICE_CANNOT_BE_DETERMINED);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pRICE_MISSINGKey = "PRICE_MISSING";
	node = json_object_get_member(pJsonObject, pRICE_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&pRICE_MISSING, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&pRICE_MISSING);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pRODUCT_LINK_MISSINGKey = "PRODUCT_LINK_MISSING";
	node = json_object_get_member(pJsonObject, pRODUCT_LINK_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&pRODUCT_LINK_MISSING, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&pRODUCT_LINK_MISSING);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pRODUCT_PRICE_INVALIDKey = "PRODUCT_PRICE_INVALID";
	node = json_object_get_member(pJsonObject, pRODUCT_PRICE_INVALIDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&pRODUCT_PRICE_INVALID, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&pRODUCT_PRICE_INVALID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tITLE_MISSINGKey = "TITLE_MISSING";
	node = json_object_get_member(pJsonObject, tITLE_MISSINGKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationDetails")) {
			jsonToValue(&tITLE_MISSING, node, "CatalogsItemValidationDetails", "CatalogsItemValidationDetails");
		} else {
			
			CatalogsItemValidationDetails* obj = static_cast<CatalogsItemValidationDetails*> (&tITLE_MISSING);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsItemValidationErrors::CatalogsItemValidationErrors(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemValidationErrors::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getADULTINVALID();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getADULTINVALID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aDULT_INVALIDKey = "ADULT_INVALID";
	json_object_set_member(pJsonObject, aDULT_INVALIDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getADWORDSFORMATINVALID();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getADWORDSFORMATINVALID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aDWORDS_FORMAT_INVALIDKey = "ADWORDS_FORMAT_INVALID";
	json_object_set_member(pJsonObject, aDWORDS_FORMAT_INVALIDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getAVAILABILITYINVALID();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getAVAILABILITYINVALID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aVAILABILITY_INVALIDKey = "AVAILABILITY_INVALID";
	json_object_set_member(pJsonObject, aVAILABILITY_INVALIDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getBLOCKLISTEDIMAGESIGNATURE();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getBLOCKLISTEDIMAGESIGNATURE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bLOCKLISTED_IMAGE_SIGNATUREKey = "BLOCKLISTED_IMAGE_SIGNATURE";
	json_object_set_member(pJsonObject, bLOCKLISTED_IMAGE_SIGNATUREKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getDESCRIPTIONMISSING();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getDESCRIPTIONMISSING());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dESCRIPTION_MISSINGKey = "DESCRIPTION_MISSING";
	json_object_set_member(pJsonObject, dESCRIPTION_MISSINGKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getIMAGELINKINVALID();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getIMAGELINKINVALID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iMAGE_LINK_INVALIDKey = "IMAGE_LINK_INVALID";
	json_object_set_member(pJsonObject, iMAGE_LINK_INVALIDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getIMAGELINKLENGTHTOOLONG();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getIMAGELINKLENGTHTOOLONG());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iMAGE_LINK_LENGTH_TOO_LONGKey = "IMAGE_LINK_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, iMAGE_LINK_LENGTH_TOO_LONGKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getIMAGELINKMISSING();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getIMAGELINKMISSING());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iMAGE_LINK_MISSINGKey = "IMAGE_LINK_MISSING";
	json_object_set_member(pJsonObject, iMAGE_LINK_MISSINGKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getINVALIDDOMAIN();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getINVALIDDOMAIN());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iNVALID_DOMAINKey = "INVALID_DOMAIN";
	json_object_set_member(pJsonObject, iNVALID_DOMAINKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getITEMIDMISSING();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getITEMIDMISSING());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iTEMID_MISSINGKey = "ITEMID_MISSING";
	json_object_set_member(pJsonObject, iTEMID_MISSINGKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getITEMMAINIMAGEDOWNLOADFAILURE();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getITEMMAINIMAGEDOWNLOADFAILURE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE";
	json_object_set_member(pJsonObject, iTEM_MAIN_IMAGE_DOWNLOAD_FAILUREKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getLINKFORMATINVALID();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getLINKFORMATINVALID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lINK_FORMAT_INVALIDKey = "LINK_FORMAT_INVALID";
	json_object_set_member(pJsonObject, lINK_FORMAT_INVALIDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getLINKLENGTHTOOLONG();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getLINKLENGTHTOOLONG());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lINK_LENGTH_TOO_LONGKey = "LINK_LENGTH_TOO_LONG";
	json_object_set_member(pJsonObject, lINK_LENGTH_TOO_LONGKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getLISTPRICEINVALID();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getLISTPRICEINVALID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *lIST_PRICE_INVALIDKey = "LIST_PRICE_INVALID";
	json_object_set_member(pJsonObject, lIST_PRICE_INVALIDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getMAXITEMSPERITEMGROUPEXCEEDED();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getMAXITEMSPERITEMGROUPEXCEEDED());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED";
	json_object_set_member(pJsonObject, mAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getPARSELINEERROR();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getPARSELINEERROR());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pARSE_LINE_ERRORKey = "PARSE_LINE_ERROR";
	json_object_set_member(pJsonObject, pARSE_LINE_ERRORKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getPINJOINCONTENTUNSAFE();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getPINJOINCONTENTUNSAFE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pINJOIN_CONTENT_UNSAFEKey = "PINJOIN_CONTENT_UNSAFE";
	json_object_set_member(pJsonObject, pINJOIN_CONTENT_UNSAFEKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getPRICECANNOTBEDETERMINED();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getPRICECANNOTBEDETERMINED());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRICE_CANNOT_BE_DETERMINEDKey = "PRICE_CANNOT_BE_DETERMINED";
	json_object_set_member(pJsonObject, pRICE_CANNOT_BE_DETERMINEDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getPRICEMISSING();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getPRICEMISSING());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRICE_MISSINGKey = "PRICE_MISSING";
	json_object_set_member(pJsonObject, pRICE_MISSINGKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getPRODUCTLINKMISSING();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getPRODUCTLINKMISSING());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_LINK_MISSINGKey = "PRODUCT_LINK_MISSING";
	json_object_set_member(pJsonObject, pRODUCT_LINK_MISSINGKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getPRODUCTPRICEINVALID();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getPRODUCTPRICEINVALID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pRODUCT_PRICE_INVALIDKey = "PRODUCT_PRICE_INVALID";
	json_object_set_member(pJsonObject, pRODUCT_PRICE_INVALIDKey, node);
	if (isprimitive("CatalogsItemValidationDetails")) {
		CatalogsItemValidationDetails obj = getTITLEMISSING();
		node = converttoJson(&obj, "CatalogsItemValidationDetails", "");
	}
	else {
		
		CatalogsItemValidationDetails obj = static_cast<CatalogsItemValidationDetails> (getTITLEMISSING());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tITLE_MISSINGKey = "TITLE_MISSING";
	json_object_set_member(pJsonObject, tITLE_MISSINGKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getADULTINVALID()
{
	return aDULT_INVALID;
}

void
CatalogsItemValidationErrors::setADULTINVALID(CatalogsItemValidationDetails  aDULT_INVALID)
{
	this->aDULT_INVALID = aDULT_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getADWORDSFORMATINVALID()
{
	return aDWORDS_FORMAT_INVALID;
}

void
CatalogsItemValidationErrors::setADWORDSFORMATINVALID(CatalogsItemValidationDetails  aDWORDS_FORMAT_INVALID)
{
	this->aDWORDS_FORMAT_INVALID = aDWORDS_FORMAT_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getAVAILABILITYINVALID()
{
	return aVAILABILITY_INVALID;
}

void
CatalogsItemValidationErrors::setAVAILABILITYINVALID(CatalogsItemValidationDetails  aVAILABILITY_INVALID)
{
	this->aVAILABILITY_INVALID = aVAILABILITY_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getBLOCKLISTEDIMAGESIGNATURE()
{
	return bLOCKLISTED_IMAGE_SIGNATURE;
}

void
CatalogsItemValidationErrors::setBLOCKLISTEDIMAGESIGNATURE(CatalogsItemValidationDetails  bLOCKLISTED_IMAGE_SIGNATURE)
{
	this->bLOCKLISTED_IMAGE_SIGNATURE = bLOCKLISTED_IMAGE_SIGNATURE;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getDESCRIPTIONMISSING()
{
	return dESCRIPTION_MISSING;
}

void
CatalogsItemValidationErrors::setDESCRIPTIONMISSING(CatalogsItemValidationDetails  dESCRIPTION_MISSING)
{
	this->dESCRIPTION_MISSING = dESCRIPTION_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getIMAGELINKINVALID()
{
	return iMAGE_LINK_INVALID;
}

void
CatalogsItemValidationErrors::setIMAGELINKINVALID(CatalogsItemValidationDetails  iMAGE_LINK_INVALID)
{
	this->iMAGE_LINK_INVALID = iMAGE_LINK_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getIMAGELINKLENGTHTOOLONG()
{
	return iMAGE_LINK_LENGTH_TOO_LONG;
}

void
CatalogsItemValidationErrors::setIMAGELINKLENGTHTOOLONG(CatalogsItemValidationDetails  iMAGE_LINK_LENGTH_TOO_LONG)
{
	this->iMAGE_LINK_LENGTH_TOO_LONG = iMAGE_LINK_LENGTH_TOO_LONG;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getIMAGELINKMISSING()
{
	return iMAGE_LINK_MISSING;
}

void
CatalogsItemValidationErrors::setIMAGELINKMISSING(CatalogsItemValidationDetails  iMAGE_LINK_MISSING)
{
	this->iMAGE_LINK_MISSING = iMAGE_LINK_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getINVALIDDOMAIN()
{
	return iNVALID_DOMAIN;
}

void
CatalogsItemValidationErrors::setINVALIDDOMAIN(CatalogsItemValidationDetails  iNVALID_DOMAIN)
{
	this->iNVALID_DOMAIN = iNVALID_DOMAIN;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getITEMIDMISSING()
{
	return iTEMID_MISSING;
}

void
CatalogsItemValidationErrors::setITEMIDMISSING(CatalogsItemValidationDetails  iTEMID_MISSING)
{
	this->iTEMID_MISSING = iTEMID_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getITEMMAINIMAGEDOWNLOADFAILURE()
{
	return iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

void
CatalogsItemValidationErrors::setITEMMAINIMAGEDOWNLOADFAILURE(CatalogsItemValidationDetails  iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE)
{
	this->iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE = iTEM_MAIN_IMAGE_DOWNLOAD_FAILURE;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getLINKFORMATINVALID()
{
	return lINK_FORMAT_INVALID;
}

void
CatalogsItemValidationErrors::setLINKFORMATINVALID(CatalogsItemValidationDetails  lINK_FORMAT_INVALID)
{
	this->lINK_FORMAT_INVALID = lINK_FORMAT_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getLINKLENGTHTOOLONG()
{
	return lINK_LENGTH_TOO_LONG;
}

void
CatalogsItemValidationErrors::setLINKLENGTHTOOLONG(CatalogsItemValidationDetails  lINK_LENGTH_TOO_LONG)
{
	this->lINK_LENGTH_TOO_LONG = lINK_LENGTH_TOO_LONG;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getLISTPRICEINVALID()
{
	return lIST_PRICE_INVALID;
}

void
CatalogsItemValidationErrors::setLISTPRICEINVALID(CatalogsItemValidationDetails  lIST_PRICE_INVALID)
{
	this->lIST_PRICE_INVALID = lIST_PRICE_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getMAXITEMSPERITEMGROUPEXCEEDED()
{
	return mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

void
CatalogsItemValidationErrors::setMAXITEMSPERITEMGROUPEXCEEDED(CatalogsItemValidationDetails  mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED)
{
	this->mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED = mAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPARSELINEERROR()
{
	return pARSE_LINE_ERROR;
}

void
CatalogsItemValidationErrors::setPARSELINEERROR(CatalogsItemValidationDetails  pARSE_LINE_ERROR)
{
	this->pARSE_LINE_ERROR = pARSE_LINE_ERROR;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPINJOINCONTENTUNSAFE()
{
	return pINJOIN_CONTENT_UNSAFE;
}

void
CatalogsItemValidationErrors::setPINJOINCONTENTUNSAFE(CatalogsItemValidationDetails  pINJOIN_CONTENT_UNSAFE)
{
	this->pINJOIN_CONTENT_UNSAFE = pINJOIN_CONTENT_UNSAFE;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRICECANNOTBEDETERMINED()
{
	return pRICE_CANNOT_BE_DETERMINED;
}

void
CatalogsItemValidationErrors::setPRICECANNOTBEDETERMINED(CatalogsItemValidationDetails  pRICE_CANNOT_BE_DETERMINED)
{
	this->pRICE_CANNOT_BE_DETERMINED = pRICE_CANNOT_BE_DETERMINED;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRICEMISSING()
{
	return pRICE_MISSING;
}

void
CatalogsItemValidationErrors::setPRICEMISSING(CatalogsItemValidationDetails  pRICE_MISSING)
{
	this->pRICE_MISSING = pRICE_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRODUCTLINKMISSING()
{
	return pRODUCT_LINK_MISSING;
}

void
CatalogsItemValidationErrors::setPRODUCTLINKMISSING(CatalogsItemValidationDetails  pRODUCT_LINK_MISSING)
{
	this->pRODUCT_LINK_MISSING = pRODUCT_LINK_MISSING;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getPRODUCTPRICEINVALID()
{
	return pRODUCT_PRICE_INVALID;
}

void
CatalogsItemValidationErrors::setPRODUCTPRICEINVALID(CatalogsItemValidationDetails  pRODUCT_PRICE_INVALID)
{
	this->pRODUCT_PRICE_INVALID = pRODUCT_PRICE_INVALID;
}

CatalogsItemValidationDetails
CatalogsItemValidationErrors::getTITLEMISSING()
{
	return tITLE_MISSING;
}

void
CatalogsItemValidationErrors::setTITLEMISSING(CatalogsItemValidationDetails  tITLE_MISSING)
{
	this->tITLE_MISSING = tITLE_MISSING;
}


