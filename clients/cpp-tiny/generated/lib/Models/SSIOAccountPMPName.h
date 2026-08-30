
/*
 * SSIOAccountPMPName.h
 *
 * Pinterest marketing partner name.
 */

#ifndef TINY_CPP_CLIENT_SSIOAccountPMPName_H_
#define TINY_CPP_CLIENT_SSIOAccountPMPName_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Pinterest marketing partner name.
 *
 *  \ingroup Models
 *
 */

class SSIOAccountPMPName{
public:

    /*! \brief Constructor.
	 */
    SSIOAccountPMPName();
    SSIOAccountPMPName(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SSIOAccountPMPName();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Salesforce id for PMP
	 */
	std::string getId();

	/*! \brief Set Salesforce id for PMP
	 */
	void setId(std::string id);
	/*! \brief Get Display name
	 */
	std::string getName();

	/*! \brief Set Display name
	 */
	void setName(std::string name);


    private:
    std::string id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_SSIOAccountPMPName_H_ */
