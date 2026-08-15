
/*
 * IntegrationLogClientError.h
 *
 * System error details included in the log sent by the client.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogClientError_H_
#define TINY_CPP_CLIENT_IntegrationLogClientError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief System error details included in the log sent by the client.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogClientError{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogClientError();
    IntegrationLogClientError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogClientError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string cause{};
    int column_number{};
    std::string file_name{};
    int line_number{};
    std::string message{};
    std::string message_detail{};
    std::string name{};
    int number{};
    std::string stack_trace{};
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogClientError_H_ */
