
/*
 * IntegrationLogClientRequest.h
 *
 * HTTP request details included in the log sent by the client.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogClientRequest_H_
#define TINY_CPP_CLIENT_IntegrationLogClientRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <map>

namespace Tiny {


/*! \brief HTTP request details included in the log sent by the client.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogClientRequest{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogClientRequest();
    IntegrationLogClientRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogClientRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get HTTP request host from host header.
	 */
	std::string getHost();

	/*! \brief Set HTTP request host from host header.
	 */
	void setHost(std::string  host);
	/*! \brief Get 
	 */
	std::string getMethod();

	/*! \brief Set 
	 */
	void setMethod(std::string  method);
	/*! \brief Get HTTP request path.
	 */
	std::string getPath();

	/*! \brief Set HTTP request path.
	 */
	void setPath(std::string  path);
	/*! \brief Get HTTP request headers as key-value pairs.
	 */
	Map<std::string, std::string> getRequestHeaders();

	/*! \brief Set HTTP request headers as key-value pairs.
	 */
	void setRequestHeaders(Map <std::string, std::string> request_headers);
	/*! \brief Get HTTP response headers as key-value pairs.
	 */
	Map<std::string, std::string> getResponseHeaders();

	/*! \brief Set HTTP response headers as key-value pairs.
	 */
	void setResponseHeaders(Map <std::string, std::string> response_headers);
	/*! \brief Get 
	 */
	int getResponseStatusCode();

	/*! \brief Set 
	 */
	void setResponseStatusCode(int  response_status_code);


    private:
    std::string host{};
    std::string method{};
    std::string path{};
    Map<std::string, std::string> request_headers;
    Map<std::string, std::string> response_headers;
    int response_status_code{};
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogClientRequest_H_ */
