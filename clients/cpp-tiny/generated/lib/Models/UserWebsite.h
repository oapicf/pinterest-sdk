
/*
 * UserWebsite.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UserWebsite_H_
#define TINY_CPP_CLIENT_UserWebsite_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UserWebsite{
public:

    /*! \brief Constructor.
	 */
    UserWebsite();
    UserWebsite(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UserWebsite();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Status of the verification process
	 */
	std::string getStatus();

	/*! \brief Set Status of the verification process
	 */
	void setStatus(std::string status);
	/*! \brief Get UTC timestamp when the verification happened - sometimes missing
	 */
	std::string getVerifiedAt();

	/*! \brief Set UTC timestamp when the verification happened - sometimes missing
	 */
	void setVerifiedAt(std::string verified_at);
	/*! \brief Get Website with path or domain only
	 */
	std::string getWebsite();

	/*! \brief Set Website with path or domain only
	 */
	void setWebsite(std::string website);


    private:
    std::string status{};
    std::string verified_at{};
    std::string website{};
};
}

#endif /* TINY_CPP_CLIENT_UserWebsite_H_ */
