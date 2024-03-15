/*
 * AdPreviewURLResponse.h
 *
 * 
 */

#ifndef _AdPreviewURLResponse_H_
#define _AdPreviewURLResponse_H_


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

class AdPreviewURLResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPreviewURLResponse();
	AdPreviewURLResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPreviewURLResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
	 */
	std::string getUrl();

	/*! \brief Set 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
	 */
	void setUrl(std::string  url);

private:
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdPreviewURLResponse_H_ */
