#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsCreativeAssetsProductGroupFilterKeys.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsCreativeAssetsProductGroupFilterKeys::CatalogsCreativeAssetsProductGroupFilterKeys()
{
	//__init();
}

CatalogsCreativeAssetsProductGroupFilterKeys::~CatalogsCreativeAssetsProductGroupFilterKeys()
{
	//__cleanup();
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::__init()
{
	//cREATIVE_ASSETS_ID = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_0 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_1 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_2 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_3 = new CatalogsProductGroupMultipleStringCriteria();
	//cUSTOM_LABEL_4 = new CatalogsProductGroupMultipleStringCriteria();
	//gOOGLE_PRODUCT_CATEGORY_6 = new CatalogsProductGroupMultipleStringListCriteria();
	//gOOGLE_PRODUCT_CATEGORY_5 = new CatalogsProductGroupMultipleStringListCriteria();
	//gOOGLE_PRODUCT_CATEGORY_4 = new CatalogsProductGroupMultipleStringListCriteria();
	//gOOGLE_PRODUCT_CATEGORY_3 = new CatalogsProductGroupMultipleStringListCriteria();
	//gOOGLE_PRODUCT_CATEGORY_2 = new CatalogsProductGroupMultipleStringListCriteria();
	//gOOGLE_PRODUCT_CATEGORY_1 = new CatalogsProductGroupMultipleStringListCriteria();
	//gOOGLE_PRODUCT_CATEGORY_0 = new CatalogsProductGroupMultipleStringListCriteria();
	//mEDIA_TYPE = new CatalogsProductGroupMultipleMediaTypesCriteria();
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::__cleanup()
{
	//if(cREATIVE_ASSETS_ID != NULL) {
	//
	//delete cREATIVE_ASSETS_ID;
	//cREATIVE_ASSETS_ID = NULL;
	//}
	//if(cUSTOM_LABEL_0 != NULL) {
	//
	//delete cUSTOM_LABEL_0;
	//cUSTOM_LABEL_0 = NULL;
	//}
	//if(cUSTOM_LABEL_1 != NULL) {
	//
	//delete cUSTOM_LABEL_1;
	//cUSTOM_LABEL_1 = NULL;
	//}
	//if(cUSTOM_LABEL_2 != NULL) {
	//
	//delete cUSTOM_LABEL_2;
	//cUSTOM_LABEL_2 = NULL;
	//}
	//if(cUSTOM_LABEL_3 != NULL) {
	//
	//delete cUSTOM_LABEL_3;
	//cUSTOM_LABEL_3 = NULL;
	//}
	//if(cUSTOM_LABEL_4 != NULL) {
	//
	//delete cUSTOM_LABEL_4;
	//cUSTOM_LABEL_4 = NULL;
	//}
	//if(gOOGLE_PRODUCT_CATEGORY_6 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_6;
	//gOOGLE_PRODUCT_CATEGORY_6 = NULL;
	//}
	//if(gOOGLE_PRODUCT_CATEGORY_5 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_5;
	//gOOGLE_PRODUCT_CATEGORY_5 = NULL;
	//}
	//if(gOOGLE_PRODUCT_CATEGORY_4 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_4;
	//gOOGLE_PRODUCT_CATEGORY_4 = NULL;
	//}
	//if(gOOGLE_PRODUCT_CATEGORY_3 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_3;
	//gOOGLE_PRODUCT_CATEGORY_3 = NULL;
	//}
	//if(gOOGLE_PRODUCT_CATEGORY_2 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_2;
	//gOOGLE_PRODUCT_CATEGORY_2 = NULL;
	//}
	//if(gOOGLE_PRODUCT_CATEGORY_1 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_1;
	//gOOGLE_PRODUCT_CATEGORY_1 = NULL;
	//}
	//if(gOOGLE_PRODUCT_CATEGORY_0 != NULL) {
	//
	//delete gOOGLE_PRODUCT_CATEGORY_0;
	//gOOGLE_PRODUCT_CATEGORY_0 = NULL;
	//}
	//if(mEDIA_TYPE != NULL) {
	//
	//delete mEDIA_TYPE;
	//mEDIA_TYPE = NULL;
	//}
	//
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cREATIVE_ASSETS_IDKey = "CREATIVE_ASSETS_ID";
	node = json_object_get_member(pJsonObject, cREATIVE_ASSETS_IDKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cREATIVE_ASSETS_ID, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cREATIVE_ASSETS_ID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_0Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_0, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_1, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_2, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_3, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";
	node = json_object_get_member(pJsonObject, cUSTOM_LABEL_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
			jsonToValue(&cUSTOM_LABEL_4, node, "CatalogsProductGroupMultipleStringCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringCriteria* obj = static_cast<CatalogsProductGroupMultipleStringCriteria*> (&cUSTOM_LABEL_4);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_6Key = "GOOGLE_PRODUCT_CATEGORY_6";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_6Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_6, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_6);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_5Key = "GOOGLE_PRODUCT_CATEGORY_5";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_5Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_5, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_5);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_4Key = "GOOGLE_PRODUCT_CATEGORY_4";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_4Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_4, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_4);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_3Key = "GOOGLE_PRODUCT_CATEGORY_3";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_3Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_3, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_3);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_2Key = "GOOGLE_PRODUCT_CATEGORY_2";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_2Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_2, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_2);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_1Key = "GOOGLE_PRODUCT_CATEGORY_1";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_1Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_1, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_1);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_0Key = "GOOGLE_PRODUCT_CATEGORY_0";
	node = json_object_get_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_0Key);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
			jsonToValue(&gOOGLE_PRODUCT_CATEGORY_0, node, "CatalogsProductGroupMultipleStringListCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleStringListCriteria* obj = static_cast<CatalogsProductGroupMultipleStringListCriteria*> (&gOOGLE_PRODUCT_CATEGORY_0);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mEDIA_TYPEKey = "MEDIA_TYPE";
	node = json_object_get_member(pJsonObject, mEDIA_TYPEKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsProductGroupMultipleMediaTypesCriteria")) {
			jsonToValue(&mEDIA_TYPE, node, "CatalogsProductGroupMultipleMediaTypesCriteria", "");
		} else {
			
			CatalogsProductGroupMultipleMediaTypesCriteria* obj = static_cast<CatalogsProductGroupMultipleMediaTypesCriteria*> (&mEDIA_TYPE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsCreativeAssetsProductGroupFilterKeys::CatalogsCreativeAssetsProductGroupFilterKeys(char* json)
{
	this->fromJson(json);
}

char*
CatalogsCreativeAssetsProductGroupFilterKeys::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCREATIVEASSETSID();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCREATIVEASSETSID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cREATIVE_ASSETS_IDKey = "CREATIVE_ASSETS_ID";
	json_object_set_member(pJsonObject, cREATIVE_ASSETS_IDKey, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL0();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_0Key = "CUSTOM_LABEL_0";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_0Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL1();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_1Key = "CUSTOM_LABEL_1";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_1Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL2();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_2Key = "CUSTOM_LABEL_2";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_2Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL3();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_3Key = "CUSTOM_LABEL_3";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_3Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringCriteria")) {
		CatalogsProductGroupMultipleStringCriteria obj = getCUSTOMLABEL4();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringCriteria obj = static_cast<CatalogsProductGroupMultipleStringCriteria> (getCUSTOMLABEL4());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cUSTOM_LABEL_4Key = "CUSTOM_LABEL_4";
	json_object_set_member(pJsonObject, cUSTOM_LABEL_4Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY6();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY6());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_6Key = "GOOGLE_PRODUCT_CATEGORY_6";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_6Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY5();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY5());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_5Key = "GOOGLE_PRODUCT_CATEGORY_5";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_5Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY4();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY4());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_4Key = "GOOGLE_PRODUCT_CATEGORY_4";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_4Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY3();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY3());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_3Key = "GOOGLE_PRODUCT_CATEGORY_3";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_3Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY2();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY2());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_2Key = "GOOGLE_PRODUCT_CATEGORY_2";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_2Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY1();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY1());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_1Key = "GOOGLE_PRODUCT_CATEGORY_1";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_1Key, node);
	if (isprimitive("CatalogsProductGroupMultipleStringListCriteria")) {
		CatalogsProductGroupMultipleStringListCriteria obj = getGOOGLEPRODUCTCATEGORY0();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleStringListCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleStringListCriteria obj = static_cast<CatalogsProductGroupMultipleStringListCriteria> (getGOOGLEPRODUCTCATEGORY0());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gOOGLE_PRODUCT_CATEGORY_0Key = "GOOGLE_PRODUCT_CATEGORY_0";
	json_object_set_member(pJsonObject, gOOGLE_PRODUCT_CATEGORY_0Key, node);
	if (isprimitive("CatalogsProductGroupMultipleMediaTypesCriteria")) {
		CatalogsProductGroupMultipleMediaTypesCriteria obj = getMEDIATYPE();
		node = converttoJson(&obj, "CatalogsProductGroupMultipleMediaTypesCriteria", "");
	}
	else {
		
		CatalogsProductGroupMultipleMediaTypesCriteria obj = static_cast<CatalogsProductGroupMultipleMediaTypesCriteria> (getMEDIATYPE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mEDIA_TYPEKey = "MEDIA_TYPE";
	json_object_set_member(pJsonObject, mEDIA_TYPEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCREATIVEASSETSID()
{
	return cREATIVE_ASSETS_ID;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCREATIVEASSETSID(CatalogsProductGroupMultipleStringCriteria  cREATIVE_ASSETS_ID)
{
	this->cREATIVE_ASSETS_ID = cREATIVE_ASSETS_ID;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL0()
{
	return cUSTOM_LABEL_0;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL0(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_0)
{
	this->cUSTOM_LABEL_0 = cUSTOM_LABEL_0;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL1()
{
	return cUSTOM_LABEL_1;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_1)
{
	this->cUSTOM_LABEL_1 = cUSTOM_LABEL_1;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL2()
{
	return cUSTOM_LABEL_2;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_2)
{
	this->cUSTOM_LABEL_2 = cUSTOM_LABEL_2;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL3()
{
	return cUSTOM_LABEL_3;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_3)
{
	this->cUSTOM_LABEL_3 = cUSTOM_LABEL_3;
}

CatalogsProductGroupMultipleStringCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getCUSTOMLABEL4()
{
	return cUSTOM_LABEL_4;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria  cUSTOM_LABEL_4)
{
	this->cUSTOM_LABEL_4 = cUSTOM_LABEL_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY6()
{
	return gOOGLE_PRODUCT_CATEGORY_6;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY6(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_6)
{
	this->gOOGLE_PRODUCT_CATEGORY_6 = gOOGLE_PRODUCT_CATEGORY_6;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY5()
{
	return gOOGLE_PRODUCT_CATEGORY_5;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_5)
{
	this->gOOGLE_PRODUCT_CATEGORY_5 = gOOGLE_PRODUCT_CATEGORY_5;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY4()
{
	return gOOGLE_PRODUCT_CATEGORY_4;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_4)
{
	this->gOOGLE_PRODUCT_CATEGORY_4 = gOOGLE_PRODUCT_CATEGORY_4;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY3()
{
	return gOOGLE_PRODUCT_CATEGORY_3;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_3)
{
	this->gOOGLE_PRODUCT_CATEGORY_3 = gOOGLE_PRODUCT_CATEGORY_3;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY2()
{
	return gOOGLE_PRODUCT_CATEGORY_2;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_2)
{
	this->gOOGLE_PRODUCT_CATEGORY_2 = gOOGLE_PRODUCT_CATEGORY_2;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY1()
{
	return gOOGLE_PRODUCT_CATEGORY_1;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_1)
{
	this->gOOGLE_PRODUCT_CATEGORY_1 = gOOGLE_PRODUCT_CATEGORY_1;
}

CatalogsProductGroupMultipleStringListCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getGOOGLEPRODUCTCATEGORY0()
{
	return gOOGLE_PRODUCT_CATEGORY_0;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria  gOOGLE_PRODUCT_CATEGORY_0)
{
	this->gOOGLE_PRODUCT_CATEGORY_0 = gOOGLE_PRODUCT_CATEGORY_0;
}

CatalogsProductGroupMultipleMediaTypesCriteria
CatalogsCreativeAssetsProductGroupFilterKeys::getMEDIATYPE()
{
	return mEDIA_TYPE;
}

void
CatalogsCreativeAssetsProductGroupFilterKeys::setMEDIATYPE(CatalogsProductGroupMultipleMediaTypesCriteria  mEDIA_TYPE)
{
	this->mEDIA_TYPE = mEDIA_TYPE;
}


