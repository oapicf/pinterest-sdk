
/*
 * TermsOfService.h
 *
 * The ID of the ad account.
 */

#ifndef TINY_CPP_CLIENT_TermsOfService_H_
#define TINY_CPP_CLIENT_TermsOfService_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The ID of the ad account.
 *
 *  \ingroup Models
 *
 */

class TermsOfService{
public:

    /*! \brief Constructor.
	 */
    TermsOfService();
    TermsOfService(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TermsOfService();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the ad account.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the ad account.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get Whether the ad account has accepted terms of service.
	 */
	bool isHasAccepted();

	/*! \brief Set Whether the ad account has accepted terms of service.
	 */
	void setHasAccepted(bool has_accepted);
	/*! \brief Get The terms of service content
	 */
	std::string getHtml();

	/*! \brief Set The terms of service content
	 */
	void setHtml(std::string html);
	/*! \brief Get The ID of the terms of service
	 */
	std::string getId();

	/*! \brief Set The ID of the terms of service
	 */
	void setId(std::string id);


    private:
    std::string ad_account_id{};
    bool has_accepted{};
    std::string html{};
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_TermsOfService_H_ */
