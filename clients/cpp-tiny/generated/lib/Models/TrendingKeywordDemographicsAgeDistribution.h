
/*
 * TrendingKeyword_demographics_age_distribution.h
 *
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef TINY_CPP_CLIENT_TrendingKeyword_demographics_age_distribution_H_
#define TINY_CPP_CLIENT_TrendingKeyword_demographics_age_distribution_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 *
 *  \ingroup Models
 *
 */

class TrendingKeyword_demographics_age_distribution{
public:

    /*! \brief Constructor.
	 */
    TrendingKeyword_demographics_age_distribution();
    TrendingKeyword_demographics_age_distribution(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendingKeyword_demographics_age_distribution();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(std::string  age_distribution);


    private:
    std::string age_distribution{};
};
}

#endif /* TINY_CPP_CLIENT_TrendingKeyword_demographics_age_distribution_H_ */
