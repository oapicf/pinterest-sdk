#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedProcessingResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedProcessingResult::CatalogsFeedProcessingResult()
{
	//__init();
}

CatalogsFeedProcessingResult::~CatalogsFeedProcessingResult()
{
	//__cleanup();
}

void
CatalogsFeedProcessingResult::__init()
{
	//created_at = null;
	//id = std::string();
	//updated_at = null;
	//ingestion_details = new CatalogsFeedIngestionDetails();
	//status = new CatalogsFeedProcessingStatus();
	//product_counts = new CatalogsFeedProductCounts();
	//validation_details = new CatalogsFeedValidationDetails();
}

void
CatalogsFeedProcessingResult::__cleanup()
{
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(updated_at != NULL) {
	//
	//delete updated_at;
	//updated_at = NULL;
	//}
	//if(ingestion_details != NULL) {
	//
	//delete ingestion_details;
	//ingestion_details = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(product_counts != NULL) {
	//
	//delete product_counts;
	//product_counts = NULL;
	//}
	//if(validation_details != NULL) {
	//
	//delete validation_details;
	//validation_details = NULL;
	//}
	//
}

void
CatalogsFeedProcessingResult::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updated_atKey = "updated_at";
	node = json_object_get_member(pJsonObject, updated_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updated_at, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ingestion_detailsKey = "ingestion_details";
	node = json_object_get_member(pJsonObject, ingestion_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedIngestionDetails")) {
			jsonToValue(&ingestion_details, node, "CatalogsFeedIngestionDetails", "CatalogsFeedIngestionDetails");
		} else {
			
			CatalogsFeedIngestionDetails* obj = static_cast<CatalogsFeedIngestionDetails*> (&ingestion_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedProcessingStatus")) {
			jsonToValue(&status, node, "CatalogsFeedProcessingStatus", "CatalogsFeedProcessingStatus");
		} else {
			
			CatalogsFeedProcessingStatus* obj = static_cast<CatalogsFeedProcessingStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *product_countsKey = "product_counts";
	node = json_object_get_member(pJsonObject, product_countsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedProductCounts")) {
			jsonToValue(&product_counts, node, "CatalogsFeedProductCounts", "CatalogsFeedProductCounts");
		} else {
			
			CatalogsFeedProductCounts* obj = static_cast<CatalogsFeedProductCounts*> (&product_counts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *validation_detailsKey = "validation_details";
	node = json_object_get_member(pJsonObject, validation_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedValidationDetails")) {
			jsonToValue(&validation_details, node, "CatalogsFeedValidationDetails", "CatalogsFeedValidationDetails");
		} else {
			
			CatalogsFeedValidationDetails* obj = static_cast<CatalogsFeedValidationDetails*> (&validation_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsFeedProcessingResult::CatalogsFeedProcessingResult(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedProcessingResult::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updated_atKey = "updated_at";
	json_object_set_member(pJsonObject, updated_atKey, node);
	if (isprimitive("CatalogsFeedIngestionDetails")) {
		CatalogsFeedIngestionDetails obj = getIngestionDetails();
		node = converttoJson(&obj, "CatalogsFeedIngestionDetails", "");
	}
	else {
		
		CatalogsFeedIngestionDetails obj = static_cast<CatalogsFeedIngestionDetails> (getIngestionDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ingestion_detailsKey = "ingestion_details";
	json_object_set_member(pJsonObject, ingestion_detailsKey, node);
	if (isprimitive("CatalogsFeedProcessingStatus")) {
		CatalogsFeedProcessingStatus obj = getStatus();
		node = converttoJson(&obj, "CatalogsFeedProcessingStatus", "");
	}
	else {
		
		CatalogsFeedProcessingStatus obj = static_cast<CatalogsFeedProcessingStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("CatalogsFeedProductCounts")) {
		CatalogsFeedProductCounts obj = getProductCounts();
		node = converttoJson(&obj, "CatalogsFeedProductCounts", "");
	}
	else {
		
		CatalogsFeedProductCounts obj = static_cast<CatalogsFeedProductCounts> (getProductCounts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *product_countsKey = "product_counts";
	json_object_set_member(pJsonObject, product_countsKey, node);
	if (isprimitive("CatalogsFeedValidationDetails")) {
		CatalogsFeedValidationDetails obj = getValidationDetails();
		node = converttoJson(&obj, "CatalogsFeedValidationDetails", "");
	}
	else {
		
		CatalogsFeedValidationDetails obj = static_cast<CatalogsFeedValidationDetails> (getValidationDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *validation_detailsKey = "validation_details";
	json_object_set_member(pJsonObject, validation_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsFeedProcessingResult::getCreatedAt()
{
	return created_at;
}

void
CatalogsFeedProcessingResult::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
CatalogsFeedProcessingResult::getId()
{
	return id;
}

void
CatalogsFeedProcessingResult::setId(std::string  id)
{
	this->id = id;
}

std::string
CatalogsFeedProcessingResult::getUpdatedAt()
{
	return updated_at;
}

void
CatalogsFeedProcessingResult::setUpdatedAt(std::string  updated_at)
{
	this->updated_at = updated_at;
}

CatalogsFeedIngestionDetails
CatalogsFeedProcessingResult::getIngestionDetails()
{
	return ingestion_details;
}

void
CatalogsFeedProcessingResult::setIngestionDetails(CatalogsFeedIngestionDetails  ingestion_details)
{
	this->ingestion_details = ingestion_details;
}

CatalogsFeedProcessingStatus
CatalogsFeedProcessingResult::getStatus()
{
	return status;
}

void
CatalogsFeedProcessingResult::setStatus(CatalogsFeedProcessingStatus  status)
{
	this->status = status;
}

CatalogsFeedProductCounts
CatalogsFeedProcessingResult::getProductCounts()
{
	return product_counts;
}

void
CatalogsFeedProcessingResult::setProductCounts(CatalogsFeedProductCounts  product_counts)
{
	this->product_counts = product_counts;
}

CatalogsFeedValidationDetails
CatalogsFeedProcessingResult::getValidationDetails()
{
	return validation_details;
}

void
CatalogsFeedProcessingResult::setValidationDetails(CatalogsFeedValidationDetails  validation_details)
{
	this->validation_details = validation_details;
}


