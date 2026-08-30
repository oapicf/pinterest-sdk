
/*
 * TrendsGender.h
 *
 * Gender category for trends demographic distribution.
 */

#ifndef TINY_CPP_CLIENT_TrendsGender_H_
#define TINY_CPP_CLIENT_TrendsGender_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Gender category for trends demographic distribution.
 *
 *  \ingroup Models
 *
 */

class TrendsGender{
public:

    /*! \brief Constructor.
	 */
    TrendsGender();
    TrendsGender(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendsGender();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TrendsGender_H_ */
