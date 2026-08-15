

#include "NonDraftEntityStatus.h"

using namespace Tiny;

NonDraftEntityStatus::NonDraftEntityStatus()
{
}

NonDraftEntityStatus::NonDraftEntityStatus(std::string jsonString)
{
	this->fromJson(jsonString);
}

NonDraftEntityStatus::~NonDraftEntityStatus()
{

}

void
NonDraftEntityStatus::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
NonDraftEntityStatus::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



