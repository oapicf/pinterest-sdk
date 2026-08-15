
/*
 * IntegrationLogsInvalidLogResponse_rejected_logs_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_
#define TINY_CPP_CLIENT_IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsInvalidLogResponse_rejected_logs_inner{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogsInvalidLogResponse_rejected_logs_inner();
    IntegrationLogsInvalidLogResponse_rejected_logs_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogsInvalidLogResponse_rejected_logs_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The field name containing an invalid value.
	 */
	std::string getField();

	/*! \brief Set The field name containing an invalid value.
	 */
	void setField(std::string  field);
	/*! \brief Get Index of the log in the batch.
	 */
	int getLogIndex();

	/*! \brief Set Index of the log in the batch.
	 */
	void setLogIndex(int  log_index);
	/*! \brief Get The reason the value is invalid.
	 */
	std::string getReason();

	/*! \brief Set The reason the value is invalid.
	 */
	void setReason(std::string  reason);
	/*! \brief Get The value that is invalid.
	 */
	std::string getValue();

	/*! \brief Set The value that is invalid.
	 */
	void setValue(std::string  value);


    private:
    std::string field{};
    int log_index{};
    std::string reason{};
    std::string value{};
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogsInvalidLogResponse_rejected_logs_inner_H_ */
