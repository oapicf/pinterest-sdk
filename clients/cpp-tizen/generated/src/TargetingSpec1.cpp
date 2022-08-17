#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingSpec_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingSpec_1::TargetingSpec_1()
{
	//__init();
}

TargetingSpec_1::~TargetingSpec_1()
{
	//__cleanup();
}

void
TargetingSpec_1::__init()
{
	//new std::list()std::list> aGE_BUCKET;
	//new std::list()std::list> aPPTYPE;
	//new std::list()std::list> aUDIENCE_EXCLUDE;
	//new std::list()std::list> aUDIENCE_INCLUDE;
	//new std::list()std::list> gENDER;
	//new std::list()std::list> gEO;
	//new std::list()std::list> iNTEREST;
	//new std::list()std::list> lOCALE;
	//new std::list()std::list> lOCATION;
	//new std::list()std::list> sHOPPING_RETARGETING;
	//new std::list()std::list> tARGETING_STRATEGY;
}

void
TargetingSpec_1::__cleanup()
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
TargetingSpec_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aGE_BUCKETKey = "AGE_BUCKET";
	node = json_object_get_member(pJsonObject, aGE_BUCKETKey);
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
			aGE_BUCKET = new_list;
		}
		
	}
	const gchar *aPPTYPEKey = "APPTYPE";
	node = json_object_get_member(pJsonObject, aPPTYPEKey);
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
	const gchar *sHOPPING_RETARGETINGKey = "SHOPPING_RETARGETING";
	node = json_object_get_member(pJsonObject, sHOPPING_RETARGETINGKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpec_SHOPPING_RETARGETING> new_list;
			TargetingSpec_SHOPPING_RETARGETING inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpec_SHOPPING_RETARGETING")) {
					jsonToValue(&inst, temp_json, "TargetingSpec_SHOPPING_RETARGETING", "");
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

TargetingSpec_1::TargetingSpec_1(char* json)
{
	this->fromJson(json);
}

char*
TargetingSpec_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAGEBUCKET());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAGEBUCKET());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *aGE_BUCKETKey = "AGE_BUCKET";
	json_object_set_member(pJsonObject, aGE_BUCKETKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAPPTYPE());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAPPTYPE());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getGENDER());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getGENDER());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
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
	if (isprimitive("TargetingSpec_SHOPPING_RETARGETING")) {
		list<TargetingSpec_SHOPPING_RETARGETING> new_list = static_cast<list <TargetingSpec_SHOPPING_RETARGETING> > (getSHOPPINGRETARGETING());
		node = converttoJson(&new_list, "TargetingSpec_SHOPPING_RETARGETING", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpec_SHOPPING_RETARGETING> new_list = static_cast<list <TargetingSpec_SHOPPING_RETARGETING> > (getSHOPPINGRETARGETING());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpec_SHOPPING_RETARGETING>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpec_SHOPPING_RETARGETING obj = *it;
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

std::list<std::string>
TargetingSpec_1::getAGEBUCKET()
{
	return aGE_BUCKET;
}

void
TargetingSpec_1::setAGEBUCKET(std::list <std::string> aGE_BUCKET)
{
	this->aGE_BUCKET = aGE_BUCKET;
}

std::list<std::string>
TargetingSpec_1::getAPPTYPE()
{
	return aPPTYPE;
}

void
TargetingSpec_1::setAPPTYPE(std::list <std::string> aPPTYPE)
{
	this->aPPTYPE = aPPTYPE;
}

std::list<std::string>
TargetingSpec_1::getAUDIENCEEXCLUDE()
{
	return aUDIENCE_EXCLUDE;
}

void
TargetingSpec_1::setAUDIENCEEXCLUDE(std::list <std::string> aUDIENCE_EXCLUDE)
{
	this->aUDIENCE_EXCLUDE = aUDIENCE_EXCLUDE;
}

std::list<std::string>
TargetingSpec_1::getAUDIENCEINCLUDE()
{
	return aUDIENCE_INCLUDE;
}

void
TargetingSpec_1::setAUDIENCEINCLUDE(std::list <std::string> aUDIENCE_INCLUDE)
{
	this->aUDIENCE_INCLUDE = aUDIENCE_INCLUDE;
}

std::list<std::string>
TargetingSpec_1::getGENDER()
{
	return gENDER;
}

void
TargetingSpec_1::setGENDER(std::list <std::string> gENDER)
{
	this->gENDER = gENDER;
}

std::list<std::string>
TargetingSpec_1::getGEO()
{
	return gEO;
}

void
TargetingSpec_1::setGEO(std::list <std::string> gEO)
{
	this->gEO = gEO;
}

std::list<std::string>
TargetingSpec_1::getINTEREST()
{
	return iNTEREST;
}

void
TargetingSpec_1::setINTEREST(std::list <std::string> iNTEREST)
{
	this->iNTEREST = iNTEREST;
}

std::list<std::string>
TargetingSpec_1::getLOCALE()
{
	return lOCALE;
}

void
TargetingSpec_1::setLOCALE(std::list <std::string> lOCALE)
{
	this->lOCALE = lOCALE;
}

std::list<std::string>
TargetingSpec_1::getLOCATION()
{
	return lOCATION;
}

void
TargetingSpec_1::setLOCATION(std::list <std::string> lOCATION)
{
	this->lOCATION = lOCATION;
}

std::list<TargetingSpec_SHOPPING_RETARGETING>
TargetingSpec_1::getSHOPPINGRETARGETING()
{
	return sHOPPING_RETARGETING;
}

void
TargetingSpec_1::setSHOPPINGRETARGETING(std::list <TargetingSpec_SHOPPING_RETARGETING> sHOPPING_RETARGETING)
{
	this->sHOPPING_RETARGETING = sHOPPING_RETARGETING;
}

std::list<std::string>
TargetingSpec_1::getTARGETINGSTRATEGY()
{
	return tARGETING_STRATEGY;
}

void
TargetingSpec_1::setTARGETINGSTRATEGY(std::list <std::string> tARGETING_STRATEGY)
{
	this->tARGETING_STRATEGY = tARGETING_STRATEGY;
}


