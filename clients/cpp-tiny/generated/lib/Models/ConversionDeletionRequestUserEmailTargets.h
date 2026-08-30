
/*
 * ConversionDeletionRequestUserEmailTargets.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionDeletionRequestUserEmailTargets_H_
#define TINY_CPP_CLIENT_ConversionDeletionRequestUserEmailTargets_H_


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

class ConversionDeletionRequestUserEmailTargets{
public:

    /*! \brief Constructor.
	 */
    ConversionDeletionRequestUserEmailTargets();
    ConversionDeletionRequestUserEmailTargets(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionDeletionRequestUserEmailTargets();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array of plain text user emails.
	 */
	std::list<std::string> getUserEmails();

	/*! \brief Set Array of plain text user emails.
	 */
	void setUserEmails(std::list<std::string> user_emails);


    private:
    std::list<std::string> user_emails;
};
}

#endif /* TINY_CPP_CLIENT_ConversionDeletionRequestUserEmailTargets_H_ */
