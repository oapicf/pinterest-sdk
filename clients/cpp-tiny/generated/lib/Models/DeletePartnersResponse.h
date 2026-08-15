
/*
 * DeletePartnersResponse.h
 *
 * An object with a list of partners that were deleted.
 */

#ifndef TINY_CPP_CLIENT_DeletePartnersResponse_H_
#define TINY_CPP_CLIENT_DeletePartnersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of partners that were deleted.
 *
 *  \ingroup Models
 *
 */

class DeletePartnersResponse{
public:

    /*! \brief Constructor.
	 */
    DeletePartnersResponse();
    DeletePartnersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePartnersResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of partners whose business partnership have been terminated.
	 */
	std::list<std::string> getDeletedPartners();

	/*! \brief Set List of partners whose business partnership have been terminated.
	 */
	void setDeletedPartners(std::list <std::string> deleted_partners);


    private:
    std::list<std::string> deleted_partners;
};
}

#endif /* TINY_CPP_CLIENT_DeletePartnersResponse_H_ */
