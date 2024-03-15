/*
 * IntegrationLogClientRequest.h
 *
 * HTTP request details included in the log sent by the client.
 */

#ifndef _IntegrationLogClientRequest_H_
#define _IntegrationLogClientRequest_H_


#include <string>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief HTTP request details included in the log sent by the client.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogClientRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLogClientRequest();
	IntegrationLogClientRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLogClientRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getMethod();

	/*! \brief Set 
	 */
	void setMethod(std::string  method);
	/*! \brief Get HTTP request host from host header.
	 */
	std::string getHost();

	/*! \brief Set HTTP request host from host header.
	 */
	void setHost(std::string  host);
	/*! \brief Get HTTP request path.
	 */
	std::string getPath();

	/*! \brief Set HTTP request path.
	 */
	void setPath(std::string  path);
	/*! \brief Get HTTP request headers as key-value pairs.
	 */
	std::map<std::string, std::string> getRequestHeaders();

	/*! \brief Set HTTP request headers as key-value pairs.
	 */
	void setRequestHeaders(std::map <std::string, std::string> request_headers);
	/*! \brief Get HTTP response headers as key-value pairs.
	 */
	std::map<std::string, std::string> getResponseHeaders();

	/*! \brief Set HTTP response headers as key-value pairs.
	 */
	void setResponseHeaders(std::map <std::string, std::string> response_headers);
	/*! \brief Get 
	 */
	int getResponseStatusCode();

	/*! \brief Set 
	 */
	void setResponseStatusCode(int  response_status_code);

private:
	std::string method;
	std::string host;
	std::string path;
	std::map <std::string, std::string>request_headers;
	std::map <std::string, std::string>response_headers;
	int response_status_code;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationLogClientRequest_H_ */
