#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpec.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpec::TargetingSpec()
{
	//__init();
}

TargetingSpec::~TargetingSpec()
{
	//__cleanup();
}

void
TargetingSpec::__init()
{
	//new std::list()std::list> aGE_BUCKET;
	//new std::list()std::list> aPPTYPE;
	//new std::list()std::list> aUDIENCE_EXCLUDE;
	//new std::list()std::list> aUDIENCE_INCLUDE;
	//new std::list()std::list> gENDER;
	//new std::list()std::list> gEO;
	//new std::list()std::list> gEO_EXCLUDE;
	//new std::list()std::list> iNTEREST;
	//new std::list()std::list> lOCALE;
	//new std::list()std::list> lOCATION;
	//new std::list()std::list> lOCATION_EXCLUDE;
	//mAXIMUM_AGE = std::string();
	//mINIMUM_AGE = std::string();
	//new std::list()std::list> sHOPPING_RETARGETING;
	//new std::list()std::list> tARGETING_STRATEGY;
}

void
TargetingSpec::__cleanup()
{
	//if(aGE_BUCKET != NULL) {
	//aGE_BUCKET.RemoveAll(true);
	//delete aGE_BUCKET;
	//aGE_BUCKET = NULL;
	//}
	//if(aPPTYPE != NULL) {
	//aPPTYPE.RemoveAll(true);
	//delete aPPTYPE;
	//aPPTYPE = NULL;
	//}
	//if(aUDIENCE_EXCLUDE != NULL) {
	//aUDIENCE_EXCLUDE.RemoveAll(true);
	//delete aUDIENCE_EXCLUDE;
	//aUDIENCE_EXCLUDE = NULL;
	//}
	//if(aUDIENCE_INCLUDE != NULL) {
	//aUDIENCE_INCLUDE.RemoveAll(true);
	//delete aUDIENCE_INCLUDE;
	//aUDIENCE_INCLUDE = NULL;
	//}
	//if(gENDER != NULL) {
	//gENDER.RemoveAll(true);
	//delete gENDER;
	//gENDER = NULL;
	//}
	//if(gEO != NULL) {
	//gEO.RemoveAll(true);
	//delete gEO;
	//gEO = NULL;
	//}
	//if(gEO_EXCLUDE != NULL) {
	//gEO_EXCLUDE.RemoveAll(true);
	//delete gEO_EXCLUDE;
	//gEO_EXCLUDE = NULL;
	//}
	//if(iNTEREST != NULL) {
	//iNTEREST.RemoveAll(true);
	//delete iNTEREST;
	//iNTEREST = NULL;
	//}
	//if(lOCALE != NULL) {
	//lOCALE.RemoveAll(true);
	//delete lOCALE;
	//lOCALE = NULL;
	//}
	//if(lOCATION != NULL) {
	//lOCATION.RemoveAll(true);
	//delete lOCATION;
	//lOCATION = NULL;
	//}
	//if(lOCATION_EXCLUDE != NULL) {
	//lOCATION_EXCLUDE.RemoveAll(true);
	//delete lOCATION_EXCLUDE;
	//lOCATION_EXCLUDE = NULL;
	//}
	//if(mAXIMUM_AGE != NULL) {
	//
	//delete mAXIMUM_AGE;
	//mAXIMUM_AGE = NULL;
	//}
	//if(mINIMUM_AGE != NULL) {
	//
	//delete mINIMUM_AGE;
	//mINIMUM_AGE = NULL;
	//}
	//if(sHOPPING_RETARGETING != NULL) {
	//sHOPPING_RETARGETING.RemoveAll(true);
	//delete sHOPPING_RETARGETING;
	//sHOPPING_RETARGETING = NULL;
	//}
	//if(tARGETING_STRATEGY != NULL) {
	//tARGETING_STRATEGY.RemoveAll(true);
	//delete tARGETING_STRATEGY;
	//tARGETING_STRATEGY = NULL;
	//}
	//
}

void
TargetingSpec::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aGE_BUCKETKey = "AGE_BUCKET";
	node = json_object_get_member(pJsonObject, aGE_BUCKETKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecAgeBucket> new_list;
			TargetingSpecAgeBucket inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecAgeBucket")) {
					jsonToValue(&inst, temp_json, "TargetingSpecAgeBucket", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			aGE_BUCKET = new_list;
		}
		
	}
	const gchar *aPPTYPEKey = "APPTYPE";
	node = json_object_get_member(pJsonObject, aPPTYPEKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecAppType> new_list;
			TargetingSpecAppType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecAppType")) {
					jsonToValue(&inst, temp_json, "TargetingSpecAppType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			aPPTYPE = new_list;
		}
		
	}
	const gchar *aUDIENCE_EXCLUDEKey = "AUDIENCE_EXCLUDE";
	node = json_object_get_member(pJsonObject, aUDIENCE_EXCLUDEKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			aUDIENCE_EXCLUDE = new_list;
		}
		
	}
	const gchar *aUDIENCE_INCLUDEKey = "AUDIENCE_INCLUDE";
	node = json_object_get_member(pJsonObject, aUDIENCE_INCLUDEKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			aUDIENCE_INCLUDE = new_list;
		}
		
	}
	const gchar *gENDERKey = "GENDER";
	node = json_object_get_member(pJsonObject, gENDERKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecGender> new_list;
			TargetingSpecGender inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecGender")) {
					jsonToValue(&inst, temp_json, "TargetingSpecGender", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			gENDER = new_list;
		}
		
	}
	const gchar *gEOKey = "GEO";
	node = json_object_get_member(pJsonObject, gEOKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			gEO = new_list;
		}
		
	}
	const gchar *gEO_EXCLUDEKey = "GEO_EXCLUDE";
	node = json_object_get_member(pJsonObject, gEO_EXCLUDEKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			gEO_EXCLUDE = new_list;
		}
		
	}
	const gchar *iNTERESTKey = "INTEREST";
	node = json_object_get_member(pJsonObject, iNTERESTKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			iNTEREST = new_list;
		}
		
	}
	const gchar *lOCALEKey = "LOCALE";
	node = json_object_get_member(pJsonObject, lOCALEKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			lOCALE = new_list;
		}
		
	}
	const gchar *lOCATIONKey = "LOCATION";
	node = json_object_get_member(pJsonObject, lOCATIONKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			lOCATION = new_list;
		}
		
	}
	const gchar *lOCATION_EXCLUDEKey = "LOCATION_EXCLUDE";
	node = json_object_get_member(pJsonObject, lOCATION_EXCLUDEKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			lOCATION_EXCLUDE = new_list;
		}
		
	}
	const gchar *mAXIMUM_AGEKey = "MAXIMUM_AGE";
	node = json_object_get_member(pJsonObject, mAXIMUM_AGEKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mAXIMUM_AGE, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *mINIMUM_AGEKey = "MINIMUM_AGE";
	node = json_object_get_member(pJsonObject, mINIMUM_AGEKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&mINIMUM_AGE, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sHOPPING_RETARGETINGKey = "SHOPPING_RETARGETING";
	node = json_object_get_member(pJsonObject, sHOPPING_RETARGETINGKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecShoppingRetargeting> new_list;
			TargetingSpecShoppingRetargeting inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecShoppingRetargeting")) {
					jsonToValue(&inst, temp_json, "TargetingSpecShoppingRetargeting", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			sHOPPING_RETARGETING = new_list;
		}
		
	}
	const gchar *tARGETING_STRATEGYKey = "TARGETING_STRATEGY";
	node = json_object_get_member(pJsonObject, tARGETING_STRATEGYKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			tARGETING_STRATEGY = new_list;
		}
		
	}
}

TargetingSpec::TargetingSpec(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpec::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TargetingSpecAgeBucket")) {
		list<TargetingSpecAgeBucket> new_list = static_cast<list <TargetingSpecAgeBucket> > (getAGEBUCKET());
		node = converttoJson(&new_list, "TargetingSpecAgeBucket", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecAgeBucket> new_list = static_cast<list <TargetingSpecAgeBucket> > (getAGEBUCKET());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecAgeBucket>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecAgeBucket obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *aGE_BUCKETKey = "AGE_BUCKET";
	json_object_set_member(pJsonObject, aGE_BUCKETKey, node);
	if (isprimitive("TargetingSpecAppType")) {
		list<TargetingSpecAppType> new_list = static_cast<list <TargetingSpecAppType> > (getAPPTYPE());
		node = converttoJson(&new_list, "TargetingSpecAppType", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecAppType> new_list = static_cast<list <TargetingSpecAppType> > (getAPPTYPE());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecAppType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecAppType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *aPPTYPEKey = "APPTYPE";
	json_object_set_member(pJsonObject, aPPTYPEKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAUDIENCEEXCLUDE());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAUDIENCEEXCLUDE());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *aUDIENCE_EXCLUDEKey = "AUDIENCE_EXCLUDE";
	json_object_set_member(pJsonObject, aUDIENCE_EXCLUDEKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAUDIENCEINCLUDE());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAUDIENCEINCLUDE());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *aUDIENCE_INCLUDEKey = "AUDIENCE_INCLUDE";
	json_object_set_member(pJsonObject, aUDIENCE_INCLUDEKey, node);
	if (isprimitive("TargetingSpecGender")) {
		list<TargetingSpecGender> new_list = static_cast<list <TargetingSpecGender> > (getGENDER());
		node = converttoJson(&new_list, "TargetingSpecGender", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecGender> new_list = static_cast<list <TargetingSpecGender> > (getGENDER());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecGender>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecGender obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *gENDERKey = "GENDER";
	json_object_set_member(pJsonObject, gENDERKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGEO());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGEO());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *gEOKey = "GEO";
	json_object_set_member(pJsonObject, gEOKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGEOEXCLUDE());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGEOEXCLUDE());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *gEO_EXCLUDEKey = "GEO_EXCLUDE";
	json_object_set_member(pJsonObject, gEO_EXCLUDEKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getINTEREST());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getINTEREST());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *iNTERESTKey = "INTEREST";
	json_object_set_member(pJsonObject, iNTERESTKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getLOCALE());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getLOCALE());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *lOCALEKey = "LOCALE";
	json_object_set_member(pJsonObject, lOCALEKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getLOCATION());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getLOCATION());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *lOCATIONKey = "LOCATION";
	json_object_set_member(pJsonObject, lOCATIONKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getLOCATIONEXCLUDE());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getLOCATIONEXCLUDE());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *lOCATION_EXCLUDEKey = "LOCATION_EXCLUDE";
	json_object_set_member(pJsonObject, lOCATION_EXCLUDEKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMAXIMUMAGE();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mAXIMUM_AGEKey = "MAXIMUM_AGE";
	json_object_set_member(pJsonObject, mAXIMUM_AGEKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMINIMUMAGE();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *mINIMUM_AGEKey = "MINIMUM_AGE";
	json_object_set_member(pJsonObject, mINIMUM_AGEKey, node);
	if (isprimitive("TargetingSpecShoppingRetargeting")) {
		list<TargetingSpecShoppingRetargeting> new_list = static_cast<list <TargetingSpecShoppingRetargeting> > (getSHOPPINGRETARGETING());
		node = converttoJson(&new_list, "TargetingSpecShoppingRetargeting", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecShoppingRetargeting> new_list = static_cast<list <TargetingSpecShoppingRetargeting> > (getSHOPPINGRETARGETING());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecShoppingRetargeting>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecShoppingRetargeting obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *sHOPPING_RETARGETINGKey = "SHOPPING_RETARGETING";
	json_object_set_member(pJsonObject, sHOPPING_RETARGETINGKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTARGETINGSTRATEGY());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTARGETINGSTRATEGY());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tARGETING_STRATEGYKey = "TARGETING_STRATEGY";
	json_object_set_member(pJsonObject, tARGETING_STRATEGYKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<TargetingSpecAgeBucket>
TargetingSpec::getAGEBUCKET()
{
	return aGE_BUCKET;
}

void
TargetingSpec::setAGEBUCKET(std::list <TargetingSpecAgeBucket> aGE_BUCKET)
{
	this->aGE_BUCKET = aGE_BUCKET;
}

std::list<TargetingSpecAppType>
TargetingSpec::getAPPTYPE()
{
	return aPPTYPE;
}

void
TargetingSpec::setAPPTYPE(std::list <TargetingSpecAppType> aPPTYPE)
{
	this->aPPTYPE = aPPTYPE;
}

std::list<std::string>
TargetingSpec::getAUDIENCEEXCLUDE()
{
	return aUDIENCE_EXCLUDE;
}

void
TargetingSpec::setAUDIENCEEXCLUDE(std::list <std::string> aUDIENCE_EXCLUDE)
{
	this->aUDIENCE_EXCLUDE = aUDIENCE_EXCLUDE;
}

std::list<std::string>
TargetingSpec::getAUDIENCEINCLUDE()
{
	return aUDIENCE_INCLUDE;
}

void
TargetingSpec::setAUDIENCEINCLUDE(std::list <std::string> aUDIENCE_INCLUDE)
{
	this->aUDIENCE_INCLUDE = aUDIENCE_INCLUDE;
}

std::list<TargetingSpecGender>
TargetingSpec::getGENDER()
{
	return gENDER;
}

void
TargetingSpec::setGENDER(std::list <TargetingSpecGender> gENDER)
{
	this->gENDER = gENDER;
}

std::list<std::string>
TargetingSpec::getGEO()
{
	return gEO;
}

void
TargetingSpec::setGEO(std::list <std::string> gEO)
{
	this->gEO = gEO;
}

std::list<std::string>
TargetingSpec::getGEOEXCLUDE()
{
	return gEO_EXCLUDE;
}

void
TargetingSpec::setGEOEXCLUDE(std::list <std::string> gEO_EXCLUDE)
{
	this->gEO_EXCLUDE = gEO_EXCLUDE;
}

std::list<std::string>
TargetingSpec::getINTEREST()
{
	return iNTEREST;
}

void
TargetingSpec::setINTEREST(std::list <std::string> iNTEREST)
{
	this->iNTEREST = iNTEREST;
}

std::list<std::string>
TargetingSpec::getLOCALE()
{
	return lOCALE;
}

void
TargetingSpec::setLOCALE(std::list <std::string> lOCALE)
{
	this->lOCALE = lOCALE;
}

std::list<std::string>
TargetingSpec::getLOCATION()
{
	return lOCATION;
}

void
TargetingSpec::setLOCATION(std::list <std::string> lOCATION)
{
	this->lOCATION = lOCATION;
}

std::list<std::string>
TargetingSpec::getLOCATIONEXCLUDE()
{
	return lOCATION_EXCLUDE;
}

void
TargetingSpec::setLOCATIONEXCLUDE(std::list <std::string> lOCATION_EXCLUDE)
{
	this->lOCATION_EXCLUDE = lOCATION_EXCLUDE;
}

std::string
TargetingSpec::getMAXIMUMAGE()
{
	return mAXIMUM_AGE;
}

void
TargetingSpec::setMAXIMUMAGE(std::string  mAXIMUM_AGE)
{
	this->mAXIMUM_AGE = mAXIMUM_AGE;
}

std::string
TargetingSpec::getMINIMUMAGE()
{
	return mINIMUM_AGE;
}

void
TargetingSpec::setMINIMUMAGE(std::string  mINIMUM_AGE)
{
	this->mINIMUM_AGE = mINIMUM_AGE;
}

std::list<TargetingSpecShoppingRetargeting>
TargetingSpec::getSHOPPINGRETARGETING()
{
	return sHOPPING_RETARGETING;
}

void
TargetingSpec::setSHOPPINGRETARGETING(std::list <TargetingSpecShoppingRetargeting> sHOPPING_RETARGETING)
{
	this->sHOPPING_RETARGETING = sHOPPING_RETARGETING;
}

std::list<std::string>
TargetingSpec::getTARGETINGSTRATEGY()
{
	return tARGETING_STRATEGY;
}

void
TargetingSpec::setTARGETINGSTRATEGY(std::list <std::string> tARGETING_STRATEGY)
{
	this->tARGETING_STRATEGY = tARGETING_STRATEGY;
}


