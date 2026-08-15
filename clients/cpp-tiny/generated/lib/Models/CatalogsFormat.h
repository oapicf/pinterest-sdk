
/*
 * CatalogsFormat.h
 *
 * The file format of a feed.
 */

#ifndef TINY_CPP_CLIENT_CatalogsFormat_H_
#define TINY_CPP_CLIENT_CatalogsFormat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The file format of a feed.
 *
 *  \ingroup Models
 *
 */

class CatalogsFormat{
public:

    /*! \brief Constructor.
	 */
    CatalogsFormat();
    CatalogsFormat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFormat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFormat_H_ */
