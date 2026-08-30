
/*
 * BusinessSearchBy.h
 *
 * The names of fields that business accounts are searched by
 */

#ifndef TINY_CPP_CLIENT_BusinessSearchBy_H_
#define TINY_CPP_CLIENT_BusinessSearchBy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The names of fields that business accounts are searched by
 *
 *  \ingroup Models
 *
 */

class BusinessSearchBy{
public:

    /*! \brief Constructor.
	 */
    BusinessSearchBy();
    BusinessSearchBy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessSearchBy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BusinessSearchBy_H_ */
