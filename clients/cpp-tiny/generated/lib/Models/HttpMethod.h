
/*
 * HttpMethod.h
 *
 * HTTP request method.
 */

#ifndef TINY_CPP_CLIENT_HttpMethod_H_
#define TINY_CPP_CLIENT_HttpMethod_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief HTTP request method.
 *
 *  \ingroup Models
 *
 */

class HttpMethod{
public:

    /*! \brief Constructor.
	 */
    HttpMethod();
    HttpMethod(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~HttpMethod();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_HttpMethod_H_ */
