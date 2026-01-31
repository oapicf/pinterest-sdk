#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Brand_accounts_create_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Brand_accounts_create_200_response::Brand_accounts_create_200_response()
{
	//__init();
}

Brand_accounts_create_200_response::~Brand_accounts_create_200_response()
{
	//__cleanup();
}

void
Brand_accounts_create_200_response::__init()
{
	//brand_account_id = std::string();
}

void
Brand_accounts_create_200_response::__cleanup()
{
	//if(brand_account_id != NULL) {
	//
	//delete brand_account_id;
	//brand_account_id = NULL;
	//}
	//
}

void
Brand_accounts_create_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *brand_account_idKey = "brand_account_id";
	node = json_object_get_member(pJsonObject, brand_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&brand_account_id, node, "std::string", "");
		} else {
			
		}
	}
}

Brand_accounts_create_200_response::Brand_accounts_create_200_response(char* json)
{
	this->fromJson(json);
}

char*
Brand_accounts_create_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBrandAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *brand_account_idKey = "brand_account_id";
	json_object_set_member(pJsonObject, brand_account_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Brand_accounts_create_200_response::getBrandAccountId()
{
	return brand_account_id;
}

void
Brand_accounts_create_200_response::setBrandAccountId(std::string  brand_account_id)
{
	this->brand_account_id = brand_account_id;
}


