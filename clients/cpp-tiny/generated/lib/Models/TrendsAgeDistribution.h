
/*
 * TrendsAgeDistribution.h
 *
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef TINY_CPP_CLIENT_TrendsAgeDistribution_H_
#define TINY_CPP_CLIENT_TrendsAgeDistribution_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TrendsAgeBucket.h"
#include <map>

namespace Tiny {


/*! \brief This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 *
 *  \ingroup Models
 *
 */

class TrendsAgeDistribution{
public:

    /*! \brief Constructor.
	 */
    TrendsAgeDistribution();
    TrendsAgeDistribution(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendsAgeDistribution();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TrendsAgeBucket getAgeDistribution();

	/*! \brief Set 
	 */
	void setAgeDistribution(TrendsAgeBucket age_distribution);


    private:
    TrendsAgeBucket age_distribution;
};
}

#endif /* TINY_CPP_CLIENT_TrendsAgeDistribution_H_ */
