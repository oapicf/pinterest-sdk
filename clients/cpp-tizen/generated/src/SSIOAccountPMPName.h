/*
 * SSIOAccountPMPName.h
 *
 * 
 */

#ifndef _SSIOAccountPMPName_H_
#define _SSIOAccountPMPName_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SSIOAccountPMPName : public Object {
public:
	/*! \brief Constructor.
	 */
	SSIOAccountPMPName();
	SSIOAccountPMPName(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SSIOAccountPMPName();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Display name
	 */
	std::string getName();

	/*! \brief Set Display name
	 */
	void setName(std::string  name);
	/*! \brief Get Salesforce id for PMP
	 */
	std::string getId();

	/*! \brief Set Salesforce id for PMP
	 */
	void setId(std::string  id);

private:
	std::string name;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SSIOAccountPMPName_H_ */
