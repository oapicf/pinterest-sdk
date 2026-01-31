#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsProductGroupUint32Criteria.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsProductGroupUint32Criteria::CatalogsProductGroupUint32Criteria()
{
	//__init();
}

CatalogsProductGroupUint32Criteria::~CatalogsProductGroupUint32Criteria()
{
	//__cleanup();
}

void
CatalogsProductGroupUint32Criteria::__init()
{
	//negated = bool(false);
	//r_operator = std::string();
	//value = int(0);
}

void
CatalogsProductGroupUint32Criteria::__cleanup()
{
	//if(negated != NULL) {
	//
	//delete negated;
	//negated = NULL;
	//}
	//if(r_operator != NULL) {
	//
	//delete r_operator;
	//r_operator = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
CatalogsProductGroupUint32Criteria::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *negatedKey = "negated";
	node = json_object_get_member(pJsonObject, negatedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&negated, node, "bool", "");
		} else {
			
		}
	}
	const gchar *r_operatorKey = "operator";
	node = json_object_get_member(pJsonObject, r_operatorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&r_operator, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&value, node, "int", "");
		} else {
			
		}
	}
}

CatalogsProductGroupUint32Criteria::CatalogsProductGroupUint32Criteria(char* json)
{
	this->fromJson(json);
}

char*
CatalogsProductGroupUint32Criteria::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getNegated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *negatedKey = "negated";
	json_object_set_member(pJsonObject, negatedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getROperator();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *r_operatorKey = "operator";
	json_object_set_member(pJsonObject, r_operatorKey, node);
	if (isprimitive("int")) {
		int obj = getValue();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
CatalogsProductGroupUint32Criteria::getNegated()
{
	return negated;
}

void
CatalogsProductGroupUint32Criteria::setNegated(bool  negated)
{
	this->negated = negated;
}

std::string
CatalogsProductGroupUint32Criteria::getROperator()
{
	return r_operator;
}

void
CatalogsProductGroupUint32Criteria::setROperator(std::string  r_operator)
{
	this->r_operator = r_operator;
}

int
CatalogsProductGroupUint32Criteria::getValue()
{
	return value;
}

void
CatalogsProductGroupUint32Criteria::setValue(int  value)
{
	this->value = value;
}


