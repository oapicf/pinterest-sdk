/*
 * AdvertiserDefinedEventProcessingRecord.h
 *
 * Processing record for an advertiser defined event operation
 */

#ifndef _AdvertiserDefinedEventProcessingRecord_H_
#define _AdvertiserDefinedEventProcessingRecord_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Processing record for an advertiser defined event operation
 *
 *  \ingroup Models
 *
 */

class AdvertiserDefinedEventProcessingRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvertiserDefinedEventProcessingRecord();
	AdvertiserDefinedEventProcessingRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvertiserDefinedEventProcessingRecord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of exception messages if the operation failed
	 */
	std::list<std::string> getExceptions();

	/*! \brief Set List of exception messages if the operation failed
	 */
	void setExceptions(std::list <std::string> exceptions);
	/*! \brief Get Name of the advertiser defined event
	 */
	std::string getName();

	/*! \brief Set Name of the advertiser defined event
	 */
	void setName(std::string  name);
	/*! \brief Get Processing status (success or failure)
	 */
	std::string getStatus();

	/*! \brief Set Processing status (success or failure)
	 */
	void setStatus(std::string  status);

private:
	std::list <std::string>exceptions;
	std::string name;
	std::string status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvertiserDefinedEventProcessingRecord_H_ */
