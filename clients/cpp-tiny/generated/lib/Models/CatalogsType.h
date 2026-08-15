
/*
 * CatalogsType.h
 *
 * Type of the catalog entity.
 */

#ifndef TINY_CPP_CLIENT_CatalogsType_H_
#define TINY_CPP_CLIENT_CatalogsType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Type of the catalog entity.
 *
 *  \ingroup Models
 *
 */

class CatalogsType{
public:

    /*! \brief Constructor.
	 */
    CatalogsType();
    CatalogsType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsType_H_ */
