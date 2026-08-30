
/*
 * TrendingKeywordDemographics.h
 *
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */

#ifndef TINY_CPP_CLIENT_TrendingKeywordDemographics_H_
#define TINY_CPP_CLIENT_TrendingKeywordDemographics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TrendsAgeDistribution.h"
#include "TrendsGenderDistribution.h"

namespace Tiny {


/*! \brief A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
 *
 *  \ingroup Models
 *
 */

class TrendingKeywordDemographics{
public:

    /*! \brief Constructor.
	 */
    TrendingKeywordDemographics();
    TrendingKeywordDemographics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingKeywordDemographics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TrendsAgeDistribution&lt;std::string, double&gt; getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(TrendsAgeDistribution&lt;std::string, double&gt; age_distribution);
	/*! \brief Get 
	 */
	TrendsGenderDistribution&lt;std::string, double&gt; getGenderDistribution();

	/*! \brief Set 
	 */
	void setGenderDistribution(TrendsGenderDistribution&lt;std::string, double&gt; gender_distribution);


    private:
    TrendsAgeDistribution&lt;std::string, double&gt; age_distribution;
    TrendsGenderDistribution&lt;std::string, double&gt; gender_distribution;
};
}

#endif /* TINY_CPP_CLIENT_TrendingKeywordDemographics_H_ */
