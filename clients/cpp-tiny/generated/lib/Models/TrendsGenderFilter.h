
/*
 * TrendsGenderFilter.h
 *
 * Gender category for trends demographic distribution.
 */

#ifndef TINY_CPP_CLIENT_TrendsGenderFilter_H_
#define TINY_CPP_CLIENT_TrendsGenderFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Gender category for trends demographic distribution.
 *
 *  \ingroup Models
 *
 */

class TrendsGenderFilter{
public:

    /*! \brief Constructor.
	 */
    TrendsGenderFilter();
    TrendsGenderFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendsGenderFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TrendsGenderFilter_H_ */
