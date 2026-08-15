
/*
 * AgeTrendsBucket.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AgeTrendsBucket_H_
#define TINY_CPP_CLIENT_AgeTrendsBucket_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AgeTrendsBucket{
public:

    /*! \brief Constructor.
	 */
    AgeTrendsBucket();
    AgeTrendsBucket(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AgeTrendsBucket();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AgeTrendsBucket_H_ */
