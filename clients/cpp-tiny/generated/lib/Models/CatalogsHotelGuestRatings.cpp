

#include "CatalogsHotelGuestRatings.h"

using namespace Tiny;

CatalogsHotelGuestRatings::CatalogsHotelGuestRatings()
{
	max_score = float(0);
	number_of_reviewers = int(0);
	rating_system = std::string();
	score = float(0);
}

CatalogsHotelGuestRatings::CatalogsHotelGuestRatings(std::string jsonString)
{
	this->fromJson(jsonString);
}

CatalogsHotelGuestRatings::~CatalogsHotelGuestRatings()
{

}

void
CatalogsHotelGuestRatings::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *max_scoreKey = "max_score";

    if(object.has_key(max_scoreKey))
    {
        bourne::json value = object[max_scoreKey];



        jsonToValue(&max_score, value, "long");


    }

    const char *number_of_reviewersKey = "number_of_reviewers";

    if(object.has_key(number_of_reviewersKey))
    {
        bourne::json value = object[number_of_reviewersKey];



        jsonToValue(&number_of_reviewers, value, "int");


    }

    const char *rating_systemKey = "rating_system";

    if(object.has_key(rating_systemKey))
    {
        bourne::json value = object[rating_systemKey];



        jsonToValue(&rating_system, value, "std::string");


    }

    const char *scoreKey = "score";

    if(object.has_key(scoreKey))
    {
        bourne::json value = object[scoreKey];



        jsonToValue(&score, value, "long");


    }


}

bourne::json
CatalogsHotelGuestRatings::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_score"] = getMaxScore();






    object["number_of_reviewers"] = getNumberOfReviewers();






    object["rating_system"] = getRatingSystem();






    object["score"] = getScore();



    return object;

}

long
CatalogsHotelGuestRatings::getMaxScore()
{
	return max_score;
}

void
CatalogsHotelGuestRatings::setMaxScore(long max_score)
{
	this->max_score = max_score;
}

int
CatalogsHotelGuestRatings::getNumberOfReviewers()
{
	return number_of_reviewers;
}

void
CatalogsHotelGuestRatings::setNumberOfReviewers(int number_of_reviewers)
{
	this->number_of_reviewers = number_of_reviewers;
}

std::string
CatalogsHotelGuestRatings::getRatingSystem()
{
	return rating_system;
}

void
CatalogsHotelGuestRatings::setRatingSystem(std::string rating_system)
{
	this->rating_system = rating_system;
}

long
CatalogsHotelGuestRatings::getScore()
{
	return score;
}

void
CatalogsHotelGuestRatings::setScore(long score)
{
	this->score = score;
}



