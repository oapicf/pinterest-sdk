
/*
 * TrendingKeyword_demographics.h
 *
 * A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. &lt;br /&gt; For each dimension: &lt;br /&gt;   - Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). &lt;br /&gt;   - Value: The proportion of search volume (e.g., 0.12 for 12%). &lt;br /&gt;     Values less than 0.05 are set to 0.04 for privacy. &lt;br /&gt;     The sum for all categories in a dimension will approximately equal 1. &lt;br /&gt;     Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
 */

#ifndef TINY_CPP_CLIENT_TrendingKeyword_demographics_H_
#define TINY_CPP_CLIENT_TrendingKeyword_demographics_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TrendingKeyword_demographics_age_distribution.h"
#include "TrendingKeyword_demographics_gender_distribution.h"

namespace Tiny {


/*! \brief A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. <br /> For each dimension: <br />   - Key: The category (e.g., \"female\", \"18-24\"). <br />   - Value: The proportion of search volume (e.g., 0.12 for 12%). <br />     Values less than 0.05 are set to 0.04 for privacy. <br />     The sum for all categories in a dimension will approximately equal 1. <br />     Only applicable when `include_demographics` query parameter is set to `true`.
 *
 *  \ingroup Models
 *
 */

class TrendingKeyword_demographics{
public:

    /*! \brief Constructor.
	 */
    TrendingKeyword_demographics();
    TrendingKeyword_demographics(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingKeyword_demographics();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TrendingKeyword_demographics_age_distribution getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(TrendingKeyword_demographics_age_distribution  age_distribution);
	/*! \brief Get 
	 */
	TrendingKeyword_demographics_gender_distribution getGenderDistribution();

	/*! \brief Set 
	 */
	void setGenderDistribution(TrendingKeyword_demographics_gender_distribution  gender_distribution);


    private:
    TrendingKeyword_demographics_age_distribution age_distribution;
    TrendingKeyword_demographics_gender_distribution gender_distribution;
};
}

#endif /* TINY_CPP_CLIENT_TrendingKeyword_demographics_H_ */
