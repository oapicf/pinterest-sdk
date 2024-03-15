#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelGuestRatings.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelGuestRatings::CatalogsHotelGuestRatings()
{
	//__init();
}

CatalogsHotelGuestRatings::~CatalogsHotelGuestRatings()
{
	//__cleanup();
}

void
CatalogsHotelGuestRatings::__init()
{
	//score = double(0);
	//number_of_reviewers = int(0);
	//max_score = double(0);
	//rating_system = std::string();
}

void
CatalogsHotelGuestRatings::__cleanup()
{
	//if(score != NULL) {
	//
	//delete score;
	//score = NULL;
	//}
	//if(number_of_reviewers != NULL) {
	//
	//delete number_of_reviewers;
	//number_of_reviewers = NULL;
	//}
	//if(max_score != NULL) {
	//
	//delete max_score;
	//max_score = NULL;
	//}
	//if(rating_system != NULL) {
	//
	//delete rating_system;
	//rating_system = NULL;
	//}
	//
}

void
CatalogsHotelGuestRatings::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scoreKey = "score";
	node = json_object_get_member(pJsonObject, scoreKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&score, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&score);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *number_of_reviewersKey = "number_of_reviewers";
	node = json_object_get_member(pJsonObject, number_of_reviewersKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&number_of_reviewers, node, "int", "");
		} else {
			
		}
	}
	const gchar *max_scoreKey = "max_score";
	node = json_object_get_member(pJsonObject, max_scoreKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&max_score, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&max_score);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rating_systemKey = "rating_system";
	node = json_object_get_member(pJsonObject, rating_systemKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&rating_system, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsHotelGuestRatings::CatalogsHotelGuestRatings(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelGuestRatings::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getScore();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getScore());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scoreKey = "score";
	json_object_set_member(pJsonObject, scoreKey, node);
	if (isprimitive("int")) {
		int obj = getNumberOfReviewers();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *number_of_reviewersKey = "number_of_reviewers";
	json_object_set_member(pJsonObject, number_of_reviewersKey, node);
	if (isprimitive("long long")) {
		long long obj = getMaxScore();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getMaxScore());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *max_scoreKey = "max_score";
	json_object_set_member(pJsonObject, max_scoreKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRatingSystem();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *rating_systemKey = "rating_system";
	json_object_set_member(pJsonObject, rating_systemKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CatalogsHotelGuestRatings::getScore()
{
	return score;
}

void
CatalogsHotelGuestRatings::setScore(long long  score)
{
	this->score = score;
}

int
CatalogsHotelGuestRatings::getNumberOfReviewers()
{
	return number_of_reviewers;
}

void
CatalogsHotelGuestRatings::setNumberOfReviewers(int  number_of_reviewers)
{
	this->number_of_reviewers = number_of_reviewers;
}

long long
CatalogsHotelGuestRatings::getMaxScore()
{
	return max_score;
}

void
CatalogsHotelGuestRatings::setMaxScore(long long  max_score)
{
	this->max_score = max_score;
}

std::string
CatalogsHotelGuestRatings::getRatingSystem()
{
	return rating_system;
}

void
CatalogsHotelGuestRatings::setRatingSystem(std::string  rating_system)
{
	this->rating_system = rating_system;
}


