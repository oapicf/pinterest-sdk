/*
 * ConversionDeletionRequestEPIKTargets.h
 *
 * 
 */

#ifndef _ConversionDeletionRequestEPIKTargets_H_
#define _ConversionDeletionRequestEPIKTargets_H_


#include <string>
#include <list>
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

class ConversionDeletionRequestEPIKTargets : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionDeletionRequestEPIKTargets();
	ConversionDeletionRequestEPIKTargets(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionDeletionRequestEPIKTargets();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
	 */
	std::list<std::string> getEpiks();

	/*! \brief Set Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
	 */
	void setEpiks(std::list <std::string> epiks);

private:
	std::list <std::string>epiks;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionDeletionRequestEPIKTargets_H_ */
