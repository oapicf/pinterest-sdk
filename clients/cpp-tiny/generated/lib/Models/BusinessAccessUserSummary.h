
/*
 * BusinessAccessUserSummary.h
 *
 * Metadata of the member/partner that has access to the asset.
 */

#ifndef TINY_CPP_CLIENT_BusinessAccessUserSummary_H_
#define TINY_CPP_CLIENT_BusinessAccessUserSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Metadata of the member/partner that has access to the asset.
 *
 *  \ingroup Models
 *
 */

class BusinessAccessUserSummary{
public:

    /*! \brief Constructor.
	 */
    BusinessAccessUserSummary();
    BusinessAccessUserSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessAccessUserSummary();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Email of the business member/partner.
	 */
	std::string getEmail();

	/*! \brief Set Email of the business member/partner.
	 */
	void setEmail(std::string  email);
	/*! \brief Get Unique identifier of the business member/partner.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the business member/partner.
	 */
	void setId(std::string  id);
	/*! \brief Get Username of the business member/partner.
	 */
	std::string getUsername();

	/*! \brief Set Username of the business member/partner.
	 */
	void setUsername(std::string  username);


    private:
    std::string email{};
    std::string id{};
    std::string username{};
};
}

#endif /* TINY_CPP_CLIENT_BusinessAccessUserSummary_H_ */
