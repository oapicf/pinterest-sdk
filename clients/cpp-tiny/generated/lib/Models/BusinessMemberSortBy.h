
/*
 * BusinessMemberSortBy.h
 *
 * The name of field that businesses are sorted by
 */

#ifndef TINY_CPP_CLIENT_BusinessMemberSortBy_H_
#define TINY_CPP_CLIENT_BusinessMemberSortBy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The name of field that businesses are sorted by
 *
 *  \ingroup Models
 *
 */

class BusinessMemberSortBy{
public:

    /*! \brief Constructor.
	 */
    BusinessMemberSortBy();
    BusinessMemberSortBy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessMemberSortBy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BusinessMemberSortBy_H_ */
