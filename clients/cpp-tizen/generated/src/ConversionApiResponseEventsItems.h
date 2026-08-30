/*
 * ConversionApiResponseEventsItems.h
 *
 * 
 */

#ifndef _ConversionApiResponseEventsItems_H_
#define _ConversionApiResponseEventsItems_H_


#include <string>
#include "EventProcessingStatus.h"
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

class ConversionApiResponseEventsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionApiResponseEventsItems();
	ConversionApiResponseEventsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionApiResponseEventsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Error message containing more information about why the event failed to be processed.
	 */
	std::string getErrorMessage();

	/*! \brief Set Error message containing more information about why the event failed to be processed.
	 */
	void setErrorMessage(std::string  error_message);
	/*! \brief Get Whether the event was processed successfully.
	 */
	EventProcessingStatus getStatus();

	/*! \brief Set Whether the event was processed successfully.
	 */
	void setStatus(EventProcessingStatus  status);
	/*! \brief Get Warning messages about any fields in the event which are not standard. These are not critical to event processing.
	 */
	std::string getWarningMessage();

	/*! \brief Set Warning messages about any fields in the event which are not standard. These are not critical to event processing.
	 */
	void setWarningMessage(std::string  warning_message);

private:
	std::string error_message;
	EventProcessingStatus status;
	std::string warning_message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionApiResponseEventsItems_H_ */
