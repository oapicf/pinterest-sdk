
/*
 * TrendsGenderDistribution.h
 *
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 */

#ifndef TINY_CPP_CLIENT_TrendsGenderDistribution_H_
#define TINY_CPP_CLIENT_TrendsGenderDistribution_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TrendsGender.h"
#include <map>

namespace Tiny {


/*! \brief This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 *
 *  \ingroup Models
 *
 */

class TrendsGenderDistribution{
public:

    /*! \brief Constructor.
	 */
    TrendsGenderDistribution();
    TrendsGenderDistribution(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendsGenderDistribution();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	TrendsGender getGenderDistribution();

	/*! \brief Set 
	 */
	void setGenderDistribution(TrendsGender gender_distribution);


    private:
    TrendsGender gender_distribution;
};
}

#endif /* TINY_CPP_CLIENT_TrendsGenderDistribution_H_ */
