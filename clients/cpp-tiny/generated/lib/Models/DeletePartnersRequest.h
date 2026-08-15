
/*
 * DeletePartnersRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DeletePartnersRequest_H_
#define TINY_CPP_CLIENT_DeletePartnersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DeletePartnersRequest{
public:

    /*! \brief Constructor.
	 */
    DeletePartnersRequest();
    DeletePartnersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePartnersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<std::string> getPartnerIds();

	/*! \brief Set 
	 */
	void setPartnerIds(std::list <std::string> partner_ids);
	/*! \brief Get 
	 */
	std::string getPartnerType();

	/*! \brief Set 
	 */
	void setPartnerType(std::string  partner_type);


    private:
    std::list<std::string> partner_ids;
    std::string partner_type{};
};
}

#endif /* TINY_CPP_CLIENT_DeletePartnersRequest_H_ */
