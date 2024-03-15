/*
 * IntegrationLogsInvalidLogResponse_rejected_logs_inner.h
 *
 * 
 */

#ifndef _IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_
#define _IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_


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

class IntegrationLogsInvalidLogResponse_rejected_logs_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogsInvalidLogResponse_rejected_logs_inner();
	IntegrationLogsInvalidLogResponse_rejected_logs_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogsInvalidLogResponse_rejected_logs_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Index of the log in the batch.
	 */
	int getLogIndex();

	/*! \brief Set Index of the log in the batch.
	 */
	void setLogIndex(int  log_index);
	/*! \brief Get The field name containing an invalid value.
	 */
	std::string getField();

	/*! \brief Set The field name containing an invalid value.
	 */
	void setField(std::string  field);
	/*! \brief Get The value that is invalid.
	 */
	std::string getValue();

	/*! \brief Set The value that is invalid.
	 */
	void setValue(std::string  value);
	/*! \brief Get The reason the value is invalid.
	 */
	std::string getReason();

	/*! \brief Set The reason the value is invalid.
	 */
	void setReason(std::string  reason);

private:
	int log_index;
	std::string field;
	std::string value;
	std::string reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_ */
