/*
 * IntegrationLogClientError.h
 *
 * System error details included in the log sent by the client.
 */

#ifndef _IntegrationLogClientError_H_
#define _IntegrationLogClientError_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief System error details included in the log sent by the client.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogClientError : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogClientError();
	IntegrationLogClientError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogClientError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Original cause of the error.
	 */
	std::string getCause();

	/*! \brief Set Original cause of the error.
	 */
	void setCause(std::string  cause);
	/*! \brief Get Column number in the line of the file that raised the error.
	 */
	int getColumnNumber();

	/*! \brief Set Column number in the line of the file that raised the error.
	 */
	void setColumnNumber(int  column_number);
	/*! \brief Get Filename where the error happened.
	 */
	std::string getFileName();

	/*! \brief Set Filename where the error happened.
	 */
	void setFileName(std::string  file_name);
	/*! \brief Get Line number where the error happened.
	 */
	int getLineNumber();

	/*! \brief Set Line number where the error happened.
	 */
	void setLineNumber(int  line_number);
	/*! \brief Get Human-readable description of the error.
	 */
	std::string getMessage();

	/*! \brief Set Human-readable description of the error.
	 */
	void setMessage(std::string  message);
	/*! \brief Get More detail about the message.
	 */
	std::string getMessageDetail();

	/*! \brief Set More detail about the message.
	 */
	void setMessageDetail(std::string  message_detail);
	/*! \brief Get Filename where the error happened.
	 */
	std::string getName();

	/*! \brief Set Filename where the error happened.
	 */
	void setName(std::string  name);
	/*! \brief Get Integer that specifies the error code.
	 */
	int getNumber();

	/*! \brief Set Integer that specifies the error code.
	 */
	void setNumber(int  number);
	/*! \brief Get Stack trace of where the error happened.
	 */
	std::string getStackTrace();

	/*! \brief Set Stack trace of where the error happened.
	 */
	void setStackTrace(std::string  stack_trace);

private:
	std::string cause;
	int column_number;
	std::string file_name;
	int line_number;
	std::string message;
	std::string message_detail;
	std::string name;
	int number;
	std::string stack_trace;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationLogClientError_H_ */
