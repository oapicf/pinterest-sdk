/*
 * IntegrationLogsRequest.h
 *
 * Batch of logs sent from an integration application.
 */

#ifndef _IntegrationLogsRequest_H_
#define _IntegrationLogsRequest_H_


#include <string>
#include "IntegrationLog.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Batch of logs sent from an integration application.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogsRequest();
	IntegrationLogsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<IntegrationLog> getLogs();

	/*! \brief Set 
	 */
	void setLogs(std::list <IntegrationLog> logs);

private:
	std::list <IntegrationLog>logs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationLogsRequest_H_ */
