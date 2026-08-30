#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkCampaignDeliveryEstimatesItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkCampaignDeliveryEstimatesItem::BulkCampaignDeliveryEstimatesItem()
{
	//__init();
}

BulkCampaignDeliveryEstimatesItem::~BulkCampaignDeliveryEstimatesItem()
{
	//__cleanup();
}

void
BulkCampaignDeliveryEstimatesItem::__init()
{
	//new std::list()std::list> adgroup_audience_sizes;
	//conversion_rate = float(0);
	//new std::list()std::list> conversion_rates;
	//new std::list()std::list> curves;
	//derived_metrics = new CampaignDeliveryEstimatesDerivedMetrics();
	//new std::list()std::list> errors;
	//estimate_id = std::string();
	//max_potential_spend = int(0);
}

void
BulkCampaignDeliveryEstimatesItem::__cleanup()
{
	//if(adgroup_audience_sizes != NULL) {
	//adgroup_audience_sizes.RemoveAll(true);
	//delete adgroup_audience_sizes;
	//adgroup_audience_sizes = NULL;
	//}
	//if(conversion_rate != NULL) {
	//
	//delete conversion_rate;
	//conversion_rate = NULL;
	//}
	//if(conversion_rates != NULL) {
	//conversion_rates.RemoveAll(true);
	//delete conversion_rates;
	//conversion_rates = NULL;
	//}
	//if(curves != NULL) {
	//curves.RemoveAll(true);
	//delete curves;
	//curves = NULL;
	//}
	//if(derived_metrics != NULL) {
	//
	//delete derived_metrics;
	//derived_metrics = NULL;
	//}
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(estimate_id != NULL) {
	//
	//delete estimate_id;
	//estimate_id = NULL;
	//}
	//if(max_potential_spend != NULL) {
	//
	//delete max_potential_spend;
	//max_potential_spend = NULL;
	//}
	//
}

void
BulkCampaignDeliveryEstimatesItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *adgroup_audience_sizesKey = "adgroup_audience_sizes";
	node = json_object_get_member(pJsonObject, adgroup_audience_sizesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningAdGroupAudienceSize> new_list;
			CampaignPlanningAdGroupAudienceSize inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningAdGroupAudienceSize")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningAdGroupAudienceSize", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			adgroup_audience_sizes = new_list;
		}
		
	}
	const gchar *conversion_rateKey = "conversion_rate";
	node = json_object_get_member(pJsonObject, conversion_rateKey);
	if (node !=NULL) {
	

		if (isprimitive("float")) {
			jsonToValue(&conversion_rate, node, "float", "");
		} else {
			
		}
	}
	const gchar *conversion_ratesKey = "conversion_rates";
	node = json_object_get_member(pJsonObject, conversion_ratesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningConversionRate> new_list;
			CampaignPlanningConversionRate inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningConversionRate")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningConversionRate", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			conversion_rates = new_list;
		}
		
	}
	const gchar *curvesKey = "curves";
	node = json_object_get_member(pJsonObject, curvesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningCurveEstimate> new_list;
			CampaignPlanningCurveEstimate inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningCurveEstimate")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningCurveEstimate", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			curves = new_list;
		}
		
	}
	const gchar *derived_metricsKey = "derived_metrics";
	node = json_object_get_member(pJsonObject, derived_metricsKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignDeliveryEstimatesDerivedMetrics")) {
			jsonToValue(&derived_metrics, node, "CampaignDeliveryEstimatesDerivedMetrics", "CampaignDeliveryEstimatesDerivedMetrics");
		} else {
			
			CampaignDeliveryEstimatesDerivedMetrics* obj = static_cast<CampaignDeliveryEstimatesDerivedMetrics*> (&derived_metrics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignPlanningResponseError> new_list;
			CampaignPlanningResponseError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignPlanningResponseError")) {
					jsonToValue(&inst, temp_json, "CampaignPlanningResponseError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
	const gchar *estimate_idKey = "estimate_id";
	node = json_object_get_member(pJsonObject, estimate_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&estimate_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *max_potential_spendKey = "max_potential_spend";
	node = json_object_get_member(pJsonObject, max_potential_spendKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_potential_spend, node, "int", "");
		} else {
			
		}
	}
}

BulkCampaignDeliveryEstimatesItem::BulkCampaignDeliveryEstimatesItem(char* json)
{
	this->fromJson(json);
}

char*
BulkCampaignDeliveryEstimatesItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignPlanningAdGroupAudienceSize")) {
		list<CampaignPlanningAdGroupAudienceSize> new_list = static_cast<list <CampaignPlanningAdGroupAudienceSize> > (getAdgroupAudienceSizes());
		node = converttoJson(&new_list, "CampaignPlanningAdGroupAudienceSize", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningAdGroupAudienceSize> new_list = static_cast<list <CampaignPlanningAdGroupAudienceSize> > (getAdgroupAudienceSizes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningAdGroupAudienceSize>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningAdGroupAudienceSize obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *adgroup_audience_sizesKey = "adgroup_audience_sizes";
	json_object_set_member(pJsonObject, adgroup_audience_sizesKey, node);
	if (isprimitive("float")) {
		float obj = getConversionRate();
		node = converttoJson(&obj, "float", "");
	}
	else {
		
	}
	const gchar *conversion_rateKey = "conversion_rate";
	json_object_set_member(pJsonObject, conversion_rateKey, node);
	if (isprimitive("CampaignPlanningConversionRate")) {
		list<CampaignPlanningConversionRate> new_list = static_cast<list <CampaignPlanningConversionRate> > (getConversionRates());
		node = converttoJson(&new_list, "CampaignPlanningConversionRate", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningConversionRate> new_list = static_cast<list <CampaignPlanningConversionRate> > (getConversionRates());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningConversionRate>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningConversionRate obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *conversion_ratesKey = "conversion_rates";
	json_object_set_member(pJsonObject, conversion_ratesKey, node);
	if (isprimitive("CampaignPlanningCurveEstimate")) {
		list<CampaignPlanningCurveEstimate> new_list = static_cast<list <CampaignPlanningCurveEstimate> > (getCurves());
		node = converttoJson(&new_list, "CampaignPlanningCurveEstimate", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningCurveEstimate> new_list = static_cast<list <CampaignPlanningCurveEstimate> > (getCurves());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningCurveEstimate>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningCurveEstimate obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *curvesKey = "curves";
	json_object_set_member(pJsonObject, curvesKey, node);
	if (isprimitive("CampaignDeliveryEstimatesDerivedMetrics")) {
		CampaignDeliveryEstimatesDerivedMetrics obj = getDerivedMetrics();
		node = converttoJson(&obj, "CampaignDeliveryEstimatesDerivedMetrics", "");
	}
	else {
		
		CampaignDeliveryEstimatesDerivedMetrics obj = static_cast<CampaignDeliveryEstimatesDerivedMetrics> (getDerivedMetrics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *derived_metricsKey = "derived_metrics";
	json_object_set_member(pJsonObject, derived_metricsKey, node);
	if (isprimitive("CampaignPlanningResponseError")) {
		list<CampaignPlanningResponseError> new_list = static_cast<list <CampaignPlanningResponseError> > (getErrors());
		node = converttoJson(&new_list, "CampaignPlanningResponseError", "array");
	} else {
		node = json_node_alloc();
		list<CampaignPlanningResponseError> new_list = static_cast<list <CampaignPlanningResponseError> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignPlanningResponseError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignPlanningResponseError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEstimateId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *estimate_idKey = "estimate_id";
	json_object_set_member(pJsonObject, estimate_idKey, node);
	if (isprimitive("int")) {
		int obj = getMaxPotentialSpend();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_potential_spendKey = "max_potential_spend";
	json_object_set_member(pJsonObject, max_potential_spendKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CampaignPlanningAdGroupAudienceSize>
BulkCampaignDeliveryEstimatesItem::getAdgroupAudienceSizes()
{
	return adgroup_audience_sizes;
}

void
BulkCampaignDeliveryEstimatesItem::setAdgroupAudienceSizes(std::list <CampaignPlanningAdGroupAudienceSize> adgroup_audience_sizes)
{
	this->adgroup_audience_sizes = adgroup_audience_sizes;
}

float
BulkCampaignDeliveryEstimatesItem::getConversionRate()
{
	return conversion_rate;
}

void
BulkCampaignDeliveryEstimatesItem::setConversionRate(float  conversion_rate)
{
	this->conversion_rate = conversion_rate;
}

std::list<CampaignPlanningConversionRate>
BulkCampaignDeliveryEstimatesItem::getConversionRates()
{
	return conversion_rates;
}

void
BulkCampaignDeliveryEstimatesItem::setConversionRates(std::list <CampaignPlanningConversionRate> conversion_rates)
{
	this->conversion_rates = conversion_rates;
}

std::list<CampaignPlanningCurveEstimate>
BulkCampaignDeliveryEstimatesItem::getCurves()
{
	return curves;
}

void
BulkCampaignDeliveryEstimatesItem::setCurves(std::list <CampaignPlanningCurveEstimate> curves)
{
	this->curves = curves;
}

CampaignDeliveryEstimatesDerivedMetrics
BulkCampaignDeliveryEstimatesItem::getDerivedMetrics()
{
	return derived_metrics;
}

void
BulkCampaignDeliveryEstimatesItem::setDerivedMetrics(CampaignDeliveryEstimatesDerivedMetrics  derived_metrics)
{
	this->derived_metrics = derived_metrics;
}

std::list<CampaignPlanningResponseError>
BulkCampaignDeliveryEstimatesItem::getErrors()
{
	return errors;
}

void
BulkCampaignDeliveryEstimatesItem::setErrors(std::list <CampaignPlanningResponseError> errors)
{
	this->errors = errors;
}

std::string
BulkCampaignDeliveryEstimatesItem::getEstimateId()
{
	return estimate_id;
}

void
BulkCampaignDeliveryEstimatesItem::setEstimateId(std::string  estimate_id)
{
	this->estimate_id = estimate_id;
}

int
BulkCampaignDeliveryEstimatesItem::getMaxPotentialSpend()
{
	return max_potential_spend;
}

void
BulkCampaignDeliveryEstimatesItem::setMaxPotentialSpend(int  max_potential_spend)
{
	this->max_potential_spend = max_potential_spend;
}


