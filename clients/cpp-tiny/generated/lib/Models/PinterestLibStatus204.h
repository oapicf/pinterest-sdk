
/*
 * Pinterest.Lib.Status204.h
 *
 * The resource was successfully deleted.
 */

#ifndef TINY_CPP_CLIENT_Pinterest.Lib.Status204_H_
#define TINY_CPP_CLIENT_Pinterest.Lib.Status204_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The resource was successfully deleted.
 *
 *  \ingroup Models
 *
 */

class Pinterest.Lib.Status204{
public:

    /*! \brief Constructor.
	 */
    Pinterest.Lib.Status204();
    Pinterest.Lib.Status204(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Pinterest.Lib.Status204();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getStatusCode();

	/*! \brief Set 
	 */
	void setStatusCode(long  statusCode);


    private:
    long statusCode{};
};
}

#endif /* TINY_CPP_CLIENT_Pinterest.Lib.Status204_H_ */
