
/*
 * TopVideoPinsSortBy.h
 *
 * Sort metric for top video pins analytics.
 */

#ifndef TINY_CPP_CLIENT_TopVideoPinsSortBy_H_
#define TINY_CPP_CLIENT_TopVideoPinsSortBy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Sort metric for top video pins analytics.
 *
 *  \ingroup Models
 *
 */

class TopVideoPinsSortBy{
public:

    /*! \brief Constructor.
	 */
    TopVideoPinsSortBy();
    TopVideoPinsSortBy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TopVideoPinsSortBy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TopVideoPinsSortBy_H_ */
