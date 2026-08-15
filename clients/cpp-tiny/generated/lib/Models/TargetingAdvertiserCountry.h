
/*
 * TargetingAdvertiserCountry.h
 *
 * Advertiser&#39;s ISO two character country code.
 */

#ifndef TINY_CPP_CLIENT_TargetingAdvertiserCountry_H_
#define TINY_CPP_CLIENT_TargetingAdvertiserCountry_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Advertiser's ISO two character country code.
 *
 *  \ingroup Models
 *
 */

class TargetingAdvertiserCountry{
public:

    /*! \brief Constructor.
	 */
    TargetingAdvertiserCountry();
    TargetingAdvertiserCountry(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingAdvertiserCountry();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TargetingAdvertiserCountry_H_ */
