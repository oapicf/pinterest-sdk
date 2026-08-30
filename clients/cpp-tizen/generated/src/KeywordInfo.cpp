#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordInfo::KeywordInfo()
{
	//__init();
}

KeywordInfo::~KeywordInfo()
{
	//__cleanup();
}

void
KeywordInfo::__init()
{
	//name = std::string();
	//pct_growth_mom = double(0);
}

void
KeywordInfo::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(pct_growth_mom != NULL) {
	//
	//delete pct_growth_mom;
	//pct_growth_mom = NULL;
	//}
	//
}

void
KeywordInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pct_growth_momKey = "pct_growth_mom";
	node = json_object_get_member(pJsonObject, pct_growth_momKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&pct_growth_mom, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&pct_growth_mom);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

KeywordInfo::KeywordInfo(char* json)
{
	this->fromJson(json);
}

char*
KeywordInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getPctGrowthMom();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getPctGrowthMom());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pct_growth_momKey = "pct_growth_mom";
	json_object_set_member(pJsonObject, pct_growth_momKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
KeywordInfo::getName()
{
	return name;
}

void
KeywordInfo::setName(std::string  name)
{
	this->name = name;
}

long long
KeywordInfo::getPctGrowthMom()
{
	return pct_growth_mom;
}

void
KeywordInfo::setPctGrowthMom(long long  pct_growth_mom)
{
	this->pct_growth_mom = pct_growth_mom;
}


