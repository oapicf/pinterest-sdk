#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailReportAllItemsFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailReportAllItemsFilter::CatalogsRetailReportAllItemsFilter()
{
	//__init();
}

CatalogsRetailReportAllItemsFilter::~CatalogsRetailReportAllItemsFilter()
{
	//__cleanup();
}

void
CatalogsRetailReportAllItemsFilter::__init()
{
	//catalog_id = std::string();
	//product_group_id = std::string();
	//report_type = std::string();
}

void
CatalogsRetailReportAllItemsFilter::__cleanup()
{
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//if(product_group_id != NULL) {
	//
	//delete product_group_id;
	//product_group_id = NULL;
	//}
	//if(report_type != NULL) {
	//
	//delete report_type;
	//report_type = NULL;
	//}
	//
}

void
CatalogsRetailReportAllItemsFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *product_group_idKey = "product_group_id";
	node = json_object_get_member(pJsonObject, product_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&product_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *report_typeKey = "report_type";
	node = json_object_get_member(pJsonObject, report_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&report_type, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsRetailReportAllItemsFilter::CatalogsRetailReportAllItemsFilter(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailReportAllItemsFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProductGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *product_group_idKey = "product_group_id";
	json_object_set_member(pJsonObject, product_group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReportType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *report_typeKey = "report_type";
	json_object_set_member(pJsonObject, report_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsRetailReportAllItemsFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsRetailReportAllItemsFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

std::string
CatalogsRetailReportAllItemsFilter::getProductGroupId()
{
	return product_group_id;
}

void
CatalogsRetailReportAllItemsFilter::setProductGroupId(std::string  product_group_id)
{
	this->product_group_id = product_group_id;
}

std::string
CatalogsRetailReportAllItemsFilter::getReportType()
{
	return report_type;
}

void
CatalogsRetailReportAllItemsFilter::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}


