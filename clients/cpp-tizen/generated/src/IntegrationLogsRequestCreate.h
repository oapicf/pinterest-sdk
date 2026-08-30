/*
 * IntegrationLogsRequestCreate.h
 *
 * Resource create operation model.
 */

#ifndef _IntegrationLogsRequestCreate_H_
#define _IntegrationLogsRequestCreate_H_


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


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsRequestCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogsRequestCreate();
	IntegrationLogsRequestCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogsRequestCreate();

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

#endif /* _IntegrationLogsRequestCreate_H_ */
