/*
 * IntegrationLogsInvalidLogResponse.h
 *
 * Schema describing the response when a log has invalid fields.
 */

#ifndef _IntegrationLogsInvalidLogResponse_H_
#define _IntegrationLogsInvalidLogResponse_H_


#include <string>
#include "IntegrationLogsInvalidLogResponse_rejected_logs_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Schema describing the response when a log has invalid fields.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsInvalidLogResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogsInvalidLogResponse();
	IntegrationLogsInvalidLogResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogsInvalidLogResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> getRejectedLogs();

	/*! \brief Set 
	 */
	void setRejectedLogs(std::list <IntegrationLogsInvalidLogResponse_rejected_logs_inner> rejected_logs);

private:
	std::list <IntegrationLogsInvalidLogResponse_rejected_logs_inner>rejected_logs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationLogsInvalidLogResponse_H_ */
