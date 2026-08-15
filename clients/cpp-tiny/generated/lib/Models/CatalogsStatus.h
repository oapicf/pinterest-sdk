
/*
 * CatalogsStatus.h
 *
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */

#ifndef TINY_CPP_CLIENT_CatalogsStatus_H_
#define TINY_CPP_CLIENT_CatalogsStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 *
 *  \ingroup Models
 *
 */

class CatalogsStatus{
public:

    /*! \brief Constructor.
	 */
    CatalogsStatus();
    CatalogsStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsStatus_H_ */
