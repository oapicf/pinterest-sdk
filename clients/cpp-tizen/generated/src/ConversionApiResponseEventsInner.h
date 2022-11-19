/*
 * ConversionApiResponse_events_inner.h
 *
 * 
 */

#ifndef _ConversionApiResponse_events_inner_H_
#define _ConversionApiResponse_events_inner_H_


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

class ConversionApiResponse_events_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionApiResponse_events_inner();
	ConversionApiResponse_events_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionApiResponse_events_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Whether the event was processed successfully.
	 */
	std::string getStatus();

	/*! \brief Set Whether the event was processed successfully.
	 */
	void setStatus(std::string  status);
	/*! \brief Get Error message containing more information about why the event failed to be processed.
	 */
	std::string getErrorMessage();

	/*! \brief Set Error message containing more information about why the event failed to be processed.
	 */
	void setErrorMessage(std::string  error_message);
	/*! \brief Get Warning messages about any fields in the event which are not standard. These are not critical to event processing.
	 */
	std::string getWarningMessage();

	/*! \brief Set Warning messages about any fields in the event which are not standard. These are not critical to event processing.
	 */
	void setWarningMessage(std::string  warning_message);

private:
	std::string status;
	std::string error_message;
	std::string warning_message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionApiResponse_events_inner_H_ */
