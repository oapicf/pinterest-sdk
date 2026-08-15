
/*
 * IntegrationLogsInvalidLogResponse.h
 *
 * Schema describing the response when a log has invalid fields.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogsInvalidLogResponse_H_
#define TINY_CPP_CLIENT_IntegrationLogsInvalidLogResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IntegrationLogsInvalidLogResponse_rejected_logs_inner.h"
#include <list>

namespace Tiny {


/*! \brief Schema describing the response when a log has invalid fields.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogsInvalidLogResponse{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogsInvalidLogResponse();
    IntegrationLogsInvalidLogResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogsInvalidLogResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> getRejectedLogs();

	/*! \brief Set 
	 */
	void setRejectedLogs(std::list <IntegrationLogsInvalidLogResponse_rejected_logs_inner> rejected_logs);


    private:
    std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> rejected_logs;
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogsInvalidLogResponse_H_ */
