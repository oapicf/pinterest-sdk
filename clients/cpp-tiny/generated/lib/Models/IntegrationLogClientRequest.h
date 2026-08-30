
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
#include "HttpMethod.h"
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
	void setHost(std::string host);
	/*! \brief Get 
	 */
	HttpMethod getMethod();

	/*! \brief Set 
	 */
	void setMethod(HttpMethod method);
	/*! \brief Get HTTP request path.
	 */
	std::string getPath();

	/*! \brief Set HTTP request path.
	 */
	void setPath(std::string path);
	/*! \brief Get HTTP request headers as key-value pairs.
	 */
	std::map<std::string, std::string> getRequestHeaders();

	/*! \brief Set HTTP request headers as key-value pairs.
	 */
	void setRequestHeaders(std::map<std::string, std::string> request_headers);
	/*! \brief Get HTTP response headers as key-value pairs.
	 */
	std::map<std::string, std::string> getResponseHeaders();

	/*! \brief Set HTTP response headers as key-value pairs.
	 */
	void setResponseHeaders(std::map<std::string, std::string> response_headers);
	/*! \brief Get 
	 */
	int getResponseStatusCode();

	/*! \brief Set 
	 */
	void setResponseStatusCode(int response_status_code);


    private:
    std::string host{};
    HttpMethod method;
    std::string path{};
    std::map<std::string, std::string> request_headers;
    std::map<std::string, std::string> response_headers;
    int response_status_code{};
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogClientRequest_H_ */
