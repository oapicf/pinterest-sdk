/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CatalogsHotelGuestRatings.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CatalogsHotelGuestRatings::CatalogsHotelGuestRatings()
{
    m_Score = 0.0;
    m_ScoreIsSet = false;
    m_Number_of_reviewers = 0;
    m_Number_of_reviewersIsSet = false;
    m_Max_score = 0.0;
    m_Max_scoreIsSet = false;
    m_Rating_system = utility::conversions::to_string_t("");
    m_Rating_systemIsSet = false;
}

CatalogsHotelGuestRatings::~CatalogsHotelGuestRatings()
{
}

void CatalogsHotelGuestRatings::validate()
{
    // TODO: implement validation
}

web::json::value CatalogsHotelGuestRatings::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ScoreIsSet)
    {
        val[utility::conversions::to_string_t(U("score"))] = ModelBase::toJson(m_Score);
    }
    if(m_Number_of_reviewersIsSet)
    {
        val[utility::conversions::to_string_t(U("number_of_reviewers"))] = ModelBase::toJson(m_Number_of_reviewers);
    }
    if(m_Max_scoreIsSet)
    {
        val[utility::conversions::to_string_t(U("max_score"))] = ModelBase::toJson(m_Max_score);
    }
    if(m_Rating_systemIsSet)
    {
        val[utility::conversions::to_string_t(U("rating_system"))] = ModelBase::toJson(m_Rating_system);
    }

    return val;
}

bool CatalogsHotelGuestRatings::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("score"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("score")));
        if(!fieldValue.is_null())
        {
            double refVal_setScore;
            ok &= ModelBase::fromJson(fieldValue, refVal_setScore);
            setScore(refVal_setScore);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("number_of_reviewers"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("number_of_reviewers")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setNumberOfReviewers;
            ok &= ModelBase::fromJson(fieldValue, refVal_setNumberOfReviewers);
            setNumberOfReviewers(refVal_setNumberOfReviewers);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("max_score"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("max_score")));
        if(!fieldValue.is_null())
        {
            double refVal_setMaxScore;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMaxScore);
            setMaxScore(refVal_setMaxScore);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("rating_system"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("rating_system")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRatingSystem;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRatingSystem);
            setRatingSystem(refVal_setRatingSystem);
        }
    }
    return ok;
}

void CatalogsHotelGuestRatings::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ScoreIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("score")), m_Score));
    }
    if(m_Number_of_reviewersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("number_of_reviewers")), m_Number_of_reviewers));
    }
    if(m_Max_scoreIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("max_score")), m_Max_score));
    }
    if(m_Rating_systemIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("rating_system")), m_Rating_system));
    }
}

bool CatalogsHotelGuestRatings::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("score"))))
    {
        double refVal_setScore;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("score"))), refVal_setScore );
        setScore(refVal_setScore);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("number_of_reviewers"))))
    {
        int32_t refVal_setNumberOfReviewers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("number_of_reviewers"))), refVal_setNumberOfReviewers );
        setNumberOfReviewers(refVal_setNumberOfReviewers);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("max_score"))))
    {
        double refVal_setMaxScore;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("max_score"))), refVal_setMaxScore );
        setMaxScore(refVal_setMaxScore);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("rating_system"))))
    {
        utility::string_t refVal_setRatingSystem;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("rating_system"))), refVal_setRatingSystem );
        setRatingSystem(refVal_setRatingSystem);
    }
    return ok;
}

double CatalogsHotelGuestRatings::getScore() const
{
    return m_Score;
}

void CatalogsHotelGuestRatings::setScore(double value)
{
    m_Score = value;
    m_ScoreIsSet = true;
}

bool CatalogsHotelGuestRatings::scoreIsSet() const
{
    return m_ScoreIsSet;
}

void CatalogsHotelGuestRatings::unsetScore()
{
    m_ScoreIsSet = false;
}
int32_t CatalogsHotelGuestRatings::getNumberOfReviewers() const
{
    return m_Number_of_reviewers;
}

void CatalogsHotelGuestRatings::setNumberOfReviewers(int32_t value)
{
    m_Number_of_reviewers = value;
    m_Number_of_reviewersIsSet = true;
}

bool CatalogsHotelGuestRatings::numberOfReviewersIsSet() const
{
    return m_Number_of_reviewersIsSet;
}

void CatalogsHotelGuestRatings::unsetNumber_of_reviewers()
{
    m_Number_of_reviewersIsSet = false;
}
double CatalogsHotelGuestRatings::getMaxScore() const
{
    return m_Max_score;
}

void CatalogsHotelGuestRatings::setMaxScore(double value)
{
    m_Max_score = value;
    m_Max_scoreIsSet = true;
}

bool CatalogsHotelGuestRatings::maxScoreIsSet() const
{
    return m_Max_scoreIsSet;
}

void CatalogsHotelGuestRatings::unsetMax_score()
{
    m_Max_scoreIsSet = false;
}
utility::string_t CatalogsHotelGuestRatings::getRatingSystem() const
{
    return m_Rating_system;
}

void CatalogsHotelGuestRatings::setRatingSystem(const utility::string_t& value)
{
    m_Rating_system = value;
    m_Rating_systemIsSet = true;
}

bool CatalogsHotelGuestRatings::ratingSystemIsSet() const
{
    return m_Rating_systemIsSet;
}

void CatalogsHotelGuestRatings::unsetRating_system()
{
    m_Rating_systemIsSet = false;
}
}
}
}
}


