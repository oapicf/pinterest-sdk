
/*
 * AudienceInsightsResponse.h
 *
 * Audience interests and demographics.
 */

#ifndef TINY_CPP_CLIENT_AudienceInsightsResponse_H_
#define TINY_CPP_CLIENT_AudienceInsightsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceCategory.h"
#include "AudienceDemographics.h"
#include "AudienceInsightType.h"
#include <list>

namespace Tiny {


/*! \brief Audience interests and demographics.
 *
 *  \ingroup Models
 *
 */

class AudienceInsightsResponse{
public:

    /*! \brief Constructor.
	 */
    AudienceInsightsResponse();
    AudienceInsightsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceInsightsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Category interest distribution
	 */
	std::list<AudienceCategory> getCategories();

	/*! \brief Set Category interest distribution
	 */
	void setCategories(std::list <AudienceCategory> categories);
	/*! \brief Get Generation date
	 */
	std::string getDate();

	/*! \brief Set Generation date
	 */
	void setDate(std::string  date);
	/*! \brief Get 
	 */
	AudienceDemographics getDemographics();

	/*! \brief Set 
	 */
	void setDemographics(AudienceDemographics  demographics);
	/*! \brief Get Population count.
	 */
	int getSize();

	/*! \brief Set Population count.
	 */
	void setSize(int  size);
	/*! \brief Get Indicates whether the audience size has been rounded up to the next highest upper boundary.
	 */
	bool isSizeIsUpperBound();

	/*! \brief Set Indicates whether the audience size has been rounded up to the next highest upper boundary.
	 */
	void setSizeIsUpperBound(bool  size_is_upper_bound);
	/*! \brief Get 
	 */
	AudienceInsightType getType();

	/*! \brief Set 
	 */
	void setType(AudienceInsightType  type);


    private:
    std::list<AudienceCategory> categories;
    std::string date{};
    AudienceDemographics demographics;
    int size{};
    bool size_is_upper_bound{};
    AudienceInsightType type;
};
}

#endif /* TINY_CPP_CLIENT_AudienceInsightsResponse_H_ */
