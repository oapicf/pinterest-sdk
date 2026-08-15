

#include "QualityComponentDetails.h"

using namespace Tiny;

QualityComponentDetails::QualityComponentDetails()
{
	coverage = float(0);
	issues = std::list<QualityComponentIssue>();
	overlap = float(0);
}

QualityComponentDetails::QualityComponentDetails(std::string jsonString)
{
	this->fromJson(jsonString);
}

QualityComponentDetails::~QualityComponentDetails()
{

}

void
QualityComponentDetails::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *coverageKey = "coverage";

    if(object.has_key(coverageKey))
    {
        bourne::json value = object[coverageKey];



        jsonToValue(&coverage, value, "long");


    }

    const char *issuesKey = "issues";

    if(object.has_key(issuesKey))
    {
        bourne::json value = object[issuesKey];


        std::list<QualityComponentIssue> issues_list;
        QualityComponentIssue element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            issues_list.push_back(element);
        }
        issues = issues_list;


    }

    const char *overlapKey = "overlap";

    if(object.has_key(overlapKey))
    {
        bourne::json value = object[overlapKey];



        jsonToValue(&overlap, value, "long");


    }


}

bourne::json
QualityComponentDetails::toJson()
{
    bourne::json object = bourne::json::object();





    object["coverage"] = getCoverage();





    std::list<QualityComponentIssue> issues_list = getIssues();
    bourne::json issues_arr = bourne::json::array();

    for(auto& var : issues_list)
    {
        QualityComponentIssue obj = var;
        issues_arr.append(obj.toJson());
    }
    object["issues"] = issues_arr;







    object["overlap"] = getOverlap();



    return object;

}

long
QualityComponentDetails::getCoverage()
{
	return coverage;
}

void
QualityComponentDetails::setCoverage(long  coverage)
{
	this->coverage = coverage;
}

std::list<QualityComponentIssue>
QualityComponentDetails::getIssues()
{
	return issues;
}

void
QualityComponentDetails::setIssues(std::list <QualityComponentIssue> issues)
{
	this->issues = issues;
}

long
QualityComponentDetails::getOverlap()
{
	return overlap;
}

void
QualityComponentDetails::setOverlap(long  overlap)
{
	this->overlap = overlap;
}



