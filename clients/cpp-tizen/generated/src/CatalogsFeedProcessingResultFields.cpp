#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Catalogs_feed_processing_result_fields.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Catalogs_feed_processing_result_fields::Catalogs_feed_processing_result_fields()
{
	//__init();
}

Catalogs_feed_processing_result_fields::~Catalogs_feed_processing_result_fields()
{
	//__cleanup();
}

void
Catalogs_feed_processing_result_fields::__init()
{
	//ingestion_details = new CatalogsFeedIngestionDetails();
	//status = new CatalogsFeedProcessingStatus();
	//product_counts = new CatalogsFeedProductCounts();
	//validation_details = new CatalogsFeedValidationDetails();
}

void
Catalogs_feed_processing_result_fields::__cleanup()
{
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
Catalogs_feed_processing_result_fields::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

Catalogs_feed_processing_result_fields::Catalogs_feed_processing_result_fields(char* json)
{
	this->fromJson(json);
}

char*
Catalogs_feed_processing_result_fields::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

CatalogsFeedIngestionDetails
Catalogs_feed_processing_result_fields::getIngestionDetails()
{
	return ingestion_details;
}

void
Catalogs_feed_processing_result_fields::setIngestionDetails(CatalogsFeedIngestionDetails  ingestion_details)
{
	this->ingestion_details = ingestion_details;
}

CatalogsFeedProcessingStatus
Catalogs_feed_processing_result_fields::getStatus()
{
	return status;
}

void
Catalogs_feed_processing_result_fields::setStatus(CatalogsFeedProcessingStatus  status)
{
	this->status = status;
}

CatalogsFeedProductCounts
Catalogs_feed_processing_result_fields::getProductCounts()
{
	return product_counts;
}

void
Catalogs_feed_processing_result_fields::setProductCounts(CatalogsFeedProductCounts  product_counts)
{
	this->product_counts = product_counts;
}

CatalogsFeedValidationDetails
Catalogs_feed_processing_result_fields::getValidationDetails()
{
	return validation_details;
}

void
Catalogs_feed_processing_result_fields::setValidationDetails(CatalogsFeedValidationDetails  validation_details)
{
	this->validation_details = validation_details;
}


