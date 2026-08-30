#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TotalCountByEntityStatus.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TotalCountByEntityStatus::TotalCountByEntityStatus()
{
	//__init();
}

TotalCountByEntityStatus::~TotalCountByEntityStatus()
{
	//__cleanup();
}

void
TotalCountByEntityStatus::__init()
{
	//aCTIVE = int(0);
	//aRCHIVED = int(0);
	//pAUSED = int(0);
}

void
TotalCountByEntityStatus::__cleanup()
{
	//if(aCTIVE != NULL) {
	//
	//delete aCTIVE;
	//aCTIVE = NULL;
	//}
	//if(aRCHIVED != NULL) {
	//
	//delete aRCHIVED;
	//aRCHIVED = NULL;
	//}
	//if(pAUSED != NULL) {
	//
	//delete pAUSED;
	//pAUSED = NULL;
	//}
	//
}

void
TotalCountByEntityStatus::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aCTIVEKey = "ACTIVE";
	node = json_object_get_member(pJsonObject, aCTIVEKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aCTIVE, node, "int", "");
		} else {
			
		}
	}
	const gchar *aRCHIVEDKey = "ARCHIVED";
	node = json_object_get_member(pJsonObject, aRCHIVEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&aRCHIVED, node, "int", "");
		} else {
			
		}
	}
	const gchar *pAUSEDKey = "PAUSED";
	node = json_object_get_member(pJsonObject, pAUSEDKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pAUSED, node, "int", "");
		} else {
			
		}
	}
}

TotalCountByEntityStatus::TotalCountByEntityStatus(char* json)
{
	this->fromJson(json);
}

char*
TotalCountByEntityStatus::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getACTIVE();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aCTIVEKey = "ACTIVE";
	json_object_set_member(pJsonObject, aCTIVEKey, node);
	if (isprimitive("int")) {
		int obj = getARCHIVED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *aRCHIVEDKey = "ARCHIVED";
	json_object_set_member(pJsonObject, aRCHIVEDKey, node);
	if (isprimitive("int")) {
		int obj = getPAUSED();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pAUSEDKey = "PAUSED";
	json_object_set_member(pJsonObject, pAUSEDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
TotalCountByEntityStatus::getACTIVE()
{
	return aCTIVE;
}

void
TotalCountByEntityStatus::setACTIVE(int  aCTIVE)
{
	this->aCTIVE = aCTIVE;
}

int
TotalCountByEntityStatus::getARCHIVED()
{
	return aRCHIVED;
}

void
TotalCountByEntityStatus::setARCHIVED(int  aRCHIVED)
{
	this->aRCHIVED = aRCHIVED;
}

int
TotalCountByEntityStatus::getPAUSED()
{
	return pAUSED;
}

void
TotalCountByEntityStatus::setPAUSED(int  pAUSED)
{
	this->pAUSED = pAUSED;
}


